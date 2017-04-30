//测试Char

public class TestCharType{
			public static void main(String args[]){
				   
				  char c1 = 'a';
				  char c2 = '伍';//Unicode    0-65536表示范围
				  char c3 = '\\'; 
				  char c4 = '\t';  //制表符
				  char c5 = '\n';   // 换行符
				  
				  char c6 = 'a';  // 对应ascii  97
				  int i = c6 + 2;
				  char c7 = (char)i;
				  
				  boolean x = true;
				  if(x){
				  		System.out.println("true");
				  	}
				  
				  System.out.println(c1);  // println表示打印并切换行
				  System.out.println(c2);  // println表示打印并切换行
				  System.out.println(c4);   //输出   \
				  System.out.println(c3); 
				  System.out.println(c6); //输出 a 
				  System.out.println(i);   //输出99
				  System.out.println(c7);  //整数转char需要强制转型     输出c
				  
				  //循环打印a-z
				  for(int j = 0;j<26;j++){
				  	char temp = (char)(c6+j);
				  	System.out.print(temp);				  	}
				  
				}
	}