---
subcategory: "Security"
---
# databricks_group_member Resource

This resource allows you to attach `users`, `service principals`, and `groups` as group members.

To attach members to groups in the Databricks account, the provider must be configured with `host = "https://accounts.cloud.databricks.com"` on AWS deployments or `host = "https://accounts.azuredatabricks.net"` and authenticate using AAD tokens on Azure deployments.

## Argument Reference

The following arguments are supported:

* `group_id` - (Required) This is the id of the `group` resource.
* `member_id` - (Required) This is the id of the `group`, `service principal`, or `user`.

## Attribute Reference

In addition to all arguments above, the following attributes are exported:

* `id` - The id for the `databricks_group_member` object which is in the format `<group_id>|<member_id>`.

## Import

-> **Note** Importing this resource is not currently supported.

## Related Resources

The following resources are often used in the same context:

* [End to end workspace management](../guides/workspace-management.md) guide.
* [databricks_group](group.md) to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
* [databricks_group](../data-sources/group.md) data to retrieve information about [databricks_group](group.md) members, entitlements and instance profiles.
* [databricks_group_instance_profile](group_instance_profile.md) to attach [databricks_instance_profile](instance_profile.md) (AWS) to [databricks_group](group.md).
* [databricks_ip_access_list](ip_access_list.md) to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
* [databricks_service_principal](service_principal.md) to grant access to a workspace to an automation tool or application.
* [databricks_user](user.md) to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to [databricks_group](group.md) within the workspace.
* [databricks_user](../data-sources/user.md) data to retrieve information about [databricks_user](user.md).
* [databricks_user_instance_profile](user_instance_profile.md) to attach [databricks_instance_profile](instance_profile.md) (AWS) to [databricks_user](user.md).
