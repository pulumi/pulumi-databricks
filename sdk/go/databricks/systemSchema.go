// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// > **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html).
//
// > **Notes**
//
//	Unity Catalog APIs are accessible via **workspace-level APIs**. This design may change in the future.
//
// Manages system tables enablement. System tables are a Databricks-hosted analytical store of your account’s operational data. System tables can be used for historical observability across your account. System tables must be enabled by an account admin.
//
// ## Example Usage
//
// Enable the system schema `access`
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
//			_, err := databricks.NewSystemSchema(ctx, "this", &databricks.SystemSchemaArgs{
//				Schema: pulumi.String("access"),
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
// # This resource can be imported by the metastore id and schema name bash
//
// ```sh
//
//	$ pulumi import databricks:index/systemSchema:SystemSchema this <metastore_id>|<schema_name>
//
// ```
type SystemSchema struct {
	pulumi.CustomResourceState

	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// Full name of the system schema.
	Schema pulumi.StringPtrOutput `pulumi:"schema"`
	// The current state of enablement for the system schema.
	State pulumi.StringOutput `pulumi:"state"`
}

// NewSystemSchema registers a new resource with the given unique name, arguments, and options.
func NewSystemSchema(ctx *pulumi.Context,
	name string, args *SystemSchemaArgs, opts ...pulumi.ResourceOption) (*SystemSchema, error) {
	if args == nil {
		args = &SystemSchemaArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SystemSchema
	err := ctx.RegisterResource("databricks:index/systemSchema:SystemSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSystemSchema gets an existing SystemSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSystemSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SystemSchemaState, opts ...pulumi.ResourceOption) (*SystemSchema, error) {
	var resource SystemSchema
	err := ctx.ReadResource("databricks:index/systemSchema:SystemSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SystemSchema resources.
type systemSchemaState struct {
	MetastoreId *string `pulumi:"metastoreId"`
	// Full name of the system schema.
	Schema *string `pulumi:"schema"`
	// The current state of enablement for the system schema.
	State *string `pulumi:"state"`
}

type SystemSchemaState struct {
	MetastoreId pulumi.StringPtrInput
	// Full name of the system schema.
	Schema pulumi.StringPtrInput
	// The current state of enablement for the system schema.
	State pulumi.StringPtrInput
}

func (SystemSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*systemSchemaState)(nil)).Elem()
}

type systemSchemaArgs struct {
	// Full name of the system schema.
	Schema *string `pulumi:"schema"`
	// The current state of enablement for the system schema.
	State *string `pulumi:"state"`
}

// The set of arguments for constructing a SystemSchema resource.
type SystemSchemaArgs struct {
	// Full name of the system schema.
	Schema pulumi.StringPtrInput
	// The current state of enablement for the system schema.
	State pulumi.StringPtrInput
}

func (SystemSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*systemSchemaArgs)(nil)).Elem()
}

type SystemSchemaInput interface {
	pulumi.Input

	ToSystemSchemaOutput() SystemSchemaOutput
	ToSystemSchemaOutputWithContext(ctx context.Context) SystemSchemaOutput
}

func (*SystemSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**SystemSchema)(nil)).Elem()
}

func (i *SystemSchema) ToSystemSchemaOutput() SystemSchemaOutput {
	return i.ToSystemSchemaOutputWithContext(context.Background())
}

func (i *SystemSchema) ToSystemSchemaOutputWithContext(ctx context.Context) SystemSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemSchemaOutput)
}

func (i *SystemSchema) ToOutput(ctx context.Context) pulumix.Output[*SystemSchema] {
	return pulumix.Output[*SystemSchema]{
		OutputState: i.ToSystemSchemaOutputWithContext(ctx).OutputState,
	}
}

// SystemSchemaArrayInput is an input type that accepts SystemSchemaArray and SystemSchemaArrayOutput values.
// You can construct a concrete instance of `SystemSchemaArrayInput` via:
//
//	SystemSchemaArray{ SystemSchemaArgs{...} }
type SystemSchemaArrayInput interface {
	pulumi.Input

	ToSystemSchemaArrayOutput() SystemSchemaArrayOutput
	ToSystemSchemaArrayOutputWithContext(context.Context) SystemSchemaArrayOutput
}

type SystemSchemaArray []SystemSchemaInput

func (SystemSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SystemSchema)(nil)).Elem()
}

func (i SystemSchemaArray) ToSystemSchemaArrayOutput() SystemSchemaArrayOutput {
	return i.ToSystemSchemaArrayOutputWithContext(context.Background())
}

