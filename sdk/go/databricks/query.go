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
// This resource can be imported using query ID:
//
// hcl
//
// import {
//
//	to = databricks_query.this
//
//	id = "<query-id>"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/query:Query this <query-id>
// ```
type Query struct {
	pulumi.CustomResourceState

	// Whether to apply a 1000 row limit to the query result.
	ApplyAutoLimit pulumi.BoolPtrOutput `pulumi:"applyAutoLimit"`
	// Name of the catalog where this query will be executed.
	Catalog pulumi.StringPtrOutput `pulumi:"catalog"`
	// The timestamp string indicating when the query was created.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the query.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Username of the user who last saved changes to this query.
	LastModifierUserName pulumi.StringOutput `pulumi:"lastModifierUserName"`
	// The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
	LifecycleState pulumi.StringOutput `pulumi:"lifecycleState"`
	// Query owner's username.
	OwnerUserName pulumi.StringPtrOutput `pulumi:"ownerUserName"`
	// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
	Parameters QueryParameterArrayOutput `pulumi:"parameters"`
	// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
	ParentPath pulumi.StringPtrOutput `pulumi:"parentPath"`
	// Text of SQL query.
	QueryText pulumi.StringOutput `pulumi:"queryText"`
	// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
	RunAsMode pulumi.StringPtrOutput `pulumi:"runAsMode"`
	// Name of the schema where this query will be executed.
	Schema pulumi.StringPtrOutput `pulumi:"schema"`
	// Tags that will be added to the query.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The timestamp string indicating when the query was updated.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
	// ID of a SQL warehouse which will be used to execute this query.
	WarehouseId pulumi.StringOutput `pulumi:"warehouseId"`
}

