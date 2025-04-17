package fp.cake.ecom.order.domain.order.aggregate;

import fp.cake.ecom.order.domain.order.vo.OrderQuantity;
import fp.cake.ecom.order.domain.order.vo.ProductPublicId;
import org.jilt.Builder;

@Builder
public record OrderProductQuantity(OrderQuantity quantity, ProductPublicId productPublicId) {
}
