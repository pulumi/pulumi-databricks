// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * The resource dbfs file can be imported using the path of the file:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/dbfsFile:DbfsFile this <path>
 * ```
 */
export class DbfsFile extends pulumi.CustomResource {
    /**
     * Get an existing DbfsFile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DbfsFileState, opts?: pulumi.CustomResourceOptions): DbfsFile {
        return new DbfsFile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/dbfsFile:DbfsFile';

    /**
     * Returns true if the given object is an instance of DbfsFile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DbfsFile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DbfsFile.__pulumiType;
    }

    public readonly contentBase64!: pulumi.Output<string | undefined>;
    /**
     * Path, but with `dbfs:` prefix.
     */
    public /*out*/ readonly dbfsPath!: pulumi.Output<string>;
    /**
     * The file size of the file that is being tracked by this resource in bytes.
     */
    public /*out*/ readonly fileSize!: pulumi.Output<number>;
    public readonly md5!: pulumi.Output<string | undefined>;
    /**
     * The path of the file in which you wish to save.
     */
    public readonly path!: pulumi.Output<string>;
    /**
     * The full absolute path to the file. Conflicts with `contentBase64`.
     */
    public readonly source!: pulumi.Output<string | undefined>;

    /**
     * Create a DbfsFile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DbfsFileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DbfsFileArgs | DbfsFileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DbfsFileState | undefined;
            resourceInputs["contentBase64"] = state ? state.contentBase64 : undefined;
            resourceInputs["dbfsPath"] = state ? state.dbfsPath : undefined;
            resourceInputs["fileSize"] = state ? state.fileSize : undefined;
            resourceInputs["md5"] = state ? state.md5 : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
        } else {
            const args = argsOrState as DbfsFileArgs | undefined;
            if ((!args || args.path === undefined) && !opts.urn) {
                throw new Error("Missing required property 'path'");
            }
            resourceInputs["contentBase64"] = args ? args.contentBase64 : undefined;
            resourceInputs["md5"] = args ? args.md5 : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["dbfsPath"] = undefined /*out*/;
            resourceInputs["fileSize"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DbfsFile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DbfsFile resources.
 */
export interface DbfsFileState {
    contentBase64?: pulumi.Input<string>;
    /**
     * Path, but with `dbfs:` prefix.
     */
    dbfsPath?: pulumi.Input<string>;
    /**
     * The file size of the file that is being tracked by this resource in bytes.
     */
    fileSize?: pulumi.Input<number>;
    md5?: pulumi.Input<string>;
    /**
     * The path of the file in which you wish to save.
     */
    path?: pulumi.Input<string>;
    /**
     * The full absolute path to the file. Conflicts with `contentBase64`.
     */
    source?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DbfsFile resource.
 */
export interface DbfsFileArgs {
    contentBase64?: pulumi.Input<string>;
    md5?: pulumi.Input<string>;
    /**
     * The path of the file in which you wish to save.
     */
    path: pulumi.Input<string>;
    /**
     * The full absolute path to the file. Conflicts with `contentBase64`.
     */
    source?: pulumi.Input<string>;
}