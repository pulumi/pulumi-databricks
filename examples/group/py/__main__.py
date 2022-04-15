"""A Python Pulumi program"""

import pulumi_databricks as databricks
import pulumi_random as random

random_name = random.RandomPet("py-pet")

group = databricks.Group("py-group", display_name=random_name.id)
