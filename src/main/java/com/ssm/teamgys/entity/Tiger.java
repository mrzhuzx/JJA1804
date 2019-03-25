package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;


@Entity
@Table(name="tiger")
@Data
public class Tiger {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer tigerId;
  private String tigerName;
  private Integer tigerAge;
  private String tigerHobby;




}
