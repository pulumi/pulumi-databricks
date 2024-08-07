// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicePrincipalsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePrincipalsPlainArgs Empty = new GetServicePrincipalsPlainArgs();

    /**
     * List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     * 
     */
    @Import(name="applicationIds")
    private @Nullable List<String> applicationIds;

    /**
     * @return List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
     * 
     */
    public Optional<List<String>> applicationIds() {
        return Optional.ofNullable(this.applicationIds);
    }

    /**
     * Only return databricks.ServicePrincipal display name that match the given name string
     * 
     */
    @Import(name="displayNameContains")
    private @Nullable String displayNameContains;

    /**
     * @return Only return databricks.ServicePrincipal display name that match the given name string
     * 
     */
    public Optional<String> displayNameContains() {
        return Optional.ofNullable(this.displayNameContains);
    }

    private GetServicePrincipalsPlainArgs() {}

    private GetServicePrincipalsPlainArgs(GetServicePrincipalsPlainArgs $) {
        this.applicationIds = $.applicationIds;
        this.displayNameContains = $.displayNameContains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePrincipalsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePrincipalsPlainArgs $;

        public Builder() {
            $ = new GetServicePrincipalsPlainArgs();
        }

        public Builder(GetServicePrincipalsPlainArgs defaults) {
            $ = new GetServicePrincipalsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationIds List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
         * 
         * @return builder
         * 
         */
        public Builder applicationIds(@Nullable List<String> applicationIds) {
            $.applicationIds = applicationIds;
            return this;
        }

        /**
         * @param applicationIds List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
         * 
         * @return builder
         * 
         */
        public Builder applicationIds(String... applicationIds) {
            return applicationIds(List.of(applicationIds));
        }

        /**
         * @param displayNameContains Only return databricks.ServicePrincipal display name that match the given name string
         * 
         * @return builder
         * 
         */
        public Builder displayNameContains(@Nullable String displayNameContains) {
            $.displayNameContains = displayNameContains;
            return this;
        }

        public GetServicePrincipalsPlainArgs build() {
            return $;
        }
    }

}
