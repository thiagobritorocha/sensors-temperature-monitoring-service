package com.fairplay.sensor.temperature.monitoring.api.model;

import io.hypersistence.tsid.TSID;
import java.time.OffsetDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SensorMonitoringOutput {
  private TSID id;
  private Double lastTemperature;
  private OffsetDateTime updatedAt;
  private Boolean enabled;
}
