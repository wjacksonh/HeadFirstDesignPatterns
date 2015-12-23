package com.wjsamples.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
	private PersonBean mPerson;
	
	public NonOwnerInvocationHandler (PersonBean person) {
		mPerson = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(mPerson, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				return method.invoke(mPerson, args);
			} else if (method.getName().startsWith("set")) {
				throw new IllegalAccessException ();
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
