/**********************************************************************
 * FileName       	[ AllSatSunday.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to show the Sunday and Saturday all of year.]
 * Author         	[ 砛标 ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/
package hw2;

public class AllSatSunday {
	public void AllSatSunday(int year){
     int first_space;
     int reference_year;
     int mod;
     int week;
     int feb_days;
     for(first_space=1,reference_year=0;reference_year<(year-1900);reference_year++)
	    {
	      if(reference_year%4==0 && reference_year%100!=0 || reference_year%400==100)
	       first_space=(first_space+366)%7;
	      else
	       first_space=(first_space+365)%7;   
	     }
     
     if(year%4==0 && year%100!=0 || year%400==0) 
     {feb_days =29;}
  else
     {feb_days =28;}
     
     
     if((first_space%7)==0)
	    {
	    	if(feb_days==28){                                        //獶秥  璶耞秥琌ぱ计穦紇臫Τ碭せら
	    	mod=(first_space+365)%7;
	    	week=(first_space+365)/7;
	    	if(mod==0){
	    		System.out.println("\n硂Τ"+week*2+"せら\n");         // 1/1玡 ⊿Τ  璝程⊿玥Τweek*2せら
	    	}
	    	else{
	    		System.out.println("\n硂Τ"+((week*2)+1)+"せら\n");   // 1/1玡 ⊿Τ  璝程Τ玥Τweek*2+1せら
	    															 // Τ緇计Τ搂ぱ ⊿Τ搂せ
	    	}
	    	}
	    	else                                                     //秥
	    	{
		    	mod=(first_space+366)%7;
		    	week=(first_space+366)/7;
		    	
		    	if(mod==0){
		    		System.out.println("\n硂Τ"+week*2+"せら\n");     //瞶
		    	}
		    	else{
		    		System.out.println("\n硂Τ"+((week*2)+1)+"せら\n");  //瞶
		    	}
		    	}

	    }
	    
	    if((first_space%7)!=0){
	    	if(feb_days==28){
		    	mod=(first_space+365)%7;                  //璝玡Τ  ,р玡干骸
		    	week=(first_space+365)/7;
		    	if(mod==0){
		    		System.out.println("\n硂Τ"+((week*2)-1)+"せら\n");   //р玡干骸,┮┮衡week*2せら穦搂ぱ  璶-1
		    	}
		    	else{
		    		System.out.println("\n硂Τ"+((week*2))+"せら\n");     //璝mod獶0  玥穦⊿干Чweekê搂眔搂ぱ  ┮-1+1=0
		    	}
		    	}
		    	else                                                    //秥
		    	{
			    	mod=(first_space+366)%7;
			    	week=(first_space+366)/7;
			    	
			    	if(mod==0){
			    		System.out.println("\n硂Τ"+((week*2)-1)+"せら\n");   //瞶
			    	}
			    	else{
			    		System.out.println("\n硂Τ"+((week*2))+"せら\n");    //瞶
			    	}
			    	}
	    }
     
}

	
}


