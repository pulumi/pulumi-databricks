// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to attach a role or databricks.InstanceProfile (AWS) to a databricks_service_principal.
 *
 * > This resource can be used with an account or workspace-level provider.
 *
 * ## Example Usage
 *
 * Granting a service principal access to an instance profile
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const instanceProfile = new databricks.InstanceProfile("instance_profile", {instanceProfileArn: "my_instance_profile_arn"});
 * const _this = new databricks.ServicePrincipal("this", {displayName: "My Service Principal"});
 * const myServicePrincipalInstanceProfile = new databricks.ServicePrincipalRole("my_service_principal_instance_profile", {
 *     servicePrincipalId: _this.id,
 *     role: instanceProfile.id,
 * });
 * ```
 *
 * Granting a service principal the Account Admin role.
 *
 * > This can only be used with an account-level provider.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const tfAdmin = new databricks.ServicePrincipal("tf_admin", {displayName: "Pulumi Admin"});
 * const tfAdminAccount = new databricks.ServicePrincipalRole("tf_admin_account", {
 *     servicePrincipalId: tfAdmin.id,
 *     role: "account_admin",
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.UserRole to attach role or databricks.InstanceProfile (AWS) to databricks_user.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.AccessControlRuleSet to attach other roles to account level resources.
 *
 * ## Import
 *
 * !> Importing this resource is not currently supported.
 */
export class ServicePrincipalRole extends pulumi.CustomResource {
    /**
     * Get an existing ServicePrincipalRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePrincipalRoleState, opts?: pulumi.CustomResourceOptions): ServicePrincipalRole {
        return new ServicePrincipalRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/servicePrincipalRole:ServicePrincipalRole';

    /**
     * Returns true if the given object is an instance of ServicePrincipalRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicePrincipalRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicePrincipalRole.__pulumiType;
    }

    /**
     * This is the role name, role id, or instance profile resource.
     */
    public readonly role!: pulumi.Output<string>;
    /**
     * This is the id of the service principal resource.
     */
    public readonly servicePrincipalId!: pulumi.Output<string>;

    /**
     * Create a ServicePrincipalRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicePrincipalRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicePrincipalRoleArgs | ServicePrincipalRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicePrincipalRoleState | undefined;
            resourceInputs["role"] = state ? state.role : undefined;
            resourceInputs["servicePrincipalId"] = state ? state.servicePrincipalId : undefined;
        } else {
            const args = argsOrState as ServicePrincipalRoleArgs | undefined;
            if ((!args || args.role === undefined) && !opts.urn) {
                throw new Error("Missing required property 'role'");
            }
            if ((!args || args.servicePrincipalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servicePrincipalId'");
            }
            resourceInputs["role"] = args ? args.role : undefined;
            resourceInputs["servicePrincipalId"] = args ? args.servicePrincipalId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServicePrincipalRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicePrincipalRole resources.
 */
export interface ServicePrincipalRoleState {
    /**
     * This is the role name, role id, or instance profile resource.
     */
    role?: pulumi.Input<string>;
    /**
     * This is the id of the service principal resource.
     */
    servicePrincipalId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServicePrincipalRole resource.
 */
export interface ServicePrincipalRoleArgs {
    /**
     * This is the role name, role id, or instance profile resource.
     */
    role: pulumi.Input<string>;
    /**
     * This is the id of the service principal resource.
     */
    servicePrincipalId: pulumi.Input<string>;
}
