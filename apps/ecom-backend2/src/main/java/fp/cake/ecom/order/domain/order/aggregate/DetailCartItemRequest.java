package fp.cake.ecom.order.domain.order.aggregate;

import fp.cake.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
