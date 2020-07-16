package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import JuiceMachine.CheckMoney;

public class PayMoney {

	//入金画面からスタート
	public int paymoney() {
		
		//入金画面
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//moneyに入力された金額を代入
		BufferedReader tmp11 = new BufferedReader(new InputStreamReader(System.in));
		String money = null;
		try {
			money = tmp11.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//money(String型)をpay(int型)に変換	
		int pay = Integer.parseInt(money);
	
	//pay(投入金額/int型)を返す	
	return pay;	
	}

}
