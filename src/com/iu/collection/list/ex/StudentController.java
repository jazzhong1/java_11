package com.iu.collection.list.ex;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.ActionMapUIResource;

public class StudentController {
	private Scanner sc;
	private Student student;
	private ArrayList<Action> actions;
	
	public StudentController() {
			sc=new Scanner(System.in);
			actions=new ArrayList();
			actions.add(new StudentInput());
			actions.add(new StudentScoreInput());
			actions.add(new StudentCheck());
			actions.add(new StudentServiceView());
	}
	
	public void start(){
		System.out.println("학생정보입력프로그램");
		
		boolean check=true;
		
		while(check){
			System.out.println("1.학생등록|2.성적입력|3.학생조회|4.전체조회|5.프로그램종료");
			System.out.print("입력:");
			int num=sc.nextInt();
			
			if(num>0&&num<5){
				actions.get(num-1).excute();
				actions.get(num-1).excute(StudentDataBase.students);
			}
			
			else{
				check=!check;
			}
			
		}
		System.out.println("종료");
		
	}
	

}
