package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="userinfo")

public class Userinfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键

  private Integer userId;
  private String userName;
  private String userAge;
  private String userSex;




}
