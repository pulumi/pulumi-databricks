package shim

import (
	"github.com/databricks/terraform-provider-databricks/internal/providers/pluginfw"
	"github.com/databricks/terraform-provider-databricks/internal/providers/sdkv2"
	"github.com/hashicorp/terraform-plugin-framework/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func PF() provider.Provider { return pluginfw.GetDatabricksProviderPluginFramework() }

func SDKv2() *schema.Provider { return sdkv2.DatabricksProvider() }
