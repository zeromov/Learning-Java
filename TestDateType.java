public class TestDateType{
		public static void main(String[] args){
				int a =10;
				//byte b = 200;//-128----127
				int a2 = 010; //�˽���
				int a3 = 0x10;//16����
				System.out.println(a);  //������10
			//	System.out.println(b);   ֻ�ܱ�ʾ-128---127 
			System.out.println(a2);   //������ 8
			System.out.println(a3);   //������ 16
			System.out.println(Integer.toBinaryString(a));   //������
			System.out.println(Integer.toOctalString(a));   // 8����
			System.out.println(Integer.toHexString(a));   //16����
			
			int a5 = 10;
			int a6 = 200;
			byte b2 = 100;//�������δ����byte/short/char�����Զ�ת��
			
			
		  long a7 = 123456789011111L;
			}
	}