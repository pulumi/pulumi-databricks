# Pulumi Databricks Provider

The Pulumi Databricks provider is a Go-based Pulumi resource provider that bridges Databricks REST APIs to Pulumi. It generates SDKs for TypeScript/JavaScript, Python, .NET, Go, and Java. The provider uses the Databricks Terraform provider as an upstream source via git submodules.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

### Prerequisites and Environment Setup
- Install required dependencies:
  - Go 1.24+ (already available)
  - Node.js 20+ with Yarn (already available)
  - Python 3.12+ (already available) 
  - .NET 8.0+ (already available)
  - Gradle (already available)

### Initial Repository Setup
- Initialize the upstream submodule: `./scripts/upstream.sh init` -- takes 30 seconds
- Create Pulumi bin directory and copy global binary: `mkdir -p .pulumi/bin && cp /usr/local/bin/pulumi .pulumi/bin/pulumi`

### Build Process and Limitations

**CRITICAL BUILD LIMITATIONS**:
- **NEVER build full provider** - Requires external Pulumi plugins that are blocked by network restrictions
- **NEVER run** `make build`, `make provider`, `make schema` -- they WILL FAIL due to missing terraform converter plugin
- **Python SDK builds FAIL** -- PyPI access is blocked, causing pip timeouts
- **Java SDK builds FAIL** -- Missing lib directory structure in generated code

### What DOES Work

#### Working Build Commands:
- `make upstream` -- Initialize upstream submodule (under 1 second if already done)
- Provider unit tests: `cd provider && go test -v -run TestWithUserAgent` (3 seconds)
- TypeScript SDK: `cd sdk/nodejs && yarn install && yarn run tsc` (7 seconds total)
- .NET SDK: `cd sdk/dotnet && echo "1.0.0-alpha.0+dev" > version.txt && dotnet build` (12 seconds) 
- Go SDK: `cd sdk && go build ./...` (under 1 second if cached)

#### Working Validation Commands:
- Lint Go code manually: `cd provider && go vet ./pkg/... ./disablelogs/...` (excludes cmd/ due to missing schema)
- Run working unit tests: `cd provider && go test -v -run TestWithUserAgent`
- Validate TypeScript compilation: `cd sdk/nodejs && yarn run tsc`

### NEVER CANCEL Operations:
- **NEVER CANCEL** any build command once started - builds may take up to 60 seconds
- Set timeouts to 120+ seconds for all build operations

## Repository Structure

### Key Directories:
- `provider/` -- Go provider implementation
- `sdk/` -- Generated SDKs for all languages
- `upstream/` -- Git submodule with Databricks Terraform provider
- `scripts/` -- Build and utility scripts
- `examples/` -- Example Pulumi programs (test framework available but skipped)

### Important Files:
- `Makefile` -- Primary build orchestration (many targets will fail due to network restrictions)
- `provider/go.mod` -- Provider dependencies
- `sdk/nodejs/package.json` -- TypeScript SDK configuration
- `sdk/dotnet/Pulumi.Databricks.csproj` -- .NET SDK project
- `.github/workflows/` -- CI/CD pipelines

## Development Workflow

### Making Code Changes:
1. Initialize repository: `./scripts/upstream.sh init`
2. Make changes to provider code in `provider/`
3. Validate with unit tests: `cd provider && go test -v -run TestWithUserAgent`
4. **DO NOT attempt full builds** - they will fail due to network restrictions

### Validation Steps:
- Always run `cd provider && go vet ./pkg/... ./disablelogs/...` (excludes cmd/ due to missing schema)
- Test TypeScript SDK builds if making SDK-related changes
- **SKIP Python and Java SDK validation** - they are blocked by network restrictions

### Working with SDKs:
- TypeScript SDK: Generated files are in `sdk/nodejs/` and can be built successfully
- .NET SDK: Generated files are in `sdk/dotnet/` and can be built successfully  
- Go SDK: Generated files are in `sdk/go/databricks/` and can be built successfully
- **Python SDK: SKIP building** - pip access blocked
- **Java SDK: SKIP building** - missing directory structure

## Validation Scenarios

Since the provider cannot be fully built due to network restrictions, validation must focus on:

### Code Quality Validation:
- Go vet checks: `cd provider && go vet ./pkg/... ./disablelogs/...` (excludes cmd/ due to missing schema)
- Unit test validation: `cd provider && go test -v -run TestWithUserAgent`
- TypeScript compilation: `cd sdk/nodejs && yarn run tsc`

### Manual Code Review:
- Check Go code follows standard patterns
- Validate resource definitions in `provider/resources.go`
- Review TypeScript types in generated SDK files
- Ensure imports and dependencies are correct

## Common Tasks Reference

### Repository Root Contents:
```
.ci-mgmt.yaml          -- CI management configuration
.devcontainer/         -- Dev container setup  
.github/               -- GitHub workflows and templates
.gitmodules           -- Git submodule configuration
.golangci.yml         -- Go linter configuration
.mise.toml            -- Mise tool configuration
CONTRIBUTING.md       -- Contribution guidelines
Makefile              -- Build orchestration (many targets fail)
README.md             -- Project documentation
devbox.json           -- Development environment
provider/             -- Go provider implementation
scripts/              -- Build utilities
sdk/                  -- Generated SDKs
upstream/             -- Databricks Terraform provider submodule
```

### Common File Operations:
- **Provider source**: `provider/resources.go` -- Resource definitions
- **Provider tests**: `provider/resources_test.go` -- Unit tests  
- **TypeScript SDK**: `sdk/nodejs/*.ts` -- Generated TypeScript resources
- **Go SDK**: `sdk/go/databricks/*.go` -- Generated Go resources

### Working Unit Tests:
Run provider unit tests that work: `cd provider && go test -v -run TestWithUserAgent`

## Network Restrictions

The following operations WILL FAIL due to network access restrictions:
- Downloading Pulumi plugins (`pulumi plugin install`)
- Python package builds (PyPI access blocked)
- Full provider schema generation (requires terraform converter plugin)
- Full make targets (require external dependencies)

## Time Expectations (Measured)

- Upstream initialization: Under 1 second (already done) or 30 seconds (first time)
- TypeScript SDK build: 6 seconds (tsc compilation) + 1 second (yarn install if cached)
- .NET SDK build: 12 seconds  
- Go SDK build: Under 1 second (if dependencies cached) or 53 seconds (first time)
- Unit tests: Under 3 seconds
- Go vet: Under 1 second

Set timeouts of 120+ seconds for build operations and NEVER CANCEL running builds.

## Critical Reminders

- **ALWAYS** run `./scripts/upstream.sh init` before starting work
- **NEVER** attempt `make build`, `make provider`, or `make schema` - they will fail
- **ONLY** use the working build commands listed above
- **FOCUS** validation on unit tests, Go vet, and TypeScript compilation
- **EXPECT** Python and Java SDK builds to fail - this is normal
- **SET** appropriate timeouts (120+ seconds) and never cancel builds prematurely