package com.fairplay.sensor.temperature.monitoring.api.controller;

import com.fairplay.sensor.temperature.monitoring.api.model.TemperatureLogOutput;
import com.fairplay.sensor.temperature.monitoring.domain.model.SensorId;
import com.fairplay.sensor.temperature.monitoring.domain.repository.TemperatureLogRepository;
import io.hypersistence.tsid.TSID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensors/{sensorId}/temperatures")
@RequiredArgsConstructor
public class TemperatureLogController {

  private final TemperatureLogRepository temperatureLogRepository;

  @GetMapping
  public Page<TemperatureLogOutput> search(
      @PathVariable TSID sensorId, @PageableDefault Pageable pageable) {
    return temperatureLogRepository
        .findAllBySensorId(new SensorId(sensorId), pageable)
        .map(
            temperatureLog ->
                TemperatureLogOutput.builder()
                    .id(temperatureLog.getId().getValue())
                    .value(temperatureLog.getValue())
                    .registeredAt(temperatureLog.getRegisteredAt())
                    .sensorId(temperatureLog.getSensorId().getValue())
                    .build());
  }
}
