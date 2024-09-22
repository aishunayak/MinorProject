package com.minor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minor.entity.RegistrationDetail;
import com.minor.service.RegistrationDetailService;

@RestController
@RequestMapping("/api/registration")
public class RegistrationDetailController {

    @Autowired
    private RegistrationDetailService service;

    @PostMapping("/create")
    public ResponseEntity<RegistrationDetail> createRegistration(@RequestBody RegistrationDetail details) {
        return ResponseEntity.ok(service.saveRegistrationDetail(details));
    }

    @GetMapping("/all")
    public ResponseEntity<List<RegistrationDetail>> getAllRegistrations() {
        return ResponseEntity.ok(service.getAllRegistrations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistrationDetail> getRegistrationById(@PathVariable Long id) {
        Optional<RegistrationDetail> details = service.getRegistrationById(id);
        return details.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistration(@PathVariable Long id) {
        service.deleteRegistrationById(id);
        return ResponseEntity.noContent().build();
    }
}
