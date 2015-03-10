package com.xeiam.xchange.loyalbit.dto;

import si.mazi.rescu.ExceptionalReturnContentException;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoyalbitBaseResponse {

  private final Integer status;
  private final String message;

  protected LoyalbitBaseResponse(
      @JsonProperty("status") Integer status,
      @JsonProperty("message") String message
  ) {
    if (status != 1) {
      throw new ExceptionalReturnContentException(message);
    }
    this.status = status;
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public Integer getStatus() {
    return status;
  }
}
