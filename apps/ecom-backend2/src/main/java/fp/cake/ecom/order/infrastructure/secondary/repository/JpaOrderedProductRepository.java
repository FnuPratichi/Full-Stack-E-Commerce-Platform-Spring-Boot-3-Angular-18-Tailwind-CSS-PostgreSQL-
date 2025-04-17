package fp.cake.ecom.order.infrastructure.secondary.repository;

import fp.cake.ecom.order.infrastructure.secondary.entity.OrderedProductEntity;
import fp.cake.ecom.order.infrastructure.secondary.entity.OrderedProductEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
