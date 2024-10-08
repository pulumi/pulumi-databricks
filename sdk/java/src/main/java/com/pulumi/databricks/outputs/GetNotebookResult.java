// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNotebookResult {
    /**
     * @return notebook content in selected format
     * 
     */
    private String content;
    private String format;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return notebook language
     * 
     */
    private String language;
    /**
     * @return notebook object ID
     * 
     */
    private Integer objectId;
    /**
     * @return notebook object type
     * 
     */
    private String objectType;
    private String path;
    /**
     * @return path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    private String workspacePath;

    private GetNotebookResult() {}
    /**
     * @return notebook content in selected format
     * 
     */
    public String content() {
        return this.content;
    }
    public String format() {
        return this.format;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return notebook language
     * 
     */
    public String language() {
        return this.language;
    }
    /**
     * @return notebook object ID
     * 
     */
    public Integer objectId() {
        return this.objectId;
    }
    /**
     * @return notebook object type
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    public String path() {
        return this.path;
    }
    /**
     * @return path on Workspace File System (WSFS) in form of `/Workspace` + `path`
     * 
     */
    public String workspacePath() {
        return this.workspacePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotebookResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String content;
        private String format;
        private String id;
        private String language;
        private Integer objectId;
        private String objectType;
        private String path;
        private String workspacePath;
        public Builder() {}
        public Builder(GetNotebookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.language = defaults.language;
    	      this.objectId = defaults.objectId;
    	      this.objectType = defaults.objectType;
    	      this.path = defaults.path;
    	      this.workspacePath = defaults.workspacePath;
        }

        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder format(String format) {
            if (format == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "format");
            }
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder language(String language) {
            if (language == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "language");
            }
            this.language = language;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(Integer objectId) {
            if (objectId == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "objectId");
            }
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder objectType(String objectType) {
            if (objectType == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "objectType");
            }
            this.objectType = objectType;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder workspacePath(String workspacePath) {
            if (workspacePath == null) {
              throw new MissingRequiredPropertyException("GetNotebookResult", "workspacePath");
            }
            this.workspacePath = workspacePath;
            return this;
        }
        public GetNotebookResult build() {
            final var _resultValue = new GetNotebookResult();
            _resultValue.content = content;
            _resultValue.format = format;
            _resultValue.id = id;
            _resultValue.language = language;
            _resultValue.objectId = objectId;
            _resultValue.objectType = objectType;
            _resultValue.path = path;
            _resultValue.workspacePath = workspacePath;
            return _resultValue;
        }
    }
}
