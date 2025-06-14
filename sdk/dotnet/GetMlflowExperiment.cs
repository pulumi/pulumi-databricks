// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetMlflowExperiment
    {
        /// <summary>
        /// Retrieves the settings of databricks.MlflowExperiment by id or name.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// </summary>
        public static Task<GetMlflowExperimentResult> InvokeAsync(GetMlflowExperimentArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMlflowExperimentResult>("databricks:index/getMlflowExperiment:getMlflowExperiment", args ?? new GetMlflowExperimentArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the settings of databricks.MlflowExperiment by id or name.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// </summary>
        public static Output<GetMlflowExperimentResult> Invoke(GetMlflowExperimentInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMlflowExperimentResult>("databricks:index/getMlflowExperiment:getMlflowExperiment", args ?? new GetMlflowExperimentInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieves the settings of databricks.MlflowExperiment by id or name.
        /// 
        /// &gt; This data source can only be used with a workspace-level provider!
        /// </summary>
        public static Output<GetMlflowExperimentResult> Invoke(GetMlflowExperimentInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMlflowExperimentResult>("databricks:index/getMlflowExperiment:getMlflowExperiment", args ?? new GetMlflowExperimentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMlflowExperimentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Location where artifacts for the experiment are stored.
        /// </summary>
        [Input("artifactLocation")]
        public string? ArtifactLocation { get; set; }

        /// <summary>
        /// Creation time in unix time stamp.
        /// </summary>
        [Input("creationTime")]
        public int? CreationTime { get; set; }

        /// <summary>
        /// Unique identifier for the experiment.
        /// </summary>
        [Input("experimentId")]
        public string? ExperimentId { get; set; }

        /// <summary>
        /// Unique identifier for the experiment. (same as `experiment_id`)
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// Last update time in unix time stamp.
        /// </summary>
        [Input("lastUpdateTime")]
        public int? LastUpdateTime { get; set; }

        /// <summary>
        /// Current life cycle stage of the experiment: `active` or `deleted`.
        /// </summary>
        [Input("lifecycleStage")]
        public string? LifecycleStage { get; set; }

        /// <summary>
        /// Path to experiment.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("tags")]
        private List<Inputs.GetMlflowExperimentTagArgs>? _tags;

        /// <summary>
        /// Additional metadata key-value pairs.
        /// </summary>
        public List<Inputs.GetMlflowExperimentTagArgs> Tags
        {
            get => _tags ?? (_tags = new List<Inputs.GetMlflowExperimentTagArgs>());
            set => _tags = value;
        }

        public GetMlflowExperimentArgs()
        {
        }
        public static new GetMlflowExperimentArgs Empty => new GetMlflowExperimentArgs();
    }

    public sealed class GetMlflowExperimentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Location where artifacts for the experiment are stored.
        /// </summary>
        [Input("artifactLocation")]
        public Input<string>? ArtifactLocation { get; set; }

        /// <summary>
        /// Creation time in unix time stamp.
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        /// <summary>
        /// Unique identifier for the experiment.
        /// </summary>
        [Input("experimentId")]
        public Input<string>? ExperimentId { get; set; }

        /// <summary>
        /// Unique identifier for the experiment. (same as `experiment_id`)
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Last update time in unix time stamp.
        /// </summary>
        [Input("lastUpdateTime")]
        public Input<int>? LastUpdateTime { get; set; }

        /// <summary>
        /// Current life cycle stage of the experiment: `active` or `deleted`.
        /// </summary>
        [Input("lifecycleStage")]
        public Input<string>? LifecycleStage { get; set; }

        /// <summary>
        /// Path to experiment.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.GetMlflowExperimentTagInputArgs>? _tags;

        /// <summary>
        /// Additional metadata key-value pairs.
        /// </summary>
        public InputList<Inputs.GetMlflowExperimentTagInputArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.GetMlflowExperimentTagInputArgs>());
            set => _tags = value;
        }

        public GetMlflowExperimentInvokeArgs()
        {
        }
        public static new GetMlflowExperimentInvokeArgs Empty => new GetMlflowExperimentInvokeArgs();
    }


    [OutputType]
    public sealed class GetMlflowExperimentResult
    {
        /// <summary>
        /// Location where artifacts for the experiment are stored.
        /// </summary>
        public readonly string ArtifactLocation;
        /// <summary>
        /// Creation time in unix time stamp.
        /// </summary>
        public readonly int CreationTime;
        /// <summary>
        /// Unique identifier for the experiment. (same as `id`)
        /// </summary>
        public readonly string ExperimentId;
        /// <summary>
        /// Unique identifier for the experiment. (same as `experiment_id`)
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Last update time in unix time stamp.
        /// </summary>
        public readonly int LastUpdateTime;
        /// <summary>
        /// Current life cycle stage of the experiment: `active` or `deleted`.
        /// </summary>
        public readonly string LifecycleStage;
        /// <summary>
        /// Path to experiment.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Additional metadata key-value pairs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMlflowExperimentTagResult> Tags;

        [OutputConstructor]
        private GetMlflowExperimentResult(
            string artifactLocation,

            int creationTime,

            string experimentId,

            string id,

            int lastUpdateTime,

            string lifecycleStage,

            string name,

            ImmutableArray<Outputs.GetMlflowExperimentTagResult> tags)
        {
            ArtifactLocation = artifactLocation;
            CreationTime = creationTime;
            ExperimentId = experimentId;
            Id = id;
            LastUpdateTime = lastUpdateTime;
            LifecycleStage = lifecycleStage;
            Name = name;
            Tags = tags;
        }
    }
}
