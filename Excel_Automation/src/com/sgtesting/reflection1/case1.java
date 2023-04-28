package com.sgtesting.reflection1;

import java.lang.reflect.Method;

public class case1 {

	public static void main(String[] args) {
		SampleDemo obj=new SampleDemo();
		try
		{
			Method a[]=obj.getClass().getMethods();
			for(int i=0;i<a.length;i++)
			{
				String b=a[i].getName();
				System.out.println(b);
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
