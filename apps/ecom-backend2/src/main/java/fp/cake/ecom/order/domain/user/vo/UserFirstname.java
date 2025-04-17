package fp.cake.ecom.order.domain.user.vo;

import fp.cake.ecom.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}
