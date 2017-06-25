package com.jazasoft.mt.repository;

import com.jazasoft.mt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mdzahidraza on 26/06/17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
