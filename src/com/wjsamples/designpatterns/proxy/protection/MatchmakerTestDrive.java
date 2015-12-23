package com.wjsamples.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchmakerTestDrive {
	private static final String[] mNames;
	
	static {
		mNames = new String [] {
			new String("Joe Javabean"),
			new String("Sarah Singleton"),
			new String("Peter Proxy"),
			new String("Phil Facade")
		};
	}

	private HashMap<String, PersonBean> mDatabase;
	
	private String mWhoIAM;
	
	public MatchmakerTestDrive (String whoIAm) {
		mWhoIAM = whoIAm;
		initializeDatabase ();
	}
	
	private void initializeDatabase() {
		mDatabase = new HashMap<>();
		
		for (String name : mNames) {
			PersonBean person = new PersonBeanImpl();
			person.setName(name);
			
			mDatabase.put(name, person);
		}
	}
	
	private PersonBean getPersonFromDataBase (String name) {		
		return mDatabase.get(name);
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("java MatchmakerTestDrive <your name>");
			return;
		}
		
		MatchmakerTestDrive testDrive = new MatchmakerTestDrive(args[0]);
		testDrive.drive ();
	}

	private void drive() {
		System.out.println("I am " + mWhoIAM);
		PersonBean joe = getPersonFromDataBase(mNames[0]);
		
		PersonBean joeProxy = getProxy(joe);
		
		System.out.println("Searching for " + joeProxy.getName());
		setIterests (joeProxy, "Bowling, Go");
		setRating (joeProxy, 3);
		
		System.out.println(joeProxy.getName() + "'s Interests are " + joeProxy.getInterests());
		System.out.println(joeProxy.getName() + "'s Rating is " + joeProxy.getHotOrNotRating());
	}

	private void setIterests(PersonBean proxy, String interests) {
		System.out.println(mWhoIAM + " is Setting interests \"" + interests + "\" on " + proxy.getName());
		try {
			proxy.setInterests(interests);
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
	}
	
	private void setRating(PersonBean proxy, int rating) {
		System.out.println(mWhoIAM + " is Setting hot or not rating \"" + rating + "\" on " + proxy.getName());
		try {
			proxy.setHotOrNotRating(rating);			
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy if not owner");
		}
	}

	private PersonBean getProxy (PersonBean person) {
		InvocationHandler ih;
		
		if (person.getName().equals(mWhoIAM)) {
			ih = new OwnerInvocationHandler(person);
		} else {
			ih = new NonOwnerInvocationHandler (person);
		}
		
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
												   person.getClass().getInterfaces(),
												   ih);
	}	
}
