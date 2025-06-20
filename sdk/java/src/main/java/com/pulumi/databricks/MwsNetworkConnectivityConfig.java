// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsNetworkConnectivityConfigArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsNetworkConnectivityConfigState;
import com.pulumi.databricks.outputs.MwsNetworkConnectivityConfigEgressConfig;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows you to create a Network Connectivity Config that can be used as part of a databricks.MwsWorkspaces resource to create a [Databricks Workspace that leverages serverless network connectivity configs](https://learn.microsoft.com/en-us/azure/databricks/security/network/serverless-network-security/serverless-firewall).
 * 
 * &gt; This resource can only be used with an account-level provider!
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.MwsNetworkConnectivityConfig;
 * import com.pulumi.databricks.MwsNetworkConnectivityConfigArgs;
 * import com.pulumi.databricks.MwsNccBinding;
 * import com.pulumi.databricks.MwsNccBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var region = config.get("region");
 *         final var prefix = config.get("prefix");
 *         var ncc = new MwsNetworkConnectivityConfig("ncc", MwsNetworkConnectivityConfigArgs.builder()
 *             .name(String.format("ncc-for-%s", prefix))
 *             .region(region)
 *             .build());
 * 
 *         var nccBinding = new MwsNccBinding("nccBinding", MwsNccBindingArgs.builder()
 *             .networkConnectivityConfigId(ncc.networkConnectivityConfigId())
 *             .workspaceId(databricksWorkspaceId)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are used in the context:
 * 
 * * databricks.MwsWorkspaces to set up Databricks workspaces.
 * * databricks.MwsNccBinding to attach an NCC to a workspace.
 * * databricks.MwsNccPrivateEndpointRule to create a private endpoint rule.
 * 
 * ## Import
 * 
 * This resource can be imported by Databricks account ID and Network Connectivity Config ID.
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_mws_network_connectivity_config.this
 * 
 *   id = &#34;&lt;account_id&gt;/&lt;network_connectivity_config_id&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig this &#34;&lt;account_id&gt;/&lt;network_connectivity_config_id&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig")
public class MwsNetworkConnectivityConfig extends com.pulumi.resources.CustomResource {
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    @Export(name="egressConfig", refs={MwsNetworkConnectivityConfigEgressConfig.class}, tree="[0]")
    private Output<MwsNetworkConnectivityConfigEgressConfig> egressConfig;

    public Output<MwsNetworkConnectivityConfigEgressConfig> egressConfig() {
        return this.egressConfig;
    }
    /**
     * Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account
     * 
     */
    @Export(name="networkConnectivityConfigId", refs={String.class}, tree="[0]")
    private Output<String> networkConnectivityConfigId;

    /**
     * @return Canonical unique identifier of Network Connectivity Config in Databricks Account
     * 
     */
    public Output<String> networkConnectivityConfigId() {
        return this.networkConnectivityConfigId;
    }
    /**
     * Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region of the Network Connectivity Config. NCCs can only be referenced by your workspaces in the same region. Change forces creation of a new resource.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    @Export(name="updatedTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> updatedTime;

    public Output<Integer> updatedTime() {
        return this.updatedTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsNetworkConnectivityConfig(java.lang.String name) {
        this(name, MwsNetworkConnectivityConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsNetworkConnectivityConfig(java.lang.String name, MwsNetworkConnectivityConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsNetworkConnectivityConfig(java.lang.String name, MwsNetworkConnectivityConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MwsNetworkConnectivityConfig(java.lang.String name, Output<java.lang.String> id, @Nullable MwsNetworkConnectivityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsNetworkConnectivityConfig:MwsNetworkConnectivityConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static MwsNetworkConnectivityConfigArgs makeArgs(MwsNetworkConnectivityConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MwsNetworkConnectivityConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MwsNetworkConnectivityConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable MwsNetworkConnectivityConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsNetworkConnectivityConfig(name, id, state, options);
    }
}
