// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to manage both [account groups and workspace-local groups](https://docs.databricks.com/administration-guide/users-groups/groups.html). You can use the GroupMember resource to assign Databricks users, service principals as well as other groups as members of the group. This is useful if you are using an application to sync users & groups with SCIM API.
//
// > This resource can be used with an account or workspace-level provider.
//
// > To assign an account level group to a workspace use databricks_mws_permission_assignment.
//
// > Entitlements, like, `allowClusterCreate`, `allowInstancePoolCreate`, `databricksSqlAccess`, `workspaceAccess` applicable only for workspace-level groups.  Use Entitlements resource to assign entitlements inside a workspace to account-level groups.
//
// To create account groups in the Databricks account, the provider must be configured accordingly. On AWS deployment with `host = "https://accounts.cloud.databricks.com"` and `accountId = "00000000-0000-0000-0000-000000000000"`. On Azure deployments `host = "https://accounts.azuredatabricks.net"`, `accountId = "00000000-0000-0000-0000-000000000000"` and using AAD tokens as authentication.
//
// Recommended to use along with Identity Provider SCIM provisioning to populate users into those groups:
//
// * [Azure Active Directory](https://docs.microsoft.com/en-us/azure/databricks/administration-guide/users-groups/scim/aad)
// * [Okta](https://docs.databricks.com/administration-guide/users-groups/scim/okta.html)
// * [OneLogin](https://docs.databricks.com/administration-guide/users-groups/scim/onelogin.html)
//
// ## Example Usage
//
// # Creating some group
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewGroup(ctx, "this", &databricks.GroupArgs{
//				DisplayName:             pulumi.String("Some Group"),
//				AllowClusterCreate:      pulumi.Bool(true),
//				AllowInstancePoolCreate: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// # Adding User as GroupMember of some group
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			this, err := databricks.NewGroup(ctx, "this", &databricks.GroupArgs{
//				DisplayName:             pulumi.String("Some Group"),
//				AllowClusterCreate:      pulumi.Bool(true),
//				AllowInstancePoolCreate: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			thisUser, err := databricks.NewUser(ctx, "this", &databricks.UserArgs{
//				UserName: pulumi.String("someone@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGroupMember(ctx, "vip_member", &databricks.GroupMemberArgs{
//				GroupId:  this.ID(),
//				MemberId: thisUser.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating group in AWS Databricks account:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewGroup(ctx, "this", &databricks.GroupArgs{
//				DisplayName: pulumi.String("Some Group"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating group in Azure Databricks account:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewGroup(ctx, "this", &databricks.GroupArgs{
//				DisplayName: pulumi.String("Some Group"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// You can import a `databricks_group` resource by its SCIM ID:
//
// hcl
//
// import {
//
//	to = databricks_group.my_group
//
//	id = "<group_id>"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/group:Group my_group <group_id>
// ```
type Group struct {
	pulumi.CustomResourceState

	// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
	AclPrincipalId pulumi.StringOutput `pulumi:"aclPrincipalId"`
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrOutput `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrOutput `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrOutput `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
	Force pulumi.BoolPtrOutput `pulumi:"force"`
	Url   pulumi.StringOutput  `pulumi:"url"`
	// This is a field to allow the group to have access to a Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrOutput `pulumi:"workspaceAccess"`
	// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
	WorkspaceConsume pulumi.BoolPtrOutput `pulumi:"workspaceConsume"`
}

// NewGroup registers a new resource with the given unique name, arguments, and options.
func NewGroup(ctx *pulumi.Context,
	name string, args *GroupArgs, opts ...pulumi.ResourceOption) (*Group, error) {
	if args == nil {
		args = &GroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Group
	err := ctx.RegisterResource("databricks:index/group:Group", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGroup gets an existing Group resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GroupState, opts ...pulumi.ResourceOption) (*Group, error) {
	var resource Group
	err := ctx.ReadResource("databricks:index/group:Group", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Group resources.
type groupState struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
	AclPrincipalId *string `pulumi:"aclPrincipalId"`
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName *string `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
	Force *bool   `pulumi:"force"`
	Url   *string `pulumi:"url"`
	// This is a field to allow the group to have access to a Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
	// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
	WorkspaceConsume *bool `pulumi:"workspaceConsume"`
}

type GroupState struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
	AclPrincipalId pulumi.StringPtrInput
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is the display name for the given group.
	DisplayName pulumi.StringPtrInput
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrInput
	// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
	Force pulumi.BoolPtrInput
	Url   pulumi.StringPtrInput
	// This is a field to allow the group to have access to a Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
	// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
	WorkspaceConsume pulumi.BoolPtrInput
}

func (GroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*groupState)(nil)).Elem()
}

type groupArgs struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
	AclPrincipalId *string `pulumi:"aclPrincipalId"`
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is the display name for the given group.
	DisplayName *string `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
	Force *bool   `pulumi:"force"`
	Url   *string `pulumi:"url"`
	// This is a field to allow the group to have access to a Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
	// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
	WorkspaceConsume *bool `pulumi:"workspaceConsume"`
}

// The set of arguments for constructing a Group resource.
type GroupArgs struct {
	// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
	AclPrincipalId pulumi.StringPtrInput
	// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is the display name for the given group.
	DisplayName pulumi.StringPtrInput
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrInput
	// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
	Force pulumi.BoolPtrInput
	Url   pulumi.StringPtrInput
	// This is a field to allow the group to have access to a Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
	// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
	WorkspaceConsume pulumi.BoolPtrInput
}

func (GroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*groupArgs)(nil)).Elem()
}

type GroupInput interface {
	pulumi.Input

	ToGroupOutput() GroupOutput
	ToGroupOutputWithContext(ctx context.Context) GroupOutput
}

func (*Group) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (i *Group) ToGroupOutput() GroupOutput {
	return i.ToGroupOutputWithContext(context.Background())
}

func (i *Group) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupOutput)
}

// GroupArrayInput is an input type that accepts GroupArray and GroupArrayOutput values.
// You can construct a concrete instance of `GroupArrayInput` via:
//
//	GroupArray{ GroupArgs{...} }
type GroupArrayInput interface {
	pulumi.Input

	ToGroupArrayOutput() GroupArrayOutput
	ToGroupArrayOutputWithContext(context.Context) GroupArrayOutput
}

type GroupArray []GroupInput

func (GroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (i GroupArray) ToGroupArrayOutput() GroupArrayOutput {
	return i.ToGroupArrayOutputWithContext(context.Background())
}

func (i GroupArray) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupArrayOutput)
}

// GroupMapInput is an input type that accepts GroupMap and GroupMapOutput values.
// You can construct a concrete instance of `GroupMapInput` via:
//
//	GroupMap{ "key": GroupArgs{...} }
type GroupMapInput interface {
	pulumi.Input

	ToGroupMapOutput() GroupMapOutput
	ToGroupMapOutputWithContext(context.Context) GroupMapOutput
}

type GroupMap map[string]GroupInput

func (GroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (i GroupMap) ToGroupMapOutput() GroupMapOutput {
	return i.ToGroupMapOutputWithContext(context.Background())
}

func (i GroupMap) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GroupMapOutput)
}

type GroupOutput struct{ *pulumi.OutputState }

func (GroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Group)(nil)).Elem()
}

func (o GroupOutput) ToGroupOutput() GroupOutput {
	return o
}

func (o GroupOutput) ToGroupOutputWithContext(ctx context.Context) GroupOutput {
	return o
}

// identifier for use in databricks_access_control_rule_set, e.g. `groups/Some Group`.
func (o GroupOutput) AclPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.AclPrincipalId }).(pulumi.StringOutput)
}

// This is a field to allow the group to have cluster create privileges. More fine grained permissions could be assigned with Permissions and clusterId argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
func (o GroupOutput) AllowClusterCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.AllowClusterCreate }).(pulumi.BoolPtrOutput)
}

// This is a field to allow the group to have instance pool create privileges. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
func (o GroupOutput) AllowInstancePoolCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.AllowInstancePoolCreate }).(pulumi.BoolPtrOutput)
}

// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
func (o GroupOutput) DatabricksSqlAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.DatabricksSqlAccess }).(pulumi.BoolPtrOutput)
}

// This is the display name for the given group.
func (o GroupOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// ID of the group in an external identity provider.
func (o GroupOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.StringPtrOutput { return v.ExternalId }).(pulumi.StringPtrOutput)
}

// Ignore `cannot create group: Group with name X already exists.` errors and implicitly import the specific group into Pulumi state, enforcing entitlements defined in the instance of resource. _This functionality is experimental_ and is designed to simplify corner cases, like Azure Active Directory synchronisation.
func (o GroupOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

func (o GroupOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Group) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// This is a field to allow the group to have access to a Databricks Workspace.
func (o GroupOutput) WorkspaceAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.WorkspaceAccess }).(pulumi.BoolPtrOutput)
}

// This is a field to allow the group to have access to a Databricks Workspace as consumer, with limited access to workspace UI.  Couldn't be used with `workspaceAccess` or `databricksSqlAccess`.
func (o GroupOutput) WorkspaceConsume() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Group) pulumi.BoolPtrOutput { return v.WorkspaceConsume }).(pulumi.BoolPtrOutput)
}

type GroupArrayOutput struct{ *pulumi.OutputState }

func (GroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Group)(nil)).Elem()
}

func (o GroupArrayOutput) ToGroupArrayOutput() GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) ToGroupArrayOutputWithContext(ctx context.Context) GroupArrayOutput {
	return o
}

func (o GroupArrayOutput) Index(i pulumi.IntInput) GroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Group {
		return vs[0].([]*Group)[vs[1].(int)]
	}).(GroupOutput)
}

type GroupMapOutput struct{ *pulumi.OutputState }

func (GroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Group)(nil)).Elem()
}

func (o GroupMapOutput) ToGroupMapOutput() GroupMapOutput {
	return o
}

func (o GroupMapOutput) ToGroupMapOutputWithContext(ctx context.Context) GroupMapOutput {
	return o
}

func (o GroupMapOutput) MapIndex(k pulumi.StringInput) GroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Group {
		return vs[0].(map[string]*Group)[vs[1].(string)]
	}).(GroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GroupInput)(nil)).Elem(), &Group{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupArrayInput)(nil)).Elem(), GroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GroupMapInput)(nil)).Elem(), GroupMap{})
	pulumi.RegisterOutputType(GroupOutput{})
	pulumi.RegisterOutputType(GroupArrayOutput{})
	pulumi.RegisterOutputType(GroupMapOutput{})
}
