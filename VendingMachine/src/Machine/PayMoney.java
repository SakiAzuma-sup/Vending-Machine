package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import JuiceMachine.CheckMoney;

public class PayMoney {

	//������ʂ���X�^�[�g
	public int paymoney() {
		
		//�������
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//money�ɓ��͂��ꂽ���z����
		BufferedReader tmp11 = new BufferedReader(new InputStreamReader(System.in));
		String money = null;
		try {
			money = tmp11.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//money(String�^)��pay(int�^)�ɕϊ�	
		int pay = Integer.parseInt(money);
	
	//pay(�������z/int�^)��Ԃ�	
	return pay;	
	}

}
