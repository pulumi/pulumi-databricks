// Copyright 2016-2023, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package databricks

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/databricks/databricks-sdk-go/useragent"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
)

func TestWithUserAgent(t *testing.T) {
	type testCase struct {
		name    string
		version string
	}
	testCases := []testCase{
		{
			name:    "release",
			version: "v1.16.0",
		},
		{
			name:    "prerelease",
			version: "v1.16.0-alpha.1684965741+892cfc57.dirty",
		},
		{
			name:    "release-without-v",
			version: "1.16.0",
		},
		{
			name:    "prerelease-without-v",
			version: "1.16.0-alpha.1684965741+892cfc57.dirty",
		},
	}

	for _, v := range testCases {
		t.Run(v.name, func(*testing.T) {
			// This function panics when the user agent does not conform to a regular expression checks.
			useragent.WithUserAgentExtra("pulumi", userAgentValue(v.version))
			// No error return value to check.
		})
	}
}

func TestNoDebugLogsOnStartup(t *testing.T) {
	dir := t.TempDir()
	binPath, err := filepath.Abs(filepath.Join("..", "bin"))
	require.NoError(t, err)

	require.NoError(t, os.WriteFile(filepath.Join(dir, "Pulumi.yaml"), []byte(`name: dev
runtime: yaml
resources:
  p:
    type: pulumi:providers:databricks

plugins:
  providers:
    - name: databricks
      path: "`+binPath+`"
`), 0600))
	test := pulumitest.NewPulumiTest(t, dir)
	result := test.Preview(t)
	for _, msg := range []string{"[DEBUG]", "[TRACE]"} {
		assert.NotContains(t, result.StdErr, msg)
		assert.NotContains(t, result.StdOut, msg)
	}
}
