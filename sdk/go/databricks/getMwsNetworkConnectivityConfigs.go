// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This data source can only be used with an account-level provider!
//
// Lists all MwsNetworkConnectivityConfig in Databricks Account.
//
// ## Example Usage
//
// # List all network connectivity configurations in Databricks Account
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
//			this, err := databricks.GetMwsNetworkConnectivityConfigs(ctx, &databricks.GetMwsNetworkConnectivityConfigsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("all", this)
//			return nil
//		})
//	}
//
// ```
//
// # List network connectivity configurations from a specific region in Databricks Account
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
//			this, err := databricks.GetMwsNetworkConnectivityConfigs(ctx, &databricks.GetMwsNetworkConnectivityConfigsArgs{
//				Region: pulumi.StringRef("us-east-1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("filtered", this)
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
// * MwsNetworkConnectivityConfig to get information about a single network connectivity configuration.
// * MwsNetworkConnectivityConfig to manage network connectivity configuration.
func GetMwsNetworkConnectivityConfigs(ctx *pulumi.Context, args *GetMwsNetworkConnectivityConfigsArgs, opts ...pulumi.InvokeOption) (*GetMwsNetworkConnectivityConfigsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMwsNetworkConnectivityConfigsResult
	err := ctx.Invoke("databricks:index/getMwsNetworkConnectivityConfigs:getMwsNetworkConnectivityConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMwsNetworkConnectivityConfigs.
type GetMwsNetworkConnectivityConfigsArgs struct {
	// List of names of databricks_mws_network_connectivity_config
	Names []string `pulumi:"names"`
	// Filter network connectivity configurations by region.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getMwsNetworkConnectivityConfigs.
type GetMwsNetworkConnectivityConfigsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of names of databricks_mws_network_connectivity_config
	Names  []string `pulumi:"names"`
	Region *string  `pulumi:"region"`
}

func GetMwsNetworkConnectivityConfigsOutput(ctx *pulumi.Context, args GetMwsNetworkConnectivityConfigsOutputArgs, opts ...pulumi.InvokeOption) GetMwsNetworkConnectivityConfigsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetMwsNetworkConnectivityConfigsResultOutput, error) {
			args := v.(GetMwsNetworkConnectivityConfigsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getMwsNetworkConnectivityConfigs:getMwsNetworkConnectivityConfigs", args, GetMwsNetworkConnectivityConfigsResultOutput{}, options).(GetMwsNetworkConnectivityConfigsResultOutput), nil
		}).(GetMwsNetworkConnectivityConfigsResultOutput)
}

// A collection of arguments for invoking getMwsNetworkConnectivityConfigs.
type GetMwsNetworkConnectivityConfigsOutputArgs struct {
	// List of names of databricks_mws_network_connectivity_config
	Names pulumi.StringArrayInput `pulumi:"names"`
	// Filter network connectivity configurations by region.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetMwsNetworkConnectivityConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMwsNetworkConnectivityConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getMwsNetworkConnectivityConfigs.
type GetMwsNetworkConnectivityConfigsResultOutput struct{ *pulumi.OutputState }

func (GetMwsNetworkConnectivityConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMwsNetworkConnectivityConfigsResult)(nil)).Elem()
}

func (o GetMwsNetworkConnectivityConfigsResultOutput) ToGetMwsNetworkConnectivityConfigsResultOutput() GetMwsNetworkConnectivityConfigsResultOutput {
	return o
}

func (o GetMwsNetworkConnectivityConfigsResultOutput) ToGetMwsNetworkConnectivityConfigsResultOutputWithContext(ctx context.Context) GetMwsNetworkConnectivityConfigsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetMwsNetworkConnectivityConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMwsNetworkConnectivityConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of names of databricks_mws_network_connectivity_config
func (o GetMwsNetworkConnectivityConfigsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMwsNetworkConnectivityConfigsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetMwsNetworkConnectivityConfigsResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMwsNetworkConnectivityConfigsResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMwsNetworkConnectivityConfigsResultOutput{})
}