// NewQuery registers a new resource with the given unique name, arguments, and options.
func NewQuery(ctx *pulumi.Context,
	name string, args *QueryArgs, opts ...pulumi.ResourceOption) (*Query, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	if args.QueryText == nil {
		return nil, errors.New("invalid value for required argument 'QueryText'")
	}
	if args.WarehouseId == nil {
		return nil, errors.New("invalid value for required argument 'WarehouseId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Query
	err := ctx.RegisterResource("databricks:index/query:Query", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetQuery gets an existing Query resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetQuery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *QueryState, opts ...pulumi.ResourceOption) (*Query, error) {
	var resource Query
	err := ctx.ReadResource("databricks:index/query:Query", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Query resources.
type queryState struct {
	// Whether to apply a 1000 row limit to the query result.
	ApplyAutoLimit *bool `pulumi:"applyAutoLimit"`
	// Name of the catalog where this query will be executed.
	Catalog *string `pulumi:"catalog"`
	// The timestamp string indicating when the query was created.
	CreateTime *string `pulumi:"createTime"`
	// General description that conveys additional information about this query such as usage notes.
	Description *string `pulumi:"description"`
	// Name of the query.
	DisplayName *string `pulumi:"displayName"`
	// Username of the user who last saved changes to this query.
	LastModifierUserName *string `pulumi:"lastModifierUserName"`
	// The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
	LifecycleState *string `pulumi:"lifecycleState"`
	// Query owner's username.
	OwnerUserName *string `pulumi:"ownerUserName"`
	// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
	Parameters []QueryParameter `pulumi:"parameters"`
	// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
	ParentPath *string `pulumi:"parentPath"`
	// Text of SQL query.
	QueryText *string `pulumi:"queryText"`
	// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
	RunAsMode *string `pulumi:"runAsMode"`
	// Name of the schema where this query will be executed.
	Schema *string `pulumi:"schema"`
	// Tags that will be added to the query.
	Tags []string `pulumi:"tags"`
	// The timestamp string indicating when the query was updated.
	UpdateTime *string `pulumi:"updateTime"`
	// ID of a SQL warehouse which will be used to execute this query.
	WarehouseId *string `pulumi:"warehouseId"`
}

type QueryState struct {
	// Whether to apply a 1000 row limit to the query result.
	ApplyAutoLimit pulumi.BoolPtrInput
	// Name of the catalog where this query will be executed.
	Catalog pulumi.StringPtrInput
	// The timestamp string indicating when the query was created.
	CreateTime pulumi.StringPtrInput
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrInput
	// Name of the query.
	DisplayName pulumi.StringPtrInput
	// Username of the user who last saved changes to this query.
	LastModifierUserName pulumi.StringPtrInput
	// The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
	LifecycleState pulumi.StringPtrInput
	// Query owner's username.
	OwnerUserName pulumi.StringPtrInput
	// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
	Parameters QueryParameterArrayInput
	// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
	ParentPath pulumi.StringPtrInput
	// Text of SQL query.
	QueryText pulumi.StringPtrInput
	// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
	RunAsMode pulumi.StringPtrInput
	// Name of the schema where this query will be executed.
	Schema pulumi.StringPtrInput
	// Tags that will be added to the query.
	Tags pulumi.StringArrayInput
	// The timestamp string indicating when the query was updated.
	UpdateTime pulumi.StringPtrInput
	// ID of a SQL warehouse which will be used to execute this query.
	WarehouseId pulumi.StringPtrInput
}

func (QueryState) ElementType() reflect.Type {
	return reflect.TypeOf((*queryState)(nil)).Elem()
}

type queryArgs struct {
	// Whether to apply a 1000 row limit to the query result.
	ApplyAutoLimit *bool `pulumi:"applyAutoLimit"`
	// Name of the catalog where this query will be executed.
	Catalog *string `pulumi:"catalog"`
	// General description that conveys additional information about this query such as usage notes.
	Description *string `pulumi:"description"`
	// Name of the query.
	DisplayName string `pulumi:"displayName"`
	// Query owner's username.
	OwnerUserName *string `pulumi:"ownerUserName"`
	// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
	Parameters []QueryParameter `pulumi:"parameters"`
	// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
	ParentPath *string `pulumi:"parentPath"`
	// Text of SQL query.
	QueryText string `pulumi:"queryText"`
	// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
	RunAsMode *string `pulumi:"runAsMode"`
	// Name of the schema where this query will be executed.
	Schema *string `pulumi:"schema"`
	// Tags that will be added to the query.
	Tags []string `pulumi:"tags"`
	// ID of a SQL warehouse which will be used to execute this query.
	WarehouseId string `pulumi:"warehouseId"`
}

// The set of arguments for constructing a Query resource.
type QueryArgs struct {
	// Whether to apply a 1000 row limit to the query result.
	ApplyAutoLimit pulumi.BoolPtrInput
	// Name of the catalog where this query will be executed.
	Catalog pulumi.StringPtrInput
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrInput
	// Name of the query.
	DisplayName pulumi.StringInput
	// Query owner's username.
	OwnerUserName pulumi.StringPtrInput
	// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
	Parameters QueryParameterArrayInput
	// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
	ParentPath pulumi.StringPtrInput
	// Text of SQL query.
	QueryText pulumi.StringInput
	// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
	RunAsMode pulumi.StringPtrInput
	// Name of the schema where this query will be executed.
	Schema pulumi.StringPtrInput
	// Tags that will be added to the query.
	Tags pulumi.StringArrayInput
	// ID of a SQL warehouse which will be used to execute this query.
	WarehouseId pulumi.StringInput
}

func (QueryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*queryArgs)(nil)).Elem()
}

type QueryInput interface {
	pulumi.Input

	ToQueryOutput() QueryOutput
	ToQueryOutputWithContext(ctx context.Context) QueryOutput
}

func (*Query) ElementType() reflect.Type {
	return reflect.TypeOf((**Query)(nil)).Elem()
}

func (i *Query) ToQueryOutput() QueryOutput {
	return i.ToQueryOutputWithContext(context.Background())
}

func (i *Query) ToQueryOutputWithContext(ctx context.Context) QueryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryOutput)
}

// QueryArrayInput is an input type that accepts QueryArray and QueryArrayOutput values.
// You can construct a concrete instance of `QueryArrayInput` via:
//
//	QueryArray{ QueryArgs{...} }
type QueryArrayInput interface {
	pulumi.Input

	ToQueryArrayOutput() QueryArrayOutput
	ToQueryArrayOutputWithContext(context.Context) QueryArrayOutput
}

type QueryArray []QueryInput

func (QueryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Query)(nil)).Elem()
}

func (i QueryArray) ToQueryArrayOutput() QueryArrayOutput {
	return i.ToQueryArrayOutputWithContext(context.Background())
}

func (i QueryArray) ToQueryArrayOutputWithContext(ctx context.Context) QueryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryArrayOutput)
}

// QueryMapInput is an input type that accepts QueryMap and QueryMapOutput values.
// You can construct a concrete instance of `QueryMapInput` via:
//
//	QueryMap{ "key": QueryArgs{...} }
type QueryMapInput interface {
	pulumi.Input

	ToQueryMapOutput() QueryMapOutput
	ToQueryMapOutputWithContext(context.Context) QueryMapOutput
}

