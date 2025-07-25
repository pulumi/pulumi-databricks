// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves information about metastore attached to a given workspace.
//
// > This data source can only be used with a workspace-level provider!
//
// ## Example Usage
//
// MetastoreSummary response for a metastore attached to the current workspace.
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
//			this, err := databricks.GetCurrentMetastore(ctx, &databricks.GetCurrentMetastoreArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("someMetastore", this.MetastoreInfo)
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
// * Metastore to get information for a metastore with a given ID.
// * getMetastores to get a mapping of name to id of all metastores.
// * Metastore to manage Metastores within Unity Catalog.
// * Catalog to manage catalogs within Unity Catalog.
func GetCurrentMetastore(ctx *pulumi.Context, args *GetCurrentMetastoreArgs, opts ...pulumi.InvokeOption) (*GetCurrentMetastoreResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCurrentMetastoreResult
	err := ctx.Invoke("databricks:index/getCurrentMetastore:getCurrentMetastore", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCurrentMetastore.
type GetCurrentMetastoreArgs struct {
	// metastore ID. Will be `noMetastore` if there is no metastore assigned for the current workspace
	Id *string `pulumi:"id"`
	// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
	MetastoreInfo *GetCurrentMetastoreMetastoreInfo `pulumi:"metastoreInfo"`
}

// A collection of values returned by getCurrentMetastore.
type GetCurrentMetastoreResult struct {
	// metastore ID. Will be `noMetastore` if there is no metastore assigned for the current workspace
	Id string `pulumi:"id"`
	// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
	MetastoreInfo GetCurrentMetastoreMetastoreInfo `pulumi:"metastoreInfo"`
}

func GetCurrentMetastoreOutput(ctx *pulumi.Context, args GetCurrentMetastoreOutputArgs, opts ...pulumi.InvokeOption) GetCurrentMetastoreResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetCurrentMetastoreResultOutput, error) {
			args := v.(GetCurrentMetastoreArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getCurrentMetastore:getCurrentMetastore", args, GetCurrentMetastoreResultOutput{}, options).(GetCurrentMetastoreResultOutput), nil
		}).(GetCurrentMetastoreResultOutput)
}

// A collection of arguments for invoking getCurrentMetastore.
type GetCurrentMetastoreOutputArgs struct {
	// metastore ID. Will be `noMetastore` if there is no metastore assigned for the current workspace
	Id pulumi.StringPtrInput `pulumi:"id"`
	// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
	MetastoreInfo GetCurrentMetastoreMetastoreInfoPtrInput `pulumi:"metastoreInfo"`
}

func (GetCurrentMetastoreOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCurrentMetastoreArgs)(nil)).Elem()
}

// A collection of values returned by getCurrentMetastore.
type GetCurrentMetastoreResultOutput struct{ *pulumi.OutputState }

func (GetCurrentMetastoreResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCurrentMetastoreResult)(nil)).Elem()
}

func (o GetCurrentMetastoreResultOutput) ToGetCurrentMetastoreResultOutput() GetCurrentMetastoreResultOutput {
	return o
}

func (o GetCurrentMetastoreResultOutput) ToGetCurrentMetastoreResultOutputWithContext(ctx context.Context) GetCurrentMetastoreResultOutput {
	return o
}

// metastore ID. Will be `noMetastore` if there is no metastore assigned for the current workspace
func (o GetCurrentMetastoreResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentMetastoreResult) string { return v.Id }).(pulumi.StringOutput)
}

// summary about a metastore attached to the current workspace returned by [Get a metastore summary API](https://docs.databricks.com/api/workspace/metastores/summary). This contains the following attributes (check the API page for up-to-date details):
func (o GetCurrentMetastoreResultOutput) MetastoreInfo() GetCurrentMetastoreMetastoreInfoOutput {
	return o.ApplyT(func(v GetCurrentMetastoreResult) GetCurrentMetastoreMetastoreInfo { return v.MetastoreInfo }).(GetCurrentMetastoreMetastoreInfoOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCurrentMetastoreResultOutput{})
}
