package com.et.util.st.ex1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherController {

	private WeatherInfo wi;
	private WeatherView wv;
	private WeatherSearch ws;
	private Scanner sc;
	private HashMap<String, Weather> map;

	public WeatherController() {
		wi = new WeatherInfo();
		wv = new WeatherView();
		ws = new WeatherSearch();
		sc = new Scanner(System.in);
		map = new HashMap<>();
	}

	public void start() {

		// 실행하자마자 weatherinfo에서 바로파싱
		// 1.전부출력counttokens
		// 2.지역검색
		// 3.날씨정보초기화,기상청에서 날씨 받아오자는것(getWeather다시호출)
		// 4.종료
		// 출력은 WeatherView에서
		boolean check = true;
		map = wi.getWeather();

		while (check) {
			System.out.println("1.날씨정보 2.지역날씨정보 3.날씨데이터초기화 4.종료");
			int select = sc.nextInt();

			switch (select) {

			case 1:
				wv.view(map);
				break;
			case 2:
				Weather w = ws.search(map);
				if (w != null) {
					wv.view(w);
				} else {
					wv.view("찾는지역이 없습니다.");
				}
				break;

			case 3:
				map = wi.getWeather();
				break;

			default:
				System.out.println("날씨 프로그램을 종료합니다.");
				check = !check;

			}
		}
	}
}
