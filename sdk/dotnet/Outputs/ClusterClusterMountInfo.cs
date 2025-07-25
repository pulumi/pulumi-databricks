// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class ClusterClusterMountInfo
    {
        /// <summary>
        /// path inside the Spark container.
        /// 
        /// For example, you can mount Azure Data Lake Storage container using the following code:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var storageAccount = "ewfw3ggwegwg";
        /// 
        ///     var storageContainer = "test";
        /// 
        ///     var withNfs = new Databricks.Cluster("with_nfs", new()
        ///     {
        ///         ClusterMountInfos = new[]
        ///         {
        ///             new Databricks.Inputs.ClusterClusterMountInfoArgs
        ///             {
        ///                 NetworkFilesystemInfo = new Databricks.Inputs.ClusterClusterMountInfoNetworkFilesystemInfoArgs
        ///                 {
        ///                     ServerAddress = $"{storageAccount}.blob.core.windows.net",
        ///                     MountOptions = "sec=sys,vers=3,nolock,proto=tcp",
        ///                 },
        ///                 RemoteMountDirPath = $"{storageAccount}/{storageContainer}",
        ///                 LocalMountDirPath = "/mnt/nfs-test",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public readonly string LocalMountDirPath;
        /// <summary>
        /// block specifying connection. It consists of:
        /// </summary>
        public readonly Outputs.ClusterClusterMountInfoNetworkFilesystemInfo NetworkFilesystemInfo;
        /// <summary>
        /// string specifying path to mount on the remote service.
        /// </summary>
        public readonly string? RemoteMountDirPath;

        [OutputConstructor]
        private ClusterClusterMountInfo(
            string localMountDirPath,

            Outputs.ClusterClusterMountInfoNetworkFilesystemInfo networkFilesystemInfo,

            string? remoteMountDirPath)
        {
            LocalMountDirPath = localMountDirPath;
            NetworkFilesystemInfo = networkFilesystemInfo;
            RemoteMountDirPath = remoteMountDirPath;
        }
    }
}
