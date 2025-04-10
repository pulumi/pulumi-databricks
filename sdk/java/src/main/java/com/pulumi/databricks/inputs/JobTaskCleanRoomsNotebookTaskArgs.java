// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskCleanRoomsNotebookTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskCleanRoomsNotebookTaskArgs Empty = new JobTaskCleanRoomsNotebookTaskArgs();

    /**
     * The clean room that the notebook belongs to.
     * 
     */
    @Import(name="cleanRoomName", required=true)
    private Output<String> cleanRoomName;

    /**
     * @return The clean room that the notebook belongs to.
     * 
     */
    public Output<String> cleanRoomName() {
        return this.cleanRoomName;
    }

    /**
     * Checksum to validate the freshness of the notebook resource.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Checksum to validate the freshness of the notebook resource.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Base parameters to be used for the clean room notebook job.
     * 
     */
    @Import(name="notebookBaseParameters")
    private @Nullable Output<Map<String,String>> notebookBaseParameters;

    /**
     * @return Base parameters to be used for the clean room notebook job.
     * 
     */
    public Optional<Output<Map<String,String>>> notebookBaseParameters() {
        return Optional.ofNullable(this.notebookBaseParameters);
    }

    /**
     * Name of the notebook being run.
     * 
     */
    @Import(name="notebookName", required=true)
    private Output<String> notebookName;

    /**
     * @return Name of the notebook being run.
     * 
     */
    public Output<String> notebookName() {
        return this.notebookName;
    }

    private JobTaskCleanRoomsNotebookTaskArgs() {}

    private JobTaskCleanRoomsNotebookTaskArgs(JobTaskCleanRoomsNotebookTaskArgs $) {
        this.cleanRoomName = $.cleanRoomName;
        this.etag = $.etag;
        this.notebookBaseParameters = $.notebookBaseParameters;
        this.notebookName = $.notebookName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskCleanRoomsNotebookTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskCleanRoomsNotebookTaskArgs $;

        public Builder() {
            $ = new JobTaskCleanRoomsNotebookTaskArgs();
        }

        public Builder(JobTaskCleanRoomsNotebookTaskArgs defaults) {
            $ = new JobTaskCleanRoomsNotebookTaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cleanRoomName The clean room that the notebook belongs to.
         * 
         * @return builder
         * 
         */
        public Builder cleanRoomName(Output<String> cleanRoomName) {
            $.cleanRoomName = cleanRoomName;
            return this;
        }

        /**
         * @param cleanRoomName The clean room that the notebook belongs to.
         * 
         * @return builder
         * 
         */
        public Builder cleanRoomName(String cleanRoomName) {
            return cleanRoomName(Output.of(cleanRoomName));
        }

        /**
         * @param etag Checksum to validate the freshness of the notebook resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Checksum to validate the freshness of the notebook resource.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param notebookBaseParameters Base parameters to be used for the clean room notebook job.
         * 
         * @return builder
         * 
         */
        public Builder notebookBaseParameters(@Nullable Output<Map<String,String>> notebookBaseParameters) {
            $.notebookBaseParameters = notebookBaseParameters;
            return this;
        }

        /**
         * @param notebookBaseParameters Base parameters to be used for the clean room notebook job.
         * 
         * @return builder
         * 
         */
        public Builder notebookBaseParameters(Map<String,String> notebookBaseParameters) {
            return notebookBaseParameters(Output.of(notebookBaseParameters));
        }

        /**
         * @param notebookName Name of the notebook being run.
         * 
         * @return builder
         * 
         */
        public Builder notebookName(Output<String> notebookName) {
            $.notebookName = notebookName;
            return this;
        }

        /**
         * @param notebookName Name of the notebook being run.
         * 
         * @return builder
         * 
         */
        public Builder notebookName(String notebookName) {
            return notebookName(Output.of(notebookName));
        }

        public JobTaskCleanRoomsNotebookTaskArgs build() {
            if ($.cleanRoomName == null) {
                throw new MissingRequiredPropertyException("JobTaskCleanRoomsNotebookTaskArgs", "cleanRoomName");
            }
            if ($.notebookName == null) {
                throw new MissingRequiredPropertyException("JobTaskCleanRoomsNotebookTaskArgs", "notebookName");
            }
            return $;
        }
    }

}
