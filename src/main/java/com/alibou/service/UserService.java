package com.alibou.service;


import com.alibou.domain.User;

public interface UserService {
	User getByUsername(String username);

    User save(User user);
}