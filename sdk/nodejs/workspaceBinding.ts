// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const sandbox = new databricks.Catalog("sandbox", {
 *     name: "sandbox",
 *     isolationMode: "ISOLATED",
 * });
 * const sandboxWorkspaceBinding = new databricks.WorkspaceBinding("sandbox", {
 *     securableName: sandbox.name,
 *     workspaceId: other.workspaceId,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by using combination of workspace ID, securable type and name:
 *
 * ```sh
 * $ pulumi import databricks:index/workspaceBinding:WorkspaceBinding this "<workspace_id>|<securable_type>|<securable_name>"
 * ```
 */
export class WorkspaceBinding extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceBindingState, opts?: pulumi.CustomResourceOptions): WorkspaceBinding {
        return new WorkspaceBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/workspaceBinding:WorkspaceBinding';

    /**
     * Returns true if the given object is an instance of WorkspaceBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceBinding.__pulumiType;
    }

    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
     */
    public readonly bindingType!: pulumi.Output<string | undefined>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    public readonly catalogName!: pulumi.Output<string | undefined>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    public readonly securableName!: pulumi.Output<string>;
    /**
     * Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
     */
    public readonly securableType!: pulumi.Output<string | undefined>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    public readonly workspaceId!: pulumi.Output<string | undefined>;

    /**
     * Create a WorkspaceBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: WorkspaceBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceBindingArgs | WorkspaceBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceBindingState | undefined;
            resourceInputs["bindingType"] = state ? state.bindingType : undefined;
            resourceInputs["catalogName"] = state ? state.catalogName : undefined;
            resourceInputs["securableName"] = state ? state.securableName : undefined;
            resourceInputs["securableType"] = state ? state.securableType : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as WorkspaceBindingArgs | undefined;
            resourceInputs["bindingType"] = args ? args.bindingType : undefined;
            resourceInputs["catalogName"] = args ? args.catalogName : undefined;
            resourceInputs["securableName"] = args ? args.securableName : undefined;
            resourceInputs["securableType"] = args ? args.securableType : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkspaceBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceBinding resources.
 */
export interface WorkspaceBindingState {
    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
     */
    bindingType?: pulumi.Input<string>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    catalogName?: pulumi.Input<string>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    securableName?: pulumi.Input<string>;
    /**
     * Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
     */
    securableType?: pulumi.Input<string>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    workspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceBinding resource.
 */
export interface WorkspaceBindingArgs {
    /**
     * Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
     */
    bindingType?: pulumi.Input<string>;
    /**
     * @deprecated Please use 'securable_name' and 'securable_type instead.
     */
    catalogName?: pulumi.Input<string>;
    /**
     * Name of securable. Change forces creation of a new resource.
     */
    securableName?: pulumi.Input<string>;
    /**
     * Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
     */
    securableType?: pulumi.Input<string>;
    /**
     * ID of the workspace. Change forces creation of a new resource.
     */
    workspaceId?: pulumi.Input<string>;
}