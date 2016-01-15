package com.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.test.User.City;

public class Test1 {

	public static void main(String[] args) {

		test1();
	}

	private static void test1() {
		User user = new User();
		user.setId(1);
		user.setName("fdsfds");
		User user2 = new User();
		user2.setId(2);
		user2.setName("地方第三方");
		City city = new City();
		city.setCityName("反攻倒算");
		City city2 = new City();
		city.setCityName("city2");
		ArrayList<City> cityList = new ArrayList<City>();
		cityList.add(city);
		cityList.add(city2);
		user.setCities(cityList);
		ArrayList<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		String string = JSON.toJSONString(list);
		System.out.println(string);

		List<User> array = JSON.parseArray(string, User.class);
		System.out.println(array.toString());
	}

}
