// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// As of Pulumi v1.5, resources can be imported through configuration.
//
// hcl
//
// import {
//
//	id = name
//
//	to = databricks_online_store.this
//
// }
//
// If you are using an older version of Pulumi, import the resource using the `pulumi import` command as follows:
//
// ```sh
// $ pulumi import databricks:index/onlineStore:OnlineStore databricks_online_store name
// ```
type OnlineStore struct {
	pulumi.CustomResourceState

	// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
	Capacity pulumi.StringPtrOutput `pulumi:"capacity"`
	// (string) - The timestamp when the online store was created
	CreationTime pulumi.StringOutput `pulumi:"creationTime"`
	// (string) - The email of the creator of the online store
	Creator pulumi.StringOutput `pulumi:"creator"`
	// The name of the online store. This is the unique identifier for the online store
	Name pulumi.StringOutput `pulumi:"name"`
	// (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
	State pulumi.StringOutput `pulumi:"state"`
}

// NewOnlineStore registers a new resource with the given unique name, arguments, and options.
func NewOnlineStore(ctx *pulumi.Context,
	name string, args *OnlineStoreArgs, opts ...pulumi.ResourceOption) (*OnlineStore, error) {
	if args == nil {
		args = &OnlineStoreArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OnlineStore
	err := ctx.RegisterResource("databricks:index/onlineStore:OnlineStore", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOnlineStore gets an existing OnlineStore resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOnlineStore(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OnlineStoreState, opts ...pulumi.ResourceOption) (*OnlineStore, error) {
	var resource OnlineStore
	err := ctx.ReadResource("databricks:index/onlineStore:OnlineStore", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OnlineStore resources.
type onlineStoreState struct {
	// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
	Capacity *string `pulumi:"capacity"`
	// (string) - The timestamp when the online store was created
	CreationTime *string `pulumi:"creationTime"`
	// (string) - The email of the creator of the online store
	Creator *string `pulumi:"creator"`
	// The name of the online store. This is the unique identifier for the online store
	Name *string `pulumi:"name"`
	// (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
	State *string `pulumi:"state"`
}

type OnlineStoreState struct {
	// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
	Capacity pulumi.StringPtrInput
	// (string) - The timestamp when the online store was created
	CreationTime pulumi.StringPtrInput
	// (string) - The email of the creator of the online store
	Creator pulumi.StringPtrInput
	// The name of the online store. This is the unique identifier for the online store
	Name pulumi.StringPtrInput
	// (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
	State pulumi.StringPtrInput
}

func (OnlineStoreState) ElementType() reflect.Type {
	return reflect.TypeOf((*onlineStoreState)(nil)).Elem()
}

type onlineStoreArgs struct {
	// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
	Capacity *string `pulumi:"capacity"`
	// The name of the online store. This is the unique identifier for the online store
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a OnlineStore resource.
type OnlineStoreArgs struct {
	// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
	Capacity pulumi.StringPtrInput
	// The name of the online store. This is the unique identifier for the online store
	Name pulumi.StringPtrInput
}

func (OnlineStoreArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*onlineStoreArgs)(nil)).Elem()
}

type OnlineStoreInput interface {
	pulumi.Input

	ToOnlineStoreOutput() OnlineStoreOutput
	ToOnlineStoreOutputWithContext(ctx context.Context) OnlineStoreOutput
}

func (*OnlineStore) ElementType() reflect.Type {
	return reflect.TypeOf((**OnlineStore)(nil)).Elem()
}

func (i *OnlineStore) ToOnlineStoreOutput() OnlineStoreOutput {
	return i.ToOnlineStoreOutputWithContext(context.Background())
}

func (i *OnlineStore) ToOnlineStoreOutputWithContext(ctx context.Context) OnlineStoreOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineStoreOutput)
}

// OnlineStoreArrayInput is an input type that accepts OnlineStoreArray and OnlineStoreArrayOutput values.
// You can construct a concrete instance of `OnlineStoreArrayInput` via:
//
//	OnlineStoreArray{ OnlineStoreArgs{...} }
type OnlineStoreArrayInput interface {
	pulumi.Input

	ToOnlineStoreArrayOutput() OnlineStoreArrayOutput
	ToOnlineStoreArrayOutputWithContext(context.Context) OnlineStoreArrayOutput
}

type OnlineStoreArray []OnlineStoreInput

func (OnlineStoreArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OnlineStore)(nil)).Elem()
}

