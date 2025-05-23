// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetRegisteredModelModelInfo;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegisteredModelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegisteredModelPlainArgs Empty = new GetRegisteredModelPlainArgs();

    /**
     * The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
     * 
     */
    @Import(name="fullName", required=true)
    private String fullName;

    /**
     * @return The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
     * 
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * flag to specify if list of aliases should be included into output.
     * 
     */
    @Import(name="includeAliases")
    private @Nullable Boolean includeAliases;

    /**
     * @return flag to specify if list of aliases should be included into output.
     * 
     */
    public Optional<Boolean> includeAliases() {
        return Optional.ofNullable(this.includeAliases);
    }

    /**
     * flag to specify if include registered models in the response for which the principal can only access selective metadata for.
     * 
     */
    @Import(name="includeBrowse")
    private @Nullable Boolean includeBrowse;

    /**
     * @return flag to specify if include registered models in the response for which the principal can only access selective metadata for.
     * 
     */
    public Optional<Boolean> includeBrowse() {
        return Optional.ofNullable(this.includeBrowse);
    }

    /**
     * block with information about the model in Unity Catalog:
     * 
     */
    @Import(name="modelInfos")
    private @Nullable List<GetRegisteredModelModelInfo> modelInfos;

    /**
     * @return block with information about the model in Unity Catalog:
     * 
     */
    public Optional<List<GetRegisteredModelModelInfo>> modelInfos() {
        return Optional.ofNullable(this.modelInfos);
    }

    private GetRegisteredModelPlainArgs() {}

    private GetRegisteredModelPlainArgs(GetRegisteredModelPlainArgs $) {
        this.fullName = $.fullName;
        this.includeAliases = $.includeAliases;
        this.includeBrowse = $.includeBrowse;
        this.modelInfos = $.modelInfos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegisteredModelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegisteredModelPlainArgs $;

        public Builder() {
            $ = new GetRegisteredModelPlainArgs();
        }

        public Builder(GetRegisteredModelPlainArgs defaults) {
            $ = new GetRegisteredModelPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fullName The fully-qualified name of the registered model (`catalog_name.schema_name.name`).
         * 
         * @return builder
         * 
         */
        public Builder fullName(String fullName) {
            $.fullName = fullName;
            return this;
        }

        /**
         * @param includeAliases flag to specify if list of aliases should be included into output.
         * 
         * @return builder
         * 
         */
        public Builder includeAliases(@Nullable Boolean includeAliases) {
            $.includeAliases = includeAliases;
            return this;
        }

        /**
         * @param includeBrowse flag to specify if include registered models in the response for which the principal can only access selective metadata for.
         * 
         * @return builder
         * 
         */
        public Builder includeBrowse(@Nullable Boolean includeBrowse) {
            $.includeBrowse = includeBrowse;
            return this;
        }

        /**
         * @param modelInfos block with information about the model in Unity Catalog:
         * 
         * @return builder
         * 
         */
        public Builder modelInfos(@Nullable List<GetRegisteredModelModelInfo> modelInfos) {
            $.modelInfos = modelInfos;
            return this;
        }

        /**
         * @param modelInfos block with information about the model in Unity Catalog:
         * 
         * @return builder
         * 
         */
        public Builder modelInfos(GetRegisteredModelModelInfo... modelInfos) {
            return modelInfos(List.of(modelInfos));
        }

        public GetRegisteredModelPlainArgs build() {
            if ($.fullName == null) {
                throw new MissingRequiredPropertyException("GetRegisteredModelPlainArgs", "fullName");
            }
            return $;
        }
    }

}
