public class TestFloatType{
	 
	 public static void main (String[] args){
	 	     float a = 3.14F;   //3.14 浮点数默认类型为double
	 	     double b = 0.75;   
	 	     
	 	     
	 	     float f = 0.1f;
	 	     double d = 1.0/10;
	 	     System.out.println(f==d);//false   浮点数在系统表示有误差
	 	     System.out.println(f); // 0.1  
	 	     System.out.println(d);  //0.1
	 	     
	 	}
	}
		