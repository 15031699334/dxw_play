package com.boot.dong.mapper;

import com.boot.dong.entity.Video;


public interface VideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Video record);

    int insertSelective(Video record);

//    @Select("select * from video where id = 1")
    Video selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);
}