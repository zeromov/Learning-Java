public class TestVariable{
	
	
	int t = 5;//直接隶属于类，所以为实例变量
		public static void main(String[] args){
	    //			int a;//使用前必须先声明和初始化
				int a = 5;//属于Main方法内的变量，属于局部变量
				int x=0,y,z;//建议分开写，比较清晰
				System.out.println(a);
				System.out.println(x);
				
				final int C = 34;  //最终变量，之内被赋值一次    //常量一般用大写
		//		C=35;  bug：无法为c分配值
				final int MAX_SPEED = 120;//可以用下划线便于识别
		          
				
			}
	}