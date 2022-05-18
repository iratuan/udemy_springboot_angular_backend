package com.cruznobre.api.core.repository;

import com.cruznobre.api.core.entity.Atendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendanceRepository extends JpaRepository<Atendance, Long> {
}