/**********************************************************************
 * FileName       	[ DirectDay.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to show the real day.]
 * Author         	[ �\�ꫮ ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/

package hw2;
public class DirectDay {
	 
	public void DirectDay(int month,int year,int inputDay){
		
		int first_space;
		int feb_days;
		int reference_year;
		
	if(month<=12 && month>=1)
	    {
	    for(first_space=1,reference_year=0;reference_year<(year-1900);reference_year++)
	    {
	      if(reference_year%4==0 && reference_year%100!=0 || reference_year%400==100)
	       first_space=(first_space+366)%7;
	      else
	       first_space=(first_space+365)%7;   
	     }    //�n���D�U�@�~��1/1�b�P���X,%7�O�N��e�����X�ӪŮ�
	    
	      //�p��2��Ѽ� 
	      if(year%4==0 && year%100!=0 || year%400==0) 
	       {feb_days =29;}
	    else
	       {feb_days=28;}
	      
	      
	    int space[]={0,first_space,0,0,0,0,0,0,0,0,0,0,0};   
	    int days[]={0,31,feb_days,31,30,31,30,31,31,30,31,30,31}; 
	    
	    for(int i=1;i<month;i++)
			    space[i+1]=(space[i]+days[i])%7;
	     
	    
	    switch(((inputDay+space[month])%7))
        
        {case 0 :System.out.println("\n\n"+"           "+"�o�ѬO�P����");
        break;
        case 1 :System.out.println("\n\n"+"           "+"�o�ѬO�P����");
        break;
        case 2 :System.out.println("\n\n"+"           "+"�o�ѬO�P���@");
        break;
        
        case 3 :System.out.println("\n\n"+"           "+"�o�ѬO�P���G");
        break;
        case 4 :System.out.println("\n\n"+"           "+"�o�ѬO�P���T");
        break;
        case 5 :System.out.println("\n\n"+"           "+"�o�ѬO�P���|");
        break;
        case 6 :System.out.println("\n\n"+"           "+"�o�ѬO�P����");
        /*case 0 :return 6;
        
        case 1 :return 7;
        
        case 2 :return 1;
        
        case 3 :return 2;
        
        case 4 :return 3;
       
        case 5 :return 4;
        
        case 6 :return 5;
        */}
       
        System.out.printf("\n");

}
	System.out.printf("");
	
	}

}
