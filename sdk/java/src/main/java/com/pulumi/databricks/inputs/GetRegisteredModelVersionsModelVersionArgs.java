// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetRegisteredModelVersionsModelVersionAliasArgs;
import com.pulumi.databricks.inputs.GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegisteredModelVersionsModelVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRegisteredModelVersionsModelVersionArgs Empty = new GetRegisteredModelVersionsModelVersionArgs();

    /**
     * the list of aliases associated with this model. Each item is object consisting of following attributes:
     * 
     */
    @Import(name="aliases")
    private @Nullable Output<List<GetRegisteredModelVersionsModelVersionAliasArgs>> aliases;

    /**
     * @return the list of aliases associated with this model. Each item is object consisting of following attributes:
     * 
     */
    public Optional<Output<List<GetRegisteredModelVersionsModelVersionAliasArgs>>> aliases() {
        return Optional.ofNullable(this.aliases);
    }

    @Import(name="browseOnly")
    private @Nullable Output<Boolean> browseOnly;

    public Optional<Output<Boolean>> browseOnly() {
        return Optional.ofNullable(this.browseOnly);
    }

    /**
     * The name of the catalog where the schema and the registered model reside.
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return The name of the catalog where the schema and the registered model reside.
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * The comment attached to the registered model.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return The comment attached to the registered model.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * the Unix timestamp at the model&#39;s creation
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    /**
     * @return the Unix timestamp at the model&#39;s creation
     * 
     */
    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * the identifier of the user who created the model
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return the identifier of the user who created the model
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * The unique identifier of the model version
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique identifier of the model version
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * the unique identifier of the metastore
     * 
     */
    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    /**
     * @return the unique identifier of the metastore
     * 
     */
    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    @Import(name="modelName")
    private @Nullable Output<String> modelName;

    public Optional<Output<String>> modelName() {
        return Optional.ofNullable(this.modelName);
    }

    /**
     * block describing model version dependencies, for feature-store packaged models. Consists of following attributes:
     * 
     */
    @Import(name="modelVersionDependencies")
    private @Nullable Output<List<GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs>> modelVersionDependencies;

    /**
     * @return block describing model version dependencies, for feature-store packaged models. Consists of following attributes:
     * 
     */
    public Optional<Output<List<GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs>>> modelVersionDependencies() {
        return Optional.ofNullable(this.modelVersionDependencies);
    }

    /**
     * MLflow run ID used when creating the model version, if `source` was generated by an experiment run stored in an MLflow tracking server
     * 
     */
    @Import(name="runId")
    private @Nullable Output<String> runId;

    /**
     * @return MLflow run ID used when creating the model version, if `source` was generated by an experiment run stored in an MLflow tracking server
     * 
     */
    public Optional<Output<String>> runId() {
        return Optional.ofNullable(this.runId);
    }

    /**
     * ID of the Databricks workspace containing the MLflow run that generated this model version, if applicable
     * 
     */
    @Import(name="runWorkspaceId")
    private @Nullable Output<Integer> runWorkspaceId;

    /**
     * @return ID of the Databricks workspace containing the MLflow run that generated this model version, if applicable
     * 
     */
    public Optional<Output<Integer>> runWorkspaceId() {
        return Optional.ofNullable(this.runWorkspaceId);
    }

    /**
     * The name of the schema where the registered model resides.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    /**
     * @return The name of the schema where the registered model resides.
     * 
     */
    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    /**
     * URI indicating the location of the source artifacts (files) for the model version.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return URI indicating the location of the source artifacts (files) for the model version.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Current status of the model version.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current status of the model version.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The storage location under which model version data files are stored.
     * 
     */
    @Import(name="storageLocation")
    private @Nullable Output<String> storageLocation;

    /**
     * @return The storage location under which model version data files are stored.
     * 
     */
    public Optional<Output<String>> storageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }

    /**
     * the timestamp of the last time changes were made to the model
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<Integer> updatedAt;

    /**
     * @return the timestamp of the last time changes were made to the model
     * 
     */
    public Optional<Output<Integer>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * the identifier of the user who updated the model last time
     * 
     */
    @Import(name="updatedBy")
    private @Nullable Output<String> updatedBy;

    /**
     * @return the identifier of the user who updated the model last time
     * 
     */
    public Optional<Output<String>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    /**
     * Integer model version number, used to reference the model version in API requests.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    /**
     * @return Integer model version number, used to reference the model version in API requests.
     * 
     */
    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetRegisteredModelVersionsModelVersionArgs() {}

    private GetRegisteredModelVersionsModelVersionArgs(GetRegisteredModelVersionsModelVersionArgs $) {
        this.aliases = $.aliases;
        this.browseOnly = $.browseOnly;
        this.catalogName = $.catalogName;
        this.comment = $.comment;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.id = $.id;
        this.metastoreId = $.metastoreId;
        this.modelName = $.modelName;
        this.modelVersionDependencies = $.modelVersionDependencies;
        this.runId = $.runId;
        this.runWorkspaceId = $.runWorkspaceId;
        this.schemaName = $.schemaName;
        this.source = $.source;
        this.status = $.status;
        this.storageLocation = $.storageLocation;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegisteredModelVersionsModelVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegisteredModelVersionsModelVersionArgs $;

        public Builder() {
            $ = new GetRegisteredModelVersionsModelVersionArgs();
        }

        public Builder(GetRegisteredModelVersionsModelVersionArgs defaults) {
            $ = new GetRegisteredModelVersionsModelVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliases the list of aliases associated with this model. Each item is object consisting of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder aliases(@Nullable Output<List<GetRegisteredModelVersionsModelVersionAliasArgs>> aliases) {
            $.aliases = aliases;
            return this;
        }

        /**
         * @param aliases the list of aliases associated with this model. Each item is object consisting of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder aliases(List<GetRegisteredModelVersionsModelVersionAliasArgs> aliases) {
            return aliases(Output.of(aliases));
        }

        /**
         * @param aliases the list of aliases associated with this model. Each item is object consisting of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder aliases(GetRegisteredModelVersionsModelVersionAliasArgs... aliases) {
            return aliases(List.of(aliases));
        }

        public Builder browseOnly(@Nullable Output<Boolean> browseOnly) {
            $.browseOnly = browseOnly;
            return this;
        }

        public Builder browseOnly(Boolean browseOnly) {
            return browseOnly(Output.of(browseOnly));
        }

        /**
         * @param catalogName The name of the catalog where the schema and the registered model reside.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName The name of the catalog where the schema and the registered model reside.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param comment The comment attached to the registered model.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment The comment attached to the registered model.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param createdAt the Unix timestamp at the model&#39;s creation
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt the Unix timestamp at the model&#39;s creation
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy the identifier of the user who created the model
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy the identifier of the user who created the model
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param id The unique identifier of the model version
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier of the model version
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param metastoreId the unique identifier of the metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        /**
         * @param metastoreId the unique identifier of the metastore
         * 
         * @return builder
         * 
         */
        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        public Builder modelName(@Nullable Output<String> modelName) {
            $.modelName = modelName;
            return this;
        }

        public Builder modelName(String modelName) {
            return modelName(Output.of(modelName));
        }

        /**
         * @param modelVersionDependencies block describing model version dependencies, for feature-store packaged models. Consists of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder modelVersionDependencies(@Nullable Output<List<GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs>> modelVersionDependencies) {
            $.modelVersionDependencies = modelVersionDependencies;
            return this;
        }

        /**
         * @param modelVersionDependencies block describing model version dependencies, for feature-store packaged models. Consists of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder modelVersionDependencies(List<GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs> modelVersionDependencies) {
            return modelVersionDependencies(Output.of(modelVersionDependencies));
        }

        /**
         * @param modelVersionDependencies block describing model version dependencies, for feature-store packaged models. Consists of following attributes:
         * 
         * @return builder
         * 
         */
        public Builder modelVersionDependencies(GetRegisteredModelVersionsModelVersionModelVersionDependencyArgs... modelVersionDependencies) {
            return modelVersionDependencies(List.of(modelVersionDependencies));
        }

        /**
         * @param runId MLflow run ID used when creating the model version, if `source` was generated by an experiment run stored in an MLflow tracking server
         * 
         * @return builder
         * 
         */
        public Builder runId(@Nullable Output<String> runId) {
            $.runId = runId;
            return this;
        }

        /**
         * @param runId MLflow run ID used when creating the model version, if `source` was generated by an experiment run stored in an MLflow tracking server
         * 
         * @return builder
         * 
         */
        public Builder runId(String runId) {
            return runId(Output.of(runId));
        }

        /**
         * @param runWorkspaceId ID of the Databricks workspace containing the MLflow run that generated this model version, if applicable
         * 
         * @return builder
         * 
         */
        public Builder runWorkspaceId(@Nullable Output<Integer> runWorkspaceId) {
            $.runWorkspaceId = runWorkspaceId;
            return this;
        }

        /**
         * @param runWorkspaceId ID of the Databricks workspace containing the MLflow run that generated this model version, if applicable
         * 
         * @return builder
         * 
         */
        public Builder runWorkspaceId(Integer runWorkspaceId) {
            return runWorkspaceId(Output.of(runWorkspaceId));
        }

        /**
         * @param schemaName The name of the schema where the registered model resides.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema where the registered model resides.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param source URI indicating the location of the source artifacts (files) for the model version.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source URI indicating the location of the source artifacts (files) for the model version.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param status Current status of the model version.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current status of the model version.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageLocation The storage location under which model version data files are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(@Nullable Output<String> storageLocation) {
            $.storageLocation = storageLocation;
            return this;
        }

        /**
         * @param storageLocation The storage location under which model version data files are stored.
         * 
         * @return builder
         * 
         */
        public Builder storageLocation(String storageLocation) {
            return storageLocation(Output.of(storageLocation));
        }

        /**
         * @param updatedAt the timestamp of the last time changes were made to the model
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<Integer> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt the timestamp of the last time changes were made to the model
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(Integer updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param updatedBy the identifier of the user who updated the model last time
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(@Nullable Output<String> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        /**
         * @param updatedBy the identifier of the user who updated the model last time
         * 
         * @return builder
         * 
         */
        public Builder updatedBy(String updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        /**
         * @param version Integer model version number, used to reference the model version in API requests.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Integer model version number, used to reference the model version in API requests.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetRegisteredModelVersionsModelVersionArgs build() {
            return $;
        }
    }

}
