// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
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
//			sandbox, err := databricks.NewCatalog(ctx, "sandbox", &databricks.CatalogArgs{
//				Name:          pulumi.String("sandbox"),
//				IsolationMode: pulumi.String("ISOLATED"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewWorkspaceBinding(ctx, "sandbox", &databricks.WorkspaceBindingArgs{
//				SecurableName: sandbox.Name,
//				WorkspaceId:   pulumi.Any(other.WorkspaceId),
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
// This resource can be imported by using combination of workspace ID, securable type and name:
//
// ```sh
// $ pulumi import databricks:index/workspaceBinding:WorkspaceBinding this "<workspace_id>|<securable_type>|<securable_name>"
// ```
type WorkspaceBinding struct {
	pulumi.CustomResourceState

	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
	BindingType pulumi.StringPtrOutput `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrOutput `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringOutput `pulumi:"securableName"`
	// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrOutput `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.StringPtrOutput `pulumi:"workspaceId"`
}

// NewWorkspaceBinding registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceBinding(ctx *pulumi.Context,
	name string, args *WorkspaceBindingArgs, opts ...pulumi.ResourceOption) (*WorkspaceBinding, error) {
	if args == nil {
		args = &WorkspaceBindingArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkspaceBinding
	err := ctx.RegisterResource("databricks:index/workspaceBinding:WorkspaceBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceBinding gets an existing WorkspaceBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceBindingState, opts ...pulumi.ResourceOption) (*WorkspaceBinding, error) {
	var resource WorkspaceBinding
	err := ctx.ReadResource("databricks:index/workspaceBinding:WorkspaceBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceBinding resources.
type workspaceBindingState struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
	BindingType *string `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName *string `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName *string `pulumi:"securableName"`
	// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
	SecurableType *string `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type WorkspaceBindingState struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
	BindingType pulumi.StringPtrInput
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrInput
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringPtrInput
	// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrInput
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.StringPtrInput
}

func (WorkspaceBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceBindingState)(nil)).Elem()
}

type workspaceBindingArgs struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
	BindingType *string `pulumi:"bindingType"`
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName *string `pulumi:"catalogName"`
	// Name of securable. Change forces creation of a new resource.
	SecurableName *string `pulumi:"securableName"`
	// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
	SecurableType *string `pulumi:"securableType"`
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId *string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a WorkspaceBinding resource.
type WorkspaceBindingArgs struct {
	// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
	BindingType pulumi.StringPtrInput
	// Deprecated: Please use 'securable_name' and 'securable_type instead.
	CatalogName pulumi.StringPtrInput
	// Name of securable. Change forces creation of a new resource.
	SecurableName pulumi.StringPtrInput
	// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
	SecurableType pulumi.StringPtrInput
	// ID of the workspace. Change forces creation of a new resource.
	WorkspaceId pulumi.StringPtrInput
}

func (WorkspaceBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceBindingArgs)(nil)).Elem()
}

type WorkspaceBindingInput interface {
	pulumi.Input

	ToWorkspaceBindingOutput() WorkspaceBindingOutput
	ToWorkspaceBindingOutputWithContext(ctx context.Context) WorkspaceBindingOutput
}

func (*WorkspaceBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceBinding)(nil)).Elem()
}

func (i *WorkspaceBinding) ToWorkspaceBindingOutput() WorkspaceBindingOutput {
	return i.ToWorkspaceBindingOutputWithContext(context.Background())
}

func (i *WorkspaceBinding) ToWorkspaceBindingOutputWithContext(ctx context.Context) WorkspaceBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceBindingOutput)
}

// WorkspaceBindingArrayInput is an input type that accepts WorkspaceBindingArray and WorkspaceBindingArrayOutput values.
// You can construct a concrete instance of `WorkspaceBindingArrayInput` via:
//
//	WorkspaceBindingArray{ WorkspaceBindingArgs{...} }
type WorkspaceBindingArrayInput interface {
	pulumi.Input

	ToWorkspaceBindingArrayOutput() WorkspaceBindingArrayOutput
	ToWorkspaceBindingArrayOutputWithContext(context.Context) WorkspaceBindingArrayOutput
}

type WorkspaceBindingArray []WorkspaceBindingInput

func (WorkspaceBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceBinding)(nil)).Elem()
}

func (i WorkspaceBindingArray) ToWorkspaceBindingArrayOutput() WorkspaceBindingArrayOutput {
	return i.ToWorkspaceBindingArrayOutputWithContext(context.Background())
}

func (i WorkspaceBindingArray) ToWorkspaceBindingArrayOutputWithContext(ctx context.Context) WorkspaceBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceBindingArrayOutput)
}

// WorkspaceBindingMapInput is an input type that accepts WorkspaceBindingMap and WorkspaceBindingMapOutput values.
// You can construct a concrete instance of `WorkspaceBindingMapInput` via:
//
//	WorkspaceBindingMap{ "key": WorkspaceBindingArgs{...} }
type WorkspaceBindingMapInput interface {
	pulumi.Input

	ToWorkspaceBindingMapOutput() WorkspaceBindingMapOutput
	ToWorkspaceBindingMapOutputWithContext(context.Context) WorkspaceBindingMapOutput
}

type WorkspaceBindingMap map[string]WorkspaceBindingInput

func (WorkspaceBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceBinding)(nil)).Elem()
}

func (i WorkspaceBindingMap) ToWorkspaceBindingMapOutput() WorkspaceBindingMapOutput {
	return i.ToWorkspaceBindingMapOutputWithContext(context.Background())
}

func (i WorkspaceBindingMap) ToWorkspaceBindingMapOutputWithContext(ctx context.Context) WorkspaceBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceBindingMapOutput)
}

type WorkspaceBindingOutput struct{ *pulumi.OutputState }

func (WorkspaceBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceBinding)(nil)).Elem()
}

func (o WorkspaceBindingOutput) ToWorkspaceBindingOutput() WorkspaceBindingOutput {
	return o
}

func (o WorkspaceBindingOutput) ToWorkspaceBindingOutputWithContext(ctx context.Context) WorkspaceBindingOutput {
	return o
}

// Binding mode. Default to `BINDING_TYPE_READ_WRITE`. For `catalog`, possible values are `BINDING_TYPE_READ_ONLY`, `BINDING_TYPE_READ_WRITE`. For `external-location` or `storage-credential`, no binding mode needs to be specified
func (o WorkspaceBindingOutput) BindingType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceBinding) pulumi.StringPtrOutput { return v.BindingType }).(pulumi.StringPtrOutput)
}

// Deprecated: Please use 'securable_name' and 'securable_type instead.
func (o WorkspaceBindingOutput) CatalogName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceBinding) pulumi.StringPtrOutput { return v.CatalogName }).(pulumi.StringPtrOutput)
}

// Name of securable. Change forces creation of a new resource.
func (o WorkspaceBindingOutput) SecurableName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceBinding) pulumi.StringOutput { return v.SecurableName }).(pulumi.StringOutput)
}

// Type of securable. Can be `catalog`, `external-locations` or `storage-credentials`. Default to `catalog`. Change forces creation of a new resource.
func (o WorkspaceBindingOutput) SecurableType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceBinding) pulumi.StringPtrOutput { return v.SecurableType }).(pulumi.StringPtrOutput)
}

// ID of the workspace. Change forces creation of a new resource.
func (o WorkspaceBindingOutput) WorkspaceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceBinding) pulumi.StringPtrOutput { return v.WorkspaceId }).(pulumi.StringPtrOutput)
}

type WorkspaceBindingArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceBinding)(nil)).Elem()
}

func (o WorkspaceBindingArrayOutput) ToWorkspaceBindingArrayOutput() WorkspaceBindingArrayOutput {
	return o
}

func (o WorkspaceBindingArrayOutput) ToWorkspaceBindingArrayOutputWithContext(ctx context.Context) WorkspaceBindingArrayOutput {
	return o
}

func (o WorkspaceBindingArrayOutput) Index(i pulumi.IntInput) WorkspaceBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkspaceBinding {
		return vs[0].([]*WorkspaceBinding)[vs[1].(int)]
	}).(WorkspaceBindingOutput)
}

type WorkspaceBindingMapOutput struct{ *pulumi.OutputState }

func (WorkspaceBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceBinding)(nil)).Elem()
}

func (o WorkspaceBindingMapOutput) ToWorkspaceBindingMapOutput() WorkspaceBindingMapOutput {
	return o
}

func (o WorkspaceBindingMapOutput) ToWorkspaceBindingMapOutputWithContext(ctx context.Context) WorkspaceBindingMapOutput {
	return o
}

func (o WorkspaceBindingMapOutput) MapIndex(k pulumi.StringInput) WorkspaceBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkspaceBinding {
		return vs[0].(map[string]*WorkspaceBinding)[vs[1].(string)]
	}).(WorkspaceBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceBindingInput)(nil)).Elem(), &WorkspaceBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceBindingArrayInput)(nil)).Elem(), WorkspaceBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceBindingMapInput)(nil)).Elem(), WorkspaceBindingMap{})
	pulumi.RegisterOutputType(WorkspaceBindingOutput{})
	pulumi.RegisterOutputType(WorkspaceBindingArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceBindingMapOutput{})
}