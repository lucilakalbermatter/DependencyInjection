package com.dci.spring.examples.exercise2.samples;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedImpl implements ConstructorInjected {
    @Override
    public String text() {
        return "I was injected in the constructor";
    }
}
