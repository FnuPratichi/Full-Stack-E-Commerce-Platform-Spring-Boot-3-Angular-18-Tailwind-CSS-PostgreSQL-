package fp.cake.ecom.order.domain.user.service;

import fp.cake.ecom.order.domain.user.aggregate.User;
import fp.cake.ecom.order.domain.user.repository.UserRepository;
import fp.cake.ecom.order.domain.user.vo.UserEmail;
import fp.cake.ecom.order.domain.user.vo.UserPublicId;
import fp.cake.ecom.order.infrastructure.secondary.entity.UserEntity;

import java.util.Optional;

public class UserReader {

  private final UserRepository userRepository;

  public UserReader(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> getByEmail(UserEmail userEmail) {
    return userRepository.getOneByEmail(userEmail);
  }

  public Optional<User> getByPublicId(UserPublicId userPublicId) {
    return userRepository.get(userPublicId);
  }
}