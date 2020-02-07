/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: NewsService
 * Author:   25610
 * Date:     2020/2/6 22:56
 * Description: 新闻消息 News 业务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.News;

import java.util.List;

public interface NewsService {
    public List<News> findForMain();
    public List<News> findByPage(int page, int limit);
    public int getPages(int limit);
}
