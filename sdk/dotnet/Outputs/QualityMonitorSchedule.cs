// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class QualityMonitorSchedule
    {
        public readonly string? PauseStatus;
        /// <summary>
        /// string expression that determines when to run the monitor. See [Quartz documentation](https://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html) for examples.
        /// </summary>
        public readonly string QuartzCronExpression;
        /// <summary>
        /// string with timezone id (e.g., `PST`) in which to evaluate the Quartz expression.
        /// </summary>
        public readonly string TimezoneId;

        [OutputConstructor]
        private QualityMonitorSchedule(
            string? pauseStatus,

            string quartzCronExpression,

            string timezoneId)
        {
            PauseStatus = pauseStatus;
            QuartzCronExpression = quartzCronExpression;
            TimezoneId = timezoneId;
        }
    }
}