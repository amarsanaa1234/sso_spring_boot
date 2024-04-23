package com.alibou.security.service;


import com.alibou.security.domain.Role;

public interface RoleService {
	Role getByName(String name);
	Role getDefaultRole();
}