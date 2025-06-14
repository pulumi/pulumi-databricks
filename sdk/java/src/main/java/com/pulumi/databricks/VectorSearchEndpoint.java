// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.VectorSearchEndpointArgs;
import com.pulumi.databricks.inputs.VectorSearchEndpointState;
import com.pulumi.databricks.outputs.VectorSearchEndpointEndpointStatus;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource allows you to create [Mosaic AI Vector Search Endpoint](https://docs.databricks.com/en/generative-ai/vector-search.html) in Databricks.  Mosaic AI Vector Search is a serverless similarity search engine that allows you to store a vector representation of your data, including metadata, in a vector database.  The Mosaic AI Vector Search Endpoint is used to create and access vector search indexes.
 * 
 * &gt; This resource can only be used with a workspace-level provider!
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
 * import com.pulumi.databricks.VectorSearchEndpoint;
 * import com.pulumi.databricks.VectorSearchEndpointArgs;
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
 *         var this_ = new VectorSearchEndpoint("this", VectorSearchEndpointArgs.builder()
 *             .name("vector-search-test")
 *             .endpointType("STANDARD")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The resource can be imported using the name of the Mosaic AI Vector Search Endpoint
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_vector_search_endpoint.this
 * 
 *   id = &#34;&lt;endpoint-name&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/vectorSearchEndpoint:VectorSearchEndpoint this &lt;endpoint-name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/vectorSearchEndpoint:VectorSearchEndpoint")
public class VectorSearchEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The Budget Policy ID set for this resource.
     * 
     */
    @Export(name="budgetPolicyId", refs={String.class}, tree="[0]")
    private Output<String> budgetPolicyId;

    /**
     * @return The Budget Policy ID set for this resource.
     * 
     */
    public Output<String> budgetPolicyId() {
        return this.budgetPolicyId;
    }
    /**
     * Timestamp of endpoint creation (milliseconds).
     * 
     */
    @Export(name="creationTimestamp", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTimestamp;

    /**
     * @return Timestamp of endpoint creation (milliseconds).
     * 
     */
    public Output<Integer> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Creator of the endpoint.
     * 
     */
    @Export(name="creator", refs={String.class}, tree="[0]")
    private Output<String> creator;

    /**
     * @return Creator of the endpoint.
     * 
     */
    public Output<String> creator() {
        return this.creator;
    }
    /**
     * The effective budget policy ID.
     * 
     */
    @Export(name="effectiveBudgetPolicyId", refs={String.class}, tree="[0]")
    private Output<String> effectiveBudgetPolicyId;

    /**
     * @return The effective budget policy ID.
     * 
     */
    public Output<String> effectiveBudgetPolicyId() {
        return this.effectiveBudgetPolicyId;
    }
    /**
     * Unique internal identifier of the endpoint (UUID).
     * 
     */
    @Export(name="endpointId", refs={String.class}, tree="[0]")
    private Output<String> endpointId;

    /**
     * @return Unique internal identifier of the endpoint (UUID).
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }
    /**
     * Object describing the current status of the endpoint consisting of the following fields:
     * 
     */
    @Export(name="endpointStatuses", refs={List.class,VectorSearchEndpointEndpointStatus.class}, tree="[0,1]")
    private Output<List<VectorSearchEndpointEndpointStatus>> endpointStatuses;

    /**
     * @return Object describing the current status of the endpoint consisting of the following fields:
     * 
     */
    public Output<List<VectorSearchEndpointEndpointStatus>> endpointStatuses() {
        return this.endpointStatuses;
    }
    /**
     * Type of Mosaic AI Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values). (Change leads to recreation of the resource).
     * 
     */
    @Export(name="endpointType", refs={String.class}, tree="[0]")
    private Output<String> endpointType;

    /**
     * @return Type of Mosaic AI Vector Search Endpoint.  Currently only accepting single value: `STANDARD` (See [documentation](https://docs.databricks.com/api/workspace/vectorsearchendpoints/createendpoint) for the list of currently supported values). (Change leads to recreation of the resource).
     * 
     */
    public Output<String> endpointType() {
        return this.endpointType;
    }
    /**
     * Timestamp of the last update to the endpoint (milliseconds).
     * 
     */
    @Export(name="lastUpdatedTimestamp", refs={Integer.class}, tree="[0]")
    private Output<Integer> lastUpdatedTimestamp;

    /**
     * @return Timestamp of the last update to the endpoint (milliseconds).
     * 
     */
    public Output<Integer> lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }
    /**
     * User who last updated the endpoint.
     * 
     */
    @Export(name="lastUpdatedUser", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedUser;

    /**
     * @return User who last updated the endpoint.
     * 
     */
    public Output<String> lastUpdatedUser() {
        return this.lastUpdatedUser;
    }
    /**
     * Name of the Mosaic AI Vector Search Endpoint to create. (Change leads to recreation of the resource).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Mosaic AI Vector Search Endpoint to create. (Change leads to recreation of the resource).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Number of indexes on the endpoint.
     * 
     */
    @Export(name="numIndexes", refs={Integer.class}, tree="[0]")
    private Output<Integer> numIndexes;

    /**
     * @return Number of indexes on the endpoint.
     * 
     */
    public Output<Integer> numIndexes() {
        return this.numIndexes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VectorSearchEndpoint(java.lang.String name) {
        this(name, VectorSearchEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VectorSearchEndpoint(java.lang.String name, VectorSearchEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VectorSearchEndpoint(java.lang.String name, VectorSearchEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/vectorSearchEndpoint:VectorSearchEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VectorSearchEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable VectorSearchEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/vectorSearchEndpoint:VectorSearchEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static VectorSearchEndpointArgs makeArgs(VectorSearchEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VectorSearchEndpointArgs.Empty : args;
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
    public static VectorSearchEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable VectorSearchEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VectorSearchEndpoint(name, id, state, options);
    }
}
