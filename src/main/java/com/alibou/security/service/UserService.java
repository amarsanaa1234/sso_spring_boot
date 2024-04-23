package com.alibou.security.service;


import com.alibou.security.domain.User;

public interface UserService {
	User getByUsername(String username);

    User save(User user);
}