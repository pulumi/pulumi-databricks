 If you're new to Databricks, please follow guide to create a workspace on [Azure](guides/azure-workspace.md), [AWS](guides/aws-workspace.md) or [GCP](guides/gcp-workspace.md) and then this [workspace management](guides/workspace-management.md) tutorial.  Take advantage of [Terraform Modules](https://www.terraform.io/docs/modules/index.html) to make your code simpler and reuse [existing modules for Databricks resources](https://registry.terraform.io/search/modules?namespace=databricks).   Changelog is available [on GitHub](https://github.com/databricks/terraform-provider-databricks/blob/main/CHANGELOG.md).

![Resources](https://raw.githubusercontent.com/databricks/terraform-provider-databricks/main/docs/resources.png)

Compute resources

* Deploy [databricks_cluster](resources/cluster.md) on selected [databricks_node_type](data-sources/node_type.md)
* Schedule automated [databricks_job](resources/job.md)
* Control cost and data access with [databricks_cluster_policy](resources/cluster_policy.md)
* Speedup job & cluster startup with [databricks_instance_pool](resources/instance_pool.md)
* Customize clusters with [databricks_global_init_script](resources/global_init_script.md)
* Manage few [databricks_notebook](resources/notebook.md), and even [list them](data-sources/notebook_paths.md)
* Manage [databricks_repo](resources/repo.md)

Storage

* Create Unity Catalog volumes to manage non-tabular data through [databricks_volume](resources/volume.md) resource
* Manage JAR, Wheel libraries and other non-tabular files through [databricks_file](resources/file.md) resource
* Configure storage access with [databricks_external_location](resources/external_location.md) resource (requires [databricks_storage_credential](resources/storage_credential.md))

Security

* Organize [databricks_user](resources/user.md) into [databricks_group](resources/group.md) through [databricks_group_member](resources/group_member.md), also reading [metadata](data-sources/group.md)
* Create [databricks_service_principal](resources/service_principal.md) with [databricks_obo_token](resources/obo_token.md) to enable even more restricted access control.
* Create [databricks_service_principal](resources/service_principal.md) with [databricks_service_principal_secret](resources/service_principal_secret.md) to authenticate with the service principal OAuth tokens (Only for AWS deployments)
* Manage data access with [databricks_instance_profile](resources/instance_profile.md), which can be assigned through [databricks_group_instance_profile](resources/group_instance_profile.md) and [databricks_user_instance_profile](resources/user_instance_profile.md)
* Control which networks can access workspace with [databricks_ip_access_list](resources/ip_access_list.md)
* Generically manage [databricks_permissions](resources/permissions.md)
* Manage Unity Catalog permissions with [databricks_grant](resources/databricks_grant.md)
* Keep sensitive elements like passwords in [databricks_secret](resources/secret.md), grouped into [databricks_secret_scope](resources/secret_scope.md) and controlled by [databricks_secret_acl](resources/secret_acl.md)

[Databricks workspace on AWS](../docs/guides/aws-workspace.md)

* Create [workspaces](resources/mws_workspaces.md) in your [VPC](resources/mws_networks.md) with [DBFS](resources/mws_storage_configurations.md) using [cross-account IAM roles](resources/mws_credentials.md), having your notebooks encrypted with [CMK](resources/mws_customer_managed_keys.md).
* Use predefined AWS IAM Policy Templates: [databricks_aws_assume_role_policy](data-sources/aws_assume_role_policy.md), [databricks_aws_crossaccount_policy](data-sources/aws_crossaccount_policy.md), [databricks_aws_bucket_policy](data-sources/aws_bucket_policy.md)
* Configure billing and audit [databricks_mws_log_delivery](resources/mws_log_delivery.md)

Databricks SQL

* Create [databricks_sql_endpoint](resources/sql_endpoint.md) controlled by [databricks_permissions](resources/permissions.md).
* Manage [queries](resources/sql_query.md) and their [visualizations](resources/sql_visualization.md).
* Manage [dashboards](resources/sql_dashboard.md) and their [widgets](resources/sql_widget.md).
* Provide [global configuration for all SQL warehouses](resources/sql_global_config.md)

Machine Learning

* Create [models in Unity Catalog](resources/registered_model.md).
* Create [MLflow experiments](resources/mlflow_experiment.md).
* Create [models in the workspace model registry](resources/mlflow_model.md).
* Create [model serving endpoints](resources/model_serving.md).
