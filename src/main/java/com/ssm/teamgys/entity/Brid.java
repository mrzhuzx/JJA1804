package com.ssm.teamgys.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "brid")
public class Brid {

  @Id
  @Generated()
  private Integer bridId;
  private String bridName;
  private String bridColor;



}
