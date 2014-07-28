/*************************************************************************
 * FileName       	[ LeapYearDays.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to compute LeapYear function and show the real day one year.]
 * Author         	[ ³\±ê«® ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/

package hw2;
public class LeapYearDays {
	public boolean LeapYearDays(int year){
		if(year%4==0 && year%100!=0 || year%400==0) 
	       {return true;}
	    else
	       {return false;}
		
		//return true;
	}
}
