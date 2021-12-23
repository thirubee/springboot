package com.main.pattern.creational.factory;

import java.util.Optional;

public class VendorFactory {

  public Optional<Vendor> getVendor(String name) {
    switch (name) {
      case "super":
        return Optional.ofNullable(new SuperFastTrade());
      case "mini":
        return Optional.ofNullable(new SuperMiniTrade());
      default:
        return Optional.empty();
    }
  }

}
