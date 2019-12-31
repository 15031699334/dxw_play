package com.boot.dong.service.Impl;

import com.boot.dong.entity.User;
import com.boot.dong.entity.Video;
import com.boot.dong.mapper.UserMapper;
import com.boot.dong.mapper.VideoMapper;
import com.boot.dong.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    VideoMapper VideoMapper;
    @Autowired
    UserMapper userMapper;
    @Override
    public Video getVideo() {
        return VideoMapper.selectByPrimaryKey(1);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public Object findObjectById(String id, String entity) {
        if (entity.equals("user")){
            return userMapper.selectByPrimaryKey(Integer.parseInt(id));
        }
        return "null";
    }
}
