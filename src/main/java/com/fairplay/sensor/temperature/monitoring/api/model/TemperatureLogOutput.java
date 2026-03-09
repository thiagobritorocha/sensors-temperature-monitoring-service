package com.fairplay.sensor.temperature.monitoring.api.model;

import io.hypersistence.tsid.TSID;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TemperatureLogOutput {
  private UUID id;
  private TSID sensorId;
  private OffsetDateTime registeredAt;
  private Double value;
}
