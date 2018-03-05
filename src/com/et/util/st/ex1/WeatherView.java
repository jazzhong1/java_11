package com.et.util.st.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WeatherView {

	public void view(String message) {
		System.out.println(message);
	}

	public void view(HashMap<String, Weather> map) {
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			this.view(map.get(key));
		}
	}

	public void view(Weather w) {

		System.out.println("지역이름: " + w.getLocation());
		System.out.println("온도: " + w.getGion());
		System.out.println("습도: " + w.getHum());
		System.out.println("풍향: " + w.getWind());
	}
}
