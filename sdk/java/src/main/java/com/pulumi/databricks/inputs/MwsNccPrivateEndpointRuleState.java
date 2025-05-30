// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsNccPrivateEndpointRuleState extends com.pulumi.resources.ResourceArgs {

    public static final MwsNccPrivateEndpointRuleState Empty = new MwsNccPrivateEndpointRuleState();

    /**
     * The current status of this private endpoint. The private endpoint rules are effective only if the connection state is ESTABLISHED. Remember that you must approve new endpoints on your resources in the Azure portal before they take effect.
     * The possible values are:
     * * `PENDING`: The endpoint has been created and pending approval.
     * * `ESTABLISHED`: The endpoint has been approved and is ready to be used in your serverless compute resources.
     * * `REJECTED`: Connection was rejected by the private link resource owner.
     * * `DISCONNECTED`: Connection was removed by the private link resource owner, the private endpoint becomes informative and should be deleted for clean-up.
     * 
     */
    @Import(name="connectionState")
    private @Nullable Output<String> connectionState;

    /**
     * @return The current status of this private endpoint. The private endpoint rules are effective only if the connection state is ESTABLISHED. Remember that you must approve new endpoints on your resources in the Azure portal before they take effect.
     * The possible values are:
     * * `PENDING`: The endpoint has been created and pending approval.
     * * `ESTABLISHED`: The endpoint has been approved and is ready to be used in your serverless compute resources.
     * * `REJECTED`: Connection was rejected by the private link resource owner.
     * * `DISCONNECTED`: Connection was removed by the private link resource owner, the private endpoint becomes informative and should be deleted for clean-up.
     * 
     */
    public Optional<Output<String>> connectionState() {
        return Optional.ofNullable(this.connectionState);
    }

    /**
     * Time in epoch milliseconds when this object was created.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return Time in epoch milliseconds when this object was created.
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * Whether this private endpoint is deactivated.
     * 
     */
    @Import(name="deactivated")
    private @Nullable Output<Boolean> deactivated;

    /**
     * @return Whether this private endpoint is deactivated.
     * 
     */
    public Optional<Output<Boolean>> deactivated() {
        return Optional.ofNullable(this.deactivated);
    }

    /**
     * Time in epoch milliseconds when this object was deactivated.
     * 
     */
    @Import(name="deactivatedAt")
    private @Nullable Output<Integer> deactivatedAt;

    /**
     * @return Time in epoch milliseconds when this object was deactivated.
     * 
     */
    public Optional<Output<Integer>> deactivatedAt() {
        return Optional.ofNullable(this.deactivatedAt);
    }

    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    /**
     * The name of the Azure private endpoint resource, e.g. &#34;databricks-088781b3-77fa-4132-b429-1af0d91bc593-pe-3cb31234&#34;
     * 
     */
    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    /**
     * @return The name of the Azure private endpoint resource, e.g. &#34;databricks-088781b3-77fa-4132-b429-1af0d91bc593-pe-3cb31234&#34;
     * 
     */
    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * The sub-resource type (group ID) of the target resource. Must be one of supported resource types (i.e., `blob`, `dfs`, `sqlServer` , etc. Consult the [Azure documentation](https://learn.microsoft.com/en-us/azure/private-link/private-endpoint-overview#private-link-resource) for full list of supported resources). Note that to connect to workspace root storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`. Change forces creation of a new resource.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The sub-resource type (group ID) of the target resource. Must be one of supported resource types (i.e., `blob`, `dfs`, `sqlServer` , etc. Consult the [Azure documentation](https://learn.microsoft.com/en-us/azure/private-link/private-endpoint-overview#private-link-resource) for full list of supported resources). Note that to connect to workspace root storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Canonical unique identifier of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     * 
     */
    @Import(name="networkConnectivityConfigId")
    private @Nullable Output<String> networkConnectivityConfigId;

    /**
     * @return Canonical unique identifier of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> networkConnectivityConfigId() {
        return Optional.ofNullable(this.networkConnectivityConfigId);
    }

    /**
     * The Azure resource ID of the target resource. Change forces creation of a new resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The Azure resource ID of the target resource. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * the ID of a private endpoint rule.
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<String> ruleId;

    /**
     * @return the ID of a private endpoint rule.
     * 
     */
    public Optional<Output<String>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * Time in epoch milliseconds when this object was updated.
     * 
     */
    @Import(name="updatedTime")
    private @Nullable Output<Integer> updatedTime;

    /**
     * @return Time in epoch milliseconds when this object was updated.
     * 
     */
    public Optional<Output<Integer>> updatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }

    private MwsNccPrivateEndpointRuleState() {}

    private MwsNccPrivateEndpointRuleState(MwsNccPrivateEndpointRuleState $) {
        this.connectionState = $.connectionState;
        this.creationTime = $.creationTime;
        this.deactivated = $.deactivated;
        this.deactivatedAt = $.deactivatedAt;
        this.domainNames = $.domainNames;
        this.endpointName = $.endpointName;
        this.groupId = $.groupId;
        this.networkConnectivityConfigId = $.networkConnectivityConfigId;
        this.resourceId = $.resourceId;
        this.ruleId = $.ruleId;
        this.updatedTime = $.updatedTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsNccPrivateEndpointRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsNccPrivateEndpointRuleState $;

        public Builder() {
            $ = new MwsNccPrivateEndpointRuleState();
        }

        public Builder(MwsNccPrivateEndpointRuleState defaults) {
            $ = new MwsNccPrivateEndpointRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionState The current status of this private endpoint. The private endpoint rules are effective only if the connection state is ESTABLISHED. Remember that you must approve new endpoints on your resources in the Azure portal before they take effect.
         * The possible values are:
         * * `PENDING`: The endpoint has been created and pending approval.
         * * `ESTABLISHED`: The endpoint has been approved and is ready to be used in your serverless compute resources.
         * * `REJECTED`: Connection was rejected by the private link resource owner.
         * * `DISCONNECTED`: Connection was removed by the private link resource owner, the private endpoint becomes informative and should be deleted for clean-up.
         * 
         * @return builder
         * 
         */
        public Builder connectionState(@Nullable Output<String> connectionState) {
            $.connectionState = connectionState;
            return this;
        }

        /**
         * @param connectionState The current status of this private endpoint. The private endpoint rules are effective only if the connection state is ESTABLISHED. Remember that you must approve new endpoints on your resources in the Azure portal before they take effect.
         * The possible values are:
         * * `PENDING`: The endpoint has been created and pending approval.
         * * `ESTABLISHED`: The endpoint has been approved and is ready to be used in your serverless compute resources.
         * * `REJECTED`: Connection was rejected by the private link resource owner.
         * * `DISCONNECTED`: Connection was removed by the private link resource owner, the private endpoint becomes informative and should be deleted for clean-up.
         * 
         * @return builder
         * 
         */
        public Builder connectionState(String connectionState) {
            return connectionState(Output.of(connectionState));
        }

        /**
         * @param creationTime Time in epoch milliseconds when this object was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime Time in epoch milliseconds when this object was created.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param deactivated Whether this private endpoint is deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivated(@Nullable Output<Boolean> deactivated) {
            $.deactivated = deactivated;
            return this;
        }

        /**
         * @param deactivated Whether this private endpoint is deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivated(Boolean deactivated) {
            return deactivated(Output.of(deactivated));
        }

        /**
         * @param deactivatedAt Time in epoch milliseconds when this object was deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivatedAt(@Nullable Output<Integer> deactivatedAt) {
            $.deactivatedAt = deactivatedAt;
            return this;
        }

        /**
         * @param deactivatedAt Time in epoch milliseconds when this object was deactivated.
         * 
         * @return builder
         * 
         */
        public Builder deactivatedAt(Integer deactivatedAt) {
            return deactivatedAt(Output.of(deactivatedAt));
        }

        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        /**
         * @param endpointName The name of the Azure private endpoint resource, e.g. &#34;databricks-088781b3-77fa-4132-b429-1af0d91bc593-pe-3cb31234&#34;
         * 
         * @return builder
         * 
         */
        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName The name of the Azure private endpoint resource, e.g. &#34;databricks-088781b3-77fa-4132-b429-1af0d91bc593-pe-3cb31234&#34;
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param groupId The sub-resource type (group ID) of the target resource. Must be one of supported resource types (i.e., `blob`, `dfs`, `sqlServer` , etc. Consult the [Azure documentation](https://learn.microsoft.com/en-us/azure/private-link/private-endpoint-overview#private-link-resource) for full list of supported resources). Note that to connect to workspace root storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The sub-resource type (group ID) of the target resource. Must be one of supported resource types (i.e., `blob`, `dfs`, `sqlServer` , etc. Consult the [Azure documentation](https://learn.microsoft.com/en-us/azure/private-link/private-endpoint-overview#private-link-resource) for full list of supported resources). Note that to connect to workspace root storage (root DBFS), you need two endpoints, one for `blob` and one for `dfs`. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param networkConnectivityConfigId Canonical unique identifier of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder networkConnectivityConfigId(@Nullable Output<String> networkConnectivityConfigId) {
            $.networkConnectivityConfigId = networkConnectivityConfigId;
            return this;
        }

        /**
         * @param networkConnectivityConfigId Canonical unique identifier of Network Connectivity Config in Databricks Account. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder networkConnectivityConfigId(String networkConnectivityConfigId) {
            return networkConnectivityConfigId(Output.of(networkConnectivityConfigId));
        }

        /**
         * @param resourceId The Azure resource ID of the target resource. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The Azure resource ID of the target resource. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param ruleId the ID of a private endpoint rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId the ID of a private endpoint rule.
         * 
         * @return builder
         * 
         */
        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param updatedTime Time in epoch milliseconds when this object was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedTime(@Nullable Output<Integer> updatedTime) {
            $.updatedTime = updatedTime;
            return this;
        }

        /**
         * @param updatedTime Time in epoch milliseconds when this object was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedTime(Integer updatedTime) {
            return updatedTime(Output.of(updatedTime));
        }

        public MwsNccPrivateEndpointRuleState build() {
            return $;
        }
    }

}
