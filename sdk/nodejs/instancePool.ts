// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances. An instance pool reduces cluster start and auto-scaling times by maintaining a set of idle, ready-to-use cloud instances. When a cluster attached to a pool needs an instance, it first attempts to allocate one of the pool's idle instances. If the pool has no idle instances, it expands by allocating a new instance from the instance provider in order to accommodate the cluster's request. When a cluster releases an instance, it returns to the pool and is free for another cluster to use. Only clusters attached to a pool can use that pool's idle instances.
 *
 * > This resource can only be used with a workspace-level provider!
 *
 * > It is important to know that different cloud service providers have different `nodeTypeId`, `diskSpecs` and potentially other configurations.
 *
 * > "auto" `zoneId` is only supported for fleet node types.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const smallest = databricks.getNodeType({});
 * const smallestNodes = new databricks.InstancePool("smallest_nodes", {
 *     instancePoolName: "Smallest Nodes",
 *     minIdleInstances: 0,
 *     maxCapacity: 300,
 *     nodeTypeId: smallest.then(smallest => smallest.id),
 *     awsAttributes: {
 *         availability: "ON_DEMAND",
 *         zoneId: "us-east-1a",
 *         spotBidPricePercent: 100,
 *     },
 *     idleInstanceAutoterminationMinutes: 10,
 *     diskSpec: {
 *         diskType: {
 *             ebsVolumeType: "GENERAL_PURPOSE_SSD",
 *         },
 *         diskSize: 80,
 *         diskCount: 1,
 *     },
 * });
 * ```
 *
 * ## Access Control
 *
 * * databricks.Group and databricks.User can control which groups or individual users can create instance pools.
 * * databricks.Permissions can control which groups or individual users can *Manage* or *Attach to* individual instance pools.
 *
 * ## Import
 *
 * The resource instance pool can be imported using its id:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_instance_pool.this
 *
 *   id = "<instance-pool-id>"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/instancePool:InstancePool this <instance-pool-id>
 * ```
 */
export class InstancePool extends pulumi.CustomResource {
    /**
     * Get an existing InstancePool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstancePoolState, opts?: pulumi.CustomResourceOptions): InstancePool {
        return new InstancePool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/instancePool:InstancePool';

    /**
     * Returns true if the given object is an instance of InstancePool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstancePool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstancePool.__pulumiType;
    }

    public readonly awsAttributes!: pulumi.Output<outputs.InstancePoolAwsAttributes | undefined>;
    public readonly azureAttributes!: pulumi.Output<outputs.InstancePoolAzureAttributes | undefined>;
    /**
     * (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
     */
    public readonly customTags!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly diskSpec!: pulumi.Output<outputs.InstancePoolDiskSpec | undefined>;
    /**
     * (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
     */
    public readonly enableElasticDisk!: pulumi.Output<boolean | undefined>;
    public readonly gcpAttributes!: pulumi.Output<outputs.InstancePoolGcpAttributes | undefined>;
    /**
     * (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
     */
    public readonly idleInstanceAutoterminationMinutes!: pulumi.Output<number>;
    public readonly instancePoolFleetAttributes!: pulumi.Output<outputs.InstancePoolInstancePoolFleetAttributes | undefined>;
    public readonly instancePoolId!: pulumi.Output<string>;
    /**
     * (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
     */
    public readonly instancePoolName!: pulumi.Output<string>;
    /**
     * (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
     */
    public readonly maxCapacity!: pulumi.Output<number | undefined>;
    /**
     * (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
     */
    public readonly minIdleInstances!: pulumi.Output<number | undefined>;
    /**
     * (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool's idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
     */
    public readonly nodeTypeId!: pulumi.Output<string | undefined>;
    public readonly preloadedDockerImages!: pulumi.Output<outputs.InstancePoolPreloadedDockerImage[] | undefined>;
    /**
     * (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via databricks.getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
     */
    public readonly preloadedSparkVersions!: pulumi.Output<string[] | undefined>;

