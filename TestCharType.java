//����Char

public class TestCharType{
			public static void main(String args[]){
				   
				  char c1 = 'a';
				  char c2 = '��';//Unicode    0-65536��ʾ��Χ
				  char c3 = '\\'; 
				  char c4 = '\t';  //�Ʊ��
				  char c5 = '\n';   // ���з�
				  
				  char c6 = 'a';  // ��Ӧascii  97
				  int i = c6 + 2;
				  char c7 = (char)i;
				  
				  boolean x = true;
				  if(x){
				  		System.out.println("true");
				  	}
				  
				  System.out.println(c1);  // println��ʾ��ӡ���л���
				  System.out.println(c2);  // println��ʾ��ӡ���л���
				  System.out.println(c4);   //���   \
				  System.out.println(c3); 
				  System.out.println(c6); //��� a 
				  System.out.println(i);   //���99
				  System.out.println(c7);  //����תchar��Ҫǿ��ת��     ���c
				  
				  //ѭ����ӡa-z
				  for(int j = 0;j<26;j++){
				  	char temp = (char)(c6+j);
				  	System.out.print(temp);				  	}
				  
				}
	}