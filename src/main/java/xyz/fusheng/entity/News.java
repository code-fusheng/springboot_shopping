/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: News
 * Author:   25610
 * Date:     2020/2/6 13:36
 * Description: 新消息 News 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

@Data
public class News {
    private Integer id;
    private String title;                       // 新闻消息标题
    private String content;                     // 内容
    private String createTime;                  // 创建时间
}
