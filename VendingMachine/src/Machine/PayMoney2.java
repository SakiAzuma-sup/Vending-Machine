package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PayMoney2 {

	//��100
	//�R�[��
	public int paymoney2(int tansan) {//cp1
		
		//�������
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//���͂��ꂽ���z����
		BufferedReader tmp19 = new BufferedReader(new InputStreamReader(System.in));
		String yukiti = null;
		try {
			yukiti = tmp19.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//yukiti(String�^)��yukichi(int�^)�ɕϊ�	
		int yukichi = Integer.parseInt(yukiti);
			
		Scanner scanner = new Scanner(System.in);
		
		//��100�ɂȂ�܂Ń��[�v
		while(yukichi<100) {
			
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+yukichi);
			System.out.print(Word.MSG_PAY_CHECK3);
			yukichi = yukichi+scanner.nextInt();
		}
		
		//yukichi(�������z/int�^)��Ԃ�
		return yukichi;	
	}
}
