package com.vstl.Array;

public class ArrayExample {
	
	
	public void getArrayStringData() {
		
	
	String strData[][]= {{"Rani","9867452345"},
		             	{"Priti","9545129042"},
			            {"Sonal","7040827153"} };
	
	
	
    for (String[]innerArray:strData) {
		   for(String strData1:innerArray) {
		    	
			   System.out.println("Name:"+strData[0][0]);
			   
			   System.out.println("Phone:"+strData[1][1]);
		}
	}
	}

	public void getmultipalvalues() {
	int intvalue[][]= {{12,34,78},
			           {11,35,79},
			           {10,36,80},
			           {9,37,81}};
	
	int [][]intvalueofMaterial=new int[4][3];
	
	intvalueofMaterial[0][0]=12;
	intvalueofMaterial[0][1]=34;
	intvalueofMaterial[0][2]=78;
	
	intvalueofMaterial[1][0]=11;
	intvalueofMaterial[1][1]=35;
	intvalueofMaterial[1][2]=79;
	
	intvalueofMaterial[2][0]=10;
	intvalueofMaterial[2][1]=36;
	intvalueofMaterial[2][2]=80;
	
	intvalueofMaterial[3][0]=9;
	intvalueofMaterial[3][1]=37;
	intvalueofMaterial[3][2]=81;
	
	
	
	System.out.println("Array is "+intvalueofMaterial[0][1]);
	System.out.println("Array is "+intvalueofMaterial[1][1]);
	System.out.println("Array is "+intvalueofMaterial[2][1]);
	
	
	
	
}
}
