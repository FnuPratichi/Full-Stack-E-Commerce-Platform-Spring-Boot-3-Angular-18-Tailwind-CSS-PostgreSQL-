package fp.cake.ecom.order.domain.order.repository;

import fp.cake.ecom.order.domain.order.aggregate.Order;
import fp.cake.ecom.order.domain.order.aggregate.StripeSessionInformation;
import fp.cake.ecom.order.domain.order.vo.OrderStatus;
import fp.cake.ecom.order.domain.user.vo.UserPublicId;
import fp.cake.ecom.product.domain.vo.PublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface OrderRepository {

  void save(Order order);

  void updateStatusByPublicId(OrderStatus orderStatus, PublicId orderPublicId);

  Optional<Order> findByStripeSessionId(StripeSessionInformation stripeSessionInformation);

  Page<Order> findAllByUserPublicId(UserPublicId userPublicId, Pageable pageable);

  Page<Order> findAll(Pageable pageable);

}