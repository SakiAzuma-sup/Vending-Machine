package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PayMoney3 {

	//80
	//ƒ\[ƒ_
	public int paymoney3(int tansansui) {
		
		//“ü‹à‰æ–Ê
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//“ü—Í‚³‚ê‚½‹àŠz‚ğ‘ã“ü
		BufferedReader tmp20 = new BufferedReader(new InputStreamReader(System.in));
		String hideo = null;
		try {
			hideo = tmp20.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//hideo(StringŒ^)‚ğhideyo(intŒ^)‚É•ÏŠ·
		int hideyo = Integer.parseInt(hideo);
		
		Scanner scanner = new Scanner(System.in);
		
		//80‚É‚È‚é‚Ü‚Åƒ‹[ƒv
		while(hideyo<80) {
		
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+hideyo);
			System.out.print(Word.MSG_PAY_CHECK3);
			hideyo = hideyo+scanner.nextInt();
		}
		
		//hideyo(“Š“ü‹àŠz/intŒ^)‚ğ•Ô‚·
		return hideyo;
	}
}
