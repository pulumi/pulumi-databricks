// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This datasource configures a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
//
// > This data source can be used with an account or workspace-level provider.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			thisBucketV2, err := s3.NewBucketV2(ctx, "this", &s3.BucketV2Args{
//				Bucket:       pulumi.String("<unique_bucket_name>"),
//				ForceDestroy: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			this := databricks.GetAwsBucketPolicyOutput(ctx, databricks.GetAwsBucketPolicyOutputArgs{
//				Bucket: thisBucketV2.Bucket,
//			}, nil)
//			_, err = s3.NewBucketPolicy(ctx, "this", &s3.BucketPolicyArgs{
//				Bucket: thisBucketV2.ID(),
//				Policy: pulumi.String(this.ApplyT(func(this databricks.GetAwsBucketPolicyResult) (*string, error) {
//					return &this.Json, nil
//				}).(pulumi.StringPtrOutput)),
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
// Bucket policy with full access:
func GetAwsBucketPolicy(ctx *pulumi.Context, args *GetAwsBucketPolicyArgs, opts ...pulumi.InvokeOption) (*GetAwsBucketPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsBucketPolicyResult
	err := ctx.Invoke("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsBucketPolicy.
type GetAwsBucketPolicyArgs struct {
	// AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
	AwsPartition *string `pulumi:"awsPartition"`
	// AWS S3 Bucket name for which to generate the policy document. The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
	Bucket string `pulumi:"bucket"`
	// Deprecated: databricks_account_id will be will be removed in the next major release.
	DatabricksAccountId *string `pulumi:"databricksAccountId"`
	// Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
	DatabricksE2AccountId *string `pulumi:"databricksE2AccountId"`
	// Data access role that can have full access for this bucket
	FullAccessRole *string `pulumi:"fullAccessRole"`
}

// A collection of values returned by getAwsBucketPolicy.
type GetAwsBucketPolicyResult struct {
	AwsPartition *string `pulumi:"awsPartition"`
	Bucket       string  `pulumi:"bucket"`
	// Deprecated: databricks_account_id will be will be removed in the next major release.
	DatabricksAccountId   *string `pulumi:"databricksAccountId"`
	DatabricksE2AccountId *string `pulumi:"databricksE2AccountId"`
	FullAccessRole        *string `pulumi:"fullAccessRole"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
	Json string `pulumi:"json"`
}

func GetAwsBucketPolicyOutput(ctx *pulumi.Context, args GetAwsBucketPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAwsBucketPolicyResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAwsBucketPolicyResultOutput, error) {
			args := v.(GetAwsBucketPolicyArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("databricks:index/getAwsBucketPolicy:getAwsBucketPolicy", args, GetAwsBucketPolicyResultOutput{}, options).(GetAwsBucketPolicyResultOutput), nil
		}).(GetAwsBucketPolicyResultOutput)
}

// A collection of arguments for invoking getAwsBucketPolicy.
type GetAwsBucketPolicyOutputArgs struct {
	// AWS partition. The options are `aws`, `aws-us-gov`, or `aws-us-gov-dod`. Defaults to `aws`
	AwsPartition pulumi.StringPtrInput `pulumi:"awsPartition"`
	// AWS S3 Bucket name for which to generate the policy document. The name must follow the [S3 bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
	Bucket pulumi.StringInput `pulumi:"bucket"`
	// Deprecated: databricks_account_id will be will be removed in the next major release.
	DatabricksAccountId pulumi.StringPtrInput `pulumi:"databricksAccountId"`
	// Your Databricks account ID. Used to generate  restrictive IAM policies that will increase the security of your root bucket
	DatabricksE2AccountId pulumi.StringPtrInput `pulumi:"databricksE2AccountId"`
	// Data access role that can have full access for this bucket
	FullAccessRole pulumi.StringPtrInput `pulumi:"fullAccessRole"`
}

func (GetAwsBucketPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsBucketPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAwsBucketPolicy.
type GetAwsBucketPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAwsBucketPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsBucketPolicyResult)(nil)).Elem()
}

func (o GetAwsBucketPolicyResultOutput) ToGetAwsBucketPolicyResultOutput() GetAwsBucketPolicyResultOutput {
	return o
}

func (o GetAwsBucketPolicyResultOutput) ToGetAwsBucketPolicyResultOutputWithContext(ctx context.Context) GetAwsBucketPolicyResultOutput {
	return o
}

func (o GetAwsBucketPolicyResultOutput) AwsPartition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.AwsPartition }).(pulumi.StringPtrOutput)
}

func (o GetAwsBucketPolicyResultOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Bucket }).(pulumi.StringOutput)
}

// Deprecated: databricks_account_id will be will be removed in the next major release.
func (o GetAwsBucketPolicyResultOutput) DatabricksAccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.DatabricksAccountId }).(pulumi.StringPtrOutput)
}

func (o GetAwsBucketPolicyResultOutput) DatabricksE2AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.DatabricksE2AccountId }).(pulumi.StringPtrOutput)
}

func (o GetAwsBucketPolicyResultOutput) FullAccessRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) *string { return v.FullAccessRole }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsBucketPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// (Read-only) AWS IAM Policy JSON document to grant Databricks full access to bucket.
func (o GetAwsBucketPolicyResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsBucketPolicyResult) string { return v.Json }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsBucketPolicyResultOutput{})
}