func (i OnlineStoreArray) ToOnlineStoreArrayOutput() OnlineStoreArrayOutput {
	return i.ToOnlineStoreArrayOutputWithContext(context.Background())
}

func (i OnlineStoreArray) ToOnlineStoreArrayOutputWithContext(ctx context.Context) OnlineStoreArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineStoreArrayOutput)
}

// OnlineStoreMapInput is an input type that accepts OnlineStoreMap and OnlineStoreMapOutput values.
// You can construct a concrete instance of `OnlineStoreMapInput` via:
//
//	OnlineStoreMap{ "key": OnlineStoreArgs{...} }
type OnlineStoreMapInput interface {
	pulumi.Input

	ToOnlineStoreMapOutput() OnlineStoreMapOutput
	ToOnlineStoreMapOutputWithContext(context.Context) OnlineStoreMapOutput
}

type OnlineStoreMap map[string]OnlineStoreInput

func (OnlineStoreMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OnlineStore)(nil)).Elem()
}

func (i OnlineStoreMap) ToOnlineStoreMapOutput() OnlineStoreMapOutput {
	return i.ToOnlineStoreMapOutputWithContext(context.Background())
}

func (i OnlineStoreMap) ToOnlineStoreMapOutputWithContext(ctx context.Context) OnlineStoreMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OnlineStoreMapOutput)
}

type OnlineStoreOutput struct{ *pulumi.OutputState }

func (OnlineStoreOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OnlineStore)(nil)).Elem()
}

func (o OnlineStoreOutput) ToOnlineStoreOutput() OnlineStoreOutput {
	return o
}

func (o OnlineStoreOutput) ToOnlineStoreOutputWithContext(ctx context.Context) OnlineStoreOutput {
	return o
}

// The capacity of the online store. Valid values are "CU_1", "CU_2", "CU_4", "CU_8"
func (o OnlineStoreOutput) Capacity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OnlineStore) pulumi.StringPtrOutput { return v.Capacity }).(pulumi.StringPtrOutput)
}

// (string) - The timestamp when the online store was created
func (o OnlineStoreOutput) CreationTime() pulumi.StringOutput {
	return o.ApplyT(func(v *OnlineStore) pulumi.StringOutput { return v.CreationTime }).(pulumi.StringOutput)
}

// (string) - The email of the creator of the online store
func (o OnlineStoreOutput) Creator() pulumi.StringOutput {
	return o.ApplyT(func(v *OnlineStore) pulumi.StringOutput { return v.Creator }).(pulumi.StringOutput)
}

// The name of the online store. This is the unique identifier for the online store
func (o OnlineStoreOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OnlineStore) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
func (o OnlineStoreOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *OnlineStore) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

type OnlineStoreArrayOutput struct{ *pulumi.OutputState }

func (OnlineStoreArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OnlineStore)(nil)).Elem()
}

func (o OnlineStoreArrayOutput) ToOnlineStoreArrayOutput() OnlineStoreArrayOutput {
	return o
}

func (o OnlineStoreArrayOutput) ToOnlineStoreArrayOutputWithContext(ctx context.Context) OnlineStoreArrayOutput {
	return o
}

func (o OnlineStoreArrayOutput) Index(i pulumi.IntInput) OnlineStoreOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OnlineStore {
		return vs[0].([]*OnlineStore)[vs[1].(int)]
	}).(OnlineStoreOutput)
}

type OnlineStoreMapOutput struct{ *pulumi.OutputState }

func (OnlineStoreMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OnlineStore)(nil)).Elem()
}

func (o OnlineStoreMapOutput) ToOnlineStoreMapOutput() OnlineStoreMapOutput {
	return o
}

func (o OnlineStoreMapOutput) ToOnlineStoreMapOutputWithContext(ctx context.Context) OnlineStoreMapOutput {
	return o
}

func (o OnlineStoreMapOutput) MapIndex(k pulumi.StringInput) OnlineStoreOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OnlineStore {
		return vs[0].(map[string]*OnlineStore)[vs[1].(string)]
	}).(OnlineStoreOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineStoreInput)(nil)).Elem(), &OnlineStore{})
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineStoreArrayInput)(nil)).Elem(), OnlineStoreArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OnlineStoreMapInput)(nil)).Elem(), OnlineStoreMap{})
	pulumi.RegisterOutputType(OnlineStoreOutput{})
	pulumi.RegisterOutputType(OnlineStoreArrayOutput{})
	pulumi.RegisterOutputType(OnlineStoreMapOutput{})
}
