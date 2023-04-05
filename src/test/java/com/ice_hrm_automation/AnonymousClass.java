package com.ice_hrm_automation;

public class AnonymousClass {
	
		public int addition()
			{
				System.out.println(10+20);
			    return 0;
			}
			
		int substraction()
		{
			System.out.println(10-20);
		    return 0;
		}
		
		public int multiplication()
		{
			System.out.println(10*20);
		    return 0;
		}
			
			
			
		public int division()
		{
			System.out.println(10/20);
		    return 0;
		}
		public static void main(String[] args)
		{
		  AnonymousClass maths = new AnonymousClass ();
		  maths.addition();
		  maths.substraction();
		  maths.multiplication();
		  maths.division();
		  
		     }
			 
			
		}