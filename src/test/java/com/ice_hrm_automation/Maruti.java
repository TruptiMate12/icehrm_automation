
package com.ice_hrm_automation;
public class Maruti{
	
	public static void main(String[]args) {
//create instance of anynomous class with car interface
	
		Car car = new Car()
				{
			public void engine() {
				System.out.println("800 cc engine");
			}
			public String color() {
				return "White";
				
			}
			public void fuelType() {
				System.out.println("CNG");
				
			}
				
			};
			car.engine();
			System.out.println(car.color());
			car.fuelType();
			
			}
				}

