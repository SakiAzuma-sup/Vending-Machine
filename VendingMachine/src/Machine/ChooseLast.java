package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseLast {

	//最後の操作選択
	public String chooselast() {
		
		//操作選択画面
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE1);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_DISPLAY_LAST1);
		System.out.println(Word.MSG_DISPLAY_LAST2);
		System.out.println(Word.MSG_DISPLAY_FINISH);
		System.out.println(Word.MSG_BAR);
		
		System.out.print(Word.MSG_CHOOSE2);
		
		//lastに終了操作番号を代入
		BufferedReader tmp7 = new BufferedReader(new InputStreamReader(System.in));
		String last = null;
		try {
			last = tmp7.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	//last(終了操作番号/String型)を返す	
	return last;
		
	}

}
