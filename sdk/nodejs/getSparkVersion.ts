// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets [Databricks Runtime (DBR)](https://docs.databricks.com/runtime/dbr.html) version that could be used for `sparkVersion` parameter in databricks.Cluster and other resources that fits search criteria, like specific Spark or Scala version, ML or Genomics runtime, etc., similar to executing `databricks clusters spark-versions`, and filters it to return the latest version that matches criteria. Often used along databricks.getNodeType data source.
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * > This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. together `ml = true` and `genomics = true`, or something like), data source will throw an error.  Similarly, if search returns multiple results, and `latest = false`, data source will throw an error.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const withGpu = databricks.getNodeType({
 *     localDisk: true,
 *     minCores: 16,
 *     gbPerCore: 1,
 *     minGpus: 1,
 * });
 * const gpuMl = databricks.getSparkVersion({
 *     gpu: true,
 *     ml: true,
 * });
 * const research = new databricks.Cluster("research", {
 *     clusterName: "Research Cluster",
 *     sparkVersion: gpuMl.then(gpuMl => gpuMl.id),
 *     nodeTypeId: withGpu.then(withGpu => withGpu.id),
 *     autoterminationMinutes: 20,
 *     autoscale: {
 *         minWorkers: 1,
 *         maxWorkers: 50,
 *     },
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getSparkVersion(args?: GetSparkVersionArgs, opts?: pulumi.InvokeOptions): Promise<GetSparkVersionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getSparkVersion:getSparkVersion", {
        "beta": args.beta,
        "genomics": args.genomics,
        "gpu": args.gpu,
        "graviton": args.graviton,
        "id": args.id,
        "latest": args.latest,
        "longTermSupport": args.longTermSupport,
        "ml": args.ml,
        "photon": args.photon,
        "scala": args.scala,
        "sparkVersion": args.sparkVersion,
    }, opts);
}

/**
 * A collection of arguments for invoking getSparkVersion.
 */
export interface GetSparkVersionArgs {
    /**
     * if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
     */
    beta?: boolean;
    /**
     * if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
     */
    genomics?: boolean;
    /**
     * if we should limit the search only to runtimes that support GPUs. Default to `false`.
     */
    gpu?: boolean;
    /**
     * if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`. _Deprecated with DBR 14.0 release. DBR version compiled for Graviton will be automatically installed when nodes with Graviton CPUs are specified in the cluster configuration._
     *
     * @deprecated Not required anymore - it's automatically enabled on the Graviton-based node types
     */
    graviton?: boolean;
    /**
     * Databricks Runtime version, that can be used as `sparkVersion` field in databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    id?: string;
    /**
     * if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
     */
    latest?: boolean;
    /**
     * if we should limit the search only to LTS (long term support) & ESR (extended support) versions. Default to `false`.
     */
    longTermSupport?: boolean;
    /**
     * if we should limit the search only to ML runtimes. Default to `false`.
     */
    ml?: boolean;
    /**
     * if we should limit the search only to Photon runtimes. Default to `false`. *Deprecated with DBR 14.0 release. Specify `runtime_engine=\"PHOTON\"` in the cluster configuration instead!*
     *
     * @deprecated Specify runtime_engine="PHOTON" in the cluster configuration
     */
    photon?: boolean;
    /**
     * if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
     */
    scala?: string;
    /**
     * if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
     */
    sparkVersion?: string;
}

/**
 * A collection of values returned by getSparkVersion.
 */
