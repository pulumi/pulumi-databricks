// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.GrantArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.GrantState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; This article refers to the privileges and inheritance model in Privilege Model version 1.0. If you created your metastore during the public preview (before August 25, 2022), you can upgrade to Privilege Model version 1.0 following [Upgrade to privilege inheritance](https://docs.databricks.com/data-governance/unity-catalog/hive-metastore.html)
 * 
 * &gt; Most of Unity Catalog APIs are only accessible via **workspace-level APIs**. This design may change in the future. Account-level principal grants can be assigned with any valid workspace as the Unity Catalog is decoupled from specific workspaces. More information in [the official documentation](https://docs.databricks.com/data-governance/unity-catalog/index.html).
 * 
 * In Unity Catalog all users initially have no access to data. Only Metastore Admins can create objects and can grant/revoke access on individual objects to users and groups. Every securable object in Unity Catalog has an owner. The owner can be any account-level user or group, called principals in general. The principal that creates an object becomes its owner. Owners receive `ALL_PRIVILEGES` on the securable object (e.g., `SELECT` and `MODIFY` on a table), as well as the permission to grant privileges to other principals.
 * 
 * Securable objects are hierarchical and privileges are inherited downward. The highest level object that privileges are inherited from is the catalog. This means that granting a privilege on a catalog or schema automatically grants the privilege to all current and future objects within the catalog or schema. Privileges that are granted on a metastore are not inherited.
 * 
 * Every `databricks.Grant` resource must have exactly one securable identifier and the following arguments:
 * 
 * - `principal` - User name, group name or service principal application ID.
 * - `privileges` - One or more privileges that are specific to a securable type.
 * 
 * For the latest list of privilege types that apply to each securable object in Unity Catalog, please refer to the [official documentation](https://docs.databricks.com/en/data-governance/unity-catalog/manage-privileges/privileges.html#privilege-types-by-securable-object-in-unity-catalog)
 * 
 * Pulumi will handle any configuration drift for the specified principal on every `pulumi up` run, even when grants are changed outside of Pulumi state.
 * 
 * See databricks.Grants for the list of privilege types that apply to each securable object.
 * 
 * ## Metastore grants
 * 
 * See databricks.Grants Metastore grants for the list of privileges that apply to Metastores.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var sandboxDataEngineers = new Grant("sandboxDataEngineers", GrantArgs.builder()
 *             .metastore("metastore_id")
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "CREATE_CATALOG",
 *                 "CREATE_EXTERNAL_LOCATION")
 *             .build());
 * 
 *         var sandboxDataSharer = new Grant("sandboxDataSharer", GrantArgs.builder()
 *             .metastore("metastore_id")
 *             .principal("Data Sharer")
 *             .privileges(            
 *                 "CREATE_RECIPIENT",
 *                 "CREATE_SHARE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Catalog grants
 * 
 * See databricks.Grants Catalog grants for the list of privileges that apply to Catalogs.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Catalog;
 * import com.pulumi.databricks.CatalogArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var sandbox = new Catalog("sandbox", CatalogArgs.builder()
 *             .name("sandbox")
 *             .comment("this catalog is managed by terraform")
 *             .properties(Map.of("purpose", "testing"))
 *             .build());
 * 
 *         var sandboxDataScientists = new Grant("sandboxDataScientists", GrantArgs.builder()
 *             .catalog(sandbox.name())
 *             .principal("Data Scientists")
 *             .privileges(            
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "CREATE_TABLE",
 *                 "SELECT")
 *             .build());
 * 
 *         var sandboxDataEngineers = new Grant("sandboxDataEngineers", GrantArgs.builder()
 *             .catalog(sandbox.name())
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "CREATE_SCHEMA",
 *                 "CREATE_TABLE",
 *                 "MODIFY")
 *             .build());
 * 
 *         var sandboxDataAnalyst = new Grant("sandboxDataAnalyst", GrantArgs.builder()
 *             .catalog(sandbox.name())
 *             .principal("Data Analyst")
 *             .privileges(            
 *                 "USE_CATALOG",
 *                 "USE_SCHEMA",
 *                 "SELECT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Schema grants
 * 
 * See databricks.Grants Schema grants for the list of privileges that apply to Schemas.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Schema;
 * import com.pulumi.databricks.SchemaArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var things = new Schema("things", SchemaArgs.builder()
 *             .catalogName(sandbox.id())
 *             .name("things")
 *             .comment("this schema is managed by terraform")
 *             .properties(Map.of("kind", "various"))
 *             .build());
 * 
 *         var thingsGrant = new Grant("thingsGrant", GrantArgs.builder()
 *             .schema(things.id())
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "USE_SCHEMA",
 *                 "MODIFY")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Table grants
 * 
 * See databricks.Grants Table grants for the list of privileges that apply to Tables.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var customersDataEngineers = new Grant("customersDataEngineers", GrantArgs.builder()
 *             .table("main.reporting.customers")
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "MODIFY",
 *                 "SELECT")
 *             .build());
 * 
 *         var customersDataAnalysts = new Grant("customersDataAnalysts", GrantArgs.builder()
 *             .table("main.reporting.customers")
 *             .principal("Data Analysts")
 *             .privileges("SELECT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * You can also apply grants dynamically with databricks.getTables data resource:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetTablesArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var things = DatabricksFunctions.getTables(GetTablesArgs.builder()
 *             .catalogName("sandbox")
 *             .schemaName("things")
 *             .build());
 * 
 *         final var thingsGrant = things.applyValue(getTablesResult -> {
 *             final var resources = new ArrayList<Grant>();
 *             for (var range : KeyedValue.of(getTablesResult.ids())) {
 *                 var resource = new Grant("thingsGrant-" + range.key(), GrantArgs.builder()
 *                     .table(range.value())
 *                     .principal("sensitive")
 *                     .privileges(                    
 *                         "SELECT",
 *                         "MODIFY")
 *                     .build());
 * 
 *                 resources.add(resource);
 *             }
 * 
 *             return resources;
 *         });
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## View grants
 * 
 * See databricks.Grants View grants for the list of privileges that apply to Views.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var customer360 = new Grant("customer360", GrantArgs.builder()
 *             .table("main.reporting.customer360")
 *             .principal("Data Analysts")
 *             .privileges("SELECT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * You can also apply grants dynamically with databricks.getViews data resource:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetViewsArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         final var customers = DatabricksFunctions.getViews(GetViewsArgs.builder()
 *             .catalogName("main")
 *             .schemaName("customers")
 *             .build());
 * 
 *         final var customersGrant = customers.applyValue(getViewsResult -> {
 *             final var resources = new ArrayList<Grant>();
 *             for (var range : KeyedValue.of(getViewsResult.ids())) {
 *                 var resource = new Grant("customersGrant-" + range.key(), GrantArgs.builder()
 *                     .table(range.value())
 *                     .principal("sensitive")
 *                     .privileges(                    
 *                         "SELECT",
 *                         "MODIFY")
 *                     .build());
 * 
 *                 resources.add(resource);
 *             }
 * 
 *             return resources;
 *         });
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Volume grants
 * 
 * See databricks.Grants Volume grants for the list of privileges that apply to Volumes.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Volume;
 * import com.pulumi.databricks.VolumeArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var this_ = new Volume("this", VolumeArgs.builder()
 *             .name("quickstart_volume")
 *             .catalogName(sandbox.name())
 *             .schemaName(things.name())
 *             .volumeType("EXTERNAL")
 *             .storageLocation(some.url())
 *             .comment("this volume is managed by terraform")
 *             .build());
 * 
 *         var volume = new Grant("volume", GrantArgs.builder()
 *             .volume(this_.id())
 *             .principal("Data Engineers")
 *             .privileges("WRITE_VOLUME")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Registered model grants
 * 
 * See databricks.Grants Registered model grants for the list of privileges that apply to Registered models.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var customersDataEngineers = new Grant("customersDataEngineers", GrantArgs.builder()
 *             .model("main.reporting.customer_model")
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "APPLY_TAG",
 *                 "EXECUTE")
 *             .build());
 * 
 *         var customersDataAnalysts = new Grant("customersDataAnalysts", GrantArgs.builder()
 *             .model("main.reporting.customer_model")
 *             .principal("Data Analysts")
 *             .privileges("EXECUTE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Function grants
 * 
 * See databricks.Grants Function grants for the list of privileges that apply to Registered models.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var udfDataEngineers = new Grant("udfDataEngineers", GrantArgs.builder()
 *             .function("main.reporting.udf")
 *             .principal("Data Engineers")
 *             .privileges("EXECUTE")
 *             .build());
 * 
 *         var udfDataAnalysts = new Grant("udfDataAnalysts", GrantArgs.builder()
 *             .function("main.reporting.udf")
 *             .principal("Data Analysts")
 *             .privileges("EXECUTE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Service credential grants
 * 
 * See databricks.Grants Service credential grants for the list of privileges that apply to Service credentials.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Credential;
 * import com.pulumi.databricks.CredentialArgs;
 * import com.pulumi.databricks.inputs.CredentialAwsIamRoleArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var external = new Credential("external", CredentialArgs.builder()
 *             .name(externalDataAccess.name())
 *             .awsIamRole(CredentialAwsIamRoleArgs.builder()
 *                 .roleArn(externalDataAccess.arn())
 *                 .build())
 *             .purpose("SERVICE")
 *             .comment("Managed by TF")
 *             .build());
 * 
 *         var externalCreds = new Grant("externalCreds", GrantArgs.builder()
 *             .credential(external.id())
 *             .principal("Data Engineers")
 *             .privileges("ACCESS")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Storage credential grants
 * 
 * See databricks.Grants Storage credential grants for the list of privileges that apply to Storage credentials.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.StorageCredential;
 * import com.pulumi.databricks.StorageCredentialArgs;
 * import com.pulumi.databricks.inputs.StorageCredentialAwsIamRoleArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var external = new StorageCredential("external", StorageCredentialArgs.builder()
 *             .name(externalDataAccess.name())
 *             .awsIamRole(StorageCredentialAwsIamRoleArgs.builder()
 *                 .roleArn(externalDataAccess.arn())
 *                 .build())
 *             .comment("Managed by TF")
 *             .build());
 * 
 *         var externalCreds = new Grant("externalCreds", GrantArgs.builder()
 *             .storageCredential(external.id())
 *             .principal("Data Engineers")
 *             .privileges("CREATE_EXTERNAL_TABLE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## External location grants
 * 
 * See databricks.Grants External location grants for the list of privileges that apply to External locations.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ExternalLocation;
 * import com.pulumi.databricks.ExternalLocationArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var some = new ExternalLocation("some", ExternalLocationArgs.builder()
 *             .name("external")
 *             .url(String.format("s3://%s/some", externalAwsS3Bucket.id()))
 *             .credentialName(external.id())
 *             .comment("Managed by TF")
 *             .build());
 * 
 *         var someDataEngineers = new Grant("someDataEngineers", GrantArgs.builder()
 *             .externalLocation(some.id())
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "CREATE_EXTERNAL_TABLE",
 *                 "READ_FILES")
 *             .build());
 * 
 *         var someServicePrincipal = new Grant("someServicePrincipal", GrantArgs.builder()
 *             .externalLocation(some.id())
 *             .principal(mySp.applicationId())
 *             .privileges(            
 *                 "USE_SCHEMA",
 *                 "MODIFY")
 *             .build());
 * 
 *         var someGroup = new Grant("someGroup", GrantArgs.builder()
 *             .externalLocation(some.id())
 *             .principal(myGroup.displayName())
 *             .privileges(            
 *                 "USE_SCHEMA",
 *                 "MODIFY")
 *             .build());
 * 
 *         var someUser = new Grant("someUser", GrantArgs.builder()
 *             .externalLocation(some.id())
 *             .principal(myUser.userName())
 *             .privileges(            
 *                 "USE_SCHEMA",
 *                 "MODIFY")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Connection grants
 * 
 * See databricks.Grants Connection grants for the list of privileges that apply to Connections.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Connection;
 * import com.pulumi.databricks.ConnectionArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var mysql = new Connection("mysql", ConnectionArgs.builder()
 *             .name("mysql_connection")
 *             .connectionType("MYSQL")
 *             .comment("this is a connection to mysql db")
 *             .options(Map.ofEntries(
 *                 Map.entry("host", "test.mysql.database.azure.com"),
 *                 Map.entry("port", "3306"),
 *                 Map.entry("user", "user"),
 *                 Map.entry("password", "password")
 *             ))
 *             .properties(Map.of("purpose", "testing"))
 *             .build());
 * 
 *         var some = new Grant("some", GrantArgs.builder()
 *             .foreignConnection(mysql.name())
 *             .principal("Data Engineers")
 *             .privileges(            
 *                 "CREATE_FOREIGN_CATALOG",
 *                 "USE_CONNECTION")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Delta Sharing share grants
 * 
 * See databricks.Grants Delta Sharing share grants for the list of privileges that apply to Delta Sharing shares.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Share;
 * import com.pulumi.databricks.ShareArgs;
 * import com.pulumi.databricks.Recipient;
 * import com.pulumi.databricks.RecipientArgs;
 * import com.pulumi.databricks.Grant;
 * import com.pulumi.databricks.GrantArgs;
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
 *         var some = new Share("some", ShareArgs.builder()
 *             .name("my_share")
 *             .build());
 * 
 *         var someRecipient = new Recipient("someRecipient", RecipientArgs.builder()
 *             .name("my_recipient")
 *             .build());
 * 
 *         var someGrant = new Grant("someGrant", GrantArgs.builder()
 *             .share(some.name())
 *             .principal(someRecipient.name())
 *             .privileges("SELECT")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Other access control
 * 
 * You can control Databricks General Permissions through databricks.Permissions resource.
 * 
 * ## Import
 * 
 * The resource can be imported using combination of securable type (`table`, `catalog`, `foreign_connection`, ...), it&#39;s name and `principal`:
 * 
 * hcl
 * 
 * import {
 * 
 *   to = databricks_grant.this
 * 
 *   id = &#34;&lt;securable_type&gt;/&lt;securable_name&gt;/&lt;principal&gt;&#34;
 * 
 * }
 * 
 * Alternatively, when using `terraform` version 1.4 or earlier, import using the `pulumi import` command:
 * 
 * bash
 * 
 * ```sh
 * $ pulumi import databricks:index/grant:Grant this &lt;securable_type&gt;/&lt;securable_name&gt;/&lt;principal&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/grant:Grant")
public class Grant extends com.pulumi.resources.CustomResource {
    @Export(name="catalog", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> catalog;

    public Output<Optional<String>> catalog() {
        return Codegen.optional(this.catalog);
    }
    @Export(name="credential", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> credential;

    public Output<Optional<String>> credential() {
        return Codegen.optional(this.credential);
    }
    @Export(name="externalLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> externalLocation;

    public Output<Optional<String>> externalLocation() {
        return Codegen.optional(this.externalLocation);
    }
    @Export(name="foreignConnection", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> foreignConnection;

    public Output<Optional<String>> foreignConnection() {
        return Codegen.optional(this.foreignConnection);
    }
    @Export(name="function", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> function;

    public Output<Optional<String>> function() {
        return Codegen.optional(this.function);
    }
    @Export(name="metastore", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> metastore;

    public Output<Optional<String>> metastore() {
        return Codegen.optional(this.metastore);
    }
    @Export(name="model", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> model;

    public Output<Optional<String>> model() {
        return Codegen.optional(this.model);
    }
    @Export(name="pipeline", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pipeline;

    public Output<Optional<String>> pipeline() {
        return Codegen.optional(this.pipeline);
    }
    @Export(name="principal", refs={String.class}, tree="[0]")
    private Output<String> principal;

    public Output<String> principal() {
        return this.principal;
    }
    @Export(name="privileges", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> privileges;

    public Output<List<String>> privileges() {
        return this.privileges;
    }
    @Export(name="recipient", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> recipient;

    public Output<Optional<String>> recipient() {
        return Codegen.optional(this.recipient);
    }
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schema;

    public Output<Optional<String>> schema() {
        return Codegen.optional(this.schema);
    }
    @Export(name="share", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> share;

    public Output<Optional<String>> share() {
        return Codegen.optional(this.share);
    }
    @Export(name="storageCredential", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storageCredential;

    public Output<Optional<String>> storageCredential() {
        return Codegen.optional(this.storageCredential);
    }
    @Export(name="table", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> table;

    public Output<Optional<String>> table() {
        return Codegen.optional(this.table);
    }
    @Export(name="volume", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volume;

    public Output<Optional<String>> volume() {
        return Codegen.optional(this.volume);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Grant(java.lang.String name) {
        this(name, GrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Grant(java.lang.String name, GrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Grant(java.lang.String name, GrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/grant:Grant", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Grant(java.lang.String name, Output<java.lang.String> id, @Nullable GrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/grant:Grant", name, state, makeResourceOptions(options, id), false);
    }

    private static GrantArgs makeArgs(GrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GrantArgs.Empty : args;
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
    public static Grant get(java.lang.String name, Output<java.lang.String> id, @Nullable GrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Grant(name, id, state, options);
    }
}
