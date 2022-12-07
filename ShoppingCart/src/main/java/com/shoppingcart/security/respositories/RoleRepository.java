package com.shoppingcart.security.respositories;

import com.shoppingcart.security.entities.Role;
import com.shoppingcart.security.enums.RoleList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository <Role, Integer> {
    Optional<Role> findByRoleName(RoleList roleName);
}
