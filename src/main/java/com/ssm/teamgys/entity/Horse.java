package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="horse")
@Data
public class Horse {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Integer horseId;
  private String horseName;
  private String horsehobby;
  private Integer horseage;



}
