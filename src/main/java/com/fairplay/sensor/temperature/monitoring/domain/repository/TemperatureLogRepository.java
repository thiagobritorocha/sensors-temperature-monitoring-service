package com.fairplay.sensor.temperature.monitoring.domain.repository;

import com.fairplay.sensor.temperature.monitoring.domain.model.SensorId;
import com.fairplay.sensor.temperature.monitoring.domain.model.TemperatureLog;
import com.fairplay.sensor.temperature.monitoring.domain.model.TemperatureLogId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureLogRepository extends JpaRepository<TemperatureLog, TemperatureLogId> {
  Page<TemperatureLog> findAllBySensorId(SensorId sensorId, Pageable pageable);
}
