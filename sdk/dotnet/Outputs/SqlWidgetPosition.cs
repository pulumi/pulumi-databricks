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
    public sealed class SqlWidgetPosition
    {
        public readonly bool? AutoHeight;
        public readonly int? PosX;
        public readonly int? PosY;
        public readonly int SizeX;
        public readonly int SizeY;

        [OutputConstructor]
        private SqlWidgetPosition(
            bool? autoHeight,

            int? posX,

            int? posY,

            int sizeX,

            int sizeY)
        {
            AutoHeight = autoHeight;
            PosX = posX;
            PosY = posY;
            SizeX = sizeX;
            SizeY = sizeY;
        }
    }
}