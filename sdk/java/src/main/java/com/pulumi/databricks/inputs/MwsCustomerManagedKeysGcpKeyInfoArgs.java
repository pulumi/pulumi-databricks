// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class MwsCustomerManagedKeysGcpKeyInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsCustomerManagedKeysGcpKeyInfoArgs Empty = new MwsCustomerManagedKeysGcpKeyInfoArgs();

    /**
     * The GCP KMS key&#39;s resource name.
     * 
     */
    @Import(name="kmsKeyId", required=true)
    private Output<String> kmsKeyId;

    /**
     * @return The GCP KMS key&#39;s resource name.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }

    private MwsCustomerManagedKeysGcpKeyInfoArgs() {}

    private MwsCustomerManagedKeysGcpKeyInfoArgs(MwsCustomerManagedKeysGcpKeyInfoArgs $) {
        this.kmsKeyId = $.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsCustomerManagedKeysGcpKeyInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsCustomerManagedKeysGcpKeyInfoArgs $;

        public Builder() {
            $ = new MwsCustomerManagedKeysGcpKeyInfoArgs();
        }

        public Builder(MwsCustomerManagedKeysGcpKeyInfoArgs defaults) {
            $ = new MwsCustomerManagedKeysGcpKeyInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyId The GCP KMS key&#39;s resource name.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The GCP KMS key&#39;s resource name.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public MwsCustomerManagedKeysGcpKeyInfoArgs build() {
            if ($.kmsKeyId == null) {
                throw new MissingRequiredPropertyException("MwsCustomerManagedKeysGcpKeyInfoArgs", "kmsKeyId");
            }
            return $;
        }
    }

}