// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAwsBucketPolicyResult {
    private @Nullable String awsPartition;
    private String bucket;
    /**
     * @deprecated
     * databricks_account_id will be will be removed in the next major release.
     * 
     */
    @Deprecated /* databricks_account_id will be will be removed in the next major release. */
    private @Nullable String databricksAccountId;
    private @Nullable String databricksE2AccountId;
    private @Nullable String fullAccessRole;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
     * 
     */
    private String json;

    private GetAwsBucketPolicyResult() {}
    public Optional<String> awsPartition() {
        return Optional.ofNullable(this.awsPartition);
    }
    public String bucket() {
        return this.bucket;
    }
    /**
     * @deprecated
     * databricks_account_id will be will be removed in the next major release.
     * 
     */
    @Deprecated /* databricks_account_id will be will be removed in the next major release. */
    public Optional<String> databricksAccountId() {
        return Optional.ofNullable(this.databricksAccountId);
    }
    public Optional<String> databricksE2AccountId() {
        return Optional.ofNullable(this.databricksE2AccountId);
    }
    public Optional<String> fullAccessRole() {
        return Optional.ofNullable(this.fullAccessRole);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
     * 
     */
    public String json() {
        return this.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsBucketPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String awsPartition;
        private String bucket;
        private @Nullable String databricksAccountId;
        private @Nullable String databricksE2AccountId;
        private @Nullable String fullAccessRole;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetAwsBucketPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsPartition = defaults.awsPartition;
    	      this.bucket = defaults.bucket;
    	      this.databricksAccountId = defaults.databricksAccountId;
    	      this.databricksE2AccountId = defaults.databricksE2AccountId;
    	      this.fullAccessRole = defaults.fullAccessRole;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder awsPartition(@Nullable String awsPartition) {

            this.awsPartition = awsPartition;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("GetAwsBucketPolicyResult", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder databricksAccountId(@Nullable String databricksAccountId) {

            this.databricksAccountId = databricksAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder databricksE2AccountId(@Nullable String databricksE2AccountId) {

            this.databricksE2AccountId = databricksE2AccountId;
            return this;
        }
        @CustomType.Setter
        public Builder fullAccessRole(@Nullable String fullAccessRole) {

            this.fullAccessRole = fullAccessRole;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAwsBucketPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            if (json == null) {
              throw new MissingRequiredPropertyException("GetAwsBucketPolicyResult", "json");
            }
            this.json = json;
            return this;
        }
        public GetAwsBucketPolicyResult build() {
            final var _resultValue = new GetAwsBucketPolicyResult();
            _resultValue.awsPartition = awsPartition;
            _resultValue.bucket = bucket;
            _resultValue.databricksAccountId = databricksAccountId;
            _resultValue.databricksE2AccountId = databricksE2AccountId;
            _resultValue.fullAccessRole = fullAccessRole;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}