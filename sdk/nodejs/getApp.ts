// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
 *
 * [Databricks Apps](https://docs.databricks.com/en/dev-tools/databricks-apps/index.html) run directly on a customer’s Databricks instance, integrate with their data, use and extend Databricks services, and enable users to interact through single sign-on. This resource creates the application but does not handle app deployment, which should be handled separately as part of your CI/CD pipeline.
 *
 * This data source allows you to fetch information about a Databricks App.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getApp({
 *     name: "my-custom-app",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.App to manage [Databricks Apps](https://docs.databricks.com/en/dev-tools/databricks-apps/index.html).
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code.
 */
export function getApp(args: GetAppArgs, opts?: pulumi.InvokeOptions): Promise<GetAppResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getApp:getApp", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApp.
 */
export interface GetAppArgs {
    /**
     * The name of the app.
     */
    name: string;
}

/**
 * A collection of values returned by getApp.
 */
export interface GetAppResult {
    /**
     * attribute
     */
    readonly app: outputs.GetAppApp;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the serving endpoint to grant permission on.
     */
    readonly name: string;
}
/**
 * > This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
 *
 * [Databricks Apps](https://docs.databricks.com/en/dev-tools/databricks-apps/index.html) run directly on a customer’s Databricks instance, integrate with their data, use and extend Databricks services, and enable users to interact through single sign-on. This resource creates the application but does not handle app deployment, which should be handled separately as part of your CI/CD pipeline.
 *
 * This data source allows you to fetch information about a Databricks App.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const this = databricks.getApp({
 *     name: "my-custom-app",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * * databricks.App to manage [Databricks Apps](https://docs.databricks.com/en/dev-tools/databricks-apps/index.html).
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code.
 */
export function getAppOutput(args: GetAppOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAppResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getApp:getApp", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getApp.
 */
export interface GetAppOutputArgs {
    /**
     * The name of the app.
     */
    name: pulumi.Input<string>;
}