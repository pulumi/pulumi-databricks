// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This article refers to the privileges and inheritance model in Privilege Model version 1.0. If you created your metastore during the public preview (before August 25, 2022), you can upgrade to Privilege Model version 1.0 following [Upgrade to privilege inheritance](https://docs.databricks.com/data-governance/unity-catalog/hive-metastore.html)
 *
 * > Most of Unity Catalog APIs are only accessible via **workspace-level APIs**. This design may change in the future. Account-level principal grants can be assigned with any valid workspace as the Unity Catalog is decoupled from specific workspaces. More information in [the official documentation](https://docs.databricks.com/data-governance/unity-catalog/index.html).
 *
 * Two different resources help you manage your Unity Catalog grants for a securable. Each of these resources serves a different use case:
 *
 * - databricks_grants: Authoritative. Sets the grants of a securable and *replaces* any existing grants defined inside or outside of Pulumi.
 * - databricks_grant: Authoritative for a given principal. Updates the grants of a securable to a single principal. Other principals within the grants for the securables are preserved.
 *
 * In Unity Catalog all users initially have no access to data. Only Metastore Admins can create objects and can grant/revoke access on individual objects to users and groups. Every securable object in Unity Catalog has an owner. The owner can be any account-level user or group, called principals in general. The principal that creates an object becomes its owner. Owners receive `ALL_PRIVILEGES` on the securable object (e.g., `SELECT` and `MODIFY` on a table), as well as the permission to grant privileges to other principals.
 *
 * Securable objects are hierarchical and privileges are inherited downward. The highest level object that privileges are inherited from is the catalog. This means that granting a privilege on a catalog or schema automatically grants the privilege to all current and future objects within the catalog or schema. Privileges that are granted on a metastore are not inherited.
 *
 * Every `databricks.Grants` resource must have exactly one securable identifier and one or more `grant` blocks with the following arguments:
 *
 * - `principal` - User name, group name or service principal application ID.
 * - `privileges` - One or more privileges that are specific to a securable type.
 *
 * For the latest list of privilege types that apply to each securable object in Unity Catalog, please refer to the [official documentation](https://docs.databricks.com/en/data-governance/unity-catalog/manage-privileges/privileges.html#privilege-types-by-securable-object-in-unity-catalog)
 *
 * Pulumi will handle any configuration drift on every `pulumi up` run, even when grants are changed outside of Pulumi state.
 *
 * When applying grants using an identity with [`MANAGE` permission](https://docs.databricks.com/aws/en/data-governance/unity-catalog/manage-privileges/ownership#ownership-versus-the-manage-privilege), their `MANAGE` permission must also be defined, otherwise Pulumi will remove their permissions, leading to errors.
 *
 * Unlike the [SQL specification](https://docs.databricks.com/sql/language-manual/sql-ref-privileges.html#privilege-types), all privileges to be written with underscore instead of space, e.g. `CREATE_TABLE` and not `CREATE TABLE`. Below summarizes which privilege types apply to each securable object in the catalog:
 *
 * ## Metastore grants
 *
 * You can grant `CREATE_CATALOG`, `CREATE_CLEAN_ROOM`, `CREATE_CONNECTION`, `CREATE_EXTERNAL_LOCATION`, `CREATE_PROVIDER`, `CREATE_RECIPIENT`, `CREATE_SHARE`, `CREATE_SERVICE_CREDENTIAL`, `CREATE_STORAGE_CREDENTIAL`, `SET_SHARE_PERMISSION`, `USE_MARKETPLACE_ASSETS`, `USE_PROVIDER`, `USE_RECIPIENT`, and `USE_SHARE` privileges to databricks.Metastore assigned to the workspace.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sandbox = new databricks.Grants("sandbox", {
 *     metastore: "metastore_id",
 *     grants: [
 *         {
 *             principal: "Data Engineers",
 *             privileges: [
 *                 "CREATE_CATALOG",
 *                 "CREATE_EXTERNAL_LOCATION",
 *             ],
 *         },
 *         {
 *             principal: "Data Sharer",
 *             privileges: [
 *                 "CREATE_RECIPIENT",
 *                 "CREATE_SHARE",
 *             ],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Catalog grants
 *
 * You can grant `ALL_PRIVILEGES`, `APPLY_TAG`, `CREATE_CONNECTION`, `CREATE_SCHEMA`, `MANAGE`, and `USE_CATALOG` privileges to databricks.Catalog specified in the `catalog` attribute. You can also grant `CREATE_FUNCTION`, `CREATE_TABLE`, `CREATE_VOLUME`, `EXECUTE`, `MODIFY`, `REFRESH`, `SELECT`, `READ_VOLUME`, `WRITE_VOLUME` and `USE_SCHEMA` at the catalog level to apply them to the pertinent current and future securable objects within the catalog:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sandbox = new databricks.Catalog("sandbox", {
 *     name: "sandbox",
 *     comment: "this catalog is managed by terraform",
 *     properties: {
 *         purpose: "testing",
 *     },
 * });
 * const sandboxGrants = new databricks.Grants("sandbox", {
 *     catalog: sandbox.name,
 *     grants: [
 *         {
 *             principal: "Data Scientists",
 *             privileges: [
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "CREATE_TABLE",
 *                 "SELECT",
 *             ],
 *         },
 *         {
 *             principal: "Data Engineers",
 *             privileges: [
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "CREATE_SCHEMA",
 *                 "CREATE_TABLE",
 *                 "MODIFY",
 *             ],
 *         },
 *         {
 *             principal: "Data Analyst",
 *             privileges: [
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "SELECT",
 *             ],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Schema grants
 *
 * You can grant `ALL_PRIVILEGES`, `APPLY_TAG`, `CREATE_FUNCTION`, `CREATE_TABLE`, `CREATE_VOLUME`, `MANAGE` and `USE_SCHEMA` privileges to *`catalog.schema`* specified in the `schema` attribute. You can also grant `EXECUTE`, `MODIFY`, `REFRESH`, `SELECT`, `READ_VOLUME`, `WRITE_VOLUME` at the schema level to apply them to the pertinent current and future securable objects within the schema:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const things = new databricks.Schema("things", {
 *     catalogName: sandbox.id,
 *     name: "things",
 *     comment: "this schema is managed by terraform",
 *     properties: {
 *         kind: "various",
 *     },
 * });
 * const thingsGrants = new databricks.Grants("things", {
 *     schema: things.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: [
 *             "USE_SCHEMA",
 *             "MODIFY",
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Table grants
 *
 * You can grant `ALL_PRIVILEGES`, `APPLY_TAG`, `MANAGE`, `SELECT` and `MODIFY` privileges to *`catalog.schema.table`* specified in the `table` attribute.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const customers = new databricks.Grants("customers", {
 *     table: "main.reporting.customers",
 *     grants: [
 *         {
 *             principal: "Data Engineers",
 *             privileges: [
 *                 "MODIFY",
 *                 "SELECT",
 *             ],
 *         },
 *         {
 *             principal: "Data Analysts",
 *             privileges: ["SELECT"],
 *         },
 *     ],
 * });
 * ```
 *
 * You can also apply grants dynamically with databricks.getTables data resource:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * export = async () => {
 *     const things = await databricks.getTables({
 *         catalogName: "sandbox",
 *         schemaName: "things",
 *     });
 *     const thingsGrants: databricks.Grants[] = [];
 *     for (const range of things.ids.map((v, k) => ({key: k, value: v}))) {
 *         thingsGrants.push(new databricks.Grants(`things-${range.key}`, {
 *             table: range.value,
 *             grants: [{
 *                 principal: "sensitive",
 *                 privileges: [
 *                     "SELECT",
 *                     "MODIFY",
 *                 ],
 *             }],
 *         }));
 *     }
 * }
 * ```
 *
 * ## View grants
 *
 * You can grant `ALL_PRIVILEGES`, `APPLY_TAG`, `MANAGE` and `SELECT` privileges to *`catalog.schema.view`* specified in `table` attribute.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const customer360 = new databricks.Grants("customer360", {
 *     table: "main.reporting.customer360",
 *     grants: [{
 *         principal: "Data Analysts",
 *         privileges: ["SELECT"],
 *     }],
 * });
 * ```
 *
 * You can also apply grants dynamically with databricks.getViews data resource:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * export = async () => {
 *     const customers = await databricks.getViews({
 *         catalogName: "main",
 *         schemaName: "customers",
 *     });
 *     const customersGrants: databricks.Grants[] = [];
 *     for (const range of customers.ids.map((v, k) => ({key: k, value: v}))) {
 *         customersGrants.push(new databricks.Grants(`customers-${range.key}`, {
 *             table: range.value,
 *             grants: [{
 *                 principal: "sensitive",
 *                 privileges: [
 *                     "SELECT",
 *                     "MODIFY",
 *                 ],
 *             }],
 *         }));
 *     }
 * }
 * ```
 *
 * ## Volume grants
 *
 * You can grant `ALL_PRIVILEGES`, `MANAGE`, `READ_VOLUME` and `WRITE_VOLUME` privileges to *`catalog.schema.volume`* specified in the `volume` attribute.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.Volume("this", {
 *     name: "quickstart_volume",
 *     catalogName: sandbox.name,
 *     schemaName: things.name,
 *     volumeType: "EXTERNAL",
 *     storageLocation: some.url,
 *     comment: "this volume is managed by terraform",
 * });
 * const volume = new databricks.Grants("volume", {
 *     volume: _this.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["WRITE_VOLUME"],
 *     }],
 * });
 * ```
 *
 * ## Registered model grants
 *
 * You can grant `ALL_PRIVILEGES`, `APPLY_TAG`, `EXECUTE`, and `MANAGE` privileges to *`catalog.schema.model`* specified in the `model` attribute.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const customers = new databricks.Grants("customers", {
 *     model: "main.reporting.customer_model",
 *     grants: [
 *         {
 *             principal: "Data Engineers",
 *             privileges: [
 *                 "APPLY_TAG",
 *                 "EXECUTE",
 *             ],
 *         },
 *         {
 *             principal: "Data Analysts",
 *             privileges: ["EXECUTE"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Function grants
 *
 * You can grant `ALL_PRIVILEGES`, `EXECUTE`, and `MANAGE` privileges to *`catalog.schema.function`* specified in the `function` attribute.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const udf = new databricks.Grants("udf", {
 *     "function": "main.reporting.udf",
 *     grants: [
 *         {
 *             principal: "Data Engineers",
 *             privileges: ["EXECUTE"],
 *         },
 *         {
 *             principal: "Data Analysts",
 *             privileges: ["EXECUTE"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Service credential grants
 *
 * You can grant `ALL_PRIVILEGES`, `ACCESS`, `CREATE_CONNECTION`, and `MANAGE` privileges to databricks.Credential id specified in `credential` attribute:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const external = new databricks.Credential("external", {
 *     name: externalDataAccess.name,
 *     awsIamRole: {
 *         roleArn: externalDataAccess.arn,
 *     },
 *     purpose: "SERVICE",
 *     comment: "Managed by TF",
 * });
 * const externalCreds = new databricks.Grants("external_creds", {
 *     credential: external.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["CREATE_CONNECTION"],
 *     }],
 * });
 * ```
 *
 * ## Storage credential grants
 *
 * You can grant `ALL_PRIVILEGES`, `CREATE_EXTERNAL_LOCATION`, `CREATE_EXTERNAL_TABLE`, `MANAGE`, `READ_FILES` and `WRITE_FILES` privileges to databricks.StorageCredential id specified in `storageCredential` attribute:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const external = new databricks.StorageCredential("external", {
 *     name: externalDataAccess.name,
 *     awsIamRole: {
 *         roleArn: externalDataAccess.arn,
 *     },
 *     comment: "Managed by TF",
 * });
 * const externalCreds = new databricks.Grants("external_creds", {
 *     storageCredential: external.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["CREATE_EXTERNAL_TABLE"],
 *     }],
 * });
 * ```
 *
 * ## External location grants
 *
 * You can grant `ALL_PRIVILEGES`, `CREATE_EXTERNAL_TABLE`, `CREATE_MANAGED_STORAGE`, `CREATE EXTERNAL VOLUME`, `MANAGE`, `READ_FILES` and `WRITE_FILES` privileges to databricks.ExternalLocation id specified in `externalLocation` attribute:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const some = new databricks.ExternalLocation("some", {
 *     name: "external",
 *     url: `s3://${externalAwsS3Bucket.id}/some`,
 *     credentialName: external.id,
 *     comment: "Managed by TF",
 * });
 * const someGrants = new databricks.Grants("some", {
 *     externalLocation: some.id,
 *     grants: [
 *         {
 *             principal: "Data Engineers",
 *             privileges: [
 *                 "CREATE_EXTERNAL_TABLE",
 *                 "READ_FILES",
 *             ],
 *         },
 *         {
 *             principal: mySp.applicationId,
 *             privileges: [
 *                 "CREATE_EXTERNAL_TABLE",
 *                 "READ_FILES",
 *             ],
 *         },
 *         {
 *             principal: myGroup.displayName,
 *             privileges: [
 *                 "CREATE_EXTERNAL_TABLE",
 *                 "READ_FILES",
 *             ],
 *         },
 *         {
 *             principal: myUser.userName,
 *             privileges: [
 *                 "CREATE_EXTERNAL_TABLE",
 *                 "READ_FILES",
 *             ],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Connection grants
 *
 * You can grant `ALL_PRIVILEGES`, `MANAGE`, `USE_CONNECTION` and `CREATE_FOREIGN_CATALOG` to databricks.Connection specified in `foreignConnection` attribute:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const mysql = new databricks.Connection("mysql", {
 *     name: "mysql_connection",
 *     connectionType: "MYSQL",
 *     comment: "this is a connection to mysql db",
 *     options: {
 *         host: "test.mysql.database.azure.com",
 *         port: "3306",
 *         user: "user",
 *         password: "password",
 *     },
 *     properties: {
 *         purpose: "testing",
 *     },
 * });
 * const some = new databricks.Grants("some", {
 *     foreignConnection: mysql.name,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: [
 *             "CREATE_FOREIGN_CATALOG",
 *             "USE_CONNECTION",
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Delta Sharing share grants
 *
 * You can grant `SELECT` to databricks.Recipient on databricks.Share name specified in `share` attribute:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const some = new databricks.Share("some", {name: "my_share"});
 * const someRecipient = new databricks.Recipient("some", {name: "my_recipient"});
 * const someGrants = new databricks.Grants("some", {
 *     share: some.name,
 *     grants: [{
 *         principal: someRecipient.name,
 *         privileges: ["SELECT"],
 *     }],
 * });
 * ```
 *
 * ## Other access control
 *
 * You can control Databricks General Permissions through databricks.Permissions resource.
 *
 * ## Import
 *
 * The resource can be imported using combination of securable type (`table`, `catalog`, `foreign_connection`, ...) and its name:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_grants.this
 *
 *   id = "catalog/abc"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/grants:Grants this catalog/abc
 * ```
 */
export class Grants extends pulumi.CustomResource {
    /**
     * Get an existing Grants resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantsState, opts?: pulumi.CustomResourceOptions): Grants {
        return new Grants(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/grants:Grants';

    /**
     * Returns true if the given object is an instance of Grants.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Grants {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Grants.__pulumiType;
    }

    public readonly catalog!: pulumi.Output<string | undefined>;
    public readonly credential!: pulumi.Output<string | undefined>;
    public readonly externalLocation!: pulumi.Output<string | undefined>;
    public readonly foreignConnection!: pulumi.Output<string | undefined>;
    public readonly function!: pulumi.Output<string | undefined>;
    public readonly grants!: pulumi.Output<outputs.GrantsGrant[]>;
    public readonly metastore!: pulumi.Output<string | undefined>;
    public readonly model!: pulumi.Output<string | undefined>;
    public readonly pipeline!: pulumi.Output<string | undefined>;
    public readonly recipient!: pulumi.Output<string | undefined>;
    public readonly schema!: pulumi.Output<string | undefined>;
    public readonly share!: pulumi.Output<string | undefined>;
    public readonly storageCredential!: pulumi.Output<string | undefined>;
    public readonly table!: pulumi.Output<string | undefined>;
    public readonly volume!: pulumi.Output<string | undefined>;

    /**
     * Create a Grants resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantsArgs | GrantsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantsState | undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["credential"] = state ? state.credential : undefined;
            resourceInputs["externalLocation"] = state ? state.externalLocation : undefined;
            resourceInputs["foreignConnection"] = state ? state.foreignConnection : undefined;
            resourceInputs["function"] = state ? state.function : undefined;
            resourceInputs["grants"] = state ? state.grants : undefined;
            resourceInputs["metastore"] = state ? state.metastore : undefined;
            resourceInputs["model"] = state ? state.model : undefined;
            resourceInputs["pipeline"] = state ? state.pipeline : undefined;
            resourceInputs["recipient"] = state ? state.recipient : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["share"] = state ? state.share : undefined;
            resourceInputs["storageCredential"] = state ? state.storageCredential : undefined;
            resourceInputs["table"] = state ? state.table : undefined;
            resourceInputs["volume"] = state ? state.volume : undefined;
        } else {
            const args = argsOrState as GrantsArgs | undefined;
            if ((!args || args.grants === undefined) && !opts.urn) {
                throw new Error("Missing required property 'grants'");
            }
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["credential"] = args ? args.credential : undefined;
            resourceInputs["externalLocation"] = args ? args.externalLocation : undefined;
            resourceInputs["foreignConnection"] = args ? args.foreignConnection : undefined;
            resourceInputs["function"] = args ? args.function : undefined;
            resourceInputs["grants"] = args ? args.grants : undefined;
            resourceInputs["metastore"] = args ? args.metastore : undefined;
            resourceInputs["model"] = args ? args.model : undefined;
            resourceInputs["pipeline"] = args ? args.pipeline : undefined;
            resourceInputs["recipient"] = args ? args.recipient : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["share"] = args ? args.share : undefined;
            resourceInputs["storageCredential"] = args ? args.storageCredential : undefined;
            resourceInputs["table"] = args ? args.table : undefined;
            resourceInputs["volume"] = args ? args.volume : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Grants.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Grants resources.
 */
export interface GrantsState {
    catalog?: pulumi.Input<string>;
    credential?: pulumi.Input<string>;
    externalLocation?: pulumi.Input<string>;
    foreignConnection?: pulumi.Input<string>;
    function?: pulumi.Input<string>;
    grants?: pulumi.Input<pulumi.Input<inputs.GrantsGrant>[]>;
    metastore?: pulumi.Input<string>;
    model?: pulumi.Input<string>;
    pipeline?: pulumi.Input<string>;
    recipient?: pulumi.Input<string>;
    schema?: pulumi.Input<string>;
    share?: pulumi.Input<string>;
    storageCredential?: pulumi.Input<string>;
    table?: pulumi.Input<string>;
    volume?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Grants resource.
 */
export interface GrantsArgs {
    catalog?: pulumi.Input<string>;
    credential?: pulumi.Input<string>;
    externalLocation?: pulumi.Input<string>;
    foreignConnection?: pulumi.Input<string>;
    function?: pulumi.Input<string>;
    grants: pulumi.Input<pulumi.Input<inputs.GrantsGrant>[]>;
    metastore?: pulumi.Input<string>;
    model?: pulumi.Input<string>;
    pipeline?: pulumi.Input<string>;
    recipient?: pulumi.Input<string>;
    schema?: pulumi.Input<string>;
    share?: pulumi.Input<string>;
    storageCredential?: pulumi.Input<string>;
    table?: pulumi.Input<string>;
    volume?: pulumi.Input<string>;
}
