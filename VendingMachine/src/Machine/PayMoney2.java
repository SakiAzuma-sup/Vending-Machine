package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PayMoney2 {

	//￥100
	//コーラ
	public int paymoney2(int tansan) {//cp1
		
		//入金画面
		System.out.println("");
		System.out.println(Word.MSG_PAY1);
		System.out.print(Word.MSG_PAY2);
		
		//入力された金額を代入
		BufferedReader tmp19 = new BufferedReader(new InputStreamReader(System.in));
		String yukiti = null;
		try {
			yukiti = tmp19.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//yukiti(String型)をyukichi(int型)に変換	
		int yukichi = Integer.parseInt(yukiti);
			
		Scanner scanner = new Scanner(System.in);
		
		//￥100になるまでループ
		while(yukichi<100) {
			
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+yukichi);
			System.out.print(Word.MSG_PAY_CHECK3);
			yukichi = yukichi+scanner.nextInt();
		}
		
		//yukichi(投入金額/int型)を返す
		return yukichi;	
	}
}
