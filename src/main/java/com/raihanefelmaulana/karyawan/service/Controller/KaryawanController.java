/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raihanefelmaulana.karyawan.service.Controller;

import com.raihanefelmaulana.karyawan.service.Entity.Karyawan;
import com.raihanefelmaulana.karyawan.service.Service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/karyawan")

public class KaryawanController {
    @Autowired
    private KaryawanService karyawanService;
    
    @PostMapping("/")
    public Karyawan saveKaryawan(@RequestBody Karyawan karyawan){
        return karyawanService.saveKaryawan(karyawan);
    }
    
    @GetMapping("/{id}")
    public Karyawan findKaryawanById(@PathVariable("id") Long karyawanId){
        return karyawanService.findKaryawanById(karyawanId);
    }
}
