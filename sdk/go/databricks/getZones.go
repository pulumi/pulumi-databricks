// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source allows you to fetch all available AWS availability zones on your workspace on AWS.
//
// > This data source can only be used with a workspace-level provider!
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
//			_, err := databricks.GetZones(ctx, &databricks.GetZonesArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZonesResult
	err := ctx.Invoke("databricks:index/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
	DefaultZone *string `pulumi:"defaultZone"`
	// The id for the zone object.
	Id *string `pulumi:"id"`
	// This is a list of all the zones available for your subnets in your Databricks workspace.
	Zones []string `pulumi:"zones"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	// This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
	DefaultZone string `pulumi:"defaultZone"`
	// The id for the zone object.
	Id string `pulumi:"id"`
	// This is a list of all the zones available for your subnets in your Databricks workspace.
	Zones []string `pulumi:"zones"`
}

func GetZonesOutput(ctx *pulumi.Context, args GetZonesOutputArgs, opts ...pulumi.InvokeOption) GetZonesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetZonesResultOutput, error) {
			args := v.(GetZonesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getZones:getZones", args, GetZonesResultOutput{}, options).(GetZonesResultOutput), nil
		}).(GetZonesResultOutput)
}

// A collection of arguments for invoking getZones.
type GetZonesOutputArgs struct {
	// This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
	DefaultZone pulumi.StringPtrInput `pulumi:"defaultZone"`
	// The id for the zone object.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// This is a list of all the zones available for your subnets in your Databricks workspace.
	Zones pulumi.StringArrayInput `pulumi:"zones"`
}

func (GetZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesArgs)(nil)).Elem()
}

// A collection of values returned by getZones.
type GetZonesResultOutput struct{ *pulumi.OutputState }

func (GetZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesResult)(nil)).Elem()
}

func (o GetZonesResultOutput) ToGetZonesResultOutput() GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) ToGetZonesResultOutputWithContext(ctx context.Context) GetZonesResultOutput {
	return o
}

// This is the default zone that gets assigned to your workspace. This is the zone used by default for clusters and instance pools.
func (o GetZonesResultOutput) DefaultZone() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesResult) string { return v.DefaultZone }).(pulumi.StringOutput)
}

// The id for the zone object.
func (o GetZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

// This is a list of all the zones available for your subnets in your Databricks workspace.
func (o GetZonesResultOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []string { return v.Zones }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZonesResultOutput{})
}
