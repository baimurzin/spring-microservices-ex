package com.baimurzin.service.auth.authserver.repository;

import com.baimurzin.service.auth.authserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
