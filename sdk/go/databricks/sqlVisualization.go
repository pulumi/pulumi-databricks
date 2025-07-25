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

// ## Import
//
// You can import a `databricks_sql_visualization` resource with ID like the following:
//
// hcl
//
// import {
//
//	to = databricks_sql_visualization.this
//
//	id = "<query-id>/<visualization-id>"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/sqlVisualization:SqlVisualization this <query-id>/<visualization-id>
// ```
type SqlVisualization struct {
	pulumi.CustomResourceState

	Description     pulumi.StringPtrOutput `pulumi:"description"`
	Name            pulumi.StringOutput    `pulumi:"name"`
	Options         pulumi.StringOutput    `pulumi:"options"`
	QueryId         pulumi.StringOutput    `pulumi:"queryId"`
	QueryPlan       pulumi.StringPtrOutput `pulumi:"queryPlan"`
	Type            pulumi.StringOutput    `pulumi:"type"`
	VisualizationId pulumi.StringOutput    `pulumi:"visualizationId"`
}

// NewSqlVisualization registers a new resource with the given unique name, arguments, and options.
func NewSqlVisualization(ctx *pulumi.Context,
	name string, args *SqlVisualizationArgs, opts ...pulumi.ResourceOption) (*SqlVisualization, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Options == nil {
		return nil, errors.New("invalid value for required argument 'Options'")
	}
	if args.QueryId == nil {
		return nil, errors.New("invalid value for required argument 'QueryId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlVisualization
	err := ctx.RegisterResource("databricks:index/sqlVisualization:SqlVisualization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlVisualization gets an existing SqlVisualization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlVisualization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlVisualizationState, opts ...pulumi.ResourceOption) (*SqlVisualization, error) {
	var resource SqlVisualization
	err := ctx.ReadResource("databricks:index/sqlVisualization:SqlVisualization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlVisualization resources.
type sqlVisualizationState struct {
	Description     *string `pulumi:"description"`
	Name            *string `pulumi:"name"`
	Options         *string `pulumi:"options"`
	QueryId         *string `pulumi:"queryId"`
	QueryPlan       *string `pulumi:"queryPlan"`
	Type            *string `pulumi:"type"`
	VisualizationId *string `pulumi:"visualizationId"`
}

type SqlVisualizationState struct {
	Description     pulumi.StringPtrInput
	Name            pulumi.StringPtrInput
	Options         pulumi.StringPtrInput
	QueryId         pulumi.StringPtrInput
	QueryPlan       pulumi.StringPtrInput
	Type            pulumi.StringPtrInput
	VisualizationId pulumi.StringPtrInput
}

func (SqlVisualizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlVisualizationState)(nil)).Elem()
}

type sqlVisualizationArgs struct {
	Description     *string `pulumi:"description"`
	Name            *string `pulumi:"name"`
	Options         string  `pulumi:"options"`
	QueryId         string  `pulumi:"queryId"`
	QueryPlan       *string `pulumi:"queryPlan"`
	Type            string  `pulumi:"type"`
	VisualizationId *string `pulumi:"visualizationId"`
}

// The set of arguments for constructing a SqlVisualization resource.
type SqlVisualizationArgs struct {
	Description     pulumi.StringPtrInput
	Name            pulumi.StringPtrInput
	Options         pulumi.StringInput
	QueryId         pulumi.StringInput
	QueryPlan       pulumi.StringPtrInput
	Type            pulumi.StringInput
	VisualizationId pulumi.StringPtrInput
}

func (SqlVisualizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlVisualizationArgs)(nil)).Elem()
}

type SqlVisualizationInput interface {
	pulumi.Input

	ToSqlVisualizationOutput() SqlVisualizationOutput
	ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput
}

func (*SqlVisualization) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlVisualization)(nil)).Elem()
}

func (i *SqlVisualization) ToSqlVisualizationOutput() SqlVisualizationOutput {
	return i.ToSqlVisualizationOutputWithContext(context.Background())
}

func (i *SqlVisualization) ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationOutput)
}

// SqlVisualizationArrayInput is an input type that accepts SqlVisualizationArray and SqlVisualizationArrayOutput values.
// You can construct a concrete instance of `SqlVisualizationArrayInput` via:
//
//	SqlVisualizationArray{ SqlVisualizationArgs{...} }
type SqlVisualizationArrayInput interface {
	pulumi.Input

	ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput
	ToSqlVisualizationArrayOutputWithContext(context.Context) SqlVisualizationArrayOutput
}

