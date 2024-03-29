// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskConditionTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskConditionTask Empty = new GetJobJobSettingsSettingsTaskConditionTask();

    @Import(name="left")
    private @Nullable String left;

    public Optional<String> left() {
        return Optional.ofNullable(this.left);
    }

    @Import(name="op")
    private @Nullable String op;

    public Optional<String> op() {
        return Optional.ofNullable(this.op);
    }

    @Import(name="right")
    private @Nullable String right;

    public Optional<String> right() {
        return Optional.ofNullable(this.right);
    }

    private GetJobJobSettingsSettingsTaskConditionTask() {}

    private GetJobJobSettingsSettingsTaskConditionTask(GetJobJobSettingsSettingsTaskConditionTask $) {
        this.left = $.left;
        this.op = $.op;
        this.right = $.right;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskConditionTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskConditionTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskConditionTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskConditionTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskConditionTask(Objects.requireNonNull(defaults));
        }

        public Builder left(@Nullable String left) {
            $.left = left;
            return this;
        }

        public Builder op(@Nullable String op) {
            $.op = op;
            return this;
        }

        public Builder right(@Nullable String right) {
            $.right = right;
            return this;
        }

        public GetJobJobSettingsSettingsTaskConditionTask build() {
            return $;
        }
    }

}
