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

// The `DefaultNamespaceSetting` resource allows you to operate the setting configuration for the default namespace in the Databricks workspace.
//
// > This resource can only be used with a workspace-level provider!
//
// Setting the default catalog for the workspace determines the catalog that is used when queries do not reference
// a fully qualified 3 level name. For example, if the default catalog is set to 'retail_prod' then a query
// 'SELECT * FROM myTable' would reference the object 'retail_prod.default.myTable'
// (the schema 'default' is always assumed).
// This setting requires a restart of clusters and SQL warehouses to take effect. Additionally, the default namespace only applies when using Unity Catalog-enabled compute.
//
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
//			_, err := databricks.NewDefaultNamespaceSetting(ctx, "this", &databricks.DefaultNamespaceSettingArgs{
//				Namespace: &databricks.DefaultNamespaceSettingNamespaceArgs{
//					Value: pulumi.String("namespace_value"),
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
// ## Import
//
// This resource can be imported by predefined name `global`:
//
// hcl
//
// import {
//
//	to = databricks_default_namespace_setting.this
//
//	id = "global"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting this global
// ```
type DefaultNamespaceSetting struct {
	pulumi.CustomResourceState

	Etag pulumi.StringOutput `pulumi:"etag"`
	// The configuration details.
	Namespace   DefaultNamespaceSettingNamespaceOutput `pulumi:"namespace"`
	SettingName pulumi.StringOutput                    `pulumi:"settingName"`
}

// NewDefaultNamespaceSetting registers a new resource with the given unique name, arguments, and options.
func NewDefaultNamespaceSetting(ctx *pulumi.Context,
	name string, args *DefaultNamespaceSettingArgs, opts ...pulumi.ResourceOption) (*DefaultNamespaceSetting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Namespace == nil {
		return nil, errors.New("invalid value for required argument 'Namespace'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DefaultNamespaceSetting
	err := ctx.RegisterResource("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDefaultNamespaceSetting gets an existing DefaultNamespaceSetting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDefaultNamespaceSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DefaultNamespaceSettingState, opts ...pulumi.ResourceOption) (*DefaultNamespaceSetting, error) {
	var resource DefaultNamespaceSetting
	err := ctx.ReadResource("databricks:index/defaultNamespaceSetting:DefaultNamespaceSetting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DefaultNamespaceSetting resources.
type defaultNamespaceSettingState struct {
	Etag *string `pulumi:"etag"`
	// The configuration details.
	Namespace   *DefaultNamespaceSettingNamespace `pulumi:"namespace"`
	SettingName *string                           `pulumi:"settingName"`
}

type DefaultNamespaceSettingState struct {
	Etag pulumi.StringPtrInput
	// The configuration details.
	Namespace   DefaultNamespaceSettingNamespacePtrInput
	SettingName pulumi.StringPtrInput
}

func (DefaultNamespaceSettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultNamespaceSettingState)(nil)).Elem()
}

type defaultNamespaceSettingArgs struct {
	Etag *string `pulumi:"etag"`
	// The configuration details.
	Namespace   DefaultNamespaceSettingNamespace `pulumi:"namespace"`
	SettingName *string                          `pulumi:"settingName"`
}

// The set of arguments for constructing a DefaultNamespaceSetting resource.
type DefaultNamespaceSettingArgs struct {
	Etag pulumi.StringPtrInput
	// The configuration details.
	Namespace   DefaultNamespaceSettingNamespaceInput
	SettingName pulumi.StringPtrInput
}

func (DefaultNamespaceSettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*defaultNamespaceSettingArgs)(nil)).Elem()
}

type DefaultNamespaceSettingInput interface {
	pulumi.Input

	ToDefaultNamespaceSettingOutput() DefaultNamespaceSettingOutput
	ToDefaultNamespaceSettingOutputWithContext(ctx context.Context) DefaultNamespaceSettingOutput
}

func (*DefaultNamespaceSetting) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultNamespaceSetting)(nil)).Elem()
}

func (i *DefaultNamespaceSetting) ToDefaultNamespaceSettingOutput() DefaultNamespaceSettingOutput {
	return i.ToDefaultNamespaceSettingOutputWithContext(context.Background())
}

func (i *DefaultNamespaceSetting) ToDefaultNamespaceSettingOutputWithContext(ctx context.Context) DefaultNamespaceSettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultNamespaceSettingOutput)
}

// DefaultNamespaceSettingArrayInput is an input type that accepts DefaultNamespaceSettingArray and DefaultNamespaceSettingArrayOutput values.
// You can construct a concrete instance of `DefaultNamespaceSettingArrayInput` via:
//
//	DefaultNamespaceSettingArray{ DefaultNamespaceSettingArgs{...} }
type DefaultNamespaceSettingArrayInput interface {
	pulumi.Input

	ToDefaultNamespaceSettingArrayOutput() DefaultNamespaceSettingArrayOutput
	ToDefaultNamespaceSettingArrayOutputWithContext(context.Context) DefaultNamespaceSettingArrayOutput
}

type DefaultNamespaceSettingArray []DefaultNamespaceSettingInput

func (DefaultNamespaceSettingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultNamespaceSetting)(nil)).Elem()
}