func (i SystemSchemaArray) ToSystemSchemaArrayOutputWithContext(ctx context.Context) SystemSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemSchemaArrayOutput)
}

func (i SystemSchemaArray) ToOutput(ctx context.Context) pulumix.Output[[]*SystemSchema] {
	return pulumix.Output[[]*SystemSchema]{
		OutputState: i.ToSystemSchemaArrayOutputWithContext(ctx).OutputState,
	}
}

// SystemSchemaMapInput is an input type that accepts SystemSchemaMap and SystemSchemaMapOutput values.
// You can construct a concrete instance of `SystemSchemaMapInput` via:
//
//	SystemSchemaMap{ "key": SystemSchemaArgs{...} }
type SystemSchemaMapInput interface {
	pulumi.Input

	ToSystemSchemaMapOutput() SystemSchemaMapOutput
	ToSystemSchemaMapOutputWithContext(context.Context) SystemSchemaMapOutput
}

type SystemSchemaMap map[string]SystemSchemaInput

func (SystemSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SystemSchema)(nil)).Elem()
}

func (i SystemSchemaMap) ToSystemSchemaMapOutput() SystemSchemaMapOutput {
	return i.ToSystemSchemaMapOutputWithContext(context.Background())
}

func (i SystemSchemaMap) ToSystemSchemaMapOutputWithContext(ctx context.Context) SystemSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SystemSchemaMapOutput)
}

func (i SystemSchemaMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SystemSchema] {
	return pulumix.Output[map[string]*SystemSchema]{
		OutputState: i.ToSystemSchemaMapOutputWithContext(ctx).OutputState,
	}
}

type SystemSchemaOutput struct{ *pulumi.OutputState }

func (SystemSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SystemSchema)(nil)).Elem()
}

func (o SystemSchemaOutput) ToSystemSchemaOutput() SystemSchemaOutput {
	return o
}

func (o SystemSchemaOutput) ToSystemSchemaOutputWithContext(ctx context.Context) SystemSchemaOutput {
	return o
}

func (o SystemSchemaOutput) ToOutput(ctx context.Context) pulumix.Output[*SystemSchema] {
	return pulumix.Output[*SystemSchema]{
		OutputState: o.OutputState,
	}
}

func (o SystemSchemaOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *SystemSchema) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Full name of the system schema.
func (o SystemSchemaOutput) Schema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SystemSchema) pulumi.StringPtrOutput { return v.Schema }).(pulumi.StringPtrOutput)
}

// The current state of enablement for the system schema.
func (o SystemSchemaOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *SystemSchema) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type SystemSchemaArrayOutput struct{ *pulumi.OutputState }

func (SystemSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SystemSchema)(nil)).Elem()
}

func (o SystemSchemaArrayOutput) ToSystemSchemaArrayOutput() SystemSchemaArrayOutput {
	return o
}

func (o SystemSchemaArrayOutput) ToSystemSchemaArrayOutputWithContext(ctx context.Context) SystemSchemaArrayOutput {
	return o
}

func (o SystemSchemaArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SystemSchema] {
	return pulumix.Output[[]*SystemSchema]{
		OutputState: o.OutputState,
	}
}

func (o SystemSchemaArrayOutput) Index(i pulumi.IntInput) SystemSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SystemSchema {
		return vs[0].([]*SystemSchema)[vs[1].(int)]
	}).(SystemSchemaOutput)
}

type SystemSchemaMapOutput struct{ *pulumi.OutputState }

func (SystemSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SystemSchema)(nil)).Elem()
}

func (o SystemSchemaMapOutput) ToSystemSchemaMapOutput() SystemSchemaMapOutput {
	return o
}

func (o SystemSchemaMapOutput) ToSystemSchemaMapOutputWithContext(ctx context.Context) SystemSchemaMapOutput {
	return o
}

func (o SystemSchemaMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SystemSchema] {
	return pulumix.Output[map[string]*SystemSchema]{
		OutputState: o.OutputState,
	}
}

func (o SystemSchemaMapOutput) MapIndex(k pulumi.StringInput) SystemSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SystemSchema {
		return vs[0].(map[string]*SystemSchema)[vs[1].(string)]
	}).(SystemSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SystemSchemaInput)(nil)).Elem(), &SystemSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*SystemSchemaArrayInput)(nil)).Elem(), SystemSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SystemSchemaMapInput)(nil)).Elem(), SystemSchemaMap{})
	pulumi.RegisterOutputType(SystemSchemaOutput{})
	pulumi.RegisterOutputType(SystemSchemaArrayOutput{})
	pulumi.RegisterOutputType(SystemSchemaMapOutput{})
}