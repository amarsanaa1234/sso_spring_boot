package com.alibou.service;


import com.alibou.domain.Role;

public interface RoleService {
	Role getByName(String name);
	Role getDefaultRole();
}