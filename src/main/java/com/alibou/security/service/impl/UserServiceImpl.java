package com.alibou.security.service.impl;

import com.alibou.security.domain.User;
import com.alibou.security.repository.UserRepository;
import com.alibou.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository repository;

	@Override
	public User getByUsername(String username) {
		if (!StringUtils.hasText(username)) {
			return null;
		}

		return repository.findByUsername(username).orElse(null);
	}

	@Override
	public User save(User entity) {
		return repository.save(entity);
	}
}
