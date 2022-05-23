package com.vstl.loops;

public class continewWhileLoop {
	
	
	//Java Program to demonstrate the use of continue statement  
	//inside the while loop.  
	public void ContinueWhile1to17num (){  

	    //while loop  
	    int intnum=1; 
	    while(intnum<=17){  
	        if(intnum==5){  
	            //using continue statement  
	            intnum++;  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(intnum);  
	        intnum++;  
	    }  
	}  
  

   public void oddnumbers() {
	   
	   int intnumber = 50;
	   
	   int oddnumber=1;
	   while(oddnumber<=intnumber) {
		   if(oddnumber%2==1) {
			   System.out.println("odd number:"+oddnumber);
		   }
		   oddnumber++;
		   continue;
	   }
   }
   }