    /**
     * Create a InstancePool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstancePoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstancePoolArgs | InstancePoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstancePoolState | undefined;
            resourceInputs["awsAttributes"] = state ? state.awsAttributes : undefined;
            resourceInputs["azureAttributes"] = state ? state.azureAttributes : undefined;
            resourceInputs["customTags"] = state ? state.customTags : undefined;
            resourceInputs["diskSpec"] = state ? state.diskSpec : undefined;
            resourceInputs["enableElasticDisk"] = state ? state.enableElasticDisk : undefined;
            resourceInputs["gcpAttributes"] = state ? state.gcpAttributes : undefined;
            resourceInputs["idleInstanceAutoterminationMinutes"] = state ? state.idleInstanceAutoterminationMinutes : undefined;
            resourceInputs["instancePoolFleetAttributes"] = state ? state.instancePoolFleetAttributes : undefined;
            resourceInputs["instancePoolId"] = state ? state.instancePoolId : undefined;
            resourceInputs["instancePoolName"] = state ? state.instancePoolName : undefined;
            resourceInputs["maxCapacity"] = state ? state.maxCapacity : undefined;
            resourceInputs["minIdleInstances"] = state ? state.minIdleInstances : undefined;
            resourceInputs["nodeTypeId"] = state ? state.nodeTypeId : undefined;
            resourceInputs["preloadedDockerImages"] = state ? state.preloadedDockerImages : undefined;
            resourceInputs["preloadedSparkVersions"] = state ? state.preloadedSparkVersions : undefined;
        } else {
            const args = argsOrState as InstancePoolArgs | undefined;
            if ((!args || args.idleInstanceAutoterminationMinutes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'idleInstanceAutoterminationMinutes'");
            }
            if ((!args || args.instancePoolName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instancePoolName'");
            }
            resourceInputs["awsAttributes"] = args ? args.awsAttributes : undefined;
            resourceInputs["azureAttributes"] = args ? args.azureAttributes : undefined;
            resourceInputs["customTags"] = args ? args.customTags : undefined;
            resourceInputs["diskSpec"] = args ? args.diskSpec : undefined;
            resourceInputs["enableElasticDisk"] = args ? args.enableElasticDisk : undefined;
            resourceInputs["gcpAttributes"] = args ? args.gcpAttributes : undefined;
            resourceInputs["idleInstanceAutoterminationMinutes"] = args ? args.idleInstanceAutoterminationMinutes : undefined;
            resourceInputs["instancePoolFleetAttributes"] = args ? args.instancePoolFleetAttributes : undefined;
            resourceInputs["instancePoolId"] = args ? args.instancePoolId : undefined;
            resourceInputs["instancePoolName"] = args ? args.instancePoolName : undefined;
            resourceInputs["maxCapacity"] = args ? args.maxCapacity : undefined;
            resourceInputs["minIdleInstances"] = args ? args.minIdleInstances : undefined;
            resourceInputs["nodeTypeId"] = args ? args.nodeTypeId : undefined;
            resourceInputs["preloadedDockerImages"] = args ? args.preloadedDockerImages : undefined;
            resourceInputs["preloadedSparkVersions"] = args ? args.preloadedSparkVersions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstancePool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstancePool resources.
 */
export interface InstancePoolState {
    awsAttributes?: pulumi.Input<inputs.InstancePoolAwsAttributes>;
    azureAttributes?: pulumi.Input<inputs.InstancePoolAzureAttributes>;
    /**
     * (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
     */
    customTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    diskSpec?: pulumi.Input<inputs.InstancePoolDiskSpec>;
    /**
     * (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
     */
    enableElasticDisk?: pulumi.Input<boolean>;
    gcpAttributes?: pulumi.Input<inputs.InstancePoolGcpAttributes>;
    /**
     * (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
     */
    idleInstanceAutoterminationMinutes?: pulumi.Input<number>;
    instancePoolFleetAttributes?: pulumi.Input<inputs.InstancePoolInstancePoolFleetAttributes>;
    instancePoolId?: pulumi.Input<string>;
    /**
     * (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
     */
    instancePoolName?: pulumi.Input<string>;
    /**
     * (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
     */
    maxCapacity?: pulumi.Input<number>;
    /**
     * (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
     */
    minIdleInstances?: pulumi.Input<number>;
    /**
     * (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool's idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
     */
    nodeTypeId?: pulumi.Input<string>;
    preloadedDockerImages?: pulumi.Input<pulumi.Input<inputs.InstancePoolPreloadedDockerImage>[]>;
    /**
     * (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via databricks.getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
     */
    preloadedSparkVersions?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a InstancePool resource.
 */
export interface InstancePoolArgs {
    awsAttributes?: pulumi.Input<inputs.InstancePoolAwsAttributes>;
    azureAttributes?: pulumi.Input<inputs.InstancePoolAzureAttributes>;
    /**
     * (Map) Additional tags for instance pool resources. Databricks tags all pool resources (e.g. AWS & Azure instances and Disk volumes). The tags of the instance pool will propagate to the clusters using the pool (see the [official documentation](https://docs.databricks.com/administration-guide/account-settings/usage-detail-tags-aws.html#tag-propagation)). Attempting to set the same tags in both cluster and instance pool will raise an error. *Databricks allows at most 43 custom tags.*
     */
    customTags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    diskSpec?: pulumi.Input<inputs.InstancePoolDiskSpec>;
    /**
     * (Bool) Autoscaling Local Storage: when enabled, the instances in the pool dynamically acquire additional disk space when they are running low on disk space.
     */
    enableElasticDisk?: pulumi.Input<boolean>;
    gcpAttributes?: pulumi.Input<inputs.InstancePoolGcpAttributes>;
    /**
     * (Integer) The number of minutes that idle instances in excess of the minIdleInstances are maintained by the pool before being terminated. If not specified, excess idle instances are terminated automatically after a default timeout period. If specified, the time must be between 0 and 10000 minutes. If you specify 0, excess idle instances are removed as soon as possible.
     */
    idleInstanceAutoterminationMinutes: pulumi.Input<number>;
    instancePoolFleetAttributes?: pulumi.Input<inputs.InstancePoolInstancePoolFleetAttributes>;
    instancePoolId?: pulumi.Input<string>;
    /**
     * (String) The name of the instance pool. This is required for create and edit operations. It must be unique, non-empty, and less than 100 characters.
     */
    instancePoolName: pulumi.Input<string>;
    /**
     * (Integer) The maximum number of instances the pool can contain, including both idle instances and ones in use by clusters. Once the maximum capacity is reached, you cannot create new clusters from the pool and existing clusters cannot autoscale up until some instances are made idle in the pool via cluster termination or down-scaling. There is no default limit, but as a [best practice](https://docs.databricks.com/clusters/instance-pools/pool-best-practices.html#configure-pools-to-control-cost), this should be set based on anticipated usage.
     */
    maxCapacity?: pulumi.Input<number>;
    /**
     * (Integer) The minimum number of idle instances maintained by the pool. This is in addition to any instances in use by active clusters.
     */
    minIdleInstances?: pulumi.Input<number>;
    /**
     * (String) The node type for the instances in the pool. All clusters attached to the pool inherit this node type and the pool's idle instances are allocated based on this type. You can retrieve a list of available node types by using the [List Node Types API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistnodetypes) call.
     */
    nodeTypeId?: pulumi.Input<string>;
    preloadedDockerImages?: pulumi.Input<pulumi.Input<inputs.InstancePoolPreloadedDockerImage>[]>;
    /**
     * (List) A list with at most one runtime version the pool installs on each instance. Pool clusters that use a preloaded runtime version start faster as they do not have to wait for the image to download. You can retrieve them via databricks.getSparkVersion data source or via  [Runtime Versions API](https://docs.databricks.com/dev-tools/api/latest/clusters.html#clusterclusterservicelistsparkversions) call.
     */
    preloadedSparkVersions?: pulumi.Input<pulumi.Input<string>[]>;
}
