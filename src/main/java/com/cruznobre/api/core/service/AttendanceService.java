package com.cruznobre.api.core.service;

import com.cruznobre.api.core.repository.AtendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    private AtendanceRepository repository;

    @Autowired
    public AttendanceService(AtendanceRepository repository){

        this.repository = repository;
    }
    
}
