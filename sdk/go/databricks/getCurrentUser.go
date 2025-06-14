// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves information about User or databricks_service_principal, that is calling Databricks REST API. Might be useful in applying the same Pulumi by different users in the shared workspace for testing purposes.
//
// > This data source can only be used with a workspace-level provider!
func GetCurrentUser(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetCurrentUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCurrentUserResult
	err := ctx.Invoke("databricks:index/getCurrentUser:getCurrentUser", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getCurrentUser.
type GetCurrentUserResult struct {
	AclPrincipalId string `pulumi:"aclPrincipalId"`
	Alphanumeric   string `pulumi:"alphanumeric"`
	ExternalId     string `pulumi:"externalId"`
	Home           string `pulumi:"home"`
	// The provider-assigned unique ID for this managed resource.
	Id           string `pulumi:"id"`
	Repos        string `pulumi:"repos"`
	UserName     string `pulumi:"userName"`
	WorkspaceUrl string `pulumi:"workspaceUrl"`
}

func GetCurrentUserOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetCurrentUserResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetCurrentUserResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("databricks:index/getCurrentUser:getCurrentUser", nil, GetCurrentUserResultOutput{}, options).(GetCurrentUserResultOutput), nil
	}).(GetCurrentUserResultOutput)
}

// A collection of values returned by getCurrentUser.
type GetCurrentUserResultOutput struct{ *pulumi.OutputState }

func (GetCurrentUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCurrentUserResult)(nil)).Elem()
}

func (o GetCurrentUserResultOutput) ToGetCurrentUserResultOutput() GetCurrentUserResultOutput {
	return o
}

func (o GetCurrentUserResultOutput) ToGetCurrentUserResultOutputWithContext(ctx context.Context) GetCurrentUserResultOutput {
	return o
}

func (o GetCurrentUserResultOutput) AclPrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.AclPrincipalId }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) Alphanumeric() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.Alphanumeric }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) Home() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.Home }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCurrentUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) Repos() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.Repos }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.UserName }).(pulumi.StringOutput)
}

func (o GetCurrentUserResultOutput) WorkspaceUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetCurrentUserResult) string { return v.WorkspaceUrl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCurrentUserResultOutput{})
}
