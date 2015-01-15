package com.bitcamp.generic.programming;

public class Student {

	int ID;
	String name;
	Adress adress;

	public Student(int ID, String name, Adress adress) {
		super();
		this.ID = ID;
		this.name = name;
		this.adress = adress;
	}

	public Student() {

		ID = 0;
		name = null;
		adress = null;
	}

	public void toCSV() {
		
		CSVBuilder csv = new CSVBuilder();
		
		
		
		
	}
	
	public class CSVBuilder {
		
		private String res = null;
		
		
	}
	
	

	public class Adress {

		private String adress;

		public Adress(String adress) {
			super();
			this.adress = adress;
		}

	
		@Override
		public String toString() {
			return "Adress [adress=" + adress + "]";
		}
		
		
		
		
	}
	
	

}

