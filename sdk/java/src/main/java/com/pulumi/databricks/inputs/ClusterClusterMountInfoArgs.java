// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterMountInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterMountInfoArgs Empty = new ClusterClusterMountInfoArgs();

    /**
     * path inside the Spark container.
     * 
     * For example, you can mount Azure Data Lake Storage container using the following code:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Cluster;
     * import com.pulumi.databricks.ClusterArgs;
     * import com.pulumi.databricks.inputs.ClusterClusterMountInfoArgs;
     * import com.pulumi.databricks.inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs;
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
     *         final var storageAccount = "ewfw3ggwegwg";
     * 
     *         final var storageContainer = "test";
     * 
     *         var withNfs = new Cluster("withNfs", ClusterArgs.builder()        
     *             .clusterMountInfos(ClusterClusterMountInfoArgs.builder()
     *                 .networkFilesystemInfo(ClusterClusterMountInfoNetworkFilesystemInfoArgs.builder()
     *                     .serverAddress(String.format("%s.blob.core.windows.net", storageAccount))
     *                     .mountOptions("sec=sys,vers=3,nolock,proto=tcp")
     *                     .build())
     *                 .remoteMountDirPath(String.format("%s/%s", storageAccount,storageContainer))
     *                 .localMountDirPath("/mnt/nfs-test")
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    @Import(name="localMountDirPath", required=true)
    private Output<String> localMountDirPath;

    /**
     * @return path inside the Spark container.
     * 
     * For example, you can mount Azure Data Lake Storage container using the following code:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.databricks.Cluster;
     * import com.pulumi.databricks.ClusterArgs;
     * import com.pulumi.databricks.inputs.ClusterClusterMountInfoArgs;
     * import com.pulumi.databricks.inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs;
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
     *         final var storageAccount = "ewfw3ggwegwg";
     * 
     *         final var storageContainer = "test";
     * 
     *         var withNfs = new Cluster("withNfs", ClusterArgs.builder()        
     *             .clusterMountInfos(ClusterClusterMountInfoArgs.builder()
     *                 .networkFilesystemInfo(ClusterClusterMountInfoNetworkFilesystemInfoArgs.builder()
     *                     .serverAddress(String.format("%s.blob.core.windows.net", storageAccount))
     *                     .mountOptions("sec=sys,vers=3,nolock,proto=tcp")
     *                     .build())
     *                 .remoteMountDirPath(String.format("%s/%s", storageAccount,storageContainer))
     *                 .localMountDirPath("/mnt/nfs-test")
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public Output<String> localMountDirPath() {
        return this.localMountDirPath;
    }

    /**
     * block specifying connection. It consists of:
     * 
     */
    @Import(name="networkFilesystemInfo", required=true)
    private Output<ClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo;

    /**
     * @return block specifying connection. It consists of:
     * 
     */
    public Output<ClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo() {
        return this.networkFilesystemInfo;
    }

    /**
     * string specifying path to mount on the remote service.
     * 
     */
    @Import(name="remoteMountDirPath")
    private @Nullable Output<String> remoteMountDirPath;

    /**
     * @return string specifying path to mount on the remote service.
     * 
     */
    public Optional<Output<String>> remoteMountDirPath() {
        return Optional.ofNullable(this.remoteMountDirPath);
    }

    private ClusterClusterMountInfoArgs() {}

    private ClusterClusterMountInfoArgs(ClusterClusterMountInfoArgs $) {
        this.localMountDirPath = $.localMountDirPath;
        this.networkFilesystemInfo = $.networkFilesystemInfo;
        this.remoteMountDirPath = $.remoteMountDirPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterMountInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterMountInfoArgs $;

        public Builder() {
            $ = new ClusterClusterMountInfoArgs();
        }

        public Builder(ClusterClusterMountInfoArgs defaults) {
            $ = new ClusterClusterMountInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localMountDirPath path inside the Spark container.
         * 
         * For example, you can mount Azure Data Lake Storage container using the following code:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Cluster;
         * import com.pulumi.databricks.ClusterArgs;
         * import com.pulumi.databricks.inputs.ClusterClusterMountInfoArgs;
         * import com.pulumi.databricks.inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs;
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
         *         final var storageAccount = "ewfw3ggwegwg";
         * 
         *         final var storageContainer = "test";
         * 
         *         var withNfs = new Cluster("withNfs", ClusterArgs.builder()        
         *             .clusterMountInfos(ClusterClusterMountInfoArgs.builder()
         *                 .networkFilesystemInfo(ClusterClusterMountInfoNetworkFilesystemInfoArgs.builder()
         *                     .serverAddress(String.format("%s.blob.core.windows.net", storageAccount))
         *                     .mountOptions("sec=sys,vers=3,nolock,proto=tcp")
         *                     .build())
         *                 .remoteMountDirPath(String.format("%s/%s", storageAccount,storageContainer))
         *                 .localMountDirPath("/mnt/nfs-test")
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder localMountDirPath(Output<String> localMountDirPath) {
            $.localMountDirPath = localMountDirPath;
            return this;
        }

        /**
         * @param localMountDirPath path inside the Spark container.
         * 
         * For example, you can mount Azure Data Lake Storage container using the following code:
         * 
         * &lt;!--Start PulumiCodeChooser --&gt;
         * <pre>
         * {@code
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.databricks.Cluster;
         * import com.pulumi.databricks.ClusterArgs;
         * import com.pulumi.databricks.inputs.ClusterClusterMountInfoArgs;
         * import com.pulumi.databricks.inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs;
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
         *         final var storageAccount = "ewfw3ggwegwg";
         * 
         *         final var storageContainer = "test";
         * 
         *         var withNfs = new Cluster("withNfs", ClusterArgs.builder()        
         *             .clusterMountInfos(ClusterClusterMountInfoArgs.builder()
         *                 .networkFilesystemInfo(ClusterClusterMountInfoNetworkFilesystemInfoArgs.builder()
         *                     .serverAddress(String.format("%s.blob.core.windows.net", storageAccount))
         *                     .mountOptions("sec=sys,vers=3,nolock,proto=tcp")
         *                     .build())
         *                 .remoteMountDirPath(String.format("%s/%s", storageAccount,storageContainer))
         *                 .localMountDirPath("/mnt/nfs-test")
         *                 .build())
         *             .build());
         * 
         *     }
         * }
         * }
         * </pre>
         * &lt;!--End PulumiCodeChooser --&gt;
         * 
         * @return builder
         * 
         */
        public Builder localMountDirPath(String localMountDirPath) {
            return localMountDirPath(Output.of(localMountDirPath));
        }

        /**
         * @param networkFilesystemInfo block specifying connection. It consists of:
         * 
         * @return builder
         * 
         */
        public Builder networkFilesystemInfo(Output<ClusterClusterMountInfoNetworkFilesystemInfoArgs> networkFilesystemInfo) {
            $.networkFilesystemInfo = networkFilesystemInfo;
            return this;
        }

        /**
         * @param networkFilesystemInfo block specifying connection. It consists of:
         * 
         * @return builder
         * 
         */
        public Builder networkFilesystemInfo(ClusterClusterMountInfoNetworkFilesystemInfoArgs networkFilesystemInfo) {
            return networkFilesystemInfo(Output.of(networkFilesystemInfo));
        }

        /**
         * @param remoteMountDirPath string specifying path to mount on the remote service.
         * 
         * @return builder
         * 
         */
        public Builder remoteMountDirPath(@Nullable Output<String> remoteMountDirPath) {
            $.remoteMountDirPath = remoteMountDirPath;
            return this;
        }

        /**
         * @param remoteMountDirPath string specifying path to mount on the remote service.
         * 
         * @return builder
         * 
         */
        public Builder remoteMountDirPath(String remoteMountDirPath) {
            return remoteMountDirPath(Output.of(remoteMountDirPath));
        }

        public ClusterClusterMountInfoArgs build() {
            if ($.localMountDirPath == null) {
                throw new MissingRequiredPropertyException("ClusterClusterMountInfoArgs", "localMountDirPath");
            }
            if ($.networkFilesystemInfo == null) {
                throw new MissingRequiredPropertyException("ClusterClusterMountInfoArgs", "networkFilesystemInfo");
            }
            return $;
        }
    }

}