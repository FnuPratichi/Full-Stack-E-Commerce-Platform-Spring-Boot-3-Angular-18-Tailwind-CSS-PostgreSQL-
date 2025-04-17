package fp.cake.ecom.order.domain.order.vo;

import fp.cake.ecom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

  public StripeSessionId {
    Assert.notNull("value", value);
  }
}
