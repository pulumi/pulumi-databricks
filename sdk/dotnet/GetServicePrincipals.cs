// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetServicePrincipals
    {
        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves `application_ids` of all databricks.ServicePrincipal based on their `display_name`
        /// </summary>
        public static Task<GetServicePrincipalsResult> InvokeAsync(GetServicePrincipalsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServicePrincipalsResult>("databricks:index/getServicePrincipals:getServicePrincipals", args ?? new GetServicePrincipalsArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add depends_on attribute in order to prevent _default auth: cannot configure default credentials_ errors.
        /// 
        /// Retrieves `application_ids` of all databricks.ServicePrincipal based on their `display_name`
        /// </summary>
        public static Output<GetServicePrincipalsResult> Invoke(GetServicePrincipalsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServicePrincipalsResult>("databricks:index/getServicePrincipals:getServicePrincipals", args ?? new GetServicePrincipalsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicePrincipalsArgs : global::Pulumi.InvokeArgs
    {
        [Input("applicationIds")]
        private List<string>? _applicationIds;

        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public List<string> ApplicationIds
        {
            get => _applicationIds ?? (_applicationIds = new List<string>());
            set => _applicationIds = value;
        }

        /// <summary>
        /// Only return databricks.ServicePrincipal display name that match the given name string
        /// </summary>
        [Input("displayNameContains")]
        public string? DisplayNameContains { get; set; }

        public GetServicePrincipalsArgs()
        {
        }
        public static new GetServicePrincipalsArgs Empty => new GetServicePrincipalsArgs();
    }

    public sealed class GetServicePrincipalsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("applicationIds")]
        private InputList<string>? _applicationIds;

        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public InputList<string> ApplicationIds
        {
            get => _applicationIds ?? (_applicationIds = new InputList<string>());
            set => _applicationIds = value;
        }

        /// <summary>
        /// Only return databricks.ServicePrincipal display name that match the given name string
        /// </summary>
        [Input("displayNameContains")]
        public Input<string>? DisplayNameContains { get; set; }

        public GetServicePrincipalsInvokeArgs()
        {
        }
        public static new GetServicePrincipalsInvokeArgs Empty => new GetServicePrincipalsInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicePrincipalsResult
    {
        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public readonly ImmutableArray<string> ApplicationIds;
        public readonly string DisplayNameContains;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetServicePrincipalsResult(
            ImmutableArray<string> applicationIds,

            string displayNameContains,

            string id)
        {
            ApplicationIds = applicationIds;
            DisplayNameContains = displayNameContains;
            Id = id;
        }
    }
}