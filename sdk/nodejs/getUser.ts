// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Retrieves information about databricks_user.
 *
 * > This data source can be used with an account or workspace-level provider.
 *
 * ## Example Usage
 *
 * Adding user to administrative group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const admins = databricks.getGroup({
 *     displayName: "admins",
 * });
 * const me = databricks.getUser({
 *     userName: "me@example.com",
 * });
 * const myMemberA = new databricks.GroupMember("my_member_a", {
 *     groupId: admins.then(admins => admins.id),
 *     memberId: me.then(me => me.id),
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * - End to end workspace management guide.
 * - databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
 * - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * - databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * - databricks.GroupMember to attach users and groups as group members.
 * - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * - databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * - databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 */
export function getUser(args?: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("databricks:index/getUser:getUser", {
        "userId": args.userId,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * ID of the user.
     */
    userId?: string;
    /**
     * User name of the user. The user must exist before this resource can be planned.
     */
    userName?: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * identifier for use in databricks_access_control_rule_set, e.g. `users/mr.foo@example.com`.
     */
    readonly aclPrincipalId: string;
    /**
     * Whether the user is active.
     */
    readonly active: boolean;
    /**
     * Alphanumeric representation of user local name. e.g. `mrFoo`.
     */
    readonly alphanumeric: string;
    readonly applicationId: string;
    /**
     * Display name of the user, e.g. `Mr Foo`.
     */
    readonly displayName: string;
    /**
     * ID of the user in an external identity provider.
     */
    readonly externalId: string;
    /**
     * Home folder of the user, e.g. `/Users/mr.foo@example.com`.
     */
    readonly home: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Personal Repos location of the user, e.g. `/Repos/mr.foo@example.com`.
     */
    readonly repos: string;
    readonly userId?: string;
    /**
     * Name of the user, e.g. `mr.foo@example.com`.
     */
    readonly userName?: string;
}
/**
 * Retrieves information about databricks_user.
 *
 * > This data source can be used with an account or workspace-level provider.
 *
 * ## Example Usage
 *
 * Adding user to administrative group
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const admins = databricks.getGroup({
 *     displayName: "admins",
 * });
 * const me = databricks.getUser({
 *     userName: "me@example.com",
 * });
 * const myMemberA = new databricks.GroupMember("my_member_a", {
 *     groupId: admins.then(admins => admins.id),
 *     memberId: me.then(me => me.id),
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are used in the same context:
 *
 * - End to end workspace management guide.
 * - databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
 * - databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * - databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * - databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * - databricks.GroupMember to attach users and groups as group members.
 * - databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * - databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
 * - databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 */
export function getUserOutput(args?: GetUserOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetUserResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("databricks:index/getUser:getUser", {
        "userId": args.userId,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * ID of the user.
     */
    userId?: pulumi.Input<string>;
    /**
     * User name of the user. The user must exist before this resource can be planned.
     */
    userName?: pulumi.Input<string>;
}
