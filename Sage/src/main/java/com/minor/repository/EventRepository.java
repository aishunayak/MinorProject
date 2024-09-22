package com.minor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minor.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
