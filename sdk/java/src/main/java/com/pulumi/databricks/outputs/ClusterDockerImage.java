// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterDockerImageBasicAuth;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterDockerImage {
    /**
     * @return `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
     * 
     * Example usage with azurerm_container_registry and docker_registry_image, that you can adapt to your specific use-case:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.docker.registryImage;
     * import com.pulumi.docker.registryImageArgs;
     * import com.pulumi.databricks.Cluster;
     * import com.pulumi.databricks.ClusterArgs;
     * import com.pulumi.databricks.inputs.ClusterDockerImageArgs;
     * import com.pulumi.databricks.inputs.ClusterDockerImageBasicAuthArgs;
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
     *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()
     *             .build(List.of(Map.ofEntries(
     *             )))
     *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
     *             .build());
     * 
     *         var thisCluster = new Cluster("thisCluster", ClusterArgs.builder()
     *             .dockerImage(ClusterDockerImageArgs.builder()
     *                 .url(this_.name())
     *                 .basicAuth(ClusterDockerImageBasicAuthArgs.builder()
     *                     .username(thisAzurermContainerRegistry.adminUsername())
     *                     .password(thisAzurermContainerRegistry.adminPassword())
     *                     .build())
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
    private @Nullable ClusterDockerImageBasicAuth basicAuth;
    /**
     * @return URL for the Docker image
     * 
     */
    private String url;

    private ClusterDockerImage() {}
    /**
     * @return `basic_auth.username` and `basic_auth.password` for Docker repository. Docker registry credentials are encrypted when they are stored in Databricks internal storage and when they are passed to a registry upon fetching Docker images at cluster launch. However, other authenticated and authorized API users of this workspace can access the username and password.
     * 
     * Example usage with azurerm_container_registry and docker_registry_image, that you can adapt to your specific use-case:
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.docker.registryImage;
     * import com.pulumi.docker.registryImageArgs;
     * import com.pulumi.databricks.Cluster;
     * import com.pulumi.databricks.ClusterArgs;
     * import com.pulumi.databricks.inputs.ClusterDockerImageArgs;
     * import com.pulumi.databricks.inputs.ClusterDockerImageBasicAuthArgs;
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
     *         var this_ = new RegistryImage("this", RegistryImageArgs.builder()
     *             .build(List.of(Map.ofEntries(
     *             )))
     *             .name(String.format("%s/sample:latest", thisAzurermContainerRegistry.loginServer()))
     *             .build());
     * 
     *         var thisCluster = new Cluster("thisCluster", ClusterArgs.builder()
     *             .dockerImage(ClusterDockerImageArgs.builder()
     *                 .url(this_.name())
     *                 .basicAuth(ClusterDockerImageBasicAuthArgs.builder()
     *                     .username(thisAzurermContainerRegistry.adminUsername())
     *                     .password(thisAzurermContainerRegistry.adminPassword())
     *                     .build())
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
    public Optional<ClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    /**
     * @return URL for the Docker image
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDockerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterDockerImageBasicAuth basicAuth;
        private String url;
        public Builder() {}
        public Builder(ClusterDockerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder basicAuth(@Nullable ClusterDockerImageBasicAuth basicAuth) {

            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("ClusterDockerImage", "url");
            }
            this.url = url;
            return this;
        }
        public ClusterDockerImage build() {
            final var _resultValue = new ClusterDockerImage();
            _resultValue.basicAuth = basicAuth;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
