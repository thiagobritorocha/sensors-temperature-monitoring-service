package com.fairplay.sensor.temperature.monitoring.domain.repository;

import com.fairplay.sensor.temperature.monitoring.domain.model.SensorId;
import com.fairplay.sensor.temperature.monitoring.domain.model.SensorMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorMonitoringRepository extends JpaRepository<SensorMonitoring, SensorId> {}
