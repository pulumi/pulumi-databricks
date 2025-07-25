// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOnlineStoreResult {
    /**
     * @return (string) - The capacity of the online store. Valid values are &#34;CU_1&#34;, &#34;CU_2&#34;, &#34;CU_4&#34;, &#34;CU_8&#34;
     * 
     */
    private @Nullable String capacity;
    /**
     * @return (string) - The timestamp when the online store was created
     * 
     */
    private String creationTime;
    /**
     * @return (string) - The email of the creator of the online store
     * 
     */
    private String creator;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (string) - The name of the online store. This is the unique identifier for the online store
     * 
     */
    private String name;
    /**
     * @return (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
     * 
     */
    private String state;

    private GetOnlineStoreResult() {}
    /**
     * @return (string) - The capacity of the online store. Valid values are &#34;CU_1&#34;, &#34;CU_2&#34;, &#34;CU_4&#34;, &#34;CU_8&#34;
     * 
     */
    public Optional<String> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return (string) - The timestamp when the online store was created
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return (string) - The email of the creator of the online store
     * 
     */
    public String creator() {
        return this.creator;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (string) - The name of the online store. This is the unique identifier for the online store
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (string) - The current state of the online store. Possible values are: `AVAILABLE`, `DELETING`, `FAILING_OVER`, `STARTING`, `STOPPED`, `UPDATING`
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineStoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String capacity;
        private String creationTime;
        private String creator;
        private String id;
        private String name;
        private String state;
        public Builder() {}
        public Builder(GetOnlineStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.creationTime = defaults.creationTime;
    	      this.creator = defaults.creator;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable String capacity) {

            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            if (creationTime == null) {
              throw new MissingRequiredPropertyException("GetOnlineStoreResult", "creationTime");
            }
            this.creationTime = creationTime;
            return this;
        }
        @CustomType.Setter
        public Builder creator(String creator) {
            if (creator == null) {
              throw new MissingRequiredPropertyException("GetOnlineStoreResult", "creator");
            }
            this.creator = creator;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOnlineStoreResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetOnlineStoreResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetOnlineStoreResult", "state");
            }
            this.state = state;
            return this;
        }
        public GetOnlineStoreResult build() {
            final var _resultValue = new GetOnlineStoreResult();
            _resultValue.capacity = capacity;
            _resultValue.creationTime = creationTime;
            _resultValue.creator = creator;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
