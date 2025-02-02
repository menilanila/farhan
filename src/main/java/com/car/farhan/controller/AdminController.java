package com.car.farhan.controller;

import com.car.farhan.model.Admin;
import com.car.farhan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin")
    public List<Admin> getAlladmin() {
        return adminService.getAlladmin();
    }
    @GetMapping("/admin/{id}")
    public Admin getadminById(@PathVariable("id") int id) {
        return adminService.getadminById(id);
    }
    @PostMapping("/admin")
    public String addadmin(@RequestBody Admin admin) {
        adminService.addadmin(admin);
        return "added..";
    }
    @PutMapping("/admin")
    public String updateadmin(@RequestBody Admin admin){
        adminService.updateadmin(admin);
        return "updated..";
    }
    @DeleteMapping("/admin/{id}")
    public String deleteadmin(@PathVariable int id){
        adminService.deleteadmin(id);
        return "deleted..";
    }
    @DeleteMapping("/admin/clear")
    public String deleteall(){
        adminService.deleteall();
        return "deleted admin records";
    }


}
