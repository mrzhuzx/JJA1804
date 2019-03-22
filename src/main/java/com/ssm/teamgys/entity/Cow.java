package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cow")
@Data //get//set//toString
public class Cow {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  private String userName;
  private String userHobby;
  private Integer userAge;



}
