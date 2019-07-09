package model;

import model.domain.People;

public class PeopleModel {

	private static People[] allData = new People[10];
	private static int index;
	static {
		allData[0] = new People(1,"AAA", "�赿��", "�Ϲ�","Customer");
		allData[1] = new People(2,"BBB", "�ѿ켮", "VIP","admin");
		allData[2] = new People(3,"CCC", "������", "VIP","Customer");
		allData[3] = new People(4,"ABC", "������", "�Ϲ�","Customer");
		allData[4] = new People(5,"BBC", "������", "�Ϲ�","Customer");
		allData[5] = new People(6,"BBQ", "������", "�Ϲ�","Customer");
		allData[6] = new People(7,"AHC", "���ο�", "VIP","Customer");
		index = 7;
	}
	
	public static boolean insert(People v) {
		if(index < 10) {
		allData[index++]=v;
			return true;
		}else {
			return false;
		}
	}
	
	public static People[] getAll() {
		return allData;
	}
	
	public static boolean delete(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
		if(v !=null && v.getName().equals(name)) {
			allData[i] =null;
			return true;
			}
		}
			return false;
	}
			
	public static People search(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
			if(v !=null && v.getName().equals(name)) {
				return v;
			} 
		}
				return null;
	}
	
	public static boolean confirm(String admin) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
			if(v !=null && v.getAdmin().equals(admin)) {
				return true;
			} 
		}
				return false;
	}
	
	public static boolean update(String name) {
		People v = null;
		for(int i=0; i < allData.length; i++) {
			v= allData[i];
		if(v !=null && v.getName().equals(name)) {
			allData[i].setGrade("vip");
			return true;
			}
		}
			return false;
	}
}
