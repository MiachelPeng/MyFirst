
package com.peng.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Subject realSubject = new RealSubject();
		InvocationHandler handler = new SubjectInvocationHandler(realSubject);
		Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), handler);
		System.out.println(subject.getClass().getName());
		subject.rent();
		subject.hello("world");
	}

}
