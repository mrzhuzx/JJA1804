package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;


/**
 *   华铭、泽锋
 */
@Entity
@Table
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private  Long teamId;
    private String teamName;
    /**
     * 口号
     */
    private String teamSlogen;
    private String teamIcon;
    /**
     * 状态
     */
    private String teamState;
    private String teamDesc;
    //...




}
