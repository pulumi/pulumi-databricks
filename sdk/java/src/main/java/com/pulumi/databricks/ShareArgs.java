// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.ShareObjectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

    /**
     * Time when the share was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    /**
     * @return Time when the share was created.
     * 
     */
    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The principal that created the share.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The principal that created the share.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Name of share. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of share. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="objects")
    private @Nullable Output<List<ShareObjectArgs>> objects;

    public Optional<Output<List<ShareObjectArgs>>> objects() {
        return Optional.ofNullable(this.objects);
    }

    /**
     * User name/group name/sp application_id of the share owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return User name/group name/sp application_id of the share owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    private ShareArgs() {}

    private ShareArgs(ShareArgs $) {
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.name = $.name;
        this.objects = $.objects;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareArgs $;

        public Builder() {
            $ = new ShareArgs();
        }

        public Builder(ShareArgs defaults) {
            $ = new ShareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt Time when the share was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Time when the share was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param createdBy The principal that created the share.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The principal that created the share.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param name Name of share. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of share. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder objects(@Nullable Output<List<ShareObjectArgs>> objects) {
            $.objects = objects;
            return this;
        }

        public Builder objects(List<ShareObjectArgs> objects) {
            return objects(Output.of(objects));
        }

        public Builder objects(ShareObjectArgs... objects) {
            return objects(List.of(objects));
        }

        /**
         * @param owner User name/group name/sp application_id of the share owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner User name/group name/sp application_id of the share owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public ShareArgs build() {
            return $;
        }
    }

}
