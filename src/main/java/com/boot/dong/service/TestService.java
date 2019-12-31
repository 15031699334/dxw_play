package com.boot.dong.service;

import com.boot.dong.entity.User;
import com.boot.dong.entity.Video;

/**
 * 测试
 */
public interface TestService {
    Video getVideo();

    User findByUsername(String username);

    Object findObjectById(String id, String entity);
}
