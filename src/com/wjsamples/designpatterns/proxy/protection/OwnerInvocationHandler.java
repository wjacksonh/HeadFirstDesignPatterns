package com.wjsamples.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	private PersonBean mPerson;
	
	public OwnerInvocationHandler (PersonBean person) {
		mPerson = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(mPerson, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException ();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(mPerson, args);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
