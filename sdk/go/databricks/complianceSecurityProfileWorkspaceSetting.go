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

type ComplianceSecurityProfileWorkspaceSetting struct {
	pulumi.CustomResourceState

	ComplianceSecurityProfileWorkspace ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceOutput `pulumi:"complianceSecurityProfileWorkspace"`
	Etag                               pulumi.StringOutput                                                               `pulumi:"etag"`
	SettingName                        pulumi.StringOutput                                                               `pulumi:"settingName"`
}

// NewComplianceSecurityProfileWorkspaceSetting registers a new resource with the given unique name, arguments, and options.
func NewComplianceSecurityProfileWorkspaceSetting(ctx *pulumi.Context,
	name string, args *ComplianceSecurityProfileWorkspaceSettingArgs, opts ...pulumi.ResourceOption) (*ComplianceSecurityProfileWorkspaceSetting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ComplianceSecurityProfileWorkspace == nil {
		return nil, errors.New("invalid value for required argument 'ComplianceSecurityProfileWorkspace'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ComplianceSecurityProfileWorkspaceSetting
	err := ctx.RegisterResource("databricks:index/complianceSecurityProfileWorkspaceSetting:ComplianceSecurityProfileWorkspaceSetting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetComplianceSecurityProfileWorkspaceSetting gets an existing ComplianceSecurityProfileWorkspaceSetting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetComplianceSecurityProfileWorkspaceSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ComplianceSecurityProfileWorkspaceSettingState, opts ...pulumi.ResourceOption) (*ComplianceSecurityProfileWorkspaceSetting, error) {
	var resource ComplianceSecurityProfileWorkspaceSetting
	err := ctx.ReadResource("databricks:index/complianceSecurityProfileWorkspaceSetting:ComplianceSecurityProfileWorkspaceSetting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ComplianceSecurityProfileWorkspaceSetting resources.
type complianceSecurityProfileWorkspaceSettingState struct {
	ComplianceSecurityProfileWorkspace *ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspace `pulumi:"complianceSecurityProfileWorkspace"`
	Etag                               *string                                                                      `pulumi:"etag"`
	SettingName                        *string                                                                      `pulumi:"settingName"`
}

type ComplianceSecurityProfileWorkspaceSettingState struct {
	ComplianceSecurityProfileWorkspace ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspacePtrInput
	Etag                               pulumi.StringPtrInput
	SettingName                        pulumi.StringPtrInput
}

func (ComplianceSecurityProfileWorkspaceSettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*complianceSecurityProfileWorkspaceSettingState)(nil)).Elem()
}

type complianceSecurityProfileWorkspaceSettingArgs struct {
	ComplianceSecurityProfileWorkspace ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspace `pulumi:"complianceSecurityProfileWorkspace"`
	Etag                               *string                                                                     `pulumi:"etag"`
	SettingName                        *string                                                                     `pulumi:"settingName"`
}

// The set of arguments for constructing a ComplianceSecurityProfileWorkspaceSetting resource.
type ComplianceSecurityProfileWorkspaceSettingArgs struct {
	ComplianceSecurityProfileWorkspace ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceInput
	Etag                               pulumi.StringPtrInput
	SettingName                        pulumi.StringPtrInput
}

func (ComplianceSecurityProfileWorkspaceSettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*complianceSecurityProfileWorkspaceSettingArgs)(nil)).Elem()
}

type ComplianceSecurityProfileWorkspaceSettingInput interface {
	pulumi.Input

	ToComplianceSecurityProfileWorkspaceSettingOutput() ComplianceSecurityProfileWorkspaceSettingOutput
	ToComplianceSecurityProfileWorkspaceSettingOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingOutput
}

func (*ComplianceSecurityProfileWorkspaceSetting) ElementType() reflect.Type {
	return reflect.TypeOf((**ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (i *ComplianceSecurityProfileWorkspaceSetting) ToComplianceSecurityProfileWorkspaceSettingOutput() ComplianceSecurityProfileWorkspaceSettingOutput {
	return i.ToComplianceSecurityProfileWorkspaceSettingOutputWithContext(context.Background())
}

func (i *ComplianceSecurityProfileWorkspaceSetting) ToComplianceSecurityProfileWorkspaceSettingOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComplianceSecurityProfileWorkspaceSettingOutput)
}

// ComplianceSecurityProfileWorkspaceSettingArrayInput is an input type that accepts ComplianceSecurityProfileWorkspaceSettingArray and ComplianceSecurityProfileWorkspaceSettingArrayOutput values.
// You can construct a concrete instance of `ComplianceSecurityProfileWorkspaceSettingArrayInput` via:
//
//	ComplianceSecurityProfileWorkspaceSettingArray{ ComplianceSecurityProfileWorkspaceSettingArgs{...} }
type ComplianceSecurityProfileWorkspaceSettingArrayInput interface {
	pulumi.Input

	ToComplianceSecurityProfileWorkspaceSettingArrayOutput() ComplianceSecurityProfileWorkspaceSettingArrayOutput
	ToComplianceSecurityProfileWorkspaceSettingArrayOutputWithContext(context.Context) ComplianceSecurityProfileWorkspaceSettingArrayOutput
}

type ComplianceSecurityProfileWorkspaceSettingArray []ComplianceSecurityProfileWorkspaceSettingInput

func (ComplianceSecurityProfileWorkspaceSettingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (i ComplianceSecurityProfileWorkspaceSettingArray) ToComplianceSecurityProfileWorkspaceSettingArrayOutput() ComplianceSecurityProfileWorkspaceSettingArrayOutput {
	return i.ToComplianceSecurityProfileWorkspaceSettingArrayOutputWithContext(context.Background())
}

func (i ComplianceSecurityProfileWorkspaceSettingArray) ToComplianceSecurityProfileWorkspaceSettingArrayOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComplianceSecurityProfileWorkspaceSettingArrayOutput)
}

// ComplianceSecurityProfileWorkspaceSettingMapInput is an input type that accepts ComplianceSecurityProfileWorkspaceSettingMap and ComplianceSecurityProfileWorkspaceSettingMapOutput values.
// You can construct a concrete instance of `ComplianceSecurityProfileWorkspaceSettingMapInput` via:
//
//	ComplianceSecurityProfileWorkspaceSettingMap{ "key": ComplianceSecurityProfileWorkspaceSettingArgs{...} }
type ComplianceSecurityProfileWorkspaceSettingMapInput interface {
	pulumi.Input

	ToComplianceSecurityProfileWorkspaceSettingMapOutput() ComplianceSecurityProfileWorkspaceSettingMapOutput
	ToComplianceSecurityProfileWorkspaceSettingMapOutputWithContext(context.Context) ComplianceSecurityProfileWorkspaceSettingMapOutput
}

type ComplianceSecurityProfileWorkspaceSettingMap map[string]ComplianceSecurityProfileWorkspaceSettingInput

func (ComplianceSecurityProfileWorkspaceSettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (i ComplianceSecurityProfileWorkspaceSettingMap) ToComplianceSecurityProfileWorkspaceSettingMapOutput() ComplianceSecurityProfileWorkspaceSettingMapOutput {
	return i.ToComplianceSecurityProfileWorkspaceSettingMapOutputWithContext(context.Background())
}

func (i ComplianceSecurityProfileWorkspaceSettingMap) ToComplianceSecurityProfileWorkspaceSettingMapOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ComplianceSecurityProfileWorkspaceSettingMapOutput)
}

