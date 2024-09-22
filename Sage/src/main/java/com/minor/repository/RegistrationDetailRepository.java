package com.minor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minor.entity.RegistrationDetail;

@Repository
public interface RegistrationDetailRepository extends JpaRepository<RegistrationDetail, Long> {
}
