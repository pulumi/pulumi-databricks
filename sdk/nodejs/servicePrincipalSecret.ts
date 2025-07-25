// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource you can create a secret for a given [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html).
 *
 * > This resource can only be used with an account-level provider!
 *
 * This secret can be used to configure the Databricks Pulumi Provider to authenticate with the service principal. See Authenticating with service principal.
 *
 * Additionally, the secret can be used to request OAuth tokens for the service principal, which can be used to authenticate to Databricks REST APIs. See [Authentication using OAuth tokens for service principals](https://docs.databricks.com/dev-tools/authentication-oauth.html).
 *
 * ## Example Usage
 *
 * Create service principal secret
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const terraformSp = new databricks.ServicePrincipalSecret("terraform_sp", {servicePrincipalId: _this.id});
 * ```
 *
 * A secret can be automatically rotated by taking a dependency on the `timeRotating` resource:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 * import * as time from "@pulumiverse/time";
 *
 * const _this = new time.Rotating("this", {rotationDays: 30});
 * const terraformSp = new databricks.ServicePrincipalSecret("terraform_sp", {
 *     servicePrincipalId: thisDatabricksServicePrincipal.id,
 *     timeRotating: pulumi.interpolate`Pulumi (created: ${_this.rfc3339})`,
 * });
 * ```
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * databricks.ServicePrincipal to manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) in Databricks
 */
export class ServicePrincipalSecret extends pulumi.CustomResource {
    /**
     * Get an existing ServicePrincipalSecret resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServicePrincipalSecretState, opts?: pulumi.CustomResourceOptions): ServicePrincipalSecret {
        return new ServicePrincipalSecret(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/servicePrincipalSecret:ServicePrincipalSecret';

    /**
     * Returns true if the given object is an instance of ServicePrincipalSecret.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServicePrincipalSecret {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServicePrincipalSecret.__pulumiType;
    }

    /**
     * UTC time when the secret was created.
     */
    public readonly createTime!: pulumi.Output<string>;
    /**
     * UTC time when the secret will expire. If the field is not present, the secret does not expire.
     */
    public readonly expireTime!: pulumi.Output<string>;
    /**
     * The lifetime of the secret in seconds formatted as `NNNNs`. If this parameter is not provided, the secret will have a default lifetime of 730 days (`63072000s`).  Expiration of secret will lead to generation of new secret.
     */
    public readonly lifetime!: pulumi.Output<string>;
    /**
     * **Sensitive** Generated secret for the service principal.
     */
    public readonly secret!: pulumi.Output<string>;
    /**
     * Secret Hash.
     */
    public readonly secretHash!: pulumi.Output<string>;
    /**
     * SCIM ID of the databricks.ServicePrincipal (not application ID).
     */
    public readonly servicePrincipalId!: pulumi.Output<string>;
    /**
     * Status of the secret (i.e., `ACTIVE` - see [REST API docs for full list](https://docs.databricks.com/api/account/serviceprincipalsecrets/list#secrets-status)).
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * Changing this argument forces recreation of the secret.
     */
    public readonly timeRotating!: pulumi.Output<string | undefined>;
    /**
     * UTC time when the secret was updated.
     */
    public readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a ServicePrincipalSecret resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServicePrincipalSecretArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServicePrincipalSecretArgs | ServicePrincipalSecretState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServicePrincipalSecretState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["expireTime"] = state ? state.expireTime : undefined;
            resourceInputs["lifetime"] = state ? state.lifetime : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["secretHash"] = state ? state.secretHash : undefined;
            resourceInputs["servicePrincipalId"] = state ? state.servicePrincipalId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeRotating"] = state ? state.timeRotating : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ServicePrincipalSecretArgs | undefined;
            if ((!args || args.servicePrincipalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'servicePrincipalId'");
            }
            resourceInputs["createTime"] = args ? args.createTime : undefined;
            resourceInputs["expireTime"] = args ? args.expireTime : undefined;
            resourceInputs["lifetime"] = args ? args.lifetime : undefined;
            resourceInputs["secret"] = args?.secret ? pulumi.secret(args.secret) : undefined;
            resourceInputs["secretHash"] = args ? args.secretHash : undefined;
            resourceInputs["servicePrincipalId"] = args ? args.servicePrincipalId : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["timeRotating"] = args ? args.timeRotating : undefined;
            resourceInputs["updateTime"] = args ? args.updateTime : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ServicePrincipalSecret.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServicePrincipalSecret resources.
 */
export interface ServicePrincipalSecretState {
    /**
     * UTC time when the secret was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * UTC time when the secret will expire. If the field is not present, the secret does not expire.
     */
    expireTime?: pulumi.Input<string>;
    /**
     * The lifetime of the secret in seconds formatted as `NNNNs`. If this parameter is not provided, the secret will have a default lifetime of 730 days (`63072000s`).  Expiration of secret will lead to generation of new secret.
     */
    lifetime?: pulumi.Input<string>;
    /**
     * **Sensitive** Generated secret for the service principal.
     */
    secret?: pulumi.Input<string>;
    /**
     * Secret Hash.
     */
    secretHash?: pulumi.Input<string>;
    /**
     * SCIM ID of the databricks.ServicePrincipal (not application ID).
     */
    servicePrincipalId?: pulumi.Input<string>;
    /**
     * Status of the secret (i.e., `ACTIVE` - see [REST API docs for full list](https://docs.databricks.com/api/account/serviceprincipalsecrets/list#secrets-status)).
     */
    status?: pulumi.Input<string>;
    /**
     * Changing this argument forces recreation of the secret.
     */
    timeRotating?: pulumi.Input<string>;
    /**
     * UTC time when the secret was updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServicePrincipalSecret resource.
 */
export interface ServicePrincipalSecretArgs {
    /**
     * UTC time when the secret was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * UTC time when the secret will expire. If the field is not present, the secret does not expire.
     */
    expireTime?: pulumi.Input<string>;
    /**
     * The lifetime of the secret in seconds formatted as `NNNNs`. If this parameter is not provided, the secret will have a default lifetime of 730 days (`63072000s`).  Expiration of secret will lead to generation of new secret.
     */
    lifetime?: pulumi.Input<string>;
    /**
     * **Sensitive** Generated secret for the service principal.
     */
    secret?: pulumi.Input<string>;
    /**
     * Secret Hash.
     */
    secretHash?: pulumi.Input<string>;
    /**
     * SCIM ID of the databricks.ServicePrincipal (not application ID).
     */
    servicePrincipalId: pulumi.Input<string>;
    /**
     * Status of the secret (i.e., `ACTIVE` - see [REST API docs for full list](https://docs.databricks.com/api/account/serviceprincipalsecrets/list#secrets-status)).
     */
    status?: pulumi.Input<string>;
    /**
     * Changing this argument forces recreation of the secret.
     */
    timeRotating?: pulumi.Input<string>;
    /**
     * UTC time when the secret was updated.
     */
    updateTime?: pulumi.Input<string>;
}
