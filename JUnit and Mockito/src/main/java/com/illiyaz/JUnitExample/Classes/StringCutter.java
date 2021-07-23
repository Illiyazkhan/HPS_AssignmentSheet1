package com.illiyaz.JUnitExample.Classes;



public class StringCutter {
	String string;
	int n;
	
	public StringCutter(String string, int n) {
		super();
		this.string = string;
		this.n = n;
	}
	
	public String Cutter() {
		int a = string.length();
		if( a < 2) {
			//System.out.println("Not possible");
			return "Not possible";
		}
		else {
			for(int i=0;i<n;i++) {
				a=string.length();
				string= string.substring(1, a);
			}
			//System.out.println(string);
			return string;
		}
		
		
	}
	public boolean State() {
		if(string.contains("i")) {
			//System.out.println("present");
			return true;
			
		}
		else {
			//System.out.println("not present");
			return false;
		}
	}
	public String[] EleList(){
		String[] A= string.split("");
		return A;
	}
	
	public String Find_letter(String i) {
		if(string.contains(i)) {
			return "true";
		}
		else {
			return "false";
		} 
		
	}
	public boolean Find_letterBoolean(String i) {
		if(string.contains(i)) {
			return true;
		}
		else {
			return false;
		} 
		
	}
	

}
