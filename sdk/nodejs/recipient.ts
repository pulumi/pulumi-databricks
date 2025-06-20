// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > This resource can only be used with a workspace-level provider!
 *
 * In Delta Sharing, a recipient is an entity that receives shares from a provider. In Unity Catalog, a share is a securable object that represents an organization and associates it with a credential or secure sharing identifier that allows that organization to access one or more shares.
 *
 * As a data provider (sharer), you can define multiple recipients for any given Unity Catalog metastore, but if you want to share data from multiple metastores with a particular user or group of users, you must define the recipient separately for each metastore. A recipient can have access to multiple shares.
 *
 * A `databricks.Recipient` is contained within databricks.Metastore and can have permissions to `SELECT` from a list of shares.
 *
 * ## Example Usage
 *
 * ### Databricks Sharing with non databricks recipient
 *
 * Setting `authenticationType` type to `TOKEN` creates a temporary url to download a credentials file. This is used to
 * authenticate to the sharing server to access data. This is for when the recipient is not using Databricks.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 * import * as random from "@pulumi/random";
 *
 * const db2opensharecode = new random.index.Password("db2opensharecode", {
 *     length: 16,
 *     special: true,
 * });
 * const current = databricks.getCurrentUser({});
 * const db2open = new databricks.Recipient("db2open", {
 *     name: current.then(current => `${current.alphanumeric}-recipient`),
 *     comment: "Made by Pulumi",
 *     authenticationType: "TOKEN",
 *     sharingCode: db2opensharecode.result,
 *     ipAccessList: {
 *         allowedIpAddresses: [],
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * The recipient resource can be imported using the name of the recipient:
 *
 * hcl
 *
 * import {
 *
 *   to = databricks_recipient.this
 *
 *   id = "<recipient_name>"
 *
 * }
 *
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/recipient:Recipient this "<recipient_name>"
 * ```
 */
export class Recipient extends pulumi.CustomResource {
    /**
     * Get an existing Recipient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecipientState, opts?: pulumi.CustomResourceOptions): Recipient {
        return new Recipient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/recipient:Recipient';

    /**
     * Returns true if the given object is an instance of Recipient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Recipient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Recipient.__pulumiType;
    }

    public /*out*/ readonly activated!: pulumi.Output<boolean>;
    /**
     * Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
     */
    public /*out*/ readonly activationUrl!: pulumi.Output<string>;
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    public readonly authenticationType!: pulumi.Output<string>;
    /**
     * Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    public /*out*/ readonly cloud!: pulumi.Output<string>;
    /**
     * Description about the recipient.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Time at which this recipient was created, in epoch milliseconds.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<number>;
    /**
     * Username of recipient creator.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * Required when `authenticationType` is `DATABRICKS`.
     */
    public readonly dataRecipientGlobalMetastoreId!: pulumi.Output<string | undefined>;
    /**
     * Expiration timestamp of the token in epoch milliseconds.
     */
    public readonly expirationTime!: pulumi.Output<number | undefined>;
    /**
     * Recipient IP access list.
     */
    public readonly ipAccessList!: pulumi.Output<outputs.RecipientIpAccessList | undefined>;
    /**
     * Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    public /*out*/ readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Username/groupname/sp applicationId of the recipient owner.
     */
    public readonly owner!: pulumi.Output<string | undefined>;
    /**
     * Recipient properties - object consisting of following fields:
     */
    public readonly propertiesKvpairs!: pulumi.Output<outputs.RecipientPropertiesKvpairs | undefined>;
    /**
     * Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    public readonly sharingCode!: pulumi.Output<string | undefined>;
    /**
     * List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
     */
    public readonly tokens!: pulumi.Output<outputs.RecipientToken[]>;
    /**
     * Time at which this recipient was updated, in epoch milliseconds.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<number>;
    /**
     * Username of recipient Token updater.
     */
    public /*out*/ readonly updatedBy!: pulumi.Output<string>;

    /**
     * Create a Recipient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecipientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RecipientArgs | RecipientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RecipientState | undefined;
            resourceInputs["activated"] = state ? state.activated : undefined;
            resourceInputs["activationUrl"] = state ? state.activationUrl : undefined;
            resourceInputs["authenticationType"] = state ? state.authenticationType : undefined;
            resourceInputs["cloud"] = state ? state.cloud : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["dataRecipientGlobalMetastoreId"] = state ? state.dataRecipientGlobalMetastoreId : undefined;
            resourceInputs["expirationTime"] = state ? state.expirationTime : undefined;
            resourceInputs["ipAccessList"] = state ? state.ipAccessList : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["propertiesKvpairs"] = state ? state.propertiesKvpairs : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["sharingCode"] = state ? state.sharingCode : undefined;
            resourceInputs["tokens"] = state ? state.tokens : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["updatedBy"] = state ? state.updatedBy : undefined;
        } else {
            const args = argsOrState as RecipientArgs | undefined;
            if ((!args || args.authenticationType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationType'");
            }
            resourceInputs["authenticationType"] = args ? args.authenticationType : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRecipientGlobalMetastoreId"] = args ? args.dataRecipientGlobalMetastoreId : undefined;
            resourceInputs["expirationTime"] = args ? args.expirationTime : undefined;
            resourceInputs["ipAccessList"] = args ? args.ipAccessList : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["propertiesKvpairs"] = args ? args.propertiesKvpairs : undefined;
            resourceInputs["sharingCode"] = args?.sharingCode ? pulumi.secret(args.sharingCode) : undefined;
            resourceInputs["tokens"] = args ? args.tokens : undefined;
            resourceInputs["activated"] = undefined /*out*/;
            resourceInputs["activationUrl"] = undefined /*out*/;
            resourceInputs["cloud"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["metastoreId"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
            resourceInputs["updatedBy"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["sharingCode"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Recipient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Recipient resources.
 */
export interface RecipientState {
    activated?: pulumi.Input<boolean>;
    /**
     * Full activation URL to retrieve the access token. It will be empty if the token is already retrieved.
     */
    activationUrl?: pulumi.Input<string>;
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    authenticationType?: pulumi.Input<string>;
    /**
     * Cloud vendor of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    cloud?: pulumi.Input<string>;
    /**
     * Description about the recipient.
     */
    comment?: pulumi.Input<string>;
    /**
     * Time at which this recipient was created, in epoch milliseconds.
     */
    createdAt?: pulumi.Input<number>;
    /**
     * Username of recipient creator.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * Required when `authenticationType` is `DATABRICKS`.
     */
    dataRecipientGlobalMetastoreId?: pulumi.Input<string>;
    /**
     * Expiration timestamp of the token in epoch milliseconds.
     */
    expirationTime?: pulumi.Input<number>;
    /**
     * Recipient IP access list.
     */
    ipAccessList?: pulumi.Input<inputs.RecipientIpAccessList>;
    /**
     * Unique identifier of recipient's Unity Catalog metastore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the recipient owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Recipient properties - object consisting of following fields:
     */
    propertiesKvpairs?: pulumi.Input<inputs.RecipientPropertiesKvpairs>;
    /**
     * Cloud region of the recipient's Unity Catalog Metstore. This field is only present when the authenticationType is `DATABRICKS`.
     */
    region?: pulumi.Input<string>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    sharingCode?: pulumi.Input<string>;
    /**
     * List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
     */
    tokens?: pulumi.Input<pulumi.Input<inputs.RecipientToken>[]>;
    /**
     * Time at which this recipient was updated, in epoch milliseconds.
     */
    updatedAt?: pulumi.Input<number>;
    /**
     * Username of recipient Token updater.
     */
    updatedBy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Recipient resource.
 */
export interface RecipientArgs {
    /**
     * The delta sharing authentication type. Valid values are `TOKEN` and `DATABRICKS`.
     */
    authenticationType: pulumi.Input<string>;
    /**
     * Description about the recipient.
     */
    comment?: pulumi.Input<string>;
    /**
     * Required when `authenticationType` is `DATABRICKS`.
     */
    dataRecipientGlobalMetastoreId?: pulumi.Input<string>;
    /**
     * Expiration timestamp of the token in epoch milliseconds.
     */
    expirationTime?: pulumi.Input<number>;
    /**
     * Recipient IP access list.
     */
    ipAccessList?: pulumi.Input<inputs.RecipientIpAccessList>;
    /**
     * Name of recipient. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the recipient owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Recipient properties - object consisting of following fields:
     */
    propertiesKvpairs?: pulumi.Input<inputs.RecipientPropertiesKvpairs>;
    /**
     * The one-time sharing code provided by the data recipient.
     */
    sharingCode?: pulumi.Input<string>;
    /**
     * List of Recipient Tokens. This field is only present when the authenticationType is TOKEN. Each list element is an object with following attributes:
     */
    tokens?: pulumi.Input<pulumi.Input<inputs.RecipientToken>[]>;
}
