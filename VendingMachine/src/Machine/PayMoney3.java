package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class PayMoney3 {

	//￥80
	//ソーダ
	public int paymoney3(int tansansui) {
		
		//入金画面
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//入力された金額を代入
		BufferedReader tmp20 = new BufferedReader(new InputStreamReader(System.in));
		String hideo = null;
		try {
			hideo = tmp20.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//hideo(String型)をhideyo(int型)に変換
		int hideyo = Integer.parseInt(hideo);
		
		Scanner scanner = new Scanner(System.in);
		
		//￥80になるまでループ
		while(hideyo<80) {
		
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+hideyo);
			System.out.print(Word.MSG_PAY_CHECK3);
			hideyo = hideyo+scanner.nextInt();
		}
		
		//hideyo(投入金額/int型)を返す
		return hideyo;
	}
}
