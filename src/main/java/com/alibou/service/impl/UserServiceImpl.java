package com.alibou.service.impl;

import com.alibou.domain.User;
import com.alibou.repository.UserRepository;
import com.alibou.service.UserService;
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
