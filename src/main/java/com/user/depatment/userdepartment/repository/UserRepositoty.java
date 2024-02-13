package com.user.depatment.userdepartment.repository;

import com.user.depatment.userdepartment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoty extends JpaRepository<User, Long> {
}
