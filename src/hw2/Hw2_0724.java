package hw2;
/*************************************************************************
 * FileName       	[ Hw2_0724.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file shows options and some imformation that can be chosen.]
 * Author         	[ �\�ꫮ ]
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
		/*System.out.println("1.�P�_�O�_���|�~\n" + "2.��J�~��Ǧ^���X��\n" + "3.��J�~���Ǧ^�P���X\n"
							+ "4.��J�~��Ǧ^��� \n" + "5.��J�~�Ǧ^���X�Ӥ���\n");*/
		//int input = scan.nextInt();
		while(true){
			System.out.println("1.�P�_�O�_���|�~\n" + "2.��J�~��Ǧ^���X��\n" + "3.��J�~���Ǧ^�P���X\n"
					+ "4.��J�~��Ǧ^��� \n" + "5.��J�~�Ǧ^���X�Ӥ���\n"+ "\n��J-1�h����j��");
			
		int input = scan.nextInt();
		switch(input)
		{
		case 1: System.out.printf("�п�J�褸");
	            System.out.printf("\n");
			    year=scan.nextInt();
	            LeapYear case1 = new LeapYear();
	            //case1.LeapYear(year);
		        
	            if(case1.LeapYear(year)==true){
		        	System.out.println("\n�o�~�O�|�~");
		        }
	            else
	            {
	            	System.out.println("\n�o�~���O�|�~");
	            }
	            
	            break;
/*************************************************************************/
		case 2:
			System.out.printf("�п�J�褸");
            System.out.printf("\n");

            year=scan.nextInt();
            LeapYear case2 = new LeapYear();
            //case1.LeapYear(year); 
            if(case2.LeapYear(year)==true){
	        	System.out.println("\n�o�~��366��");
	        }
            else
            {
            	System.out.println("\n�o�~��365��");
            }
            
            break;
 /*************************************************************************/
		case 3:
		System.out.printf("�п�J�褸");
	    System.out.printf("\n");
	    year=scan.nextInt();
	    
	    System.out.printf("�п�J���");
	    System.out.printf("\n");
	    month=scan.nextInt();
  
	    System.out.printf("�п�J���");
	    System.out.printf("\n");
	    inputDay=scan.nextInt();
			
	    DirectDay case3 = new DirectDay();
        case3.DirectDay(month,year,inputDay);
        
	    break;
/*************************************************************************/
		case 4:
			System.out.printf("�п�J�褸");
		    System.out.printf("\n");
		    year=scan.nextInt();
		    
		    System.out.printf("�п�J���");
		    System.out.printf("\n");
		    month=scan.nextInt();
		    
		    calendar case4 = new calendar();
		    case4.calendar(month,year);
		    
			break;
/*************************************************************************/
			
		case 5:
			System.out.printf("�п�J�褸");
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
			System.out.println("����J���T��\n");
			
/*************************************************************************/
		}
		if(k==1){
			break;
		}
		continue;
		}
	}

}
