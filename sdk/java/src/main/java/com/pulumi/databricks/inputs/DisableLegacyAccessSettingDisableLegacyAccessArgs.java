// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class DisableLegacyAccessSettingDisableLegacyAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final DisableLegacyAccessSettingDisableLegacyAccessArgs Empty = new DisableLegacyAccessSettingDisableLegacyAccessArgs();

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    private DisableLegacyAccessSettingDisableLegacyAccessArgs() {}

    private DisableLegacyAccessSettingDisableLegacyAccessArgs(DisableLegacyAccessSettingDisableLegacyAccessArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DisableLegacyAccessSettingDisableLegacyAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DisableLegacyAccessSettingDisableLegacyAccessArgs $;

        public Builder() {
            $ = new DisableLegacyAccessSettingDisableLegacyAccessArgs();
        }

        public Builder(DisableLegacyAccessSettingDisableLegacyAccessArgs defaults) {
            $ = new DisableLegacyAccessSettingDisableLegacyAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public DisableLegacyAccessSettingDisableLegacyAccessArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("DisableLegacyAccessSettingDisableLegacyAccessArgs", "value");
            }
            return $;
        }
    }

}
