package com.vstl.stringExample;

public class StringBufers {

	public void getStudentname() {
		
		//Buffer:- we will use it because it will not impact on other obj.Bcz Strings are immutable so we will use Buffer to make it mutable
				//thread safe.
				     //APPEND
				
				String strArray[]= {"Adarsh","Nikhil","Aniket","Abhishek","Ritesh","Shubham"};
				
				StringBuffer strName = new StringBuffer("Ritesh");
				strName.append("Nikhil");
				strName.append('k');
				
				System.out.println(strName);
			}

			        //delete
		public void getcompanyName() {
				String strCompanyName = "whiteLift";
				
				StringBuffer strCompany = new StringBuffer("leaf");
				strCompany.charAt(3);
				strCompany.delete(0, 2);
				System.out.println(strCompany);
			}
			
			       //INSERTED INTO THE INDEX TO SOME LETTERS
			public void getDoctors() {
				String strDoctersName = "S.D.patane";
				
				StringBuffer strDoctersName1 = new StringBuffer("S.D.patane");
				strDoctersName1.equals("S.D.patane");
				strDoctersName1.insert(0,"shivanad");
				System.out.println(strDoctersName1);
			}
			
			
		//Builder:-It is also same method as Buffer but it is not thread safe.
			
			public void getcollegeName() {
				String strcollegeName = "Sadhana";
				
				StringBuilder strName = new StringBuilder("sadhana");
				//strName.append(" collegeName");
				strName.replace(0, 1, "AT");
				System.out.println(strName);
			}

		}

