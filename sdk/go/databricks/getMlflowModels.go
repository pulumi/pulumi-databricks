// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This data source could be only used with workspace-level provider!
//
// Retrieves a list of MlflowModel objects, that were created by Pulumi or manually, so that special handling could be applied.
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
//			this, err := databricks.GetMlflowModels(ctx, &databricks.GetMlflowModelsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("model", this)
//			return nil
//		})
//	}
//
// ```
func GetMlflowModels(ctx *pulumi.Context, args *GetMlflowModelsArgs, opts ...pulumi.InvokeOption) (*GetMlflowModelsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMlflowModelsResult
	err := ctx.Invoke("databricks:index/getMlflowModels:getMlflowModels", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMlflowModels.
type GetMlflowModelsArgs struct {
	// List of names of databricks_mlflow_model
	Names []string `pulumi:"names"`
}

// A collection of values returned by getMlflowModels.
type GetMlflowModelsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of names of databricks_mlflow_model
	Names []string `pulumi:"names"`
}

func GetMlflowModelsOutput(ctx *pulumi.Context, args GetMlflowModelsOutputArgs, opts ...pulumi.InvokeOption) GetMlflowModelsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMlflowModelsResultOutput, error) {
			args := v.(GetMlflowModelsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetMlflowModelsResult
			secret, err := ctx.InvokePackageRaw("databricks:index/getMlflowModels:getMlflowModels", args, &rv, "", opts...)
			if err != nil {
				return GetMlflowModelsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetMlflowModelsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetMlflowModelsResultOutput), nil
			}
			return output, nil
		}).(GetMlflowModelsResultOutput)
}

// A collection of arguments for invoking getMlflowModels.
type GetMlflowModelsOutputArgs struct {
	// List of names of databricks_mlflow_model
	Names pulumi.StringArrayInput `pulumi:"names"`
}

func (GetMlflowModelsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMlflowModelsArgs)(nil)).Elem()
}

// A collection of values returned by getMlflowModels.
type GetMlflowModelsResultOutput struct{ *pulumi.OutputState }

func (GetMlflowModelsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMlflowModelsResult)(nil)).Elem()
}

func (o GetMlflowModelsResultOutput) ToGetMlflowModelsResultOutput() GetMlflowModelsResultOutput {
	return o
}

func (o GetMlflowModelsResultOutput) ToGetMlflowModelsResultOutputWithContext(ctx context.Context) GetMlflowModelsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetMlflowModelsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMlflowModelsResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of names of databricks_mlflow_model
func (o GetMlflowModelsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMlflowModelsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMlflowModelsResultOutput{})
}
