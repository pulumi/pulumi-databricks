// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * !> Importing this resource is not currently supported.
 */
export class Mount extends pulumi.CustomResource {
    /**
     * Get an existing Mount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MountState, opts?: pulumi.CustomResourceOptions): Mount {
        return new Mount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mount:Mount';

    /**
     * Returns true if the given object is an instance of Mount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Mount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Mount.__pulumiType;
    }

    public readonly abfs!: pulumi.Output<outputs.MountAbfs | undefined>;
    public readonly adl!: pulumi.Output<outputs.MountAdl | undefined>;
    public readonly clusterId!: pulumi.Output<string>;
    public readonly encryptionType!: pulumi.Output<string | undefined>;
    public readonly extraConfigs!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly gs!: pulumi.Output<outputs.MountGs | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly resourceId!: pulumi.Output<string | undefined>;
    public readonly s3!: pulumi.Output<outputs.MountS3 | undefined>;
    /**
     * (String) HDFS-compatible url
     */
    public /*out*/ readonly source!: pulumi.Output<string>;
    public readonly uri!: pulumi.Output<string | undefined>;
    public readonly wasb!: pulumi.Output<outputs.MountWasb | undefined>;

    /**
     * Create a Mount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MountArgs | MountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MountState | undefined;
            resourceInputs["abfs"] = state ? state.abfs : undefined;
            resourceInputs["adl"] = state ? state.adl : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["encryptionType"] = state ? state.encryptionType : undefined;
            resourceInputs["extraConfigs"] = state ? state.extraConfigs : undefined;
            resourceInputs["gs"] = state ? state.gs : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceId"] = state ? state.resourceId : undefined;
            resourceInputs["s3"] = state ? state.s3 : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["wasb"] = state ? state.wasb : undefined;
        } else {
            const args = argsOrState as MountArgs | undefined;
            resourceInputs["abfs"] = args ? args.abfs : undefined;
            resourceInputs["adl"] = args ? args.adl : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["encryptionType"] = args ? args.encryptionType : undefined;
            resourceInputs["extraConfigs"] = args ? args.extraConfigs : undefined;
            resourceInputs["gs"] = args ? args.gs : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["resourceId"] = args ? args.resourceId : undefined;
            resourceInputs["s3"] = args ? args.s3 : undefined;
            resourceInputs["uri"] = args ? args.uri : undefined;
            resourceInputs["wasb"] = args ? args.wasb : undefined;
            resourceInputs["source"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Mount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Mount resources.
 */
export interface MountState {
    abfs?: pulumi.Input<inputs.MountAbfs>;
    adl?: pulumi.Input<inputs.MountAdl>;
    clusterId?: pulumi.Input<string>;
    encryptionType?: pulumi.Input<string>;
    extraConfigs?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    gs?: pulumi.Input<inputs.MountGs>;
    name?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    s3?: pulumi.Input<inputs.MountS3>;
    /**
     * (String) HDFS-compatible url
     */
    source?: pulumi.Input<string>;
    uri?: pulumi.Input<string>;
    wasb?: pulumi.Input<inputs.MountWasb>;
}

/**
 * The set of arguments for constructing a Mount resource.
 */
export interface MountArgs {
    abfs?: pulumi.Input<inputs.MountAbfs>;
    adl?: pulumi.Input<inputs.MountAdl>;
    clusterId?: pulumi.Input<string>;
    encryptionType?: pulumi.Input<string>;
    extraConfigs?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    gs?: pulumi.Input<inputs.MountGs>;
    name?: pulumi.Input<string>;
    resourceId?: pulumi.Input<string>;
    s3?: pulumi.Input<inputs.MountS3>;
    uri?: pulumi.Input<string>;
    wasb?: pulumi.Input<inputs.MountWasb>;
}
