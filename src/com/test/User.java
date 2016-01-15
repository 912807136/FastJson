package com.test;

import java.util.ArrayList;

public class User {
	private int id;
	private String name;
	private ArrayList cities;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class City {
		private String cityName;

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		@Override
		public String toString() {
			return "City [cityName=" + cityName;
		}

	}

	public ArrayList getCities() {
		return cities;
	}

	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cities=" + cities + "]";
	}

}
