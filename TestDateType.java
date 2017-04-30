public class TestDateType{
		public static void main(String[] args){
				int a =10;
				//byte b = 200;//-128----127
				int a2 = 010; //八进制
				int a3 = 0x10;//16进制
				System.out.println(a);  //输出结果10
			//	System.out.println(b);   只能表示-128---127 
			System.out.println(a2);   //输出结果 8
			System.out.println(a3);   //输出结果 16
			System.out.println(Integer.toBinaryString(a));   //二进制
			System.out.println(Integer.toOctalString(a));   // 8进制
			System.out.println(Integer.toHexString(a));   //16进制
			
			int a5 = 10;
			int a6 = 200;
			byte b2 = 100;//如果数据未超过byte/short/char，则自动转型
			
			
		  long a7 = 123456789011111L;
			}
	}