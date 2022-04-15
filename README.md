[![Actions Status](https://github.com/pulumi/pulumi-databricks/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-databricks/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fdatabricks.svg)](https://www.npmjs.com/package/@pulumi/databricks)
[![Python version](https://badge.fury.io/py/pulumi-databricks.svg)](https://pypi.org/project/pulumi-databricks)
[![NuGet version](https://badge.fury.io/nu/pulumi.databricks.svg)](https://badge.fury.io/nu/pulumi.databricks)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-databricks/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-databricks/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-databricks/blob/master/LICENSE)

# Databricks Resource Provider

The Databricks Resource Provider lets you manage Databricks resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/databricks

or `yarn`:

    $ yarn add @pulumi/databricks

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_databricks

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-databricks/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Databricks

## Configuration

The following configuration points are available:

* `databricks:host` - (optional) This is the host of the Databricks workspace. It is a URL that you use to login to your workspace.
  Alternatively, you can provide this value as an environment variable `DATABRICKS_HOST`.
* `databricks:token` - (optional) This is the API token to authenticate into the workspace. Alternatively, you can provide 
  this value as an environment variable `DATABRICKS_TOKEN`.
* `databricks:username` - (optional) This is the username of the user that can log into the workspace. Alternatively,
  you can provide this value as an environment variable `DATABRICKS_USERNAME`.
* `databricks:password` - (optional) This is the user's password that can log into the workspace. Alternatively, you can 
  provide this value as an environment variable `DATABRICKS_PASSWORD`.
* `databricks:configFile` - (optional) Location of the Databricks CLI credentials file created by `databricks configure --token`
  command (`~/.databrickscfg` by default). Check [Databricks CLI documentation](https://docs.databricks.com/dev-tools/cli/index.html#set-up-authentication) for more details. 
  The provider uses configuration file credentials when you don't specify host/token/username/password/azure attributes. 
  Alternatively, you can provide this value as an environment variable `DATABRICKS_CONFIG_FILE`. This field defaults to `~/.databrickscfg`.
* `databricks:profile` - (optional) Connection profile specified within `~/.databrickscfg`. Please check 
  [connection profiles section](https://docs.databricks.com/dev-tools/cli/index.html#connection-profiles) for more details. This field defaults to `DEFAULT`.
* `databricks:accountId` - (optional) Account Id that could be found in the bottom left corner of 
  [Accounts Console](https://accounts.cloud.databricks.com/). Alternatively, you can provide this value as an environment 
  variable `DATABRICKS_ACCOUNT_ID`. Only has effect when `host = "https://accounts.cloud.databricks.com/"` and currently used to provision account admins via `databricks_user`.
  In the future releases of the provider this property will also be used specify account for `databricks_mws_*` resources as well.
* `databricks:authType` - (optional) enforce specific auth type to be used in very rare cases, where a single provider state
  manages Databricks workspaces on more than one cloud and `More than one authorization method configured` error is a false positive. Valid values are `pat`, `basic`, `azure-client-secret`, `azure-msi`, `azure-cli`, and `databricks-cli`.

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/databricks/api-docs/).