export interface GetSparkVersionResult {
    readonly beta?: boolean;
    readonly genomics?: boolean;
    readonly gpu?: boolean;
    /**
     * @deprecated Not required anymore - it's automatically enabled on the Graviton-based node types
     */
    readonly graviton?: boolean;
    /**
     * Databricks Runtime version, that can be used as `sparkVersion` field in databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly longTermSupport?: boolean;
    readonly ml?: boolean;
    /**
     * @deprecated Specify runtime_engine="PHOTON" in the cluster configuration
     */
    readonly photon?: boolean;
    readonly scala?: string;
    readonly sparkVersion?: string;
}
/**
 * Gets [Databricks Runtime (DBR)](https://docs.databricks.com/runtime/dbr.html) version that could be used for `sparkVersion` parameter in databricks.Cluster and other resources that fits search criteria, like specific Spark or Scala version, ML or Genomics runtime, etc., similar to executing `databricks clusters spark-versions`, and filters it to return the latest version that matches criteria. Often used along databricks.getNodeType data source.
 *
 * > This data source can only be used with a workspace-level provider!
 *
 * > This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. together `ml = true` and `genomics = true`, or something like), data source will throw an error.  Similarly, if search returns multiple results, and `latest = false`, data source will throw an error.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const withGpu = databricks.getNodeType({
 *     localDisk: true,
 *     minCores: 16,
 *     gbPerCore: 1,
 *     minGpus: 1,
 * });
 * const gpuMl = databricks.getSparkVersion({
 *     gpu: true,
 *     ml: true,
 * });
 * const research = new databricks.Cluster("research", {
 *     clusterName: "Research Cluster",
 *     sparkVersion: gpuMl.then(gpuMl => gpuMl.id),
 *     nodeTypeId: withGpu.then(withGpu => withGpu.id),
 *     autoterminationMinutes: 20,
 *     autoscale: {
 *         minWorkers: 1,
 *         maxWorkers: 50,
 *     },
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 */
export function getSparkVersionOutput(args?: GetSparkVersionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSparkVersionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getSparkVersion:getSparkVersion", {
        "beta": args.beta,
        "genomics": args.genomics,
        "gpu": args.gpu,
        "graviton": args.graviton,
        "id": args.id,
        "latest": args.latest,
        "longTermSupport": args.longTermSupport,
        "ml": args.ml,
        "photon": args.photon,
        "scala": args.scala,
        "sparkVersion": args.sparkVersion,
    }, opts);
}

/**
 * A collection of arguments for invoking getSparkVersion.
 */
export interface GetSparkVersionOutputArgs {
    /**
     * if we should limit the search only to runtimes that are in Beta stage. Default to `false`.
     */
    beta?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to Genomics (HLS) runtimes. Default to `false`.
     */
    genomics?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to runtimes that support GPUs. Default to `false`.
     */
    gpu?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to runtimes supporting AWS Graviton CPUs. Default to `false`. _Deprecated with DBR 14.0 release. DBR version compiled for Graviton will be automatically installed when nodes with Graviton CPUs are specified in the cluster configuration._
     *
     * @deprecated Not required anymore - it's automatically enabled on the Graviton-based node types
     */
    graviton?: pulumi.Input<boolean>;
    /**
     * Databricks Runtime version, that can be used as `sparkVersion` field in databricks_job, databricks_cluster, or databricks_instance_pool.
     */
    id?: pulumi.Input<string>;
    /**
     * if we should return only the latest version if there is more than one result.  Default to `true`. If set to `false` and multiple versions are matching, throws an error.
     */
    latest?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to LTS (long term support) & ESR (extended support) versions. Default to `false`.
     */
    longTermSupport?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to ML runtimes. Default to `false`.
     */
    ml?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to Photon runtimes. Default to `false`. *Deprecated with DBR 14.0 release. Specify `runtime_engine=\"PHOTON\"` in the cluster configuration instead!*
     *
     * @deprecated Specify runtime_engine="PHOTON" in the cluster configuration
     */
    photon?: pulumi.Input<boolean>;
    /**
     * if we should limit the search only to runtimes that are based on specific Scala version. Default to `2.12`.
     */
    scala?: pulumi.Input<string>;
    /**
     * if we should limit the search only to runtimes that are based on specific Spark version. Default to empty string.  It could be specified as `3`, or `3.0`, or full version, like, `3.0.1`.
     */
    sparkVersion?: pulumi.Input<string>;
}
