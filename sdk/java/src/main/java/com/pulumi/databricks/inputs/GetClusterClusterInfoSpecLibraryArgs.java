// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoSpecLibraryCranArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoSpecLibraryMavenArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoSpecLibraryPypiArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoSpecLibraryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetClusterClusterInfoSpecLibraryArgs Empty = new GetClusterClusterInfoSpecLibraryArgs();

    @Import(name="cran")
    private @Nullable Output<GetClusterClusterInfoSpecLibraryCranArgs> cran;

    public Optional<Output<GetClusterClusterInfoSpecLibraryCranArgs>> cran() {
        return Optional.ofNullable(this.cran);
    }

    @Import(name="egg")
    private @Nullable Output<String> egg;

    public Optional<Output<String>> egg() {
        return Optional.ofNullable(this.egg);
    }

    @Import(name="jar")
    private @Nullable Output<String> jar;

    public Optional<Output<String>> jar() {
        return Optional.ofNullable(this.jar);
    }

    @Import(name="maven")
    private @Nullable Output<GetClusterClusterInfoSpecLibraryMavenArgs> maven;

    public Optional<Output<GetClusterClusterInfoSpecLibraryMavenArgs>> maven() {
        return Optional.ofNullable(this.maven);
    }

    @Import(name="pypi")
    private @Nullable Output<GetClusterClusterInfoSpecLibraryPypiArgs> pypi;

    public Optional<Output<GetClusterClusterInfoSpecLibraryPypiArgs>> pypi() {
        return Optional.ofNullable(this.pypi);
    }

    @Import(name="requirements")
    private @Nullable Output<String> requirements;

    public Optional<Output<String>> requirements() {
        return Optional.ofNullable(this.requirements);
    }

    @Import(name="whl")
    private @Nullable Output<String> whl;

    public Optional<Output<String>> whl() {
        return Optional.ofNullable(this.whl);
    }

    private GetClusterClusterInfoSpecLibraryArgs() {}

    private GetClusterClusterInfoSpecLibraryArgs(GetClusterClusterInfoSpecLibraryArgs $) {
        this.cran = $.cran;
        this.egg = $.egg;
        this.jar = $.jar;
        this.maven = $.maven;
        this.pypi = $.pypi;
        this.requirements = $.requirements;
        this.whl = $.whl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoSpecLibraryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoSpecLibraryArgs $;

        public Builder() {
            $ = new GetClusterClusterInfoSpecLibraryArgs();
        }

        public Builder(GetClusterClusterInfoSpecLibraryArgs defaults) {
            $ = new GetClusterClusterInfoSpecLibraryArgs(Objects.requireNonNull(defaults));
        }

        public Builder cran(@Nullable Output<GetClusterClusterInfoSpecLibraryCranArgs> cran) {
            $.cran = cran;
            return this;
        }

        public Builder cran(GetClusterClusterInfoSpecLibraryCranArgs cran) {
            return cran(Output.of(cran));
        }

        public Builder egg(@Nullable Output<String> egg) {
            $.egg = egg;
            return this;
        }

        public Builder egg(String egg) {
            return egg(Output.of(egg));
        }

        public Builder jar(@Nullable Output<String> jar) {
            $.jar = jar;
            return this;
        }

        public Builder jar(String jar) {
            return jar(Output.of(jar));
        }

        public Builder maven(@Nullable Output<GetClusterClusterInfoSpecLibraryMavenArgs> maven) {
            $.maven = maven;
            return this;
        }

        public Builder maven(GetClusterClusterInfoSpecLibraryMavenArgs maven) {
            return maven(Output.of(maven));
        }

        public Builder pypi(@Nullable Output<GetClusterClusterInfoSpecLibraryPypiArgs> pypi) {
            $.pypi = pypi;
            return this;
        }

        public Builder pypi(GetClusterClusterInfoSpecLibraryPypiArgs pypi) {
            return pypi(Output.of(pypi));
        }

        public Builder requirements(@Nullable Output<String> requirements) {
            $.requirements = requirements;
            return this;
        }

        public Builder requirements(String requirements) {
            return requirements(Output.of(requirements));
        }

        public Builder whl(@Nullable Output<String> whl) {
            $.whl = whl;
            return this;
        }

        public Builder whl(String whl) {
            return whl(Output.of(whl));
        }

        public GetClusterClusterInfoSpecLibraryArgs build() {
            return $;
        }
    }

}