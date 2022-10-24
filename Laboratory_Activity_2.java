package com.softEng.projects;

public class Laboratory_Activity_2 {
public static void main(String[]args) {
	
	
	String input = "01010200";
	boolean accept = true;
	String state = "q0";
	
	//filter only 0 and 1 within the string character
	for(int i =0; i< input.length();i++)
	{
		char temp_ch = input.charAt(i);
		
		if(temp_ch=='0')
		{
			
		}
		else if(temp_ch == '1')
		{
		 }
		else
		{
			
			accept= false;
			break;
}
	}

	{
		if(accept == true)
		{ 
			for (int i= 0; i<input.length();i++) {
			
			
			char temp =input.charAt(1);
			if (state.equals("q0")&&temp=='0') 
			{
			state="q1";
			
	  
							}
			else if(state.equals("q0")&&temp== '1') 
			{
			 state="q0";	 
			}
			else if(state.equals("q1")&&temp== '0')
			{
				state="q1";
			}
			else if(state.equals("q1")&&temp=='1') {
				state= "q2";
				
			}
			else if(state.equals("q2")&&temp=='0') 
			{
				state = "q1";
			}
			else if(state.equals("q2")&&temp=='1')
			{
			state="q0";	
			}
			if(state.equals("q2"))
			{
			System.out.println("String accepted");	
			}
			
		}
		}
		else {
			System.out.println("String not Accepted");
		}
	}
}
}

