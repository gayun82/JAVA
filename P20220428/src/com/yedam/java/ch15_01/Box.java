package com.yedam.java.ch15_01;
//제네딕타입으로 바뀌면
public class Box<T> {
				//<String>
	//private  Object object;
	private T t;//String t;
	
	//public Object getObject() {
		public T get() { return t;}
			//String

	//public void setObject(Object object) {
		public void set(T t ) {this.t = t;}
	}					//String



