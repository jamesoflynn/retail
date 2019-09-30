package bank.web.transferobjects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage {
    @JsonProperty
    private String error;

    public ErrorMessage(String message) {
        this.error = message;
    }

    public String getError() {
        return error;
    }
}
