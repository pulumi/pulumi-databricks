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
    /// This resource allows you to manage credentials for [Databricks Repos](https://docs.databricks.com/repos.html) using [Git Credentials API](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html).
    /// 
    /// &gt; This resource can only be used with a workspace-level provider!
    /// 
    /// ## Example Usage
    /// 
    /// You can declare Pulumi-managed Git credential using following code:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var ado = new Databricks.GitCredential("ado", new()
    ///     {
    ///         GitUsername = "myuser",
    ///         GitProvider = "azureDevOpsServices",
    ///         PersonalAccessToken = "sometoken",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * databricks.Repo to manage Databricks Repos.
    /// 
    /// ## Import
    /// 
    /// The resource cluster can be imported using ID of Git credential that could be obtained via REST API:
    /// 
    /// hcl
    /// 
    /// import {
    /// 
    ///   to = databricks_git_credential.this
    /// 
    ///   id = "&lt;git-credential-id&gt;"
    /// 
    /// }
    /// 
    /// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
    /// 
    /// bash
    /// 
    /// ```sh
    /// $ pulumi import databricks:index/gitCredential:GitCredential this &lt;git-credential-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/gitCredential:GitCredential")]
    public partial class GitCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`, `azureDevOpsServicesAad`.
        /// </summary>
        [Output("gitProvider")]
        public Output<string> GitProvider { get; private set; } = null!;

        /// <summary>
        /// user name at Git provider.
        /// </summary>
        [Output("gitUsername")]
        public Output<string?> GitUsername { get; private set; } = null!;

        /// <summary>
        /// The personal access token used to authenticate to the corresponding Git provider. If value is not provided, it's sourced from the first environment variable of `GITHUB_TOKEN`, `GITLAB_TOKEN`, or `AZDO_PERSONAL_ACCESS_TOKEN`, that has a non-empty value.
        /// </summary>
        [Output("personalAccessToken")]
        public Output<string?> PersonalAccessToken { get; private set; } = null!;


        /// <summary>
        /// Create a GitCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitCredential(string name, GitCredentialArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/gitCredential:GitCredential", name, args ?? new GitCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitCredential(string name, Input<string> id, GitCredentialState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/gitCredential:GitCredential", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GitCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitCredential Get(string name, Input<string> id, GitCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new GitCredential(name, id, state, options);
        }
    }

    public sealed class GitCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`, `azureDevOpsServicesAad`.
        /// </summary>
        [Input("gitProvider", required: true)]
        public Input<string> GitProvider { get; set; } = null!;

        /// <summary>
        /// user name at Git provider.
        /// </summary>
        [Input("gitUsername")]
        public Input<string>? GitUsername { get; set; }

        /// <summary>
        /// The personal access token used to authenticate to the corresponding Git provider. If value is not provided, it's sourced from the first environment variable of `GITHUB_TOKEN`, `GITLAB_TOKEN`, or `AZDO_PERSONAL_ACCESS_TOKEN`, that has a non-empty value.
        /// </summary>
        [Input("personalAccessToken")]
        public Input<string>? PersonalAccessToken { get; set; }

        public GitCredentialArgs()
        {
        }
        public static new GitCredentialArgs Empty => new GitCredentialArgs();
    }

    public sealed class GitCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it's already configured, the apply operation will fail.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`, `azureDevOpsServicesAad`.
        /// </summary>
        [Input("gitProvider")]
        public Input<string>? GitProvider { get; set; }

        /// <summary>
        /// user name at Git provider.
        /// </summary>
        [Input("gitUsername")]
        public Input<string>? GitUsername { get; set; }

        /// <summary>
        /// The personal access token used to authenticate to the corresponding Git provider. If value is not provided, it's sourced from the first environment variable of `GITHUB_TOKEN`, `GITLAB_TOKEN`, or `AZDO_PERSONAL_ACCESS_TOKEN`, that has a non-empty value.
        /// </summary>
        [Input("personalAccessToken")]
        public Input<string>? PersonalAccessToken { get; set; }

        public GitCredentialState()
        {
        }
        public static new GitCredentialState Empty => new GitCredentialState();
    }
}
