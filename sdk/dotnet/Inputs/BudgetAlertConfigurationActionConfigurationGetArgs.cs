// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class BudgetAlertConfigurationActionConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionConfigurationId")]
        public Input<string>? ActionConfigurationId { get; set; }

        /// <summary>
        /// The type of action to take when the budget alert is triggered. (Enum: `EMAIL_NOTIFICATION`)
        /// </summary>
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        /// <summary>
        /// The target of the action. For `EMAIL_NOTIFICATION`, this is the email address to send the notification to.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        public BudgetAlertConfigurationActionConfigurationGetArgs()
        {
        }
        public static new BudgetAlertConfigurationActionConfigurationGetArgs Empty => new BudgetAlertConfigurationActionConfigurationGetArgs();
    }
}