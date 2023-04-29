package com.spring.core.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friendsName;
	private Map<String, Integer> subjects;

	public Map<String, Integer> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}

	public List<String> getFriendsName() {
		return friendsName;
	}

	public void setFriendsName(List<String> friendsName) {
		this.friendsName = friendsName;
	}

	@Override
	public String toString() {
		return "Person [friendsName=" + friendsName + ", subjects=" + subjects + "]";
	}
}
