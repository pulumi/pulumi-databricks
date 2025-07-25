// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class QualityMonitorV2Args extends com.pulumi.resources.ResourceArgs {

    public static final QualityMonitorV2Args Empty = new QualityMonitorV2Args();

    /**
     * The uuid of the request object. For example, schema id
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    /**
     * @return The uuid of the request object. For example, schema id
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The type of the monitored object. Can be one of the following: schema
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return The type of the monitored object. Can be one of the following: schema
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    private QualityMonitorV2Args() {}

    private QualityMonitorV2Args(QualityMonitorV2Args $) {
        this.objectId = $.objectId;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QualityMonitorV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QualityMonitorV2Args $;

        public Builder() {
            $ = new QualityMonitorV2Args();
        }

        public Builder(QualityMonitorV2Args defaults) {
            $ = new QualityMonitorV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectId The uuid of the request object. For example, schema id
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The uuid of the request object. For example, schema id
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param objectType The type of the monitored object. Can be one of the following: schema
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType The type of the monitored object. Can be one of the following: schema
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public QualityMonitorV2Args build() {
            if ($.objectId == null) {
                throw new MissingRequiredPropertyException("QualityMonitorV2Args", "objectId");
            }
            if ($.objectType == null) {
                throw new MissingRequiredPropertyException("QualityMonitorV2Args", "objectType");
            }
            return $;
        }
    }

}
