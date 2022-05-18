package com.cruznobre.api.core.service;

import com.cruznobre.api.core.repository.AtendanceRepository;
import com.cruznobre.api.core.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    private AtendanceRepository repository;

    public AttendanceService(AtendanceRepository repository){

        this.repository = repository;
    }
    
}
