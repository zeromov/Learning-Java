//测试自动转型和强制转型

public class TestCast{
		public static void main(String args[]){
			byte b = 123;    //int 在 byte范围内可转
			//byte c2 = 300;    //不能转
			//char c = -3; 
			char c2 = 'a';
			int i = c2;
			long d01=123213;
			float f = d01;
			
			//测试强制转换类型
			int i2 = -100;
			char c3 = (char)i2; //-100 超过char表述范围 转化成无意义的值
			System.out.println(c3);
			
			//表达式中的类型提升问题
			
			int x = 3;
			long y = 4;
			int z = (int)(x+y);   //做所有的二元运算符,都会有类型提升的问题
			
			
			/*
			int money = 1000000000;//10 亿
			int year = 20;
			int total = money * year;//返回的是负数
			System.out.println(total);				
			*/
			
			int money =1000000000;
			int year = 20;
			long total = (long)money*year;
			System.out.println(total);
			
			//一个人70年心跳多少次
			
			long times = 70*60*24*365*70
			
					}
	}