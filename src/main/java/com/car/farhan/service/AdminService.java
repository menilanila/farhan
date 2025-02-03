package com.car.farhan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<Admin> getAlladmin() {
        return adminRepository.findAll();
    }

    public Admin getadminById(int id) {
        return adminRepository.findById(id).orElse(new Admin());
    }

    public void addadmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void updateadmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteadmin(int id) {
        adminRepository.deleteById(id);
    }

    public void deleteall() {
        adminRepository.deleteAll();
    }

}
