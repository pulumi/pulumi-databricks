// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskSqlTaskFileInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        [Input("source")]
        public Input<string>? Source { get; set; }

        public GetJobJobSettingsSettingsTaskSqlTaskFileInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskSqlTaskFileInputArgs Empty => new GetJobJobSettingsSettingsTaskSqlTaskFileInputArgs();
    }
}