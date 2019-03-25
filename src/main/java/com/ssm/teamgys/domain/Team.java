package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private  Long teamId;




}
