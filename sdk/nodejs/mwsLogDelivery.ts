// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource configures the delivery of the two supported log types from Databricks workspaces: [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
 *
 * > This resource can only be used with an account-level provider!
 *
 * You cannot delete a log delivery configuration, but you can disable it when you no longer need it. This fact is important because there is a limit to the number of enabled log delivery configurations that you can create for an account. You can create a maximum of two enabled configurations that use the account level (no workspace filter) and two enabled configurations for every specific workspace (a workspaceId can occur in the workspace filter for two configurations). You can re-enable a disabled configuration, but the request fails if it violates the limits previously described.
 *
 * ## Billable Usage
 *
 * CSV files are delivered to `<delivery_path_prefix>/billable-usage/csv/` and are named `workspaceId=<workspace-id>-usageMonth=<month>.csv`, which are delivered daily by overwriting the month's CSV file for each workspace. Format of CSV file, as well as some usage examples, can be found [here](https://docs.databricks.com/administration-guide/account-settings/usage.html#download-usage-as-a-csv-file).
 *
 * Common processing scenario is to apply [cost allocation tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html), that could be enforced by setting customTags on a cluster or through cluster policy. Report contains `clusterId` field, that could be joined with data from AWS [cost and usage reports](https://docs.aws.amazon.com/cur/latest/userguide/cur-create.html), that can be joined with `user:ClusterId` tag from AWS usage report.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const usageLogs = new databricks.MwsLogDelivery("usage_logs", {
 *     accountId: databricksAccountId,
 *     credentialsId: logWriter.credentialsId,
 *     storageConfigurationId: logBucket.storageConfigurationId,
 *     deliveryPathPrefix: "billable-usage",
 *     configName: "Usage Logs",
 *     logType: "BILLABLE_USAGE",
 *     outputFormat: "CSV",
 * });
 * ```
 *
 * ## Audit Logs
 *
 * JSON files with [static schema](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html#audit-log-schema) are delivered to `<delivery_path_prefix>/workspaceId=<workspaceId>/date=<yyyy-mm-dd>/auditlogs_<internal-id>.json`. Logs are available within 15 minutes of activation for audit logs. New JSON files are delivered every few minutes, potentially overwriting existing files for each workspace. Sometimes data may arrive later than 15 minutes. Databricks can overwrite the delivered log files in your bucket at any time. If a file is overwritten, the existing content remains, but there may be additional lines for more auditable events. Overwriting ensures exactly-once semantics without requiring read or delete access to your account.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const auditLogs = new databricks.MwsLogDelivery("audit_logs", {
 *     accountId: databricksAccountId,
 *     credentialsId: logWriter.credentialsId,
 *     storageConfigurationId: logBucket.storageConfigurationId,
 *     deliveryPathPrefix: "audit-logs",
 *     configName: "Audit Logs",
 *     logType: "AUDIT_LOGS",
 *     outputFormat: "JSON",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * Provisioning Databricks on AWS guide.
 * * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
 * * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
 * * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
 * * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
 * * databricks.MwsWorkspaces to set up [AWS and GCP workspaces](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
 *
 * ## Import
 *
 * !> Importing this resource is not currently supported.
 */
export class MwsLogDelivery extends pulumi.CustomResource {
    /**
     * Get an existing MwsLogDelivery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MwsLogDeliveryState, opts?: pulumi.CustomResourceOptions): MwsLogDelivery {
        return new MwsLogDelivery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mwsLogDelivery:MwsLogDelivery';

    /**
     * Returns true if the given object is an instance of MwsLogDelivery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MwsLogDelivery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MwsLogDelivery.__pulumiType;
    }

    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Databricks log delivery configuration ID.
     */
    public readonly configId!: pulumi.Output<string>;
    /**
     * The optional human-readable name of the log delivery configuration. Defaults to empty.
     */
    public readonly configName!: pulumi.Output<string | undefined>;
    /**
     * The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
     */
    public readonly credentialsId!: pulumi.Output<string>;
    /**
     * Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
     */
    public readonly deliveryPathPrefix!: pulumi.Output<string | undefined>;
    /**
     * The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
     */
    public readonly deliveryStartTime!: pulumi.Output<string>;
    /**
     * The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
     */
    public readonly logType!: pulumi.Output<string>;
    /**
     * The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
     */
    public readonly outputFormat!: pulumi.Output<string>;
    /**
     * Status of log delivery configuration. Set to ENABLED or DISABLED. Defaults to ENABLED. This is the only field you can update.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
     */
    public readonly storageConfigurationId!: pulumi.Output<string>;
    /**
     * By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the multitenant version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
     */
    public readonly workspaceIdsFilters!: pulumi.Output<number[] | undefined>;

    /**
     * Create a MwsLogDelivery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MwsLogDeliveryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MwsLogDeliveryArgs | MwsLogDeliveryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MwsLogDeliveryState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["configId"] = state ? state.configId : undefined;
            resourceInputs["configName"] = state ? state.configName : undefined;
            resourceInputs["credentialsId"] = state ? state.credentialsId : undefined;
            resourceInputs["deliveryPathPrefix"] = state ? state.deliveryPathPrefix : undefined;
            resourceInputs["deliveryStartTime"] = state ? state.deliveryStartTime : undefined;
            resourceInputs["logType"] = state ? state.logType : undefined;
            resourceInputs["outputFormat"] = state ? state.outputFormat : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageConfigurationId"] = state ? state.storageConfigurationId : undefined;
            resourceInputs["workspaceIdsFilters"] = state ? state.workspaceIdsFilters : undefined;
        } else {
            const args = argsOrState as MwsLogDeliveryArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.credentialsId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentialsId'");
            }
            if ((!args || args.logType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logType'");
            }
            if ((!args || args.outputFormat === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outputFormat'");
            }
            if ((!args || args.storageConfigurationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageConfigurationId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["configId"] = args ? args.configId : undefined;
            resourceInputs["configName"] = args ? args.configName : undefined;
            resourceInputs["credentialsId"] = args ? args.credentialsId : undefined;
            resourceInputs["deliveryPathPrefix"] = args ? args.deliveryPathPrefix : undefined;
            resourceInputs["deliveryStartTime"] = args ? args.deliveryStartTime : undefined;
            resourceInputs["logType"] = args ? args.logType : undefined;
            resourceInputs["outputFormat"] = args ? args.outputFormat : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["storageConfigurationId"] = args ? args.storageConfigurationId : undefined;
            resourceInputs["workspaceIdsFilters"] = args ? args.workspaceIdsFilters : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MwsLogDelivery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MwsLogDelivery resources.
 */
export interface MwsLogDeliveryState {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    accountId?: pulumi.Input<string>;
    /**
     * Databricks log delivery configuration ID.
     */
    configId?: pulumi.Input<string>;
    /**
     * The optional human-readable name of the log delivery configuration. Defaults to empty.
     */
    configName?: pulumi.Input<string>;
    /**
     * The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
     */
    credentialsId?: pulumi.Input<string>;
    /**
     * Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
     */
    deliveryPathPrefix?: pulumi.Input<string>;
    /**
     * The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
     */
    deliveryStartTime?: pulumi.Input<string>;
    /**
     * The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
     */
    logType?: pulumi.Input<string>;
    /**
     * The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
     */
    outputFormat?: pulumi.Input<string>;
    /**
     * Status of log delivery configuration. Set to ENABLED or DISABLED. Defaults to ENABLED. This is the only field you can update.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
     */
    storageConfigurationId?: pulumi.Input<string>;
    /**
     * By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the multitenant version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
     */
    workspaceIdsFilters?: pulumi.Input<pulumi.Input<number>[]>;
}

/**
 * The set of arguments for constructing a MwsLogDelivery resource.
 */
export interface MwsLogDeliveryArgs {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     */
    accountId: pulumi.Input<string>;
    /**
     * Databricks log delivery configuration ID.
     */
    configId?: pulumi.Input<string>;
    /**
     * The optional human-readable name of the log delivery configuration. Defaults to empty.
     */
    configName?: pulumi.Input<string>;
    /**
     * The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
     */
    credentialsId: pulumi.Input<string>;
    /**
     * Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
     */
    deliveryPathPrefix?: pulumi.Input<string>;
    /**
     * The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
     */
    deliveryStartTime?: pulumi.Input<string>;
    /**
     * The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
     */
    logType: pulumi.Input<string>;
    /**
     * The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
     */
    outputFormat: pulumi.Input<string>;
    /**
     * Status of log delivery configuration. Set to ENABLED or DISABLED. Defaults to ENABLED. This is the only field you can update.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
     */
    storageConfigurationId: pulumi.Input<string>;
    /**
     * By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the multitenant version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
     */
    workspaceIdsFilters?: pulumi.Input<pulumi.Input<number>[]>;
}
