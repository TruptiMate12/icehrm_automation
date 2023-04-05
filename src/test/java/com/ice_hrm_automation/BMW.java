
package com.ice_hrm_automation;
public class BMW implements Car{
	public void engine() {
		System.out.println("2000 cc engine");
	}
	public String color() {
		return "White";
		
	}
	public void fuelType() {
		System.out.println("Petrol");
	}
		public static void main(String [] args) {
			BMW obj = new BMW();
		obj.engine();
		System.out.println(obj.color());
		obj.fuelType();
		
		
		}
		
	}
