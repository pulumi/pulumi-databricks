// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source allows you to retrieve information about [Notification Destinations](https://docs.databricks.com/api/workspace/notificationdestinations). Notification Destinations are used to send notifications for query alerts and jobs to external systems such as email, Slack, Microsoft Teams, PagerDuty, or generic webhooks.
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
//			_, err := databricks.NewNotificationDestination(ctx, "email", &databricks.NotificationDestinationArgs{
//				DisplayName: pulumi.String("Email Destination"),
//				Config: &databricks.NotificationDestinationConfigArgs{
//					Email: &databricks.NotificationDestinationConfigEmailArgs{
//						Addresses: pulumi.StringArray{
//							pulumi.String("abc@gmail.com"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewNotificationDestination(ctx, "slack", &databricks.NotificationDestinationArgs{
//				DisplayName: pulumi.String("Slack Destination"),
//				Config: &databricks.NotificationDestinationConfigArgs{
//					Slack: &databricks.NotificationDestinationConfigSlackArgs{
//						Url: pulumi.String("https://hooks.slack.com/services/..."),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			// Lists all notification desitnations
//			_, err = databricks.GetNotificationDestinations(ctx, &databricks.GetNotificationDestinationsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			// List destinations of specific type and name
//			_, err = databricks.GetNotificationDestinations(ctx, &databricks.GetNotificationDestinationsArgs{
//				DisplayNameContains: pulumi.StringRef("Destination"),
//				Type:                pulumi.StringRef("EMAIL"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetNotificationDestinations(ctx *pulumi.Context, args *GetNotificationDestinationsArgs, opts ...pulumi.InvokeOption) (*GetNotificationDestinationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNotificationDestinationsResult
	err := ctx.Invoke("databricks:index/getNotificationDestinations:getNotificationDestinations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNotificationDestinations.
type GetNotificationDestinationsArgs struct {
	// A **case-insensitive** substring to filter Notification Destinations by their display name.
	DisplayNameContains *string `pulumi:"displayNameContains"`
	// A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
	NotificationDestinations []GetNotificationDestinationsNotificationDestination `pulumi:"notificationDestinations"`
	// The type of the Notification Destination to filter by. Valid values are:
	// * `EMAIL` - Filters Notification Destinations of type Email.
	// * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
	// * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
	// * `SLACK` - Filters Notification Destinations of type Slack.
	// * `WEBHOOK` - Filters Notification Destinations of type Webhook.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getNotificationDestinations.
type GetNotificationDestinationsResult struct {
	DisplayNameContains *string `pulumi:"displayNameContains"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
	NotificationDestinations []GetNotificationDestinationsNotificationDestination `pulumi:"notificationDestinations"`
	Type                     *string                                              `pulumi:"type"`
}

func GetNotificationDestinationsOutput(ctx *pulumi.Context, args GetNotificationDestinationsOutputArgs, opts ...pulumi.InvokeOption) GetNotificationDestinationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNotificationDestinationsResultOutput, error) {
			args := v.(GetNotificationDestinationsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetNotificationDestinationsResult
			secret, err := ctx.InvokePackageRaw("databricks:index/getNotificationDestinations:getNotificationDestinations", args, &rv, "", opts...)
			if err != nil {
				return GetNotificationDestinationsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetNotificationDestinationsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetNotificationDestinationsResultOutput), nil
			}
			return output, nil
		}).(GetNotificationDestinationsResultOutput)
}

// A collection of arguments for invoking getNotificationDestinations.
type GetNotificationDestinationsOutputArgs struct {
	// A **case-insensitive** substring to filter Notification Destinations by their display name.
	DisplayNameContains pulumi.StringPtrInput `pulumi:"displayNameContains"`
	// A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
	NotificationDestinations GetNotificationDestinationsNotificationDestinationArrayInput `pulumi:"notificationDestinations"`
	// The type of the Notification Destination to filter by. Valid values are:
	// * `EMAIL` - Filters Notification Destinations of type Email.
	// * `MICROSOFT_TEAMS` - Filters Notification Destinations of type Microsoft Teams.
	// * `PAGERDUTY` - Filters Notification Destinations of type PagerDuty.
	// * `SLACK` - Filters Notification Destinations of type Slack.
	// * `WEBHOOK` - Filters Notification Destinations of type Webhook.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetNotificationDestinationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNotificationDestinationsArgs)(nil)).Elem()
}

// A collection of values returned by getNotificationDestinations.
type GetNotificationDestinationsResultOutput struct{ *pulumi.OutputState }

func (GetNotificationDestinationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNotificationDestinationsResult)(nil)).Elem()
}

func (o GetNotificationDestinationsResultOutput) ToGetNotificationDestinationsResultOutput() GetNotificationDestinationsResultOutput {
	return o
}

func (o GetNotificationDestinationsResultOutput) ToGetNotificationDestinationsResultOutputWithContext(ctx context.Context) GetNotificationDestinationsResultOutput {
	return o
}

func (o GetNotificationDestinationsResultOutput) DisplayNameContains() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNotificationDestinationsResult) *string { return v.DisplayNameContains }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNotificationDestinationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNotificationDestinationsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of Notification Destinations matching the specified criteria. Each element contains the following attributes:
func (o GetNotificationDestinationsResultOutput) NotificationDestinations() GetNotificationDestinationsNotificationDestinationArrayOutput {
	return o.ApplyT(func(v GetNotificationDestinationsResult) []GetNotificationDestinationsNotificationDestination {
		return v.NotificationDestinations
	}).(GetNotificationDestinationsNotificationDestinationArrayOutput)
}

func (o GetNotificationDestinationsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNotificationDestinationsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNotificationDestinationsResultOutput{})
}