// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetMlflowModelLatestVersion;
import com.pulumi.databricks.outputs.GetMlflowModelTag;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMlflowModelResult {
    /**
     * @return User-specified description for the object.
     * 
     */
    private String description;
    /**
     * @return Unique identifier for the object.
     * 
     */
    private String id;
    /**
     * @return Array of model versions, each the latest version for its stage.
     * 
     */
    private List<GetMlflowModelLatestVersion> latestVersions;
    /**
     * @return Name of the model.
     * 
     */
    private String name;
    /**
     * @return Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
     * 
     */
    private String permissionLevel;
    /**
     * @return Array of tags associated with the model.
     * 
     */
    private List<GetMlflowModelTag> tags;
    /**
     * @return The username of the user that created the object.
     * 
     */
    private String userId;

    private GetMlflowModelResult() {}
    /**
     * @return User-specified description for the object.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Unique identifier for the object.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Array of model versions, each the latest version for its stage.
     * 
     */
    public List<GetMlflowModelLatestVersion> latestVersions() {
        return this.latestVersions;
    }
    /**
     * @return Name of the model.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Permission level of the requesting user on the object. For what is allowed at each level, see MLflow Model permissions.
     * 
     */
    public String permissionLevel() {
        return this.permissionLevel;
    }
    /**
     * @return Array of tags associated with the model.
     * 
     */
    public List<GetMlflowModelTag> tags() {
        return this.tags;
    }
    /**
     * @return The username of the user that created the object.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMlflowModelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private List<GetMlflowModelLatestVersion> latestVersions;
        private String name;
        private String permissionLevel;
        private List<GetMlflowModelTag> tags;
        private String userId;
        public Builder() {}
        public Builder(GetMlflowModelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.latestVersions = defaults.latestVersions;
    	      this.name = defaults.name;
    	      this.permissionLevel = defaults.permissionLevel;
    	      this.tags = defaults.tags;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latestVersions(List<GetMlflowModelLatestVersion> latestVersions) {
            if (latestVersions == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "latestVersions");
            }
            this.latestVersions = latestVersions;
            return this;
        }
        public Builder latestVersions(GetMlflowModelLatestVersion... latestVersions) {
            return latestVersions(List.of(latestVersions));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder permissionLevel(String permissionLevel) {
            if (permissionLevel == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "permissionLevel");
            }
            this.permissionLevel = permissionLevel;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetMlflowModelTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetMlflowModelTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetMlflowModelResult", "userId");
            }
            this.userId = userId;
            return this;
        }
        public GetMlflowModelResult build() {
            final var _resultValue = new GetMlflowModelResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.latestVersions = latestVersions;
            _resultValue.name = name;
            _resultValue.permissionLevel = permissionLevel;
            _resultValue.tags = tags;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}