func (i DefaultNamespaceSettingArray) ToDefaultNamespaceSettingArrayOutput() DefaultNamespaceSettingArrayOutput {
	return i.ToDefaultNamespaceSettingArrayOutputWithContext(context.Background())
}

func (i DefaultNamespaceSettingArray) ToDefaultNamespaceSettingArrayOutputWithContext(ctx context.Context) DefaultNamespaceSettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultNamespaceSettingArrayOutput)
}

// DefaultNamespaceSettingMapInput is an input type that accepts DefaultNamespaceSettingMap and DefaultNamespaceSettingMapOutput values.
// You can construct a concrete instance of `DefaultNamespaceSettingMapInput` via:
//
//	DefaultNamespaceSettingMap{ "key": DefaultNamespaceSettingArgs{...} }
type DefaultNamespaceSettingMapInput interface {
	pulumi.Input

	ToDefaultNamespaceSettingMapOutput() DefaultNamespaceSettingMapOutput
	ToDefaultNamespaceSettingMapOutputWithContext(context.Context) DefaultNamespaceSettingMapOutput
}

type DefaultNamespaceSettingMap map[string]DefaultNamespaceSettingInput

func (DefaultNamespaceSettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultNamespaceSetting)(nil)).Elem()
}

func (i DefaultNamespaceSettingMap) ToDefaultNamespaceSettingMapOutput() DefaultNamespaceSettingMapOutput {
	return i.ToDefaultNamespaceSettingMapOutputWithContext(context.Background())
}

func (i DefaultNamespaceSettingMap) ToDefaultNamespaceSettingMapOutputWithContext(ctx context.Context) DefaultNamespaceSettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DefaultNamespaceSettingMapOutput)
}

type DefaultNamespaceSettingOutput struct{ *pulumi.OutputState }

func (DefaultNamespaceSettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DefaultNamespaceSetting)(nil)).Elem()
}

func (o DefaultNamespaceSettingOutput) ToDefaultNamespaceSettingOutput() DefaultNamespaceSettingOutput {
	return o
}

func (o DefaultNamespaceSettingOutput) ToDefaultNamespaceSettingOutputWithContext(ctx context.Context) DefaultNamespaceSettingOutput {
	return o
}

func (o DefaultNamespaceSettingOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultNamespaceSetting) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// The configuration details.
func (o DefaultNamespaceSettingOutput) Namespace() DefaultNamespaceSettingNamespaceOutput {
	return o.ApplyT(func(v *DefaultNamespaceSetting) DefaultNamespaceSettingNamespaceOutput { return v.Namespace }).(DefaultNamespaceSettingNamespaceOutput)
}

func (o DefaultNamespaceSettingOutput) SettingName() pulumi.StringOutput {
	return o.ApplyT(func(v *DefaultNamespaceSetting) pulumi.StringOutput { return v.SettingName }).(pulumi.StringOutput)
}

type DefaultNamespaceSettingArrayOutput struct{ *pulumi.OutputState }

func (DefaultNamespaceSettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DefaultNamespaceSetting)(nil)).Elem()
}

func (o DefaultNamespaceSettingArrayOutput) ToDefaultNamespaceSettingArrayOutput() DefaultNamespaceSettingArrayOutput {
	return o
}

func (o DefaultNamespaceSettingArrayOutput) ToDefaultNamespaceSettingArrayOutputWithContext(ctx context.Context) DefaultNamespaceSettingArrayOutput {
	return o
}

func (o DefaultNamespaceSettingArrayOutput) Index(i pulumi.IntInput) DefaultNamespaceSettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DefaultNamespaceSetting {
		return vs[0].([]*DefaultNamespaceSetting)[vs[1].(int)]
	}).(DefaultNamespaceSettingOutput)
}

type DefaultNamespaceSettingMapOutput struct{ *pulumi.OutputState }

func (DefaultNamespaceSettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DefaultNamespaceSetting)(nil)).Elem()
}

func (o DefaultNamespaceSettingMapOutput) ToDefaultNamespaceSettingMapOutput() DefaultNamespaceSettingMapOutput {
	return o
}

func (o DefaultNamespaceSettingMapOutput) ToDefaultNamespaceSettingMapOutputWithContext(ctx context.Context) DefaultNamespaceSettingMapOutput {
	return o
}

func (o DefaultNamespaceSettingMapOutput) MapIndex(k pulumi.StringInput) DefaultNamespaceSettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DefaultNamespaceSetting {
		return vs[0].(map[string]*DefaultNamespaceSetting)[vs[1].(string)]
	}).(DefaultNamespaceSettingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultNamespaceSettingInput)(nil)).Elem(), &DefaultNamespaceSetting{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultNamespaceSettingArrayInput)(nil)).Elem(), DefaultNamespaceSettingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DefaultNamespaceSettingMapInput)(nil)).Elem(), DefaultNamespaceSettingMap{})
	pulumi.RegisterOutputType(DefaultNamespaceSettingOutput{})
	pulumi.RegisterOutputType(DefaultNamespaceSettingArrayOutput{})
	pulumi.RegisterOutputType(DefaultNamespaceSettingMapOutput{})
}
