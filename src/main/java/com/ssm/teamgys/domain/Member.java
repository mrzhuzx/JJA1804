package com.ssm.teamgys.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 开发人员表
 */
@Entity
@Table
@Data
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private long mId;
  /*** 员工工号*/private String mNumber;
  private String mName;
  private String mFaceImg;
  private String mJob;
  /**
   * 开发人员等级
   */
  private  String mGrade;
  /**技能*/
  private String mSkill;
  /**
   * 状态
   */
  private String mStatus;
  private long mItemId;


}
