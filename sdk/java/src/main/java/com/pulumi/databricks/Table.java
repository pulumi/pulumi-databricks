// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.TableArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.TableState;
import com.pulumi.databricks.outputs.TableColumn;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="databricks:index/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    @Export(name="catalogName", refs={String.class}, tree="[0]")
    private Output<String> catalogName;

    public Output<String> catalogName() {
        return this.catalogName;
    }
    @Export(name="columns", refs={List.class,TableColumn.class}, tree="[0,1]")
    private Output<List<TableColumn>> columns;

    public Output<List<TableColumn>> columns() {
        return this.columns;
    }
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="dataSourceFormat", refs={String.class}, tree="[0]")
    private Output<String> dataSourceFormat;

    public Output<String> dataSourceFormat() {
        return this.dataSourceFormat;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    public Output<String> owner() {
        return this.owner;
    }
    @Export(name="properties", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> properties;

    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName;
    }
    @Export(name="storageCredentialName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageCredentialName;

    public Output<Optional<String>> storageCredentialName() {
        return Codegen.optional(this.storageCredentialName);
    }
    @Export(name="storageLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageLocation;

    public Output<Optional<String>> storageLocation() {
        return Codegen.optional(this.storageLocation);
    }
    @Export(name="tableType", refs={String.class}, tree="[0]")
    private Output<String> tableType;

    public Output<String> tableType() {
        return this.tableType;
    }
    @Export(name="viewDefinition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> viewDefinition;

    public Output<Optional<String>> viewDefinition() {
        return Codegen.optional(this.viewDefinition);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(java.lang.String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(java.lang.String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(java.lang.String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/table:Table", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Table(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/table:Table", name, state, makeResourceOptions(options, id), false);
    }

    private static TableArgs makeArgs(TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TableArgs.Empty : args;
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
    public static Table get(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}