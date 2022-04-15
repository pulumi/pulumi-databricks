import * as databricks from "@pulumi/databricks";
import * as random from "@pulumi/random";

const randomPet = new random.RandomPet("ts-name")

const tsGroup = new databricks.Group("ts-group", {
    displayName: randomPet.id,
});
