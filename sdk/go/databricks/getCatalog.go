// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves details of a specific catalog in Unity Catalog, that were created by Pulumi or manually. Use getCatalogs to retrieve IDs of multiple catalogs from Unity Catalog
//
// > This data source can only be used with a workspace-level provider!
//
// ## Example Usage
//
// Read  on a specific catalog `test`:
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
//			test, err := databricks.LookupCatalog(ctx, &databricks.LookupCatalogArgs{
//				Name: "test",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "things", &databricks.GrantsArgs{
//				Catalog: pulumi.String(test.Name),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("sensitive"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("USE_CATALOG"),
//						},
//					},
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
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Grant to manage grants within Unity Catalog.
// * getCatalogs to list all catalogs within Unity Catalog metastore.
func LookupCatalog(ctx *pulumi.Context, args *LookupCatalogArgs, opts ...pulumi.InvokeOption) (*LookupCatalogResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupCatalogResult
	err := ctx.Invoke("databricks:index/getCatalog:getCatalog", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCatalog.
type LookupCatalogArgs struct {
	// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
	CatalogInfo *GetCatalogCatalogInfo `pulumi:"catalogInfo"`
	// same as the `name`
	Id *string `pulumi:"id"`
	// name of the catalog
	Name string `pulumi:"name"`
}

// A collection of values returned by getCatalog.
type LookupCatalogResult struct {
	// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
	CatalogInfo GetCatalogCatalogInfo `pulumi:"catalogInfo"`
	// same as the `name`
	Id string `pulumi:"id"`
	// Name of the catalog
	Name string `pulumi:"name"`
}

func LookupCatalogOutput(ctx *pulumi.Context, args LookupCatalogOutputArgs, opts ...pulumi.InvokeOption) LookupCatalogResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupCatalogResultOutput, error) {
			args := v.(LookupCatalogArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getCatalog:getCatalog", args, LookupCatalogResultOutput{}, options).(LookupCatalogResultOutput), nil
		}).(LookupCatalogResultOutput)
}

// A collection of arguments for invoking getCatalog.
type LookupCatalogOutputArgs struct {
	// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
	CatalogInfo GetCatalogCatalogInfoPtrInput `pulumi:"catalogInfo"`
	// same as the `name`
	Id pulumi.StringPtrInput `pulumi:"id"`
	// name of the catalog
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupCatalogOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCatalogArgs)(nil)).Elem()
}

// A collection of values returned by getCatalog.
type LookupCatalogResultOutput struct{ *pulumi.OutputState }

func (LookupCatalogResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCatalogResult)(nil)).Elem()
}

func (o LookupCatalogResultOutput) ToLookupCatalogResultOutput() LookupCatalogResultOutput {
	return o
}

func (o LookupCatalogResultOutput) ToLookupCatalogResultOutputWithContext(ctx context.Context) LookupCatalogResultOutput {
	return o
}

// the [CatalogInfo](https://pkg.go.dev/github.com/databricks/databricks-sdk-go/service/catalog#CatalogInfo) object for a Unity Catalog catalog. This contains the following attributes (see ):
func (o LookupCatalogResultOutput) CatalogInfo() GetCatalogCatalogInfoOutput {
	return o.ApplyT(func(v LookupCatalogResult) GetCatalogCatalogInfo { return v.CatalogInfo }).(GetCatalogCatalogInfoOutput)
}

// same as the `name`
func (o LookupCatalogResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the catalog
func (o LookupCatalogResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCatalogResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCatalogResultOutput{})
}
