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
    public sealed class GetFunctionsFunctionResult
    {
        /// <summary>
        /// Indicates whether the principal is limited to retrieving metadata for the associated object through the `BROWSE` privilege when `include_browse` is enabled in the request.
        /// </summary>
        public readonly bool? BrowseOnly;
        /// <summary>
        /// Name of databricks_catalog.
        /// </summary>
        public readonly string? CatalogName;
        /// <summary>
        /// User-provided free-form text description.
        /// </summary>
        public readonly string? Comment;
        /// <summary>
        /// Time at which this function was created, in epoch milliseconds.
        /// </summary>
        public readonly int? CreatedAt;
        /// <summary>
        /// Username of function creator.
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// Scalar function return data type.
        /// </summary>
        public readonly string? DataType;
        /// <summary>
        /// External function language.
        /// </summary>
        public readonly string? ExternalLanguage;
        /// <summary>
        /// External function name.
        /// </summary>
        public readonly string? ExternalName;
        /// <summary>
        /// Pretty printed function data type.
        /// </summary>
        public readonly string? FullDataType;
        /// <summary>
        /// Full name of function, in form of catalog_name.schema_name.function__name
        /// </summary>
        public readonly string? FullName;
        /// <summary>
        /// Id of Function, relative to parent schema.
        /// </summary>
        public readonly string? FunctionId;
        /// <summary>
        /// object describing input parameters. Consists of the single attribute:
        /// </summary>
        public readonly Outputs.GetFunctionsFunctionInputParamsResult? InputParams;
        /// <summary>
        /// Boolean flag specifying whether the function is deterministic.
        /// </summary>
        public readonly bool? IsDeterministic;
        /// <summary>
        /// Boolean flag whether function null call.
        /// </summary>
        public readonly bool? IsNullCall;
        /// <summary>
        /// Unique identifier of parent metastore.
        /// </summary>
        public readonly string? MetastoreId;
        /// <summary>
        /// Name of parameter.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Username of current owner of function.
        /// </summary>
        public readonly string? Owner;
        /// <summary>
        /// Function parameter style. `S` is the value for SQL.
        /// </summary>
        public readonly string? ParameterStyle;
        /// <summary>
        /// JSON-serialized key-value pair map, encoded (escaped) as a string.
        /// </summary>
        public readonly string? Properties;
        /// <summary>
        /// Table function return parameters.  See `input_params` for description.
        /// </summary>
        public readonly Outputs.GetFunctionsFunctionReturnParamsResult? ReturnParams;
        /// <summary>
        /// Function language (`SQL` or `EXTERNAL`). When `EXTERNAL` is used, the language of the routine function should be specified in the `external_language` field, and the `return_params` of the function cannot be used (as `TABLE` return type is not supported), and the `sql_data_access` field must be `NO_SQL`.
        /// </summary>
        public readonly string? RoutineBody;
        /// <summary>
        /// Function body.
        /// </summary>
        public readonly string? RoutineDefinition;
        /// <summary>
        /// Function dependencies.
        /// </summary>
        public readonly Outputs.GetFunctionsFunctionRoutineDependenciesResult? RoutineDependencies;
        /// <summary>
        /// Name of databricks_schema.
        /// </summary>
        public readonly string? SchemaName;
        /// <summary>
        /// Function security type. (Enum: `DEFINER`).
        /// </summary>
        public readonly string? SecurityType;
        /// <summary>
        /// Specific name of the function; Reserved for future use.
        /// </summary>
        public readonly string? SpecificName;
        /// <summary>
        /// Function SQL data access (`CONTAINS_SQL`, `READS_SQL_DATA`, `NO_SQL`).
        /// </summary>
        public readonly string? SqlDataAccess;
        /// <summary>
        /// List of schemes whose objects can be referenced without qualification.
        /// </summary>
        public readonly string? SqlPath;
        /// <summary>
        /// Time at which this function was created, in epoch milliseconds.
        /// </summary>
        public readonly int? UpdatedAt;
        /// <summary>
        /// Username of user who last modified function.
        /// </summary>
        public readonly string? UpdatedBy;

        [OutputConstructor]
        private GetFunctionsFunctionResult(
            bool? browseOnly,

            string? catalogName,

            string? comment,

            int? createdAt,

            string? createdBy,

            string? dataType,

            string? externalLanguage,

            string? externalName,

            string? fullDataType,

            string? fullName,

            string? functionId,

            Outputs.GetFunctionsFunctionInputParamsResult? inputParams,

            bool? isDeterministic,

            bool? isNullCall,

            string? metastoreId,

            string? name,

            string? owner,

            string? parameterStyle,

            string? properties,

            Outputs.GetFunctionsFunctionReturnParamsResult? returnParams,

            string? routineBody,

            string? routineDefinition,

            Outputs.GetFunctionsFunctionRoutineDependenciesResult? routineDependencies,

            string? schemaName,

            string? securityType,

            string? specificName,

            string? sqlDataAccess,

            string? sqlPath,

            int? updatedAt,

            string? updatedBy)
        {
            BrowseOnly = browseOnly;
            CatalogName = catalogName;
            Comment = comment;
            CreatedAt = createdAt;
            CreatedBy = createdBy;
            DataType = dataType;
            ExternalLanguage = externalLanguage;
            ExternalName = externalName;
            FullDataType = fullDataType;
            FullName = fullName;
            FunctionId = functionId;
            InputParams = inputParams;
            IsDeterministic = isDeterministic;
            IsNullCall = isNullCall;
            MetastoreId = metastoreId;
            Name = name;
            Owner = owner;
            ParameterStyle = parameterStyle;
            Properties = properties;
            ReturnParams = returnParams;
            RoutineBody = routineBody;
            RoutineDefinition = routineDefinition;
            RoutineDependencies = routineDependencies;
            SchemaName = schemaName;
            SecurityType = securityType;
            SpecificName = specificName;
            SqlDataAccess = sqlDataAccess;
            SqlPath = sqlPath;
            UpdatedAt = updatedAt;
            UpdatedBy = updatedBy;
        }
    }
}