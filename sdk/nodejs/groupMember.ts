// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource allows you to attach users, service_principal, and groups as group members.
 *
 * To attach members to groups in the Databricks account, the provider must be configured with `host = "https://accounts.cloud.databricks.com"` on AWS deployments or `host = "https://accounts.azuredatabricks.net"` and authenticate using AAD tokens on Azure deployments
 *
 * ## Example Usage
 *
 * After the following example, Bradley would have direct membership in group B and transitive membership in group A.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const a = new databricks.Group("a", {displayName: "A"});
 * const b = new databricks.Group("b", {displayName: "B"});
 * const ab = new databricks.GroupMember("ab", {
 *     groupId: a.id,
 *     memberId: b.id,
 * });
 * const bradley = new databricks.User("bradley", {userName: "bradley@example.com"});
 * const bb = new databricks.GroupMember("bb", {
 *     groupId: b.id,
 *     memberId: bradley.id,
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks.IpAccessList to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
 * * databricks.ServicePrincipal to grant access to a workspace to an automation tool or application.
 * * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * * databricks.User data to retrieve information about databricks_user.
 * * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 *
 * ## Import
 *
 * You can import a `databricks_group_member` resource with name `my_group_member` like the following:
 *
 * bash
 *
 * ```sh
 * $ pulumi import databricks:index/groupMember:GroupMember my_group_member "<group_id>|<member_id>"
 * ```
 */
export class GroupMember extends pulumi.CustomResource {
    /**
     * Get an existing GroupMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupMemberState, opts?: pulumi.CustomResourceOptions): GroupMember {
        return new GroupMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/groupMember:GroupMember';

    /**
     * Returns true if the given object is an instance of GroupMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupMember.__pulumiType;
    }

    /**
     * This is the id of the group resource.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * This is the id of the group, service principal, or user.
     */
    public readonly memberId!: pulumi.Output<string>;

    /**
     * Create a GroupMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupMemberArgs | GroupMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupMemberState | undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["memberId"] = state ? state.memberId : undefined;
        } else {
            const args = argsOrState as GroupMemberArgs | undefined;
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.memberId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'memberId'");
            }
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["memberId"] = args ? args.memberId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GroupMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupMember resources.
 */
export interface GroupMemberState {
    /**
     * This is the id of the group resource.
     */
    groupId?: pulumi.Input<string>;
    /**
     * This is the id of the group, service principal, or user.
     */
    memberId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GroupMember resource.
 */
export interface GroupMemberArgs {
    /**
     * This is the id of the group resource.
     */
    groupId: pulumi.Input<string>;
    /**
     * This is the id of the group, service principal, or user.
     */
    memberId: pulumi.Input<string>;
}