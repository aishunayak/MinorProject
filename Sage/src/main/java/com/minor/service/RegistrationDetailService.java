package com.minor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minor.entity.RegistrationDetail;
import com.minor.repository.RegistrationDetailRepository;

@Service
public class RegistrationDetailService {

    @Autowired
    private RegistrationDetailRepository repository;

    public RegistrationDetail saveRegistrationDetail(RegistrationDetail detail) {
        return repository.save(detail);
    }

    public List<RegistrationDetail> getAllRegistrations() {
        return repository.findAll();
    }

    public Optional<RegistrationDetail> getRegistrationById(Long id) {
        return repository.findById(id);
    }

    public void deleteRegistrationById(Long id) {
        repository.deleteById(id);
    }
}
