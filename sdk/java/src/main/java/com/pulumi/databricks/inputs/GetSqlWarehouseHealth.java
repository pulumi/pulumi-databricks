// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetSqlWarehouseHealthFailureReason;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlWarehouseHealth extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlWarehouseHealth Empty = new GetSqlWarehouseHealth();

    @Import(name="details")
    private @Nullable String details;

    public Optional<String> details() {
        return Optional.ofNullable(this.details);
    }

    @Import(name="failureReason")
    private @Nullable GetSqlWarehouseHealthFailureReason failureReason;

    public Optional<GetSqlWarehouseHealthFailureReason> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }

    @Import(name="message")
    private @Nullable String message;

    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="summary")
    private @Nullable String summary;

    public Optional<String> summary() {
        return Optional.ofNullable(this.summary);
    }

    private GetSqlWarehouseHealth() {}

    private GetSqlWarehouseHealth(GetSqlWarehouseHealth $) {
        this.details = $.details;
        this.failureReason = $.failureReason;
        this.message = $.message;
        this.status = $.status;
        this.summary = $.summary;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlWarehouseHealth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlWarehouseHealth $;

        public Builder() {
            $ = new GetSqlWarehouseHealth();
        }

        public Builder(GetSqlWarehouseHealth defaults) {
            $ = new GetSqlWarehouseHealth(Objects.requireNonNull(defaults));
        }

        public Builder details(@Nullable String details) {
            $.details = details;
            return this;
        }

        public Builder failureReason(@Nullable GetSqlWarehouseHealthFailureReason failureReason) {
            $.failureReason = failureReason;
            return this;
        }

        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public Builder summary(@Nullable String summary) {
            $.summary = summary;
            return this;
        }

        public GetSqlWarehouseHealth build() {
            return $;
        }
    }

}