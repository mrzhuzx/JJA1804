package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="horse")
@Data
public class Horse {

  @Id
  @GeneratedValue()
  private long horseId;
  private String horseName;



}
