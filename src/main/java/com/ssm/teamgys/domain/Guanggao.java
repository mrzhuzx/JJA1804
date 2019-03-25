package com.ssm.teamgys.domain;

import lombok.Data;

/**
 *     队长
 * 广告表
 */
@Data
public class Guanggao {

  private long ggId;
  private String ggTitle; //主题
  private String ggImg;//图片
  private String ggUrl;//链接
  private long ggTime;//时间



}
