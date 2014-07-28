/**********************************************************************
 * FileName       	[ AllSatSunday.java ]
 * PackageName    	[ hw2 ]
 * JavaProjectName	[ Hw2_0724 ]
 * Synopsis       	[ This file is to show the Sunday and Saturday all of year.]
 * Author         	[ �\�ꫮ ]
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
	    	if(feb_days==28){                                        //�D�|�~��  �n�P�_�|�~�O�]�ѼƷ|�v�T�즳�X�Ӥ���
	    	mod=(first_space+365)%7;
	    	week=(first_space+365)/7;
	    	if(mod==0){
	    		System.out.println("\n�o�~��"+week*2+"�Ӥ���\n");         // 1/1�e �S���Ů�  �Y�̫�]�S�Ů�h��week*2�Ӥ���
	    	}
	    	else{
	    		System.out.println("\n�o�~��"+((week*2)+1)+"�Ӥ���\n");   // 1/1�e �S���Ů�  �Y�̫�]���Ů�h��week*2+1�Ӥ���
	    															 // �]�����l�ƥN��§���� �S��§����
	    	}
	    	}
	    	else                                                     //�|�~��
	    	{
		    	mod=(first_space+366)%7;
		    	week=(first_space+366)/7;
		    	
		    	if(mod==0){
		    		System.out.println("\n�o�~��"+week*2+"�Ӥ���\n");     //��z�P�W
		    	}
		    	else{
		    		System.out.println("\n�o�~��"+((week*2)+1)+"�Ӥ���\n");  //��z�P�W
		    	}
		    	}

	    }
	    
	    if((first_space%7)!=0){
	    	if(feb_days==28){
		    	mod=(first_space+365)%7;                  //�Y�e�����Ů��  ,����e���Ů�ɺ�
		    	week=(first_space+365)/7;
		    	if(mod==0){
		    		System.out.println("\n�o�~��"+((week*2)-1)+"�Ӥ���\n");   //�]����e���Ů�ɺ�,�ҥH�Һ�X��week*2�Ӥ���|�h�@��§����  �n�A-1
		    	}
		    	else{
		    		System.out.println("\n�o�~��"+((week*2))+"�Ӥ���\n");     //�Ymod�D0  �h�|�b�S�ɧ�week������§���h�o��@��§����  �ҥH-1+1=0
		    	}
		    	}
		    	else                                                    //�|�~��
		    	{
			    	mod=(first_space+366)%7;
			    	week=(first_space+366)/7;
			    	
			    	if(mod==0){
			    		System.out.println("\n�o�~��"+((week*2)-1)+"�Ӥ���\n");   //��z�P�W
			    	}
			    	else{
			    		System.out.println("\n�o�~��"+((week*2))+"�Ӥ���\n");    //��z�P�W
			    	}
			    	}
	    }
     
}

	
}


