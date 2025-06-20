// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MetastoreAssignmentArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MetastoreAssignmentState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; This resource can be used with an account or workspace-level provider.
 * 
 * A single databricks.Metastore can be shared across Databricks workspaces, and each linked workspace has a consistent view of the data and a single set of access policies. You can only create a single metastore for each region in which your organization operates.
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
 * import com.pulumi.databricks.Metastore;
 * import com.pulumi.databricks.MetastoreArgs;
 * import com.pulumi.databricks.MetastoreAssignment;
 * import com.pulumi.databricks.MetastoreAssignmentArgs;
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
 *         var this_ = new Metastore("this", MetastoreArgs.builder()
 *             .name("primary")
 *             .storageRoot(String.format("s3://%s/metastore", metastore.id()))
 *             .owner("uc admins")
 *             .region("us-east-1")
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var thisMetastoreAssignment = new MetastoreAssignment("thisMetastoreAssignment", MetastoreAssignmentArgs.builder()
 *             .metastoreId(this_.id())
 *             .workspaceId(workspaceId)
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
 * This resource can be imported by combination of workspace id and metastore id:
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_metastore_assignment.this
 * 
 *   id = &#34;&lt;workspace_id&gt;|&lt;metastore_id&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/metastoreAssignment:MetastoreAssignment this &#34;&lt;workspace_id&gt;|&lt;metastore_id&gt;&#34;
 * ```
 * 
 */
@ResourceType(type="databricks:index/metastoreAssignment:MetastoreAssignment")
public class MetastoreAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
     * 
     * @deprecated
     * Use databricks.DefaultNamespaceSetting resource instead
     * 
     */
    @Deprecated /* Use databricks.DefaultNamespaceSetting resource instead */
    @Export(name="defaultCatalogName", refs={String.class}, tree="[0]")
    private Output<String> defaultCatalogName;

    /**
     * @return Default catalog used for this assignment. Please use databricks.DefaultNamespaceSetting instead.
     * 
     */
    public Output<String> defaultCatalogName() {
        return this.defaultCatalogName;
    }
    /**
     * Unique identifier of the parent Metastore
     * 
     */
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    /**
     * @return Unique identifier of the parent Metastore
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * id of the workspace for the assignment
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return id of the workspace for the assignment
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetastoreAssignment(java.lang.String name) {
        this(name, MetastoreAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetastoreAssignment(java.lang.String name, MetastoreAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetastoreAssignment(java.lang.String name, MetastoreAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreAssignment:MetastoreAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private MetastoreAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable MetastoreAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/metastoreAssignment:MetastoreAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static MetastoreAssignmentArgs makeArgs(MetastoreAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MetastoreAssignmentArgs.Empty : args;
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
    public static MetastoreAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable MetastoreAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetastoreAssignment(name, id, state, options);
    }
}
