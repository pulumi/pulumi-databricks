// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMwsCredentialsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMwsCredentialsPlainArgs Empty = new GetMwsCredentialsPlainArgs();

    /**
     * name-to-id map for all of the credentials in the account
     * 
     */
    @Import(name="ids")
    private @Nullable Map<String,String> ids;

    /**
     * @return name-to-id map for all of the credentials in the account
     * 
     */
    public Optional<Map<String,String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetMwsCredentialsPlainArgs() {}

    private GetMwsCredentialsPlainArgs(GetMwsCredentialsPlainArgs $) {
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMwsCredentialsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMwsCredentialsPlainArgs $;

        public Builder() {
            $ = new GetMwsCredentialsPlainArgs();
        }

        public Builder(GetMwsCredentialsPlainArgs defaults) {
            $ = new GetMwsCredentialsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids name-to-id map for all of the credentials in the account
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Map<String,String> ids) {
            $.ids = ids;
            return this;
        }

        public GetMwsCredentialsPlainArgs build() {
            return $;
        }
    }

}