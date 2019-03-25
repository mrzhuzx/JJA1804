package com.ssm.teamgys.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "panda")
@Data
public class Panda {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer pandaid;
  @Column
  private String pandaname;
  @Column
  private String pandacolor;
  @Column
  private double pandaweight;
  @Column
  private Integer pandaage;
  @Column
  private String pandafood;


}
