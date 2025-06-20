// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace. *Please note that changing parameters of this resource will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.
    /// 
    /// &gt; This resource can only be used with a workspace-level provider!
    /// 
    /// ## Example Usage
    /// 
    /// ### AWS example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.SqlGlobalConfig("this", new()
    ///     {
    ///         SecurityPolicy = "DATA_ACCESS_CONTROL",
    ///         InstanceProfileArn = "arn:....",
    ///         DataAccessConfig = 
    ///         {
    ///             { "spark.sql.session.timeZone", "UTC" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Azure example
    /// 
    /// For Azure you should use the `data_access_config` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @this = new Databricks.SqlGlobalConfig("this", new()
    ///     {
    ///         SecurityPolicy = "DATA_ACCESS_CONTROL",
    ///         DataAccessConfig = 
    ///         {
    ///             { "spark.hadoop.fs.azure.account.auth.type", "OAuth" },
    ///             { "spark.hadoop.fs.azure.account.oauth.provider.type", "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider" },
    ///             { "spark.hadoop.fs.azure.account.oauth2.client.id", applicationId },
    ///             { "spark.hadoop.fs.azure.account.oauth2.client.secret", $"{{{{secrets/{secretScope}/{secretKey}}}}}" },
    ///             { "spark.hadoop.fs.azure.account.oauth2.client.endpoint", $"https://login.microsoftonline.com/{tenantId}/oauth2/token" },
    ///         },
    ///         SqlConfigParams = 
    ///         {
    ///             { "ANSI_MODE", "true" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
    /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
    /// * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
    /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
    /// 
    /// ## Import
    /// 
    /// You can import a `databricks_sql_global_config` resource with command like the following (you need to use `global` as ID):
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_sql_global_config.this
    /// 
    ///   id = "global"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/sqlGlobalConfig:SqlGlobalConfig this global
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlGlobalConfig:SqlGlobalConfig")]
    public partial class SqlGlobalConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        /// </summary>
        [Output("dataAccessConfig")]
        public Output<ImmutableDictionary<string, string>?> DataAccessConfig { get; private set; } = null!;

        [Output("enableServerlessCompute")]
        public Output<bool> EnableServerlessCompute { get; private set; } = null!;

        /// <summary>
        /// used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        /// </summary>
        [Output("googleServiceAccount")]
        public Output<string?> GoogleServiceAccount { get; private set; } = null!;

        /// <summary>
        /// databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        /// </summary>
        [Output("instanceProfileArn")]
        public Output<string?> InstanceProfileArn { get; private set; } = null!;

        /// <summary>
        /// The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        /// </summary>
        [Output("securityPolicy")]
        public Output<string?> SecurityPolicy { get; private set; } = null!;

        /// <summary>
        /// SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        /// </summary>
        [Output("sqlConfigParams")]
        public Output<ImmutableDictionary<string, string>?> SqlConfigParams { get; private set; } = null!;


        /// <summary>
        /// Create a SqlGlobalConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlGlobalConfig(string name, SqlGlobalConfigArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, args ?? new SqlGlobalConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlGlobalConfig(string name, Input<string> id, SqlGlobalConfigState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SqlGlobalConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlGlobalConfig Get(string name, Input<string> id, SqlGlobalConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlGlobalConfig(name, id, state, options);
        }
    }

    public sealed class SqlGlobalConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("dataAccessConfig")]
        private InputMap<string>? _dataAccessConfig;

        /// <summary>
        /// Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        /// </summary>
        public InputMap<string> DataAccessConfig
        {
            get => _dataAccessConfig ?? (_dataAccessConfig = new InputMap<string>());
            set => _dataAccessConfig = value;
        }

        [Input("enableServerlessCompute")]
        public Input<bool>? EnableServerlessCompute { get; set; }

        /// <summary>
        /// used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        /// </summary>
        [Input("googleServiceAccount")]
        public Input<string>? GoogleServiceAccount { get; set; }

        /// <summary>
        /// databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        /// </summary>
        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        /// </summary>
        [Input("securityPolicy")]
        public Input<string>? SecurityPolicy { get; set; }

        [Input("sqlConfigParams")]
        private InputMap<string>? _sqlConfigParams;

        /// <summary>
        /// SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        /// </summary>
        public InputMap<string> SqlConfigParams
        {
            get => _sqlConfigParams ?? (_sqlConfigParams = new InputMap<string>());
            set => _sqlConfigParams = value;
        }

        public SqlGlobalConfigArgs()
        {
        }
        public static new SqlGlobalConfigArgs Empty => new SqlGlobalConfigArgs();
    }

    public sealed class SqlGlobalConfigState : global::Pulumi.ResourceArgs
    {
        [Input("dataAccessConfig")]
        private InputMap<string>? _dataAccessConfig;

        /// <summary>
        /// Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
        /// </summary>
        public InputMap<string> DataAccessConfig
        {
            get => _dataAccessConfig ?? (_dataAccessConfig = new InputMap<string>());
            set => _dataAccessConfig = value;
        }

        [Input("enableServerlessCompute")]
        public Input<bool>? EnableServerlessCompute { get; set; }

        /// <summary>
        /// used to access GCP services, such as Cloud Storage, from databricks_sql_endpoint. Please note that this parameter is only for GCP, and will generate an error if used on other clouds.
        /// </summary>
        [Input("googleServiceAccount")]
        public Input<string>? GoogleServiceAccount { get; set; }

        /// <summary>
        /// databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
        /// </summary>
        [Input("instanceProfileArn")]
        public Input<string>? InstanceProfileArn { get; set; }

        /// <summary>
        /// The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
        /// </summary>
        [Input("securityPolicy")]
        public Input<string>? SecurityPolicy { get; set; }

        [Input("sqlConfigParams")]
        private InputMap<string>? _sqlConfigParams;

        /// <summary>
        /// SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
        /// </summary>
        public InputMap<string> SqlConfigParams
        {
            get => _sqlConfigParams ?? (_sqlConfigParams = new InputMap<string>());
            set => _sqlConfigParams = value;
        }

        public SqlGlobalConfigState()
        {
        }
        public static new SqlGlobalConfigState Empty => new SqlGlobalConfigState();
    }
}
