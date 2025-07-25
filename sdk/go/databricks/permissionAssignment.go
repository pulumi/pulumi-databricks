// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource is used to assign account-level users, service principals and groups to a Databricks workspace.
//
// > This resource can only be used with a workspace-level provider!
//
// ## Example Usage
//
// In workspace context, adding account-level user to a workspace:
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
//			// Use the account provider
//			me, err := databricks.LookupUser(ctx, &databricks.LookupUserArgs{
//				UserName: pulumi.StringRef("me@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewPermissionAssignment(ctx, "add_user", &databricks.PermissionAssignmentArgs{
//				PrincipalId: pulumi.String(me.Id),
//				Permissions: pulumi.StringArray{
//					pulumi.String("USER"),
//				},
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
// In workspace context, adding account-level service principal to a workspace:
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
//			// Use the account provider
//			sp, err := databricks.LookupServicePrincipal(ctx, &databricks.LookupServicePrincipalArgs{
//				DisplayName: pulumi.StringRef("Automation-only SP"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewPermissionAssignment(ctx, "add_admin_spn", &databricks.PermissionAssignmentArgs{
//				PrincipalId: pulumi.String(sp.Id),
//				Permissions: pulumi.StringArray{
//					pulumi.String("ADMIN"),
//				},
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
// In workspace context, adding account-level group to a workspace:
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
//			// Use the account provider
//			accountLevel, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "example-group",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// Use the workspace provider
//			_, err = databricks.NewPermissionAssignment(ctx, "this", &databricks.PermissionAssignmentArgs{
//				PrincipalId: pulumi.String(accountLevel.Id),
//				Permissions: pulumi.StringArray{
//					pulumi.String("USER"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			workspaceLevel, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "example-group",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("databricksGroupId", workspaceLevel.Id)
//			return nil
//		})
//	}
//
// ```
//
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupMember to attach users and groups as group members.
// * MwsPermissionAssignment to manage permission assignment from an account context
//
// ## Import
//
// The resource `databricks_permission_assignment` can be imported using the principal id:
//
// hcl
//
// import {
//
//	to = databricks_permission_assignment.this
//
//	id = "<principal_id>"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/permissionAssignment:PermissionAssignment this "<principal_id>"
// ```
type PermissionAssignment struct {
	pulumi.CustomResourceState

	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
	PrincipalId pulumi.StringOutput `pulumi:"principalId"`
}

// NewPermissionAssignment registers a new resource with the given unique name, arguments, and options.
func NewPermissionAssignment(ctx *pulumi.Context,
	name string, args *PermissionAssignmentArgs, opts ...pulumi.ResourceOption) (*PermissionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PermissionAssignment
	err := ctx.RegisterResource("databricks:index/permissionAssignment:PermissionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPermissionAssignment gets an existing PermissionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPermissionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PermissionAssignmentState, opts ...pulumi.ResourceOption) (*PermissionAssignment, error) {
	var resource PermissionAssignment
	err := ctx.ReadResource("databricks:index/permissionAssignment:PermissionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PermissionAssignment resources.
type permissionAssignmentState struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions []string `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
	PrincipalId *string `pulumi:"principalId"`
}

type PermissionAssignmentState struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayInput
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
	PrincipalId pulumi.StringPtrInput
}

func (PermissionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*permissionAssignmentState)(nil)).Elem()
}

type permissionAssignmentArgs struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions []string `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
	PrincipalId string `pulumi:"principalId"`
}

// The set of arguments for constructing a PermissionAssignment resource.
type PermissionAssignmentArgs struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayInput
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
	PrincipalId pulumi.StringInput
}

func (PermissionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*permissionAssignmentArgs)(nil)).Elem()
}

type PermissionAssignmentInput interface {
	pulumi.Input

	ToPermissionAssignmentOutput() PermissionAssignmentOutput
	ToPermissionAssignmentOutputWithContext(ctx context.Context) PermissionAssignmentOutput
}

func (*PermissionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**PermissionAssignment)(nil)).Elem()
}

func (i *PermissionAssignment) ToPermissionAssignmentOutput() PermissionAssignmentOutput {
	return i.ToPermissionAssignmentOutputWithContext(context.Background())
}

func (i *PermissionAssignment) ToPermissionAssignmentOutputWithContext(ctx context.Context) PermissionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PermissionAssignmentOutput)
}

