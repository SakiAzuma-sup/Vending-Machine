package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseLast {

	//ΕγΜμIπ
	public String chooselast() {
		
		//μIπζΚ
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE1);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_DISPLAY_LAST1);
		System.out.println(Word.MSG_DISPLAY_LAST2);
		System.out.println(Word.MSG_DISPLAY_FINISH);
		System.out.println(Word.MSG_BAR);
		
		System.out.print(Word.MSG_CHOOSE2);
		
		//lastΙIΉμΤπγό
		BufferedReader tmp7 = new BufferedReader(new InputStreamReader(System.in));
		String last = null;
		try {
			last = tmp7.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	//last(IΉμΤ/String^)πΤ·	
	return last;
		
	}

}
