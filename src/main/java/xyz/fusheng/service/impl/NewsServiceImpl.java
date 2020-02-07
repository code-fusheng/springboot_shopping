/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: NewsServiceImpl
 * Author:   25610
 * Date:     2020/2/6 23:30
 * Description: 新闻消息 News 业务接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.entity.News;
import xyz.fusheng.repository.NewsRepository;
import xyz.fusheng.service.NewsService;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> findForMain() {
        return newsRepository.findForMain();
    }

    @Override
    public List<News> findByPage(int page, int limit) {
        return newsRepository.findLimit((page-1)*limit,limit);
    }

    @Override
    public int getPages(int limit) {
        int total = newsRepository.count();
        int page = 0;
        if (total%limit == 0){
            page = total/limit;
        }else{
            page = total/limit+1;
        }
        return page;
    }
}
