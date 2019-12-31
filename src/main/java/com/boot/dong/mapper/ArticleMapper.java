package com.boot.dong.mapper;

import com.boot.dong.entity.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> getAllNews();
}