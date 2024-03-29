// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile();

    @Import(name="path", required=true)
    private String path;

    public String path() {
        return this.path;
    }

    @Import(name="source")
    private @Nullable String source;

    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile $) {
        this.path = $.path;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile(Objects.requireNonNull(defaults));
        }

        public Builder path(String path) {
            $.path = path;
            return this;
        }

        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskFile", "path");
            }
            return $;
        }
    }

}
