// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs Empty = new GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs();

    @Import(name="managedResourceId")
    private @Nullable Output<String> managedResourceId;

    public Optional<Output<String>> managedResourceId() {
        return Optional.ofNullable(this.managedResourceId);
    }

    @Import(name="queueUrl")
    private @Nullable Output<String> queueUrl;

    public Optional<Output<String>> queueUrl() {
        return Optional.ofNullable(this.queueUrl);
    }

    private GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs() {}

    private GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs(GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs $) {
        this.managedResourceId = $.managedResourceId;
        this.queueUrl = $.queueUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs $;

        public Builder() {
            $ = new GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs();
        }

        public Builder(GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs defaults) {
            $ = new GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs(Objects.requireNonNull(defaults));
        }

        public Builder managedResourceId(@Nullable Output<String> managedResourceId) {
            $.managedResourceId = managedResourceId;
            return this;
        }

        public Builder managedResourceId(String managedResourceId) {
            return managedResourceId(Output.of(managedResourceId));
        }

        public Builder queueUrl(@Nullable Output<String> queueUrl) {
            $.queueUrl = queueUrl;
            return this;
        }

        public Builder queueUrl(String queueUrl) {
            return queueUrl(Output.of(queueUrl));
        }

        public GetExternalLocationExternalLocationInfoFileEventQueueManagedSqsArgs build() {
            return $;
        }
    }

}
