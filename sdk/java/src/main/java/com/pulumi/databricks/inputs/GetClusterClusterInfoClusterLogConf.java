// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoClusterLogConfDbfs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoClusterLogConf extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoClusterLogConf Empty = new GetClusterClusterInfoClusterLogConf();

    @Import(name="dbfs")
    private @Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs;

    public Optional<GetClusterClusterInfoClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }

    @Import(name="s3")
    private @Nullable GetClusterClusterInfoClusterLogConfS3 s3;

    public Optional<GetClusterClusterInfoClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    private GetClusterClusterInfoClusterLogConf() {}

    private GetClusterClusterInfoClusterLogConf(GetClusterClusterInfoClusterLogConf $) {
        this.dbfs = $.dbfs;
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoClusterLogConf defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoClusterLogConf $;

        public Builder() {
            $ = new GetClusterClusterInfoClusterLogConf();
        }

        public Builder(GetClusterClusterInfoClusterLogConf defaults) {
            $ = new GetClusterClusterInfoClusterLogConf(Objects.requireNonNull(defaults));
        }

        public Builder dbfs(@Nullable GetClusterClusterInfoClusterLogConfDbfs dbfs) {
            $.dbfs = dbfs;
            return this;
        }

        public Builder s3(@Nullable GetClusterClusterInfoClusterLogConfS3 s3) {
            $.s3 = s3;
            return this;
        }

        public GetClusterClusterInfoClusterLogConf build() {
            return $;
        }
    }

}