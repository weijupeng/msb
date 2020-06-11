package com.wjp.test.rank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weijupeng
 */
public class RanksClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Results results = (Results)context.getBean("results");
		System.out.println(results);
	}

}