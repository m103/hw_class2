package hw2;
/*************************************************************************
 * FileName       	[ Hw2_0724.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file shows options and some imformation that can be chosen.]
 * Author         	[ 許梓垣 ]
 * Copyright      	[ Copyleft(c) 2014 MITLAB, GIEE, NTUST, Taiwan ]
**************************************************************************/

import java.util.Scanner;
public class Hw2_0724 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int k=0 ;
		int year, month, inputDay; 
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*System.out.println("1.判斷是否為閏年\n" + "2.輸入年月傳回有幾天\n" + "3.輸入年月日傳回星期幾\n"
							+ "4.輸入年月傳回整月 \n" + "5.輸入年傳回有幾個六日\n");*/
		//int input = scan.nextInt();
		while(true){
			System.out.println("1.判斷是否為閏年\n" + "2.輸入年月傳回有幾天\n" + "3.輸入年月日傳回星期幾\n"
					+ "4.輸入年月傳回整月 \n" + "5.輸入年傳回有幾個六日\n"+ "\n輸入-1則中止迴圈");
			
		int input = scan.nextInt();
		switch(input)
		{
		case 1: System.out.printf("請輸入西元");
	            System.out.printf("\n");
			    year=scan.nextInt();
	            LeapYear case1 = new LeapYear();
	            //case1.LeapYear(year);
		        
	            if(case1.LeapYear(year)==true){
		        	System.out.println("\n這年是閏年");
		        }
	            else
	            {
	            	System.out.println("\n這年不是閏年");
	            }
	            
	            break;
/*************************************************************************/
		case 2:
			System.out.printf("請輸入西元");
            System.out.printf("\n");

            year=scan.nextInt();
            LeapYear case2 = new LeapYear();
            //case1.LeapYear(year); 
            if(case2.LeapYear(year)==true){
	        	System.out.println("\n這年有366天");
	        }
            else
            {
            	System.out.println("\n這年有365天");
            }
            
            break;
 /*************************************************************************/
		case 3:
		System.out.printf("請輸入西元");
	    System.out.printf("\n");
	    year=scan.nextInt();
	    
	    System.out.printf("請輸入月份");
	    System.out.printf("\n");
	    month=scan.nextInt();
  
	    System.out.printf("請輸入日期");
	    System.out.printf("\n");
	    inputDay=scan.nextInt();
			
	    DirectDay case3 = new DirectDay();
        case3.DirectDay(month,year,inputDay);
        
	    break;
/*************************************************************************/
		case 4:
			System.out.printf("請輸入西元");
		    System.out.printf("\n");
		    year=scan.nextInt();
		    
		    System.out.printf("請輸入月份");
		    System.out.printf("\n");
		    month=scan.nextInt();
		    
		    calendar case4 = new calendar();
		    case4.calendar(month,year);
		    
			break;
/*************************************************************************/
			
		case 5:
			System.out.printf("請輸入西元");
		    System.out.printf("\n");
		    year=scan.nextInt();
		    
		    AllSatSunday case5 = new AllSatSunday();
		    case5.AllSatSunday(year);
		    
		    break;
		    
/*************************************************************************/
		case -1:
			k=1;
			break;
/*************************************************************************/
		default:
			System.out.println("未輸入正確值\n");
			
/*************************************************************************/
		}
		if(k==1){
			break;
		}
		continue;
		}
	}

}
