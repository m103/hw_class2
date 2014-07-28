/**********************************************************************
 * FileName       	[ calendar.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to show the calendar.]
 * Author         	[ 許梓垣 ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/
package hw2;

public class calendar {
	 void  calendar(int month,int year){
		 
		int first_space;
		int feb_days;
		int reference_year;
		int reference_month;        // month是指輸入的月,reference_month是指電腦內部的month參考
		int reference_day;          // day是指輸入的月,reference_day是指電腦內部的day參考
		int ms_decide;              //ms_decide=month_block_decide
			
		if(month<=12 && month>=1)
		    {
		    for(first_space=1,reference_year=0;reference_year<(year-1900);reference_year++)    //first_space=1是因1900年1/1有一個空格
		    {
		      if(reference_year%4==0 && reference_year%100!=0 || reference_year%400==100)
		       first_space=(first_space+366)%7;
		      else
		       first_space=(first_space+365)%7;   
		     }    //要知道下一年的1/1在星期幾,%7是代表前面有幾個空格
		    
		      //計算2月天數 
		      if(year%4==0 && year%100!=0 || year%400==0) 
		       {feb_days =29;}
		    else
		       {feb_days=28;}
		      
		      
		    int space[]={0,first_space,0,0,0,0,0,0,0,0,0,0,0};   
		    int days[]={0,31,feb_days,31,30,31,30,31,31,30,31,30,31}; 
		    
		    for(reference_month=1;reference_month<month;reference_month++)
				    space[reference_month+1]=(space[reference_month]+days[reference_month])%7;
		    
		    System.out.printf("     Sun Mon Tue Wed Thu Fri Sat　　\n   ");
	        for(ms_decide=1;ms_decide<=space[reference_month];ms_decide++)//ms_decide=month_block_decide
	        	System.out.printf("    ");       //計算空格從1開始,若還未到空格數,則繼續跑
	              
	        for(reference_day=1;reference_day<=days[reference_month];reference_day++)
	         {    
	        	System.out.printf(" %3d",reference_day);
	          
	            if ((space[reference_month]+reference_day)%7==0) //一開始要把格子算進去   則(space+n)%7=0  就跳格
	        
	            {System.out.printf("\n   ");}
	          }
	        System.out.printf("\n\n");
		    }
	 }
}