type QueryMap map[string]QueryInput

func (QueryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Query)(nil)).Elem()
}

func (i QueryMap) ToQueryMapOutput() QueryMapOutput {
	return i.ToQueryMapOutputWithContext(context.Background())
}

func (i QueryMap) ToQueryMapOutputWithContext(ctx context.Context) QueryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QueryMapOutput)
}

type QueryOutput struct{ *pulumi.OutputState }

func (QueryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Query)(nil)).Elem()
}

func (o QueryOutput) ToQueryOutput() QueryOutput {
	return o
}

func (o QueryOutput) ToQueryOutputWithContext(ctx context.Context) QueryOutput {
	return o
}

// Whether to apply a 1000 row limit to the query result.
func (o QueryOutput) ApplyAutoLimit() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.BoolPtrOutput { return v.ApplyAutoLimit }).(pulumi.BoolPtrOutput)
}

// Name of the catalog where this query will be executed.
func (o QueryOutput) Catalog() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.Catalog }).(pulumi.StringPtrOutput)
}

// The timestamp string indicating when the query was created.
func (o QueryOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// General description that conveys additional information about this query such as usage notes.
func (o QueryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the query.
func (o QueryOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Username of the user who last saved changes to this query.
func (o QueryOutput) LastModifierUserName() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.LastModifierUserName }).(pulumi.StringOutput)
}

// The workspace state of the query. Used for tracking trashed status. (Possible values are `ACTIVE` or `TRASHED`).
func (o QueryOutput) LifecycleState() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.LifecycleState }).(pulumi.StringOutput)
}

// Query owner's username.
func (o QueryOutput) OwnerUserName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.OwnerUserName }).(pulumi.StringPtrOutput)
}

// Query parameter definition.  Consists of following attributes (one of `*_value` is required):
func (o QueryOutput) Parameters() QueryParameterArrayOutput {
	return o.ApplyT(func(v *Query) QueryParameterArrayOutput { return v.Parameters }).(QueryParameterArrayOutput)
}

// The path to a workspace folder containing the query. The default is the user's home folder.  If changed, the query will be recreated.
func (o QueryOutput) ParentPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.ParentPath }).(pulumi.StringPtrOutput)
}

// Text of SQL query.
func (o QueryOutput) QueryText() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.QueryText }).(pulumi.StringOutput)
}

// Sets the "Run as" role for the object.  Should be one of `OWNER`, `VIEWER`.
func (o QueryOutput) RunAsMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.RunAsMode }).(pulumi.StringPtrOutput)
}

// Name of the schema where this query will be executed.
func (o QueryOutput) Schema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Query) pulumi.StringPtrOutput { return v.Schema }).(pulumi.StringPtrOutput)
}

// Tags that will be added to the query.
func (o QueryOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Query) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The timestamp string indicating when the query was updated.
func (o QueryOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

// ID of a SQL warehouse which will be used to execute this query.
func (o QueryOutput) WarehouseId() pulumi.StringOutput {
	return o.ApplyT(func(v *Query) pulumi.StringOutput { return v.WarehouseId }).(pulumi.StringOutput)
}

type QueryArrayOutput struct{ *pulumi.OutputState }

func (QueryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Query)(nil)).Elem()
}

func (o QueryArrayOutput) ToQueryArrayOutput() QueryArrayOutput {
	return o
}

func (o QueryArrayOutput) ToQueryArrayOutputWithContext(ctx context.Context) QueryArrayOutput {
	return o
}

func (o QueryArrayOutput) Index(i pulumi.IntInput) QueryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Query {
		return vs[0].([]*Query)[vs[1].(int)]
	}).(QueryOutput)
}

type QueryMapOutput struct{ *pulumi.OutputState }

func (QueryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Query)(nil)).Elem()
}

func (o QueryMapOutput) ToQueryMapOutput() QueryMapOutput {
	return o
}

func (o QueryMapOutput) ToQueryMapOutputWithContext(ctx context.Context) QueryMapOutput {
	return o
}

func (o QueryMapOutput) MapIndex(k pulumi.StringInput) QueryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Query {
		return vs[0].(map[string]*Query)[vs[1].(string)]
	}).(QueryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*QueryInput)(nil)).Elem(), &Query{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueryArrayInput)(nil)).Elem(), QueryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*QueryMapInput)(nil)).Elem(), QueryMap{})
	pulumi.RegisterOutputType(QueryOutput{})
	pulumi.RegisterOutputType(QueryArrayOutput{})
	pulumi.RegisterOutputType(QueryMapOutput{})
}
