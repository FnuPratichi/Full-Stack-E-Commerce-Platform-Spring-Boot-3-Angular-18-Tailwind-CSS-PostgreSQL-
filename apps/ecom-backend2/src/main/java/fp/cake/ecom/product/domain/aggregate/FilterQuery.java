package fp.cake.ecom.product.domain.aggregate;

import fp.cake.ecom.product.domain.vo.ProductSize;
import fp.cake.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}
