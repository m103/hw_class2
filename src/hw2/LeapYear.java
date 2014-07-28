/*************************************************************************
 * FileName       	[ LeapYear.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to compute LeapYear function.]
 * Author         	[ 許梓垣 ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/
package hw2;
public class LeapYear {
	
	public boolean LeapYear(int year){
		if(year%4==0 && year%100!=0 || year%400==0) 
	       {return true;}
	    else
	       {return false;}
		
		//return true;
	}
	
	
	//System.out.println("請輸入西元");
    //System.out.println("\n");

	
	
}
