package com.main.rest.model;

import java.util.Objects;

public class Message {

  private int errorId;
  private String errorMessage;

  Message(int errorId, String errorMessage){
    this.errorId = errorId;
    this.errorMessage = errorMessage;
  }

  public int getErrorId() {
    return errorId;
  }

  public void setErrorId(int errorId) {
    this.errorId = errorId;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return errorId == message.errorId && errorMessage.equals(message.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, errorMessage);
  }
}
