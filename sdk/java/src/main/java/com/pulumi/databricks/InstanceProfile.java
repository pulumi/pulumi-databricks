// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.InstanceProfileArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.InstanceProfileState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating a new `databricks.InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).
 * 
 * &gt; This resource can only be used with a workspace-level provider!
 * 
 * &gt; Please switch to databricks.StorageCredential with Unity Catalog to manage storage credentials, which provides a better and faster way for managing credential security.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetSparkVersionArgs;
 * import com.pulumi.databricks.inputs.GetNodeTypeArgs;
 * import com.pulumi.databricks.Cluster;
 * import com.pulumi.databricks.ClusterArgs;
 * import com.pulumi.databricks.inputs.ClusterAutoscaleArgs;
 * import com.pulumi.databricks.inputs.ClusterAwsAttributesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var crossaccountRoleName = config.get("crossaccountRoleName");
 *         final var assumeRoleForEc2 = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .actions("sts:AssumeRole")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers("ec2.amazonaws.com")
 *                     .type("Service")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var roleForS3Access = new Role("roleForS3Access", RoleArgs.builder()
 *             .name("shared-ec2-role-for-s3")
 *             .description("Role for shared access")
 *             .assumeRolePolicy(assumeRoleForEc2.json())
 *             .build());
 * 
 *         final var passRoleForS3Access = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect("Allow")
 *                 .actions("iam:PassRole")
 *                 .resources(roleForS3Access.arn())
 *                 .build())
 *             .build());
 * 
 *         var passRoleForS3AccessPolicy = new Policy("passRoleForS3AccessPolicy", PolicyArgs.builder()
 *             .name("shared-pass-role-for-s3-access")
 *             .path("/")
 *             .policy(passRoleForS3Access.applyValue(_passRoleForS3Access -> _passRoleForS3Access.json()))
 *             .build());
 * 
 *         var crossAccount = new RolePolicyAttachment("crossAccount", RolePolicyAttachmentArgs.builder()
 *             .policyArn(passRoleForS3AccessPolicy.arn())
 *             .role(crossaccountRoleName)
 *             .build());
 * 
 *         var shared = new com.pulumi.aws.iam.InstanceProfile("shared", com.pulumi.aws.iam.InstanceProfileArgs.builder()
 *             .name("shared-instance-profile")
 *             .role(roleForS3Access.name())
 *             .build());
 * 
 *         var sharedInstanceProfile = new com.pulumi.databricks.InstanceProfile("sharedInstanceProfile", com.pulumi.databricks.InstanceProfileArgs.builder()
 *             .instanceProfileArn(shared.arn())
 *             .build());
 * 
 *         final var latest = DatabricksFunctions.getSparkVersion(GetSparkVersionArgs.builder()
 *             .build());
 * 
 *         final var smallest = DatabricksFunctions.getNodeType(GetNodeTypeArgs.builder()
 *             .localDisk(true)
 *             .build());
 * 
 *         var this_ = new Cluster("this", ClusterArgs.builder()
 *             .clusterName("Shared Autoscaling")
 *             .sparkVersion(latest.id())
 *             .nodeTypeId(smallest.id())
 *             .autoterminationMinutes(20)
 *             .autoscale(ClusterAutoscaleArgs.builder()
 *                 .minWorkers(1)
 *                 .maxWorkers(50)
 *                 .build())
 *             .awsAttributes(ClusterAwsAttributesArgs.builder()
 *                 .instanceProfileArn(sharedInstanceProfile.id())
 *                 .availability("SPOT")
 *                 .zoneId("us-east-1")
 *                 .firstOnDemand(1)
 *                 .spotBidPricePercent(100)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Usage with Cluster Policies
 * 
 * It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `databricks.Cluster` above could be replaced with `databricks.ClusterPolicy`:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ClusterPolicy;
 * import com.pulumi.databricks.ClusterPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new ClusterPolicy("this", ClusterPolicyArgs.builder()
 *             .name("Policy with predefined instance profile")
 *             .definition(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("aws_attributes.instance_profile_arn", jsonObject(
 *                         jsonProperty("type", "fixed"),
 *                         jsonProperty("value", shared.id())
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Granting access to all users
 * 
 * You can make instance profile available to all users by associating it with the special group called `users` through databricks.Group data source.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.GroupInstanceProfile;
 * import com.pulumi.databricks.GroupInstanceProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new InstanceProfile("this", InstanceProfileArgs.builder()
 *             .instanceProfileArn(shared.id())
 *             .build());
 * 
 *         final var users = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName("users")
 *             .build());
 * 
 *         var all = new GroupInstanceProfile("all", GroupInstanceProfileArgs.builder()
 *             .groupId(users.id())
 *             .instanceProfileId(this_.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Usage with Databricks SQL serverless
 * 
 * When the instance profile ARN and its associated IAM role ARN don&#39;t match and the instance profile is intended for use with Databricks SQL serverless, the `iam_role_arn` parameter can be specified.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var sqlServerlessAssumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions("sts:AssumeRole")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("AWS")
 *                     .identifiers("arn:aws:iam::790110701330:role/serverless-customer-resource-role")
 *                     .build())
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test("StringEquals")
 *                     .variable("sts:ExternalID")
 *                     .values(                    
 *                         "databricks-serverless-<YOUR_WORKSPACE_ID1>",
 *                         "databricks-serverless-<YOUR_WORKSPACE_ID2>")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var this_ = new Role("this", RoleArgs.builder()
 *             .name("my-databricks-sql-serverless-role")
 *             .assumeRolePolicy(sqlServerlessAssumeRole.json())
 *             .build());
 * 
 *         var thisInstanceProfile = new com.pulumi.aws.iam.InstanceProfile("thisInstanceProfile", com.pulumi.aws.iam.InstanceProfileArgs.builder()
 *             .name("my-databricks-sql-serverless-instance-profile")
 *             .role(this_.name())
 *             .build());
 * 
 *         var thisInstanceProfile2 = new com.pulumi.databricks.InstanceProfile("thisInstanceProfile2", com.pulumi.databricks.InstanceProfileArgs.builder()
 *             .instanceProfileArn(thisInstanceProfile.arn())
 *             .iamRoleArn(this_.arn())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * The resource instance profile can be imported using the ARN of it
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_instance_profile.this
 * 
 *   id = &#34;&lt;instance-profile-arn&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/instanceProfile:InstanceProfile this &lt;instance-profile-arn&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/instanceProfile:InstanceProfile")
public class InstanceProfile extends com.pulumi.resources.CustomResource {
    /**
     * The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    @Export(name="iamRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamRoleArn;

    /**
     * @return The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    public Output<Optional<String>> iamRoleArn() {
        return Codegen.optional(this.iamRoleArn);
    }
    /**
     * `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    @Export(name="instanceProfileArn", refs={String.class}, tree="[0]")
    private Output<String> instanceProfileArn;

    /**
     * @return `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    public Output<String> instanceProfileArn() {
        return this.instanceProfileArn;
    }
    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    @Export(name="isMetaInstanceProfile", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isMetaInstanceProfile;

    /**
     * @return Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    public Output<Optional<Boolean>> isMetaInstanceProfile() {
        return Codegen.optional(this.isMetaInstanceProfile);
    }
    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> skipValidation;

    /**
     * @return **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    public Output<Boolean> skipValidation() {
        return this.skipValidation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(java.lang.String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(java.lang.String name, InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(java.lang.String name, InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instanceProfile:InstanceProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InstanceProfile(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceProfileArgs makeArgs(InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceProfileArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
