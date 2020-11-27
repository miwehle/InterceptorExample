package com.baeldung.interceptor;

public class SuperService {
  @Audited
  public String deliverService(String uid) {
    return uid;
  }
}
