package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseFirst {

	//最初の操作選択
	public static String choosefirst() {
		
		//操作選択画面
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE1);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_DISPLAY_FIRST1);
		System.out.println(Word.MSG_DISPLAY_FIRST2);
		System.out.println(Word.MSG_DISPLAY_FINISH);
		System.out.println(Word.MSG_DISPLAY_FIRST3);
		System.out.println(Word.MSG_BAR);
		System.out.print(Word.MSG_CHOOSE2);
		
		//operationに操作番号を代入
		BufferedReader sousa = new BufferedReader(new InputStreamReader(System.in));
		String operation = null;
			try {
				operation = sousa.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		//operation(操作番号/String型)を返す	
		return operation;
		
		
	

	}
}
