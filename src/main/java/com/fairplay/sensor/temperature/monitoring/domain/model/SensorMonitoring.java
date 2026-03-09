package com.fairplay.sensor.temperature.monitoring.domain.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.OffsetDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SensorMonitoring {
  @Id
  @AttributeOverride(name = "value", column = @Column(name = "id", columnDefinition = "BIGINT"))
  private SensorId id;

  private Double lastTemperature;
  private OffsetDateTime updatedAt;
  private Boolean enabled;
}
