// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetExternalLocationExternalLocationInfoArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalLocationArgs Empty = new GetExternalLocationArgs();

    @Import(name="externalLocationInfo")
    private @Nullable Output<GetExternalLocationExternalLocationInfoArgs> externalLocationInfo;

    public Optional<Output<GetExternalLocationExternalLocationInfoArgs>> externalLocationInfo() {
        return Optional.ofNullable(this.externalLocationInfo);
    }

    /**
     * The name of the storage credential
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the storage credential
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetExternalLocationArgs() {}

    private GetExternalLocationArgs(GetExternalLocationArgs $) {
        this.externalLocationInfo = $.externalLocationInfo;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationArgs $;

        public Builder() {
            $ = new GetExternalLocationArgs();
        }

        public Builder(GetExternalLocationArgs defaults) {
            $ = new GetExternalLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalLocationInfo(@Nullable Output<GetExternalLocationExternalLocationInfoArgs> externalLocationInfo) {
            $.externalLocationInfo = externalLocationInfo;
            return this;
        }

        public Builder externalLocationInfo(GetExternalLocationExternalLocationInfoArgs externalLocationInfo) {
            return externalLocationInfo(Output.of(externalLocationInfo));
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the storage credential
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetExternalLocationArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetExternalLocationArgs", "name");
            }
            return $;
        }
    }

}