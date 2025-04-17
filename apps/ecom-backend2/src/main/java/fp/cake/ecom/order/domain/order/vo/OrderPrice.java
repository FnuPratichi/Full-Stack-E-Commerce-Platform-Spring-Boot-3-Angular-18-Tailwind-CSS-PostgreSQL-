package fp.cake.ecom.order.domain.order.vo;

import fp.cake.ecom.shared.error.domain.Assert;

public record OrderPrice(double value) {

  public OrderPrice {
    Assert.field("value", value).strictlyPositive();
  }
}
