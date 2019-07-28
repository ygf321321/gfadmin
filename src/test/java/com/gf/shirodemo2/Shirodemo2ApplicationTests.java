package com.gf.shirodemo2;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Shirodemo2ApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void password() {
		String hashAlgorithmName = "MD5";
		String credentials = "123456";
		String salt="ygf";
		int hashIterations = 2;
		Object obj = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
		System.out.println("密码加密:"+obj);
	}


}
