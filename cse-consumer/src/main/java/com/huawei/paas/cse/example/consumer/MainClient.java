package com.huawei.paas.cse.example.consumer;

import org.springframework.stereotype.Component;

import com.huawei.paas.cse.provider.pojo.RpcReference;
import com.huawei.paas.foundation.common.utils.BeanUtils;
import com.huawei.paas.foundation.common.utils.Log4jUtils;

@Component
public class MainClient {

	@RpcReference(microserviceName = "helloservice")
	private static HelloWorld consumer;

	public static void main(String[] args) throws Exception {
		Log4jUtils.init();
		BeanUtils.init();
		int count = 10;
		while (count-- > 0) {
			Thread.sleep(5000);
			System.out.println(consumer.sayHello("world!!!!!!!!!!!"));
		}
	}
}
