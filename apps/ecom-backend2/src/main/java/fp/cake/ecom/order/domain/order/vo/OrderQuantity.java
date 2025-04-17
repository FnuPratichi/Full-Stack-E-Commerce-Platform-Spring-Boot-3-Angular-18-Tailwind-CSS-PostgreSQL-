package fp.cake.ecom.order.domain.order.vo;

import fp.cake.ecom.shared.error.domain.Assert;

public record OrderQuantity(long value) {

  public OrderQuantity {
    Assert.field("value", value).positive();

  }
}
