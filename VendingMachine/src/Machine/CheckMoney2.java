package Machine;

import java.util.*;
import java.io.*;

public class CheckMoney2 {

	//商品選択からスタート(￥100)
	public boolean checkmoney2(int okane) {
		
		boolean check2 = false;

		Scanner scanner = new Scanner(System.in);
		
		//￥100になるまでループ
		while(okane<100) {
			System.out.println(Word.MSG_PAY_CHECK1);
			System.out.println(Word.MSG_PAY1+System.lineSeparator());
			System.out.println(Word.MSG_PAY_CHECK2+okane);
			System.out.print(Word.MSG_PAY_CHECK3);
			okane = okane+scanner.nextInt();
		}
		
		check2 = true;
		
		return check2;
		
		
		
	}
	
	
}
