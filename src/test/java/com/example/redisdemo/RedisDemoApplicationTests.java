package com.example.redisdemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisDemoApplicationTests {
	@Resource
	private RedisTemplate redisTemplate;

	@Test
	void testString() {
		redisTemplate.opsForValue().set("name", "吴晓丽");
		Object name = redisTemplate.opsForValue().get("name");
		System.out.println("name: " + name);
	}
}
