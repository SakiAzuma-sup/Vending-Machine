package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PayMoney3 {

	//��80
	//�\�[�_
	public int paymoney3(int tansansui) {
		
		//�������
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//���͂��ꂽ���z����
		BufferedReader tmp20 = new BufferedReader(new InputStreamReader(System.in));
		String hideo = null;
		try {
			hideo = tmp20.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//hideo(String�^)��hideyo(int�^)�ɕϊ�
		int hideyo = Integer.parseInt(hideo);
		
		Scanner scanner = new Scanner(System.in);
		
		//��80�ɂȂ�܂Ń��[�v
		while(hideyo<80) {
		
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+hideyo);
			System.out.print(Word.MSG_PAY_CHECK3);
			hideyo = hideyo+scanner.nextInt();
		}
		
		//hideyo(�������z/int�^)��Ԃ�
		return hideyo;
	}
}
