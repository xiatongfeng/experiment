package com.string.mytest;

import org.apache.commons.lang3.StringUtils;

class Stringex extends StringU{
	boolean empty(CharSequence cs)
	{
		return true;
	}
}

public class StringU {
		String string;
	boolean empty(CharSequence cs)
	{
		return StringUtils.isEmpty(cs);
	}//判断是否为空 
	
	
	boolean lowercase(CharSequence cs)
	{
		return StringUtils.isAllLowerCase(cs);
	}//判断是否为小写
	
	boolean uppercase(CharSequence cs)
	{
		return StringUtils.isAllUpperCase(cs);
	}//判断是否为大写

	String center(String ch1,int a,String ch2)
	{
		return StringUtils.center(ch1,a,ch2);
	}//使用指定字符ch2填充字符串至指定长度a，并将字符串ch1位于中间
	
		String stringu(CharSequence ss1,CharSequence ss2,int temp) 
		{
			if(empty(ss1)||empty(ss2))
			{
				System.out.println("字符串为空，结束");
				return "";
			}
			else
			{	
				if(uppercase(ss1))
				{
					if(lowercase(ss2))
					{
						String str1=ss1.toString();
						String srt2=ss2.toString();//转化为String类型
						
						string=center(str1, temp, srt2);
						//string=CT(srt2, temp, str1);//错误
						System.out.println(string);
						return string;
					}
					else 
					{System.out.println("第二个字符串不全为小写");
						return "lower";
					}
				}
				
				else
				{
					System.out.println("第一个字符串不是全为大写");
					return "upper";
				}
			}
		}
		
	
}//填充字符串至指定长度，中间为大写，两边为小写