type ComplianceSecurityProfileWorkspaceSettingOutput struct{ *pulumi.OutputState }

func (ComplianceSecurityProfileWorkspaceSettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (o ComplianceSecurityProfileWorkspaceSettingOutput) ToComplianceSecurityProfileWorkspaceSettingOutput() ComplianceSecurityProfileWorkspaceSettingOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingOutput) ToComplianceSecurityProfileWorkspaceSettingOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingOutput) ComplianceSecurityProfileWorkspace() ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceOutput {
	return o.ApplyT(func(v *ComplianceSecurityProfileWorkspaceSetting) ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceOutput {
		return v.ComplianceSecurityProfileWorkspace
	}).(ComplianceSecurityProfileWorkspaceSettingComplianceSecurityProfileWorkspaceOutput)
}

func (o ComplianceSecurityProfileWorkspaceSettingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ComplianceSecurityProfileWorkspaceSetting) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

func (o ComplianceSecurityProfileWorkspaceSettingOutput) SettingName() pulumi.StringOutput {
	return o.ApplyT(func(v *ComplianceSecurityProfileWorkspaceSetting) pulumi.StringOutput { return v.SettingName }).(pulumi.StringOutput)
}

type ComplianceSecurityProfileWorkspaceSettingArrayOutput struct{ *pulumi.OutputState }

func (ComplianceSecurityProfileWorkspaceSettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (o ComplianceSecurityProfileWorkspaceSettingArrayOutput) ToComplianceSecurityProfileWorkspaceSettingArrayOutput() ComplianceSecurityProfileWorkspaceSettingArrayOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingArrayOutput) ToComplianceSecurityProfileWorkspaceSettingArrayOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingArrayOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingArrayOutput) Index(i pulumi.IntInput) ComplianceSecurityProfileWorkspaceSettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ComplianceSecurityProfileWorkspaceSetting {
		return vs[0].([]*ComplianceSecurityProfileWorkspaceSetting)[vs[1].(int)]
	}).(ComplianceSecurityProfileWorkspaceSettingOutput)
}

type ComplianceSecurityProfileWorkspaceSettingMapOutput struct{ *pulumi.OutputState }

func (ComplianceSecurityProfileWorkspaceSettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ComplianceSecurityProfileWorkspaceSetting)(nil)).Elem()
}

func (o ComplianceSecurityProfileWorkspaceSettingMapOutput) ToComplianceSecurityProfileWorkspaceSettingMapOutput() ComplianceSecurityProfileWorkspaceSettingMapOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingMapOutput) ToComplianceSecurityProfileWorkspaceSettingMapOutputWithContext(ctx context.Context) ComplianceSecurityProfileWorkspaceSettingMapOutput {
	return o
}

func (o ComplianceSecurityProfileWorkspaceSettingMapOutput) MapIndex(k pulumi.StringInput) ComplianceSecurityProfileWorkspaceSettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ComplianceSecurityProfileWorkspaceSetting {
		return vs[0].(map[string]*ComplianceSecurityProfileWorkspaceSetting)[vs[1].(string)]
	}).(ComplianceSecurityProfileWorkspaceSettingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ComplianceSecurityProfileWorkspaceSettingInput)(nil)).Elem(), &ComplianceSecurityProfileWorkspaceSetting{})
	pulumi.RegisterInputType(reflect.TypeOf((*ComplianceSecurityProfileWorkspaceSettingArrayInput)(nil)).Elem(), ComplianceSecurityProfileWorkspaceSettingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ComplianceSecurityProfileWorkspaceSettingMapInput)(nil)).Elem(), ComplianceSecurityProfileWorkspaceSettingMap{})
	pulumi.RegisterOutputType(ComplianceSecurityProfileWorkspaceSettingOutput{})
	pulumi.RegisterOutputType(ComplianceSecurityProfileWorkspaceSettingArrayOutput{})
	pulumi.RegisterOutputType(ComplianceSecurityProfileWorkspaceSettingMapOutput{})
}
