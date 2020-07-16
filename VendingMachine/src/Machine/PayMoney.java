package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import JuiceMachine.CheckMoney;

public class PayMoney {

	//“ü‹à‰æ–Ê‚©‚çƒXƒ^[ƒg
	public int paymoney() {
		
		//“ü‹à‰æ–Ê
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//money‚É“ü—Í‚³‚ê‚½‹àŠz‚ğ‘ã“ü
		BufferedReader tmp11 = new BufferedReader(new InputStreamReader(System.in));
		String money = null;
		try {
			money = tmp11.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//money(StringŒ^)‚ğpay(intŒ^)‚É•ÏŠ·	
		int pay = Integer.parseInt(money);
	
	//pay(“Š“ü‹àŠz/intŒ^)‚ğ•Ô‚·	
	return pay;	
	}

}
