// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterClusterLogConf {
    private @Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs;
    private @Nullable JobJobClusterNewClusterClusterLogConfS3 s3;

    private JobJobClusterNewClusterClusterLogConf() {}
    public Optional<JobJobClusterNewClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobJobClusterNewClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs;
        private @Nullable JobJobClusterNewClusterClusterLogConfS3 s3;
        public Builder() {}
        public Builder(JobJobClusterNewClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable JobJobClusterNewClusterClusterLogConfDbfs dbfs) {

            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable JobJobClusterNewClusterClusterLogConfS3 s3) {

            this.s3 = s3;
            return this;
        }
        public JobJobClusterNewClusterClusterLogConf build() {
            final var _resultValue = new JobJobClusterNewClusterClusterLogConf();
            _resultValue.dbfs = dbfs;
            _resultValue.s3 = s3;
            return _resultValue;
        }
    }
}