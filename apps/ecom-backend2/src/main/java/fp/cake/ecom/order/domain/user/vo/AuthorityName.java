package fp.cake.ecom.order.domain.user.vo;

import fp.cake.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
