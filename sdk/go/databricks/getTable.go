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
// Read  on a specific table `main.certified.fct_transactions`:
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
//			fctTransactions, err := databricks.LookupTable(ctx, &databricks.LookupTableArgs{
//				Name: "main.certified.fct_transactions",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "things", &databricks.GrantsArgs{
//				Table: pulumi.String(fctTransactions.Name),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("sensitive"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("SELECT"),
//							pulumi.String("MODIFY"),
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
// * getTables to list all tables within a schema in Unity Catalog.
func LookupTable(ctx *pulumi.Context, args *LookupTableArgs, opts ...pulumi.InvokeOption) (*LookupTableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTableResult
	err := ctx.Invoke("databricks:index/getTable:getTable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTable.
type LookupTableArgs struct {
	Id *string `pulumi:"id"`
	// Full name of the databricks_table: _`catalog`.`schema`.`table`_
	Name string `pulumi:"name"`
	// TableInfo object for a Unity Catalog table. This contains the following attributes:
	TableInfo *GetTableTableInfo `pulumi:"tableInfo"`
}

// A collection of values returned by getTable.
type LookupTableResult struct {
	Id string `pulumi:"id"`
	// Name of table, relative to parent schema.
	Name string `pulumi:"name"`
	// TableInfo object for a Unity Catalog table. This contains the following attributes:
	TableInfo GetTableTableInfo `pulumi:"tableInfo"`
}

func LookupTableOutput(ctx *pulumi.Context, args LookupTableOutputArgs, opts ...pulumi.InvokeOption) LookupTableResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTableResult, error) {
			args := v.(LookupTableArgs)
			r, err := LookupTable(ctx, &args, opts...)
			var s LookupTableResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTableResultOutput)
}

// A collection of arguments for invoking getTable.
type LookupTableOutputArgs struct {
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Full name of the databricks_table: _`catalog`.`schema`.`table`_
	Name pulumi.StringInput `pulumi:"name"`
	// TableInfo object for a Unity Catalog table. This contains the following attributes:
	TableInfo GetTableTableInfoPtrInput `pulumi:"tableInfo"`
}

func (LookupTableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableArgs)(nil)).Elem()
}

// A collection of values returned by getTable.
type LookupTableResultOutput struct{ *pulumi.OutputState }

func (LookupTableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTableResult)(nil)).Elem()
}

func (o LookupTableResultOutput) ToLookupTableResultOutput() LookupTableResultOutput {
	return o
}

func (o LookupTableResultOutput) ToLookupTableResultOutputWithContext(ctx context.Context) LookupTableResultOutput {
	return o
}

func (o LookupTableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of table, relative to parent schema.
func (o LookupTableResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTableResult) string { return v.Name }).(pulumi.StringOutput)
}

// TableInfo object for a Unity Catalog table. This contains the following attributes:
func (o LookupTableResultOutput) TableInfo() GetTableTableInfoOutput {
	return o.ApplyT(func(v LookupTableResult) GetTableTableInfo { return v.TableInfo }).(GetTableTableInfoOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTableResultOutput{})
}