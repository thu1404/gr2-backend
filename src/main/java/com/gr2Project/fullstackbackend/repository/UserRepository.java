package com.gr2Project.fullstackbackend.repository;

import com.gr2Project.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
