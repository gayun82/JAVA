package com.yedam.java.ch11_01;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<Key, String>();
		
		map.put(new Key(1), "홍길동");
		
		String value = map.get(new Key(1));//new연산자 새로운것 다른 해쉬코드
		System.out.println(value);
		
		Map<Member,String> mMap = new HashMap<Member, String>();
		
		mMap.put(new Member("blue"), "하늘색");
		
		String mValue = mMap.get(new Member("blue"));
		System.out.println(mValue);
	}

}
