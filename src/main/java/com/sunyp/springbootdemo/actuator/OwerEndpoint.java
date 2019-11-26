package com.sunyp.springbootdemo.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/**
 * @author
 * @date201931
 */
@ConfigurationProperties(prefix = "endpoints.person")
@Component
public class OwerEndpoint implements Endpoint {

    public String invoke() {
        return "testEndpoint";
    }

    @Override
    public String id() {
        return null;
    }

    @Override
    public boolean enableByDefault() {
        return false;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
