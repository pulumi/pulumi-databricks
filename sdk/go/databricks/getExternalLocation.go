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
// Getting details of an existing external location in the metastore
func LookupExternalLocation(ctx *pulumi.Context, args *LookupExternalLocationArgs, opts ...pulumi.InvokeOption) (*LookupExternalLocationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupExternalLocationResult
	err := ctx.Invoke("databricks:index/getExternalLocation:getExternalLocation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalLocation.
type LookupExternalLocationArgs struct {
	ExternalLocationInfo *GetExternalLocationExternalLocationInfo `pulumi:"externalLocationInfo"`
	// The name of the storage credential
	Name string `pulumi:"name"`
}

// A collection of values returned by getExternalLocation.
type LookupExternalLocationResult struct {
	ExternalLocationInfo GetExternalLocationExternalLocationInfo `pulumi:"externalLocationInfo"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
}

func LookupExternalLocationOutput(ctx *pulumi.Context, args LookupExternalLocationOutputArgs, opts ...pulumi.InvokeOption) LookupExternalLocationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupExternalLocationResult, error) {
			args := v.(LookupExternalLocationArgs)
			r, err := LookupExternalLocation(ctx, &args, opts...)
			var s LookupExternalLocationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupExternalLocationResultOutput)
}

// A collection of arguments for invoking getExternalLocation.
type LookupExternalLocationOutputArgs struct {
	ExternalLocationInfo GetExternalLocationExternalLocationInfoPtrInput `pulumi:"externalLocationInfo"`
	// The name of the storage credential
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupExternalLocationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalLocationArgs)(nil)).Elem()
}

// A collection of values returned by getExternalLocation.
type LookupExternalLocationResultOutput struct{ *pulumi.OutputState }

func (LookupExternalLocationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalLocationResult)(nil)).Elem()
}

func (o LookupExternalLocationResultOutput) ToLookupExternalLocationResultOutput() LookupExternalLocationResultOutput {
	return o
}

func (o LookupExternalLocationResultOutput) ToLookupExternalLocationResultOutputWithContext(ctx context.Context) LookupExternalLocationResultOutput {
	return o
}

func (o LookupExternalLocationResultOutput) ExternalLocationInfo() GetExternalLocationExternalLocationInfoOutput {
	return o.ApplyT(func(v LookupExternalLocationResult) GetExternalLocationExternalLocationInfo {
		return v.ExternalLocationInfo
	}).(GetExternalLocationExternalLocationInfoOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupExternalLocationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalLocationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupExternalLocationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalLocationResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupExternalLocationResultOutput{})
}