// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTaskSqlTaskAlertSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationId")]
        public Input<string>? DestinationId { get; set; }

        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public JobTaskSqlTaskAlertSubscriptionArgs()
        {
        }
        public static new JobTaskSqlTaskAlertSubscriptionArgs Empty => new JobTaskSqlTaskAlertSubscriptionArgs();
    }
}