type SqlVisualizationArray []SqlVisualizationInput

func (SqlVisualizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlVisualization)(nil)).Elem()
}

func (i SqlVisualizationArray) ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput {
	return i.ToSqlVisualizationArrayOutputWithContext(context.Background())
}

func (i SqlVisualizationArray) ToSqlVisualizationArrayOutputWithContext(ctx context.Context) SqlVisualizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationArrayOutput)
}

// SqlVisualizationMapInput is an input type that accepts SqlVisualizationMap and SqlVisualizationMapOutput values.
// You can construct a concrete instance of `SqlVisualizationMapInput` via:
//
//	SqlVisualizationMap{ "key": SqlVisualizationArgs{...} }
type SqlVisualizationMapInput interface {
	pulumi.Input

	ToSqlVisualizationMapOutput() SqlVisualizationMapOutput
	ToSqlVisualizationMapOutputWithContext(context.Context) SqlVisualizationMapOutput
}

type SqlVisualizationMap map[string]SqlVisualizationInput

func (SqlVisualizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlVisualization)(nil)).Elem()
}

func (i SqlVisualizationMap) ToSqlVisualizationMapOutput() SqlVisualizationMapOutput {
	return i.ToSqlVisualizationMapOutputWithContext(context.Background())
}

func (i SqlVisualizationMap) ToSqlVisualizationMapOutputWithContext(ctx context.Context) SqlVisualizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlVisualizationMapOutput)
}

type SqlVisualizationOutput struct{ *pulumi.OutputState }

func (SqlVisualizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationOutput) ToSqlVisualizationOutput() SqlVisualizationOutput {
	return o
}

func (o SqlVisualizationOutput) ToSqlVisualizationOutputWithContext(ctx context.Context) SqlVisualizationOutput {
	return o
}

func (o SqlVisualizationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o SqlVisualizationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SqlVisualizationOutput) Options() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringOutput { return v.Options }).(pulumi.StringOutput)
}

func (o SqlVisualizationOutput) QueryId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringOutput { return v.QueryId }).(pulumi.StringOutput)
}

func (o SqlVisualizationOutput) QueryPlan() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringPtrOutput { return v.QueryPlan }).(pulumi.StringPtrOutput)
}

func (o SqlVisualizationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o SqlVisualizationOutput) VisualizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlVisualization) pulumi.StringOutput { return v.VisualizationId }).(pulumi.StringOutput)
}

type SqlVisualizationArrayOutput struct{ *pulumi.OutputState }

func (SqlVisualizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationArrayOutput) ToSqlVisualizationArrayOutput() SqlVisualizationArrayOutput {
	return o
}

func (o SqlVisualizationArrayOutput) ToSqlVisualizationArrayOutputWithContext(ctx context.Context) SqlVisualizationArrayOutput {
	return o
}

func (o SqlVisualizationArrayOutput) Index(i pulumi.IntInput) SqlVisualizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlVisualization {
		return vs[0].([]*SqlVisualization)[vs[1].(int)]
	}).(SqlVisualizationOutput)
}

type SqlVisualizationMapOutput struct{ *pulumi.OutputState }

func (SqlVisualizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlVisualization)(nil)).Elem()
}

func (o SqlVisualizationMapOutput) ToSqlVisualizationMapOutput() SqlVisualizationMapOutput {
	return o
}

func (o SqlVisualizationMapOutput) ToSqlVisualizationMapOutputWithContext(ctx context.Context) SqlVisualizationMapOutput {
	return o
}

func (o SqlVisualizationMapOutput) MapIndex(k pulumi.StringInput) SqlVisualizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlVisualization {
		return vs[0].(map[string]*SqlVisualization)[vs[1].(string)]
	}).(SqlVisualizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationInput)(nil)).Elem(), &SqlVisualization{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationArrayInput)(nil)).Elem(), SqlVisualizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlVisualizationMapInput)(nil)).Elem(), SqlVisualizationMap{})
	pulumi.RegisterOutputType(SqlVisualizationOutput{})
	pulumi.RegisterOutputType(SqlVisualizationArrayOutput{})
	pulumi.RegisterOutputType(SqlVisualizationMapOutput{})
}
