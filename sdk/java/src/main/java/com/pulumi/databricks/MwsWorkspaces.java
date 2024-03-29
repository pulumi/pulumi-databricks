// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsWorkspacesArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsWorkspacesState;
import com.pulumi.databricks.outputs.MwsWorkspacesCloudResourceContainer;
import com.pulumi.databricks.outputs.MwsWorkspacesExternalCustomerInfo;
import com.pulumi.databricks.outputs.MwsWorkspacesGcpManagedNetworkConfig;
import com.pulumi.databricks.outputs.MwsWorkspacesGkeConfig;
import com.pulumi.databricks.outputs.MwsWorkspacesToken;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ### Creating a Databricks on AWS workspace
 * 
 * !Simplest multiworkspace
 * 
 * To get workspace running, you have to configure a couple of things:
 * 
 * * databricks.MwsCredentials - You can share a credentials (cross-account IAM role) configuration ID with multiple workspaces. It is not required to create a new one for each workspace.
 * * databricks.MwsStorageConfigurations - You can share a root S3 bucket with multiple workspaces in a single account. You do not have to create new ones for each workspace. If you share a root S3 bucket for multiple workspaces in an account, data on the root S3 bucket is partitioned into separate directories by workspace.
 * * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets or security groups with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
 * * databricks.MwsCustomerManagedKeys - You can share a customer-managed key across workspaces.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.MwsCredentials;
 * import com.pulumi.databricks.MwsCredentialsArgs;
 * import com.pulumi.databricks.MwsStorageConfigurations;
 * import com.pulumi.databricks.MwsStorageConfigurationsArgs;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
 * import com.pulumi.databricks.MwsWorkspaces;
 * import com.pulumi.databricks.MwsWorkspacesArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesTokenArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         var mws = new Provider(&#34;mws&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.cloud.databricks.com&#34;)
 *             .build());
 * 
 *         var thisMwsCredentials = new MwsCredentials(&#34;thisMwsCredentials&#34;, MwsCredentialsArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .credentialsName(String.format(&#34;%s-creds&#34;, var_.prefix()))
 *             .roleArn(var_.crossaccount_arn())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         var thisMwsStorageConfigurations = new MwsStorageConfigurations(&#34;thisMwsStorageConfigurations&#34;, MwsStorageConfigurationsArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .storageConfigurationName(String.format(&#34;%s-storage&#34;, var_.prefix()))
 *             .bucketName(var_.root_bucket())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         var thisMwsNetworks = new MwsNetworks(&#34;thisMwsNetworks&#34;, MwsNetworksArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .networkName(String.format(&#34;%s-network&#34;, var_.prefix()))
 *             .vpcId(var_.vpc_id())
 *             .subnetIds(var_.subnets_private())
 *             .securityGroupIds(var_.security_group())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         var thisMwsWorkspaces = new MwsWorkspaces(&#34;thisMwsWorkspaces&#34;, MwsWorkspacesArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .workspaceName(var_.prefix())
 *             .awsRegion(var_.region())
 *             .credentialsId(thisMwsCredentials.credentialsId())
 *             .storageConfigurationId(thisMwsStorageConfigurations.storageConfigurationId())
 *             .networkId(thisMwsNetworks.networkId())
 *             .token()
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         ctx.export(&#34;databricksToken&#34;, thisMwsWorkspaces.token().applyValue(token -&gt; token.tokenValue()));
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Creating a Databricks on AWS workspace with Databricks-Managed VPC
 * 
 * ![VPCs](https://docs.databricks.com/_images/customer-managed-vpc.png)
 * 
 * By default, Databricks creates a VPC in your AWS account for each workspace. Databricks uses it for running clusters in the workspace. Optionally, you can use your VPC for the workspace, using the feature customer-managed VPC. Databricks recommends that you provide your VPC with databricks.MwsNetworks so that you can configure it according to your organization’s enterprise cloud standards while still conforming to Databricks requirements. You cannot migrate an existing workspace to your VPC. Please see the difference described through IAM policy actions [on this page](https://docs.databricks.com/administration-guide/account-api/iam-role.html).
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.RandomString;
 * import com.pulumi.random.RandomStringArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetAwsAssumeRolePolicyArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.databricks.inputs.GetAwsCrossAccountPolicyArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
 * import com.pulumi.databricks.MwsCredentials;
 * import com.pulumi.databricks.MwsCredentialsArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketVersioningV2;
 * import com.pulumi.aws.s3.BucketVersioningV2Args;
 * import com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs;
 * import com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2;
 * import com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args;
 * import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs;
 * import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs;
 * import com.pulumi.aws.s3.BucketPublicAccessBlock;
 * import com.pulumi.aws.s3.BucketPublicAccessBlockArgs;
 * import com.pulumi.databricks.inputs.GetAwsBucketPolicyArgs;
 * import com.pulumi.aws.s3.BucketPolicy;
 * import com.pulumi.aws.s3.BucketPolicyArgs;
 * import com.pulumi.databricks.MwsStorageConfigurations;
 * import com.pulumi.databricks.MwsStorageConfigurationsArgs;
 * import com.pulumi.databricks.MwsWorkspaces;
 * import com.pulumi.databricks.MwsWorkspacesArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesTokenArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         var naming = new RandomString(&#34;naming&#34;, RandomStringArgs.builder()        
 *             .special(false)
 *             .upper(false)
 *             .length(6)
 *             .build());
 * 
 *         final var prefix = naming.result().applyValue(result -&gt; String.format(&#34;dltp%s&#34;, result));
 * 
 *         final var thisAwsAssumeRolePolicy = DatabricksFunctions.getAwsAssumeRolePolicy(GetAwsAssumeRolePolicyArgs.builder()
 *             .externalId(databricksAccountId)
 *             .build());
 * 
 *         var crossAccountRole = new Role(&#34;crossAccountRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(thisAwsAssumeRolePolicy.applyValue(getAwsAssumeRolePolicyResult -&gt; getAwsAssumeRolePolicyResult.json()))
 *             .tags(var_.tags())
 *             .build());
 * 
 *         final var thisAwsCrossAccountPolicy = DatabricksFunctions.getAwsCrossAccountPolicy();
 * 
 *         var thisRolePolicy = new RolePolicy(&#34;thisRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(crossAccountRole.id())
 *             .policy(thisAwsCrossAccountPolicy.applyValue(getAwsCrossAccountPolicyResult -&gt; getAwsCrossAccountPolicyResult.json()))
 *             .build());
 * 
 *         var thisMwsCredentials = new MwsCredentials(&#34;thisMwsCredentials&#34;, MwsCredentialsArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .credentialsName(String.format(&#34;%s-creds&#34;, prefix))
 *             .roleArn(crossAccountRole.arn())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         var rootStorageBucketBucketV2 = new BucketV2(&#34;rootStorageBucketBucketV2&#34;, BucketV2Args.builder()        
 *             .acl(&#34;private&#34;)
 *             .forceDestroy(true)
 *             .tags(var_.tags())
 *             .build());
 * 
 *         var rootVersioning = new BucketVersioningV2(&#34;rootVersioning&#34;, BucketVersioningV2Args.builder()        
 *             .bucket(rootStorageBucketBucketV2.id())
 *             .versioningConfiguration(BucketVersioningV2VersioningConfigurationArgs.builder()
 *                 .status(&#34;Disabled&#34;)
 *                 .build())
 *             .build());
 * 
 *         var rootStorageBucketBucketServerSideEncryptionConfigurationV2 = new BucketServerSideEncryptionConfigurationV2(&#34;rootStorageBucketBucketServerSideEncryptionConfigurationV2&#34;, BucketServerSideEncryptionConfigurationV2Args.builder()        
 *             .bucket(rootStorageBucketBucketV2.bucket())
 *             .rules(BucketServerSideEncryptionConfigurationV2RuleArgs.builder()
 *                 .applyServerSideEncryptionByDefault(BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs.builder()
 *                     .sseAlgorithm(&#34;AES256&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var rootStorageBucketBucketPublicAccessBlock = new BucketPublicAccessBlock(&#34;rootStorageBucketBucketPublicAccessBlock&#34;, BucketPublicAccessBlockArgs.builder()        
 *             .bucket(rootStorageBucketBucketV2.id())
 *             .blockPublicAcls(true)
 *             .blockPublicPolicy(true)
 *             .ignorePublicAcls(true)
 *             .restrictPublicBuckets(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(rootStorageBucketBucketV2)
 *                 .build());
 * 
 *         final var thisAwsBucketPolicy = DatabricksFunctions.getAwsBucketPolicy(GetAwsBucketPolicyArgs.builder()
 *             .bucket(rootStorageBucketBucketV2.bucket())
 *             .build());
 * 
 *         var rootBucketPolicy = new BucketPolicy(&#34;rootBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(rootStorageBucketBucketV2.id())
 *             .policy(thisAwsBucketPolicy.applyValue(getAwsBucketPolicyResult -&gt; getAwsBucketPolicyResult).applyValue(thisAwsBucketPolicy -&gt; thisAwsBucketPolicy.applyValue(getAwsBucketPolicyResult -&gt; getAwsBucketPolicyResult.json())))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(rootStorageBucketBucketPublicAccessBlock)
 *                 .build());
 * 
 *         var thisMwsStorageConfigurations = new MwsStorageConfigurations(&#34;thisMwsStorageConfigurations&#34;, MwsStorageConfigurationsArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .storageConfigurationName(String.format(&#34;%s-storage&#34;, prefix))
 *             .bucketName(rootStorageBucketBucketV2.bucket())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         var thisMwsWorkspaces = new MwsWorkspaces(&#34;thisMwsWorkspaces&#34;, MwsWorkspacesArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .workspaceName(prefix)
 *             .awsRegion(&#34;us-east-1&#34;)
 *             .credentialsId(thisMwsCredentials.credentialsId())
 *             .storageConfigurationId(thisMwsStorageConfigurations.storageConfigurationId())
 *             .token()
 *             .customTags(Map.of(&#34;SoldToCode&#34;, &#34;1234&#34;))
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *         ctx.export(&#34;databricksToken&#34;, thisMwsWorkspaces.token().applyValue(token -&gt; token.tokenValue()));
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * In order to create a [Databricks Workspace that leverages AWS PrivateLink](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) please ensure that you have read and understood the [Enable Private Link](https://docs.databricks.com/administration-guide/cloud-configurations/aws/privatelink.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mws_private_access_settings and mws_networks.
 * 
 * ### Creating a Databricks on GCP workspace
 * 
 * To get workspace running, you have to configure a network object:
 * 
 * * databricks.MwsNetworks - (optional, but recommended) You can share one [customer-managed VPC](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/customer-managed-vpc.html) with multiple workspaces in a single account. You do not have to create a new VPC for each workspace. However, you cannot reuse subnets with other resources, including other workspaces or non-Databricks resources. If you plan to share one VPC with multiple workspaces, be sure to size your VPC and subnets accordingly. Because a Databricks databricks.MwsNetworks encapsulates this information, you cannot reuse it across workspaces.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.MwsNetworks;
 * import com.pulumi.databricks.MwsNetworksArgs;
 * import com.pulumi.databricks.inputs.MwsNetworksGcpNetworkInfoArgs;
 * import com.pulumi.databricks.MwsWorkspaces;
 * import com.pulumi.databricks.MwsWorkspacesArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceContainerArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceContainerGcpArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesGkeConfigArgs;
 * import com.pulumi.databricks.inputs.MwsWorkspacesTokenArgs;
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
 *         final var databricksAccountId = config.get(&#34;databricksAccountId&#34;);
 *         final var databricksGoogleServiceAccount = config.get(&#34;databricksGoogleServiceAccount&#34;);
 *         final var googleProject = config.get(&#34;googleProject&#34;);
 *         var mws = new Provider(&#34;mws&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.gcp.databricks.com&#34;)
 *             .build());
 * 
 *         var thisMwsNetworks = new MwsNetworks(&#34;thisMwsNetworks&#34;, MwsNetworksArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .networkName(String.format(&#34;%s-network&#34;, var_.prefix()))
 *             .gcpNetworkInfo(MwsNetworksGcpNetworkInfoArgs.builder()
 *                 .networkProjectId(googleProject)
 *                 .vpcId(var_.vpc_id())
 *                 .subnetId(var_.subnet_id())
 *                 .subnetRegion(var_.subnet_region())
 *                 .podIpRangeName(&#34;pods&#34;)
 *                 .serviceIpRangeName(&#34;svc&#34;)
 *                 .build())
 *             .build());
 * 
 *         var thisMwsWorkspaces = new MwsWorkspaces(&#34;thisMwsWorkspaces&#34;, MwsWorkspacesArgs.builder()        
 *             .accountId(databricksAccountId)
 *             .workspaceName(var_.prefix())
 *             .location(var_.subnet_region())
 *             .cloudResourceContainer(MwsWorkspacesCloudResourceContainerArgs.builder()
 *                 .gcp(MwsWorkspacesCloudResourceContainerGcpArgs.builder()
 *                     .projectId(googleProject)
 *                     .build())
 *                 .build())
 *             .networkId(thisMwsNetworks.networkId())
 *             .gkeConfig(MwsWorkspacesGkeConfigArgs.builder()
 *                 .connectivityType(&#34;PRIVATE_NODE_PUBLIC_MASTER&#34;)
 *                 .masterIpRange(&#34;10.3.0.0/28&#34;)
 *                 .build())
 *             .token()
 *             .build());
 * 
 *         ctx.export(&#34;databricksToken&#34;, thisMwsWorkspaces.token().applyValue(token -&gt; token.tokenValue()));
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * In order to create a [Databricks Workspace that leverages GCP Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) please ensure that you have read and understood the [Enable Private Service Connect](https://docs.gcp.databricks.com/administration-guide/cloud-configurations/gcp/private-service-connect.html) documentation and then customise the example above with the relevant examples from mws_vpc_endpoint, mws_private_access_settings and mws_networks.
 * 
 */
@ResourceType(type="databricks:index/mwsWorkspaces:MwsWorkspaces")
public class MwsWorkspaces extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the top right corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * region of VPC.
     * 
     */
    @Export(name="awsRegion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> awsRegion;

    /**
     * @return region of VPC.
     * 
     */
    public Output<Optional<String>> awsRegion() {
        return Codegen.optional(this.awsRegion);
    }
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    public Output<String> cloud() {
        return this.cloud;
    }
    /**
     * A block that specifies GCP workspace configurations, consisting of following blocks:
     * 
     */
    @Export(name="cloudResourceContainer", refs={MwsWorkspacesCloudResourceContainer.class}, tree="[0]")
    private Output</* @Nullable */ MwsWorkspacesCloudResourceContainer> cloudResourceContainer;

    /**
     * @return A block that specifies GCP workspace configurations, consisting of following blocks:
     * 
     */
    public Output<Optional<MwsWorkspacesCloudResourceContainer>> cloudResourceContainer() {
        return Codegen.optional(this.cloudResourceContainer);
    }
    /**
     * (Integer) time when workspace was created
     * 
     */
    @Export(name="creationTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> creationTime;

    /**
     * @return (Integer) time when workspace was created
     * 
     */
    public Output<Integer> creationTime() {
        return this.creationTime;
    }
    @Export(name="credentialsId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> credentialsId;

    public Output<Optional<String>> credentialsId() {
        return Codegen.optional(this.credentialsId);
    }
    /**
     * The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `default_tags` or `custom_tags` on a cluster level. Please note it can take up to an hour for custom_tags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
     * 
     */
    @Export(name="customTags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> customTags;

    /**
     * @return The custom tags key-value pairing that is attached to this workspace. These tags will be applied to clusters automatically in addition to any `default_tags` or `custom_tags` on a cluster level. Please note it can take up to an hour for custom_tags to be set due to scheduling on Control Plane. After custom tags are applied, they can be modified however they can never be completely removed.
     * 
     */
    public Output<Optional<Map<String,Object>>> customTags() {
        return Codegen.optional(this.customTags);
    }
    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    @Export(name="customerManagedKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerManagedKeyId;

    public Output<Optional<String>> customerManagedKeyId() {
        return Codegen.optional(this.customerManagedKeyId);
    }
    /**
     * part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    @Export(name="deploymentName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentName;

    /**
     * @return part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    public Output<Optional<String>> deploymentName() {
        return Codegen.optional(this.deploymentName);
    }
    @Export(name="externalCustomerInfo", refs={MwsWorkspacesExternalCustomerInfo.class}, tree="[0]")
    private Output</* @Nullable */ MwsWorkspacesExternalCustomerInfo> externalCustomerInfo;

    public Output<Optional<MwsWorkspacesExternalCustomerInfo>> externalCustomerInfo() {
        return Codegen.optional(this.externalCustomerInfo);
    }
    @Export(name="gcpManagedNetworkConfig", refs={MwsWorkspacesGcpManagedNetworkConfig.class}, tree="[0]")
    private Output</* @Nullable */ MwsWorkspacesGcpManagedNetworkConfig> gcpManagedNetworkConfig;

    public Output<Optional<MwsWorkspacesGcpManagedNetworkConfig>> gcpManagedNetworkConfig() {
        return Codegen.optional(this.gcpManagedNetworkConfig);
    }
    /**
     * A block that specifies GKE configuration for the Databricks workspace:
     * 
     */
    @Export(name="gkeConfig", refs={MwsWorkspacesGkeConfig.class}, tree="[0]")
    private Output</* @Nullable */ MwsWorkspacesGkeConfig> gkeConfig;

    /**
     * @return A block that specifies GKE configuration for the Databricks workspace:
     * 
     */
    public Output<Optional<MwsWorkspacesGkeConfig>> gkeConfig() {
        return Codegen.optional(this.gkeConfig);
    }
    @Export(name="isNoPublicIpEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isNoPublicIpEnabled;

    public Output<Optional<Boolean>> isNoPublicIpEnabled() {
        return Codegen.optional(this.isNoPublicIpEnabled);
    }
    /**
     * region of the subnet.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return region of the subnet.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    @Export(name="managedServicesCustomerManagedKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> managedServicesCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    public Output<Optional<String>> managedServicesCustomerManagedKeyId() {
        return Codegen.optional(this.managedServicesCustomerManagedKeyId);
    }
    /**
     * `network_id` from networks.
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networkId;

    /**
     * @return `network_id` from networks.
     * 
     */
    public Output<Optional<String>> networkId() {
        return Codegen.optional(this.networkId);
    }
    @Export(name="pricingTier", refs={String.class}, tree="[0]")
    private Output<String> pricingTier;

    public Output<String> pricingTier() {
        return this.pricingTier;
    }
    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     * 
     */
    @Export(name="privateAccessSettingsId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account.
     * 
     */
    public Output<Optional<String>> privateAccessSettingsId() {
        return Codegen.optional(this.privateAccessSettingsId);
    }
    /**
     * `storage_configuration_id` from storage configuration.
     * 
     */
    @Export(name="storageConfigurationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageConfigurationId;

    /**
     * @return `storage_configuration_id` from storage configuration.
     * 
     */
    public Output<Optional<String>> storageConfigurationId() {
        return Codegen.optional(this.storageConfigurationId);
    }
    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
     * 
     */
    @Export(name="storageCustomerManagedKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `STORAGE`. This is used to encrypt the DBFS Storage &amp; Cluster Volumes.
     * 
     */
    public Output<Optional<String>> storageCustomerManagedKeyId() {
        return Codegen.optional(this.storageCustomerManagedKeyId);
    }
    @Export(name="token", refs={MwsWorkspacesToken.class}, tree="[0]")
    private Output</* @Nullable */ MwsWorkspacesToken> token;

    public Output<Optional<MwsWorkspacesToken>> token() {
        return Codegen.optional(this.token);
    }
    /**
     * (String) workspace id
     * 
     */
    @Export(name="workspaceId", refs={Integer.class}, tree="[0]")
    private Output<Integer> workspaceId;

    /**
     * @return (String) workspace id
     * 
     */
    public Output<Integer> workspaceId() {
        return this.workspaceId;
    }
    /**
     * name of the workspace, will appear on UI.
     * 
     */
    @Export(name="workspaceName", refs={String.class}, tree="[0]")
    private Output<String> workspaceName;

    /**
     * @return name of the workspace, will appear on UI.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }
    /**
     * (String) workspace status
     * 
     */
    @Export(name="workspaceStatus", refs={String.class}, tree="[0]")
    private Output<String> workspaceStatus;

    /**
     * @return (String) workspace status
     * 
     */
    public Output<String> workspaceStatus() {
        return this.workspaceStatus;
    }
    /**
     * (String) updates on workspace status
     * 
     */
    @Export(name="workspaceStatusMessage", refs={String.class}, tree="[0]")
    private Output<String> workspaceStatusMessage;

    /**
     * @return (String) updates on workspace status
     * 
     */
    public Output<String> workspaceStatusMessage() {
        return this.workspaceStatusMessage;
    }
    /**
     * (String) URL of the workspace
     * 
     */
    @Export(name="workspaceUrl", refs={String.class}, tree="[0]")
    private Output<String> workspaceUrl;

    /**
     * @return (String) URL of the workspace
     * 
     */
    public Output<String> workspaceUrl() {
        return this.workspaceUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsWorkspaces(String name) {
        this(name, MwsWorkspacesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsWorkspaces(String name, MwsWorkspacesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsWorkspaces(String name, MwsWorkspacesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsWorkspaces:MwsWorkspaces", name, args == null ? MwsWorkspacesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsWorkspaces(String name, Output<String> id, @Nullable MwsWorkspacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsWorkspaces:MwsWorkspaces", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "accountId"
            ))
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
    public static MwsWorkspaces get(String name, Output<String> id, @Nullable MwsWorkspacesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsWorkspaces(name, id, state, options);
    }
}
