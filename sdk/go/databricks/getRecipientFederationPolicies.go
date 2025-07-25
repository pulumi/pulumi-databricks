// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetRecipientFederationPolicies(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetRecipientFederationPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRecipientFederationPoliciesResult
	err := ctx.Invoke("databricks:index/getRecipientFederationPolicies:getRecipientFederationPolicies", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getRecipientFederationPolicies.
type GetRecipientFederationPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string                                 `pulumi:"id"`
	Policies []GetRecipientFederationPoliciesPolicy `pulumi:"policies"`
}

func GetRecipientFederationPoliciesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetRecipientFederationPoliciesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetRecipientFederationPoliciesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("databricks:index/getRecipientFederationPolicies:getRecipientFederationPolicies", nil, GetRecipientFederationPoliciesResultOutput{}, options).(GetRecipientFederationPoliciesResultOutput), nil
	}).(GetRecipientFederationPoliciesResultOutput)
}

// A collection of values returned by getRecipientFederationPolicies.
type GetRecipientFederationPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetRecipientFederationPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRecipientFederationPoliciesResult)(nil)).Elem()
}

func (o GetRecipientFederationPoliciesResultOutput) ToGetRecipientFederationPoliciesResultOutput() GetRecipientFederationPoliciesResultOutput {
	return o
}

func (o GetRecipientFederationPoliciesResultOutput) ToGetRecipientFederationPoliciesResultOutputWithContext(ctx context.Context) GetRecipientFederationPoliciesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetRecipientFederationPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRecipientFederationPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRecipientFederationPoliciesResultOutput) Policies() GetRecipientFederationPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetRecipientFederationPoliciesResult) []GetRecipientFederationPoliciesPolicy { return v.Policies }).(GetRecipientFederationPoliciesPolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRecipientFederationPoliciesResultOutput{})
}
