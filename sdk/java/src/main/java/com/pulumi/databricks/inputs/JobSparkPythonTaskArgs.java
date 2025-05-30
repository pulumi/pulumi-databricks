// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobSparkPythonTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobSparkPythonTaskArgs Empty = new JobSparkPythonTaskArgs();

    /**
     * (List) Command line parameters passed to the Python file.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    /**
     * @return (List) Command line parameters passed to the Python file.
     * 
     */
    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/`. For files stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    @Import(name="pythonFile", required=true)
    private Output<String> pythonFile;

    /**
     * @return The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/`. For files stored in a remote repository, the path must be relative. This field is required.
     * 
     */
    public Output<String> pythonFile() {
        return this.pythonFile;
    }

    /**
     * Location type of the Python file. When set to `WORKSPACE` or not specified, the file will be retrieved from the local Databricks workspace or cloud location (if the python_file has a URI format). When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
     * * `WORKSPACE`: The Python file is located in a Databricks workspace or at a cloud filesystem URI.
     * * `GIT`: The Python file is located in a remote Git repository.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Location type of the Python file. When set to `WORKSPACE` or not specified, the file will be retrieved from the local Databricks workspace or cloud location (if the python_file has a URI format). When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
     * * `WORKSPACE`: The Python file is located in a Databricks workspace or at a cloud filesystem URI.
     * * `GIT`: The Python file is located in a remote Git repository.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private JobSparkPythonTaskArgs() {}

    private JobSparkPythonTaskArgs(JobSparkPythonTaskArgs $) {
        this.parameters = $.parameters;
        this.pythonFile = $.pythonFile;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobSparkPythonTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobSparkPythonTaskArgs $;

        public Builder() {
            $ = new JobSparkPythonTaskArgs();
        }

        public Builder(JobSparkPythonTaskArgs defaults) {
            $ = new JobSparkPythonTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameters (List) Command line parameters passed to the Python file.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters (List) Command line parameters passed to the Python file.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters (List) Command line parameters passed to the Python file.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param pythonFile The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/`. For files stored in a remote repository, the path must be relative. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder pythonFile(Output<String> pythonFile) {
            $.pythonFile = pythonFile;
            return this;
        }

        /**
         * @param pythonFile The URI of the Python file to be executed. databricks_dbfs_file, cloud file URIs (e.g. `s3:/`, `abfss:/`, `gs:/`), workspace paths and remote repository are supported. For Python files stored in the Databricks workspace, the path must be absolute and begin with `/`. For files stored in a remote repository, the path must be relative. This field is required.
         * 
         * @return builder
         * 
         */
        public Builder pythonFile(String pythonFile) {
            return pythonFile(Output.of(pythonFile));
        }

        /**
         * @param source Location type of the Python file. When set to `WORKSPACE` or not specified, the file will be retrieved from the local Databricks workspace or cloud location (if the python_file has a URI format). When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
         * * `WORKSPACE`: The Python file is located in a Databricks workspace or at a cloud filesystem URI.
         * * `GIT`: The Python file is located in a remote Git repository.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Location type of the Python file. When set to `WORKSPACE` or not specified, the file will be retrieved from the local Databricks workspace or cloud location (if the python_file has a URI format). When set to `GIT`, the Python file will be retrieved from a Git repository defined in `git_source`.
         * * `WORKSPACE`: The Python file is located in a Databricks workspace or at a cloud filesystem URI.
         * * `GIT`: The Python file is located in a remote Git repository.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public JobSparkPythonTaskArgs build() {
            if ($.pythonFile == null) {
                throw new MissingRequiredPropertyException("JobSparkPythonTaskArgs", "pythonFile");
            }
            return $;
        }
    }

}
