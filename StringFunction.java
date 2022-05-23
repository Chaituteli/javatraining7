package com.vstl.stringExample;

public class StringFunction {

	//string concatination
	public String getFullName(String strFirstName,String strLastName) {
		
		//String strFullname = strFirstName.concat(strLastName);
		String strFullname = strFirstName+" "+strLastName;
		return strFullname;
		
	}
	
	//
	public String getEngineName(String  strEngineName) {

	return  strEngineName;
	}
	
	public String verifyStrokeWordinEngineName(String  strEngineName) {
		String strArray[]= strEngineName.split(" ");
		String strReturnvalue="";
		for(String string:strArray) {
			if(string.equals("stroke")) {
				 strReturnvalue=string;
				break;
			}
		}
		return  strReturnvalue ;
		
	}
	
	
	
	
	
	
	
}
