package com.et.util.st.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WeatherInfo {

	private String weatherInfo;

	public HashMap<String, Weather> getWeather() {
		// key = 지역명
		// value = Weather
		// 지역,온도,습도,풍향
		weatherInfo = "seoul,10,50,남서,busan,32,80,남동,daegu,-22,10,북서,jeju,-32,75,북동";
		StringTokenizer st = new StringTokenizer(weatherInfo, ",");
		HashMap<String, Weather> map = new HashMap<>();

		while (st.hasMoreTokens()) {

			Weather weather = new Weather();
			weather.setLocation(st.nextToken());
			weather.setGion(Integer.parseInt(st.nextToken()));
			weather.setHum(Integer.parseInt(st.nextToken()));
			weather.setWind(st.nextToken());
			map.put(weather.getLocation(), weather);

		}
		return map;
	}

	public String getWeatherInfo() {
		return weatherInfo;
	}

	public void setWeatherInfo(String weatherInfo) {
		this.weatherInfo = weatherInfo;
	}

}
