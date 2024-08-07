// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery Empty = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery();

    @Import(name="queryId", required=true)
    private String queryId;

    public String queryId() {
        return this.queryId;
    }

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery() {}

    private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery $) {
        this.queryId = $.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery();
        }

        public Builder(GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery defaults) {
            $ = new GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery(Objects.requireNonNull(defaults));
        }

        public Builder queryId(String queryId) {
            $.queryId = queryId;
            return this;
        }

        public GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery build() {
            if ($.queryId == null) {
                throw new MissingRequiredPropertyException("GetJobJobSettingsSettingsTaskForEachTaskTaskSqlTaskQuery", "queryId");
            }
            return $;
        }
    }

}