// PermissionAssignmentArrayInput is an input type that accepts PermissionAssignmentArray and PermissionAssignmentArrayOutput values.
// You can construct a concrete instance of `PermissionAssignmentArrayInput` via:
//
//	PermissionAssignmentArray{ PermissionAssignmentArgs{...} }
type PermissionAssignmentArrayInput interface {
	pulumi.Input

	ToPermissionAssignmentArrayOutput() PermissionAssignmentArrayOutput
	ToPermissionAssignmentArrayOutputWithContext(context.Context) PermissionAssignmentArrayOutput
}

type PermissionAssignmentArray []PermissionAssignmentInput

func (PermissionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PermissionAssignment)(nil)).Elem()
}

func (i PermissionAssignmentArray) ToPermissionAssignmentArrayOutput() PermissionAssignmentArrayOutput {
	return i.ToPermissionAssignmentArrayOutputWithContext(context.Background())
}

func (i PermissionAssignmentArray) ToPermissionAssignmentArrayOutputWithContext(ctx context.Context) PermissionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PermissionAssignmentArrayOutput)
}

// PermissionAssignmentMapInput is an input type that accepts PermissionAssignmentMap and PermissionAssignmentMapOutput values.
// You can construct a concrete instance of `PermissionAssignmentMapInput` via:
//
//	PermissionAssignmentMap{ "key": PermissionAssignmentArgs{...} }
type PermissionAssignmentMapInput interface {
	pulumi.Input

	ToPermissionAssignmentMapOutput() PermissionAssignmentMapOutput
	ToPermissionAssignmentMapOutputWithContext(context.Context) PermissionAssignmentMapOutput
}

type PermissionAssignmentMap map[string]PermissionAssignmentInput

func (PermissionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PermissionAssignment)(nil)).Elem()
}

func (i PermissionAssignmentMap) ToPermissionAssignmentMapOutput() PermissionAssignmentMapOutput {
	return i.ToPermissionAssignmentMapOutputWithContext(context.Background())
}

func (i PermissionAssignmentMap) ToPermissionAssignmentMapOutputWithContext(ctx context.Context) PermissionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PermissionAssignmentMapOutput)
}

type PermissionAssignmentOutput struct{ *pulumi.OutputState }

func (PermissionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PermissionAssignment)(nil)).Elem()
}

func (o PermissionAssignmentOutput) ToPermissionAssignmentOutput() PermissionAssignmentOutput {
	return o
}

func (o PermissionAssignmentOutput) ToPermissionAssignmentOutputWithContext(ctx context.Context) PermissionAssignmentOutput {
	return o
}

// The list of workspace permissions to assign to the principal:
// * `"USER"` - Can access the workspace with basic privileges.
// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
func (o PermissionAssignmentOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PermissionAssignment) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the account-level SCIM API, or using databricks_user, ServicePrincipal or Group data sources with account API (and has to be an account admin). A more sensible approach is to retrieve the list of `principalId` as outputs from another Pulumi stack.
func (o PermissionAssignmentOutput) PrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *PermissionAssignment) pulumi.StringOutput { return v.PrincipalId }).(pulumi.StringOutput)
}

type PermissionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (PermissionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PermissionAssignment)(nil)).Elem()
}

func (o PermissionAssignmentArrayOutput) ToPermissionAssignmentArrayOutput() PermissionAssignmentArrayOutput {
	return o
}

func (o PermissionAssignmentArrayOutput) ToPermissionAssignmentArrayOutputWithContext(ctx context.Context) PermissionAssignmentArrayOutput {
	return o
}

func (o PermissionAssignmentArrayOutput) Index(i pulumi.IntInput) PermissionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PermissionAssignment {
		return vs[0].([]*PermissionAssignment)[vs[1].(int)]
	}).(PermissionAssignmentOutput)
}

type PermissionAssignmentMapOutput struct{ *pulumi.OutputState }

func (PermissionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PermissionAssignment)(nil)).Elem()
}

func (o PermissionAssignmentMapOutput) ToPermissionAssignmentMapOutput() PermissionAssignmentMapOutput {
	return o
}

func (o PermissionAssignmentMapOutput) ToPermissionAssignmentMapOutputWithContext(ctx context.Context) PermissionAssignmentMapOutput {
	return o
}

func (o PermissionAssignmentMapOutput) MapIndex(k pulumi.StringInput) PermissionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PermissionAssignment {
		return vs[0].(map[string]*PermissionAssignment)[vs[1].(string)]
	}).(PermissionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PermissionAssignmentInput)(nil)).Elem(), &PermissionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PermissionAssignmentArrayInput)(nil)).Elem(), PermissionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PermissionAssignmentMapInput)(nil)).Elem(), PermissionAssignmentMap{})
	pulumi.RegisterOutputType(PermissionAssignmentOutput{})
	pulumi.RegisterOutputType(PermissionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(PermissionAssignmentMapOutput{})
}
