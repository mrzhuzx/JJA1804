package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Table(name = "cat")
@Entity
public class Cat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer catId;
  private String catName;
  private String catAge;
  private String catColor;




}
