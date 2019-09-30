package bank.web.transferobjects;

import bank.entity.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class CustomerRequest {

    @JsonProperty
    private String name;

    public CustomerRequest(){}

    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }
}
