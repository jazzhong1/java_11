package com.iu.collection.list.ex;

import java.util.ArrayList;

public interface Action {
	
	public void excute();
	public void excute(Student student);
	public void excute(ArrayList<Student> students);

}

