package com.ssm.teamgys.entity; /*
 *desc:
 *author:wjs
 *time:2019/3/22 0022
 *version:1.2.3
 */

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="pig")
@Data
public class Pig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer pigId;
    private String pigName;
    private String pigHobby;
    private Integer pigAge;




}
