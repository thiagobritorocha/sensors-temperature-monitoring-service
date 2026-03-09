package com.fairplay.sensor.temperature.monitoring.domain.repository;

import com.fairplay.sensor.temperature.monitoring.domain.model.SensorAlert;
import com.fairplay.sensor.temperature.monitoring.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorAlertRepository extends JpaRepository<SensorAlert, SensorId> {}
