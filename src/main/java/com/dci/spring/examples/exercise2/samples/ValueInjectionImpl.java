package com.dci.spring.examples.exercise2.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class ValueInjectionImpl implements ValueInjection {

    @Value("${value.text}")
    private String text;
    @Value("${value.boolean}")
    private Boolean bool;
    @Value("${value.integer}")
    private Integer integer;
    @Value("${value.long}")
    private Long aLong;

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public Boolean getBool() {
        return this.bool;
    }

    @Override
    public Integer getInt() {
        return this.integer;
    }

    @Override
    public Long getLong() {
        return this.aLong;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println();
        System.out.println("============================");
        System.out.println("Text value: "+getText());
        System.out.println("Boolean value: "+getBool());
        System.out.println("Int value: "+getInt());
        System.out.println("Long value: "+getLong());
        System.out.println("============================");
        System.out.println();
    }
}
