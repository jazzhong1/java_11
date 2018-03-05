package com.et.util.st.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WeatherSearch {
	private Scanner sc;

	public WeatherSearch() {
		sc = new Scanner(System.in);
	}

	public Weather search(HashMap<String, Weather> map) {
		// 지역명입력받아서 찾은뒤 controller로
		Weather w=null;
		System.out.println("찾을 지역을 입력");
		String name = sc.next();
		w = map.get(name);
		return w;
	}
}
