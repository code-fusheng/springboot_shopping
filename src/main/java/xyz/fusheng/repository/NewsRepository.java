/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: NewsRepository
 * Author:   25610
 * Date:     2020/2/6 20:50
 * Description: 新闻资讯 News 仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.News;

import java.util.List;

public interface NewsRepository {
    public List<News> findForMain();
    public List<News> findLimit(int index, int limit);
    public int count();
}
