// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.LibraryArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.LibraryState;
import com.pulumi.databricks.outputs.LibraryCran;
import com.pulumi.databricks.outputs.LibraryMaven;
import com.pulumi.databricks.outputs.LibraryPypi;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It&#39;s possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.
 * 
 * &gt; This resource can only be used with a workspace-level provider!
 * 
 * &gt; `databricks.Library` resource would always start the associated cluster if it&#39;s not running, so make sure to have auto-termination configured. It&#39;s not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.
 * 
 * ## Plugin Framework Migration
 * 
 * The library resource has been migrated from sdkv2 to plugin framework。 If you encounter any problem with this resource and suspect it is due to the migration, you can fallback to sdkv2 by setting the environment variable in the following way `export USE_SDK_V2_RESOURCES=&#34;databricks.Library&#34;`.
 * 
 * ## Installing library on all clusters
 * 
 * You can install libraries on all clusters with the help of databricks.getClusters data resource:
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
 * import com.pulumi.databricks.inputs.GetClustersArgs;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryPypiArgs;
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
 *         final var all = DatabricksFunctions.getClusters(GetClustersArgs.builder()
 *             .build());
 * 
 *         final var cli = all.applyValue(getClustersResult -> {
 *             final var resources = new ArrayList<Library>();
 *             for (var range : KeyedValue.of(getClustersResult.ids())) {
 *                 var resource = new Library("cli-" + range.key(), LibraryArgs.builder()
 *                     .clusterId(range.key())
 *                     .pypi(LibraryPypiArgs.builder()
 *                         .package_("databricks-cli")
 *                         .build())
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
 * ## Java/Scala Maven
 * 
 * Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryMavenArgs;
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
 *         var deequ = new Library("deequ", LibraryArgs.builder()
 *             .clusterId(this_.id())
 *             .maven(LibraryMavenArgs.builder()
 *                 .coordinates("com.amazon.deequ:deequ:1.0.4")
 *                 .exclusions("org.apache.avro:avro")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Python PyPI
 * 
 * Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.
 * 
 * &gt; `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryPypiArgs;
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
 *         var fbprophet = new Library("fbprophet", LibraryArgs.builder()
 *             .clusterId(this_.id())
 *             .pypi(LibraryPypiArgs.builder()
 *                 .package_("fbprophet==0.6")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Python requirements files
 * 
 * Installing Python libraries listed in the `requirements.txt` file.  Only Workspace paths and Unity Catalog Volumes paths are supported.  Requires a cluster with DBR 15.0+.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
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
 *         var libraries = new Library("libraries", LibraryArgs.builder()
 *             .clusterId(this_.id())
 *             .requirements("/Workspace/path/to/requirements.txt")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## R CRan
 * 
 * Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryCranArgs;
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
 *         var rkeops = new Library("rkeops", LibraryArgs.builder()
 *             .clusterId(this_.id())
 *             .cran(LibraryCranArgs.builder()
 *                 .package_("rkeops")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.getClusters data to retrieve a list of databricks.Cluster ids.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all databricks.Cluster and databricks_job.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
 * * databricks.Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/aws/en/dlt).
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * !&gt; Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/library:Library")
public class Library extends com.pulumi.resources.CustomResource {
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="cran", refs={LibraryCran.class}, tree="[0]")
    private Output</* @Nullable */ LibraryCran> cran;

    public Output<Optional<LibraryCran>> cran() {
        return Codegen.optional(this.cran);
    }
    @Export(name="egg", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> egg;

    public Output<Optional<String>> egg() {
        return Codegen.optional(this.egg);
    }
    @Export(name="jar", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> jar;

    public Output<Optional<String>> jar() {
        return Codegen.optional(this.jar);
    }
    @Export(name="libraryId", refs={String.class}, tree="[0]")
    private Output<String> libraryId;

    public Output<String> libraryId() {
        return this.libraryId;
    }
    @Export(name="maven", refs={LibraryMaven.class}, tree="[0]")
    private Output</* @Nullable */ LibraryMaven> maven;

    public Output<Optional<LibraryMaven>> maven() {
        return Codegen.optional(this.maven);
    }
    @Export(name="pypi", refs={LibraryPypi.class}, tree="[0]")
    private Output</* @Nullable */ LibraryPypi> pypi;

    public Output<Optional<LibraryPypi>> pypi() {
        return Codegen.optional(this.pypi);
    }
    @Export(name="requirements", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> requirements;

    public Output<Optional<String>> requirements() {
        return Codegen.optional(this.requirements);
    }
    @Export(name="whl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> whl;

    public Output<Optional<String>> whl() {
        return Codegen.optional(this.whl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Library(java.lang.String name) {
        this(name, LibraryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Library(java.lang.String name, LibraryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Library(java.lang.String name, LibraryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/library:Library", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Library(java.lang.String name, Output<java.lang.String> id, @Nullable LibraryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/library:Library", name, state, makeResourceOptions(options, id), false);
    }

    private static LibraryArgs makeArgs(LibraryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LibraryArgs.Empty : args;
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
    public static Library get(java.lang.String name, Output<java.lang.String> id, @Nullable LibraryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Library(name, id, state, options);
    }
}
