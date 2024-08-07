// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetMlflowExperimentTag;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMlflowExperimentResult {
    /**
     * @return Location where artifacts for the experiment are stored.
     * 
     */
    private String artifactLocation;
    /**
     * @return Creation time in unix time stamp.
     * 
     */
    private Integer creationTime;
    /**
     * @return Unique identifier for the experiment. (same as `id`)
     * 
     */
    private String experimentId;
    /**
     * @return Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    private String id;
    /**
     * @return Last update time in unix time stamp.
     * 
     */
    private Integer lastUpdateTime;
    /**
     * @return Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    private String lifecycleStage;
    /**
     * @return Path to experiment.
     * 
     */
    private String name;
    /**
     * @return Additional metadata key-value pairs.
     * 
     */
    private List<GetMlflowExperimentTag> tags;

    private GetMlflowExperimentResult() {}
    /**
     * @return Location where artifacts for the experiment are stored.
     * 
     */
    public String artifactLocation() {
        return this.artifactLocation;
    }
    /**
     * @return Creation time in unix time stamp.
     * 
     */
    public Integer creationTime() {
        return this.creationTime;
    }
    /**
     * @return Unique identifier for the experiment. (same as `id`)
     * 
     */
    public String experimentId() {
        return this.experimentId;
    }
    /**
     * @return Unique identifier for the experiment. (same as `experiment_id`)
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Last update time in unix time stamp.
     * 
     */
    public Integer lastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * @return Current life cycle stage of the experiment: `active` or `deleted`.
     * 
     */
    public String lifecycleStage() {
        return this.lifecycleStage;
    }
    /**
     * @return Path to experiment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Additional metadata key-value pairs.
     * 
     */
    public List<GetMlflowExperimentTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMlflowExperimentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String artifactLocation;
        private Integer creationTime;
        private String experimentId;
        private String id;
        private Integer lastUpdateTime;
        private String lifecycleStage;
        private String name;
        private List<GetMlflowExperimentTag> tags;
        public Builder() {}
        public Builder(GetMlflowExperimentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactLocation = defaults.artifactLocation;
    	      this.creationTime = defaults.creationTime;
    	      this.experimentId = defaults.experimentId;
    	      this.id = defaults.id;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.lifecycleStage = defaults.lifecycleStage;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder artifactLocation(String artifactLocation) {
            if (artifactLocation == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "artifactLocation");
            }
            this.artifactLocation = artifactLocation;
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(Integer creationTime) {
            if (creationTime == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "creationTime");
            }
            this.creationTime = creationTime;
            return this;
        }
        @CustomType.Setter
        public Builder experimentId(String experimentId) {
            if (experimentId == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "experimentId");
            }
            this.experimentId = experimentId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdateTime(Integer lastUpdateTime) {
            if (lastUpdateTime == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "lastUpdateTime");
            }
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        @CustomType.Setter
        public Builder lifecycleStage(String lifecycleStage) {
            if (lifecycleStage == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "lifecycleStage");
            }
            this.lifecycleStage = lifecycleStage;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetMlflowExperimentTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetMlflowExperimentResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetMlflowExperimentTag... tags) {
            return tags(List.of(tags));
        }
        public GetMlflowExperimentResult build() {
            final var _resultValue = new GetMlflowExperimentResult();
            _resultValue.artifactLocation = artifactLocation;
            _resultValue.creationTime = creationTime;
            _resultValue.experimentId = experimentId;
            _resultValue.id = id;
            _resultValue.lastUpdateTime = lastUpdateTime;
            _resultValue.lifecycleStage = lifecycleStage;
            _resultValue.name = name;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
