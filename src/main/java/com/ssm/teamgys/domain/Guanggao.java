package com.ssm.teamgys.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 *     队长
 * 广告表
 */
@Entity
@Table
@Data
public class Guanggao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long ggId;
  private String ggTitle; //主题
  private String ggImg;//图片
  private String ggUrl;//链接
  private Date ggTime;//时间



}
