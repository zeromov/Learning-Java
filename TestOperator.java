public class TestOperator{
		public static void main(String[] args){
				int d = 10%3;
				double f = 10.3%3;//小数也可以取余数
				System.out.println(d);//取余 
				
				int a = 3;
				int b = a++;//执行完后，b=3,a=4   先赋值，再自增
				int c = ++a; //执行完后 a=5 ,c=5   先自增，再赋值
				
				
				//int c = 3/0;//0不能做除数  会有异常 Exception
				
				boolean h = 1>2&&2>(3/0); // 执行完&&已停止
				
				
				int m = 8;//   1000
				int n = 4;//   0100
				System.out.println(m&n);//输出 0000
				System.out.println(m|n);//输出 1100
				System.out.println(~m); //输出 0111  ？？输出-9
				
				int u = 3*2*2;
				int i = 3<<2;//相当于 3*2*2*2
				int o = 12/2/2;
				int p = 12>>2;  //右移两位  相当于除4
				
				System.out.println(u);
				System.out.println(i);
				System.out.println(o);
				System.out.println(p);
				
				
				//扩展运算符
				
			int g = 3;
			g += 5;// g = g+5
			
			System.out.println(4+"5");//输出45   字符串前有+,变为字符串相连
			
			//三目条件运算符 X？Y:Z
			
			int n1 = 3;
			int m1 = 5;
			String str = "";
			if(n1<m1){
				str = "n1<m1";
				}else{
					str = "n1>m1";
					}
			System.out.println(str);
			
			String str2 = "";
			str2 = (n1<m1)?"n1<m1":"n1>m1";
			System.out.println(str2);	
			
			
									}
}