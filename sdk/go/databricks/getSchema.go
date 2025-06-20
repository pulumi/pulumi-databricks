// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves details about Schema that was created by Pulumi or manually.
// A schema can be identified by its two-level (fully qualified) name (in the form of: `catalogName`.`schemaName`) as input. This can be retrieved programmatically using getSchemas data source.
//
// > This data source can only be used with a workspace-level provider!
func LookupSchema(ctx *pulumi.Context, args *LookupSchemaArgs, opts ...pulumi.InvokeOption) (*LookupSchemaResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSchemaResult
	err := ctx.Invoke("databricks:index/getSchema:getSchema", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchema.
type LookupSchemaArgs struct {
	// ID of this Unity Catalog Schema in form of `<catalog>.<schema>`.
	Id *string `pulumi:"id"`
	// a fully qualified name of databricks_schema: *`catalog`.`schema`*
	Name string `pulumi:"name"`
	// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
	SchemaInfo *GetSchemaSchemaInfo `pulumi:"schemaInfo"`
}

// A collection of values returned by getSchema.
type LookupSchemaResult struct {
	// ID of this Unity Catalog Schema in form of `<catalog>.<schema>`.
	Id string `pulumi:"id"`
	// Name of schema, relative to parent catalog.
	Name string `pulumi:"name"`
	// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
	SchemaInfo GetSchemaSchemaInfo `pulumi:"schemaInfo"`
}

func LookupSchemaOutput(ctx *pulumi.Context, args LookupSchemaOutputArgs, opts ...pulumi.InvokeOption) LookupSchemaResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupSchemaResultOutput, error) {
			args := v.(LookupSchemaArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getSchema:getSchema", args, LookupSchemaResultOutput{}, options).(LookupSchemaResultOutput), nil
		}).(LookupSchemaResultOutput)
}

// A collection of arguments for invoking getSchema.
type LookupSchemaOutputArgs struct {
	// ID of this Unity Catalog Schema in form of `<catalog>.<schema>`.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// a fully qualified name of databricks_schema: *`catalog`.`schema`*
	Name pulumi.StringInput `pulumi:"name"`
	// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
	SchemaInfo GetSchemaSchemaInfoPtrInput `pulumi:"schemaInfo"`
}

func (LookupSchemaOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaArgs)(nil)).Elem()
}

// A collection of values returned by getSchema.
type LookupSchemaResultOutput struct{ *pulumi.OutputState }

func (LookupSchemaResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSchemaResult)(nil)).Elem()
}

func (o LookupSchemaResultOutput) ToLookupSchemaResultOutput() LookupSchemaResultOutput {
	return o
}

func (o LookupSchemaResultOutput) ToLookupSchemaResultOutputWithContext(ctx context.Context) LookupSchemaResultOutput {
	return o
}

// ID of this Unity Catalog Schema in form of `<catalog>.<schema>`.
func (o LookupSchemaResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of schema, relative to parent catalog.
func (o LookupSchemaResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSchemaResult) string { return v.Name }).(pulumi.StringOutput)
}

// `SchemaInfo` object for a Unity Catalog schema. This contains the following attributes:
func (o LookupSchemaResultOutput) SchemaInfo() GetSchemaSchemaInfoOutput {
	return o.ApplyT(func(v LookupSchemaResult) GetSchemaSchemaInfo { return v.SchemaInfo }).(GetSchemaSchemaInfoOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSchemaResultOutput{})
}
