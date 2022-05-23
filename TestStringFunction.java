package com.vstl.stringExample;

public class TestStringFunction {

	public static void main(String[] args) {
		StringFunction objStringFunction=new StringFunction();
		String strFullname = objStringFunction.getFullName("sanvi", "vibhute");
		System.out.println("full Name:"+strFullname);

	
	
	   String strMashinName = objStringFunction.getEngineName("two Stroke Engine");
	  System.out.println("Engine Name:"+strMashinName);
	
	
	  String strEnginename = "Four stroke diesel Engine";
	String strEngine=objStringFunction.verifyStrokeWordinEngineName(strEnginename);
	  System.out.println("get stroke :"+strEngine);
	  //length
	  System.out.println("get stroke :"+strEngine.length());
	  //to upper case
	  System.out.println("get stroke Upper case : "+strEnginename.toUpperCase());
	  //to Lower case
	  System.out.println("get stroke Lower case: "+strEnginename.toLowerCase());
	  //to charAt
	  System.out.println("get First char: "+strEnginename.charAt(0));
	  System.out.println("get length: "+strEnginename.length());
	  //substring
	  System.out.println("get Substring : "+strEnginename.substring(2));
	  //replace 
	  System.out.println("get Replacing 'T' to 'N' : "+strEnginename.replace('T','N'));
	  //Indexof
	  System.out.println("get indexof: "+strEnginename.lastIndexOf('a'));
	  //equals
	  System.out.println("get equale Machine: "+strEnginename.equals("Machine"));
	  
	}
	}
	
