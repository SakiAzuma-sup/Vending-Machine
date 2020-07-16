package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseFirst {

	//Å‰‚Ì‘€ì‘I‘ğ
	public static String choosefirst() {
		
		//‘€ì‘I‘ğ‰æ–Ê
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE1);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_DISPLAY_FIRST1);
		System.out.println(Word.MSG_DISPLAY_FIRST2);
		System.out.println(Word.MSG_DISPLAY_FINISH);
		System.out.println(Word.MSG_DISPLAY_FIRST3);
		System.out.println(Word.MSG_BAR);
		System.out.print(Word.MSG_CHOOSE2);
		
		//operation‚É‘€ì”Ô†‚ğ‘ã“ü
		BufferedReader sousa = new BufferedReader(new InputStreamReader(System.in));
		String operation = null;
			try {
				operation = sousa.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		//operation(‘€ì”Ô†/StringŒ^)‚ğ•Ô‚·	
		return operation;
		
		
	

	}
}
