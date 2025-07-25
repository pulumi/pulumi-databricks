// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > This resource can only be used with a workspace-level provider!
//
// Lakehouse Federation is the query federation platform for Databricks. Databricks uses Unity Catalog to manage query federation. To make a dataset available for read-only querying using Lakehouse Federation, you create the following:
//
// - A connection, a securable object in Unity Catalog that specifies a path and credentials for accessing an external database system.
// - A foreign catalog
//
// This resource manages connections in Unity Catalog. Please note that OAuth U2M is not supported as it requires user interaction for authentication.
//
// ## Example Usage
//
// # Create a connection to a MySQL database
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
//			_, err := databricks.NewConnection(ctx, "mysql", &databricks.ConnectionArgs{
//				Name:           pulumi.String("mysql_connection"),
//				ConnectionType: pulumi.String("MYSQL"),
//				Comment:        pulumi.String("this is a connection to mysql db"),
//				Options: pulumi.StringMap{
//					"host":     pulumi.String("test.mysql.database.azure.com"),
//					"port":     pulumi.String("3306"),
//					"user":     pulumi.String("user"),
//					"password": pulumi.String("password"),
//				},
//				Properties: pulumi.StringMap{
//					"purpose": pulumi.String("testing"),
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
// # Create a connection to a BigQuery database
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"type":                        "service_account",
//				"project_id":                  "PROJECT_ID",
//				"private_key_id":              "KEY_ID",
//				"private_key":                 "-----BEGIN PRIVATE KEY-----\nPRIVATE_KEY\n-----END PRIVATE KEY-----\n",
//				"client_email":                "SERVICE_ACCOUNT_EMAIL",
//				"client_id":                   "CLIENT_ID",
//				"auth_uri":                    "https://accounts.google.com/o/oauth2/auth",
//				"token_uri":                   "https://accounts.google.com/o/oauth2/token",
//				"auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
//				"client_x509_cert_url":        "https://www.googleapis.com/robot/v1/metadata/x509/SERVICE_ACCOUNT_EMAIL",
//				"universe_domain":             "googleapis.com",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = databricks.NewConnection(ctx, "bigquery", &databricks.ConnectionArgs{
//				Name:           pulumi.String("bq_connection"),
//				ConnectionType: pulumi.String("BIGQUERY"),
//				Comment:        pulumi.String("this is a connection to BQ"),
//				Options: pulumi.StringMap{
//					"GoogleServiceAccountKeyJson": pulumi.String(json0),
//				},
//				Properties: pulumi.StringMap{
//					"purpose": pulumi.String("testing"),
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
// # Create a connection to builtin Hive Metastore
//
// ## Import
//
// This resource can be imported by `id`:
//
// hcl
//
// import {
//
//	to = databricks_connection.this
//
//	id = "<metastore_id>|<name>"
//
// }
//
// Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
//
// bash
//
// ```sh
// $ pulumi import databricks:index/connection:Connection this "<metastore_id>|<name>"
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Free-form text. Change forces creation of a new resource.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Unique ID of the connection.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
	ConnectionType pulumi.StringPtrOutput `pulumi:"connectionType"`
	// Time at which this connection was created, in epoch milliseconds.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// Username of connection creator.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// The type of credential for this connection.
	CredentialType pulumi.StringOutput `pulumi:"credentialType"`
	// Full name of connection.
	FullName pulumi.StringOutput `pulumi:"fullName"`
	// Unique ID of the UC metastore for this connection.
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of the Connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
	Options pulumi.StringMapOutput `pulumi:"options"`
	// Name of the connection owner.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Free-form connection properties. Change forces creation of a new resource.
	Properties pulumi.StringMapOutput `pulumi:"properties"`
	// Object with the status of an asynchronously provisioned resource.
	ProvisioningInfos ConnectionProvisioningInfoArrayOutput `pulumi:"provisioningInfos"`
	// Indicates whether the connection is read-only. Change forces creation of a new resource.
	ReadOnly      pulumi.BoolOutput   `pulumi:"readOnly"`
	SecurableType pulumi.StringOutput `pulumi:"securableType"`
	// Time at which connection this was last modified, in epoch milliseconds.
	UpdatedAt pulumi.IntOutput `pulumi:"updatedAt"`
	// Username of user who last modified the connection.
	UpdatedBy pulumi.StringOutput `pulumi:"updatedBy"`
	// URL of the remote data source, extracted from options.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		args = &ConnectionArgs{}
	}

	if args.Options != nil {
		args.Options = pulumi.ToSecret(args.Options).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"options",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("databricks:index/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("databricks:index/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Free-form text. Change forces creation of a new resource.
	Comment *string `pulumi:"comment"`
	// Unique ID of the connection.
	ConnectionId *string `pulumi:"connectionId"`
	// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
	ConnectionType *string `pulumi:"connectionType"`
	// Time at which this connection was created, in epoch milliseconds.
	CreatedAt *int `pulumi:"createdAt"`
	// Username of connection creator.
	CreatedBy *string `pulumi:"createdBy"`
	// The type of credential for this connection.
	CredentialType *string `pulumi:"credentialType"`
	// Full name of connection.
	FullName *string `pulumi:"fullName"`
	// Unique ID of the UC metastore for this connection.
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of the Connection.
	Name *string `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
	Options map[string]string `pulumi:"options"`
	// Name of the connection owner.
	Owner *string `pulumi:"owner"`
	// Free-form connection properties. Change forces creation of a new resource.
	Properties map[string]string `pulumi:"properties"`
	// Object with the status of an asynchronously provisioned resource.
	ProvisioningInfos []ConnectionProvisioningInfo `pulumi:"provisioningInfos"`
	// Indicates whether the connection is read-only. Change forces creation of a new resource.
	ReadOnly      *bool   `pulumi:"readOnly"`
	SecurableType *string `pulumi:"securableType"`
	// Time at which connection this was last modified, in epoch milliseconds.
	UpdatedAt *int `pulumi:"updatedAt"`
	// Username of user who last modified the connection.
	UpdatedBy *string `pulumi:"updatedBy"`
	// URL of the remote data source, extracted from options.
	Url *string `pulumi:"url"`
}

type ConnectionState struct {
	// Free-form text. Change forces creation of a new resource.
	Comment pulumi.StringPtrInput
	// Unique ID of the connection.
	ConnectionId pulumi.StringPtrInput
	// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
	ConnectionType pulumi.StringPtrInput
	// Time at which this connection was created, in epoch milliseconds.
	CreatedAt pulumi.IntPtrInput
	// Username of connection creator.
	CreatedBy pulumi.StringPtrInput
	// The type of credential for this connection.
	CredentialType pulumi.StringPtrInput
	// Full name of connection.
	FullName pulumi.StringPtrInput
	// Unique ID of the UC metastore for this connection.
	MetastoreId pulumi.StringPtrInput
	// Name of the Connection.
	Name pulumi.StringPtrInput
	// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
	Options pulumi.StringMapInput
	// Name of the connection owner.
	Owner pulumi.StringPtrInput
	// Free-form connection properties. Change forces creation of a new resource.
	Properties pulumi.StringMapInput
	// Object with the status of an asynchronously provisioned resource.
	ProvisioningInfos ConnectionProvisioningInfoArrayInput
	// Indicates whether the connection is read-only. Change forces creation of a new resource.
	ReadOnly      pulumi.BoolPtrInput
	SecurableType pulumi.StringPtrInput
	// Time at which connection this was last modified, in epoch milliseconds.
	UpdatedAt pulumi.IntPtrInput
	// Username of user who last modified the connection.
	UpdatedBy pulumi.StringPtrInput
	// URL of the remote data source, extracted from options.
	Url pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Free-form text. Change forces creation of a new resource.
	Comment *string `pulumi:"comment"`
	// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
	ConnectionType *string `pulumi:"connectionType"`
	// Name of the Connection.
	Name *string `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
	Options map[string]string `pulumi:"options"`
	// Name of the connection owner.
	Owner *string `pulumi:"owner"`
	// Free-form connection properties. Change forces creation of a new resource.
	Properties map[string]string `pulumi:"properties"`
	// Indicates whether the connection is read-only. Change forces creation of a new resource.
	ReadOnly *bool `pulumi:"readOnly"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Free-form text. Change forces creation of a new resource.
	Comment pulumi.StringPtrInput
	// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
	ConnectionType pulumi.StringPtrInput
	// Name of the Connection.
	Name pulumi.StringPtrInput
	// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
	Options pulumi.StringMapInput
	// Name of the connection owner.
	Owner pulumi.StringPtrInput
	// Free-form connection properties. Change forces creation of a new resource.
	Properties pulumi.StringMapInput
	// Indicates whether the connection is read-only. Change forces creation of a new resource.
	ReadOnly pulumi.BoolPtrInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// Free-form text. Change forces creation of a new resource.
func (o ConnectionOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Unique ID of the connection.
func (o ConnectionOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// Connection type. `MYSQL`, `POSTGRESQL`, `SNOWFLAKE`, `REDSHIFT` `SQLDW`, `SQLSERVER`, `DATABRICKS`, `SALESFORCE`, `BIGQUERY`, `WORKDAY_RAAS`, `HIVE_METASTORE`, `GA4_RAW_DATA`, `SERVICENOW`, `SALESFORCE_DATA_CLOUD`, `GLUE`, `ORACLE`, `TERADATA`, `HTTP` or `POWER_BI` are supported. Up-to-date list of connection type supported is in the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources). Change forces creation of a new resource.
func (o ConnectionOutput) ConnectionType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.ConnectionType }).(pulumi.StringPtrOutput)
}

// Time at which this connection was created, in epoch milliseconds.
func (o ConnectionOutput) CreatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Connection) pulumi.IntOutput { return v.CreatedAt }).(pulumi.IntOutput)
}

// Username of connection creator.
func (o ConnectionOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// The type of credential for this connection.
func (o ConnectionOutput) CredentialType() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.CredentialType }).(pulumi.StringOutput)
}

// Full name of connection.
func (o ConnectionOutput) FullName() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.FullName }).(pulumi.StringOutput)
}

// Unique ID of the UC metastore for this connection.
func (o ConnectionOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of the Connection.
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The key value of options required by the connection, e.g. `host`, `port`, `user`, `password`, `authorizationEndpoint`, `clientId`, `clientSecret` or `GoogleServiceAccountKeyJson`. Please consult the [documentation](https://docs.databricks.com/query-federation/index.html#supported-data-sources) for the required option.
func (o ConnectionOutput) Options() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.Options }).(pulumi.StringMapOutput)
}

// Name of the connection owner.
func (o ConnectionOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Free-form connection properties. Change forces creation of a new resource.
func (o ConnectionOutput) Properties() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.Properties }).(pulumi.StringMapOutput)
}

// Object with the status of an asynchronously provisioned resource.
func (o ConnectionOutput) ProvisioningInfos() ConnectionProvisioningInfoArrayOutput {
	return o.ApplyT(func(v *Connection) ConnectionProvisioningInfoArrayOutput { return v.ProvisioningInfos }).(ConnectionProvisioningInfoArrayOutput)
}

// Indicates whether the connection is read-only. Change forces creation of a new resource.
func (o ConnectionOutput) ReadOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.ReadOnly }).(pulumi.BoolOutput)
}

func (o ConnectionOutput) SecurableType() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.SecurableType }).(pulumi.StringOutput)
}

// Time at which connection this was last modified, in epoch milliseconds.
func (o ConnectionOutput) UpdatedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *Connection) pulumi.IntOutput { return v.UpdatedAt }).(pulumi.IntOutput)
}

// Username of user who last modified the connection.
func (o ConnectionOutput) UpdatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.UpdatedBy }).(pulumi.StringOutput)
}

// URL of the remote data source, extracted from options.
func (o ConnectionOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
