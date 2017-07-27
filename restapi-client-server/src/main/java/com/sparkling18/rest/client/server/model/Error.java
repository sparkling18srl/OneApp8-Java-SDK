package com.sparkling18.rest.client.server.model;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
* Error model
**/
@ApiModel(description = "Error model")
public class Error  {

    private String code = null;
    private String message = null;
    private List<BaseError> detailedErrors = new ArrayList<BaseError>() ;

    public Error(){}

    public Error(String code, String message, List<BaseError> detailedErrors) {
      this.code = code;
      this.message = message;
      this.detailedErrors = detailedErrors;
    }

    /**
    * Machine readable error code
    **/
    @ApiModelProperty(required = true, value = "Machine readable error code")
    @JsonProperty("code")
    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }


    /**
    * Human readable, localized error message.
    **/
    @ApiModelProperty(required = true, value = "Human readable, localized error message.")
    @JsonProperty("message")
    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }


    /**
    **/
    @ApiModelProperty(value = "")
    @JsonProperty("detailedErrors")
    public List<BaseError> getDetailedErrors() {
        return detailedErrors;
    }

    public void setDetailedErrors(List<BaseError> detailedErrors) {
      this.detailedErrors = detailedErrors;
    }

    @Override
    public String toString()  {
      StringBuilder sb = new StringBuilder();
      sb.append("class Error {\n");

      sb.append("  code: ").append(code).append("\n");
      sb.append("  message: ").append(message).append("\n");
      sb.append("  detailedErrors: ").append(detailedErrors).append("\n");
      sb.append("}\n");
      return sb.toString();
    }
}