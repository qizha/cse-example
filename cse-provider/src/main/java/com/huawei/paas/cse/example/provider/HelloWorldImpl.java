package com.huawei.paas.cse.example.provider;

import com.huawei.paas.cse.provider.pojo.RpcSchema;

@RpcSchema(schemaId = "helloworld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHello(String name) {
        return "hello " + name;
    }

}
