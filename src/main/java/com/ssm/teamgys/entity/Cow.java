package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cow")
@Data //get//set//toString
public class Cow {
@Id
@GeneratedValue()
  private long userId;
  private String userName;



}
