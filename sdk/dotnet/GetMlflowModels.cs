// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMlflowModels
    {
        /// <summary>
        /// &gt; **Note** This data source could be only used with workspace-level provider!
        /// 
        /// Retrieves a list of databricks.MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetMlflowModels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["model"] = @this,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetMlflowModelsResult> InvokeAsync(GetMlflowModelsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMlflowModelsResult>("databricks:index/getMlflowModels:getMlflowModels", args ?? new GetMlflowModelsArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** This data source could be only used with workspace-level provider!
        /// 
        /// Retrieves a list of databricks.MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetMlflowModels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["model"] = @this,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMlflowModelsResult> Invoke(GetMlflowModelsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMlflowModelsResult>("databricks:index/getMlflowModels:getMlflowModels", args ?? new GetMlflowModelsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** This data source could be only used with workspace-level provider!
        /// 
        /// Retrieves a list of databricks.MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @this = Databricks.GetMlflowModels.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["model"] = @this,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetMlflowModelsResult> Invoke(GetMlflowModelsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMlflowModelsResult>("databricks:index/getMlflowModels:getMlflowModels", args ?? new GetMlflowModelsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMlflowModelsArgs : global::Pulumi.InvokeArgs
    {
        [Input("names")]
        private List<string>? _names;

        /// <summary>
        /// List of names of databricks_mlflow_model
        /// </summary>
        public List<string> Names
        {
            get => _names ?? (_names = new List<string>());
            set => _names = value;
        }

        public GetMlflowModelsArgs()
        {
        }
        public static new GetMlflowModelsArgs Empty => new GetMlflowModelsArgs();
    }

    public sealed class GetMlflowModelsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("names")]
        private InputList<string>? _names;

        /// <summary>
        /// List of names of databricks_mlflow_model
        /// </summary>
        public InputList<string> Names
        {
            get => _names ?? (_names = new InputList<string>());
            set => _names = value;
        }

        public GetMlflowModelsInvokeArgs()
        {
        }
        public static new GetMlflowModelsInvokeArgs Empty => new GetMlflowModelsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMlflowModelsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of names of databricks_mlflow_model
        /// </summary>
        public readonly ImmutableArray<string> Names;

        [OutputConstructor]
        private GetMlflowModelsResult(
            string id,

            ImmutableArray<string> names)
        {
            Id = id;
            Names = names;
        }
    }
}