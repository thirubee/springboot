package com.main.assessment.job1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class SpringBeanTestOne {

  @Bean
  public TestBeanOne testBeanOne() {
    return new TestBeanOne();
  }

  @Bean
  public TestBeanTwo testBeanTwo() {
    return new TestBeanTwo();
  }

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanTestOne.class);
  }
}
