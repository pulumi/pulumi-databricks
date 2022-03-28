"""A Python Pulumi program"""

import pulumi
import pulumi_databricks as databricks

group = databricks.Group("py-group", display_name="Python Group")
