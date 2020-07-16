package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//入金スタートの場合
public class CheckMoney {
	
	public String checkmoney(int kane) {

		String check = null;
	
			Scanner scanner = new Scanner(System.in);
		
			while(kane<80) {
			
				System.out.println("");
				System.out.println(Word.MSG_PAY_CHECK1);
				System.out.println(Word.MSG_PAY1+System.lineSeparator());
				System.out.println(Word.MSG_PAY_CHECK2+kane);
				System.out.print(Word.MSG_PAY_CHECK3);
				kane = kane+scanner.nextInt();
				

			}
			check = "soda";
			
		boolean donai = true;	
		
		
	if(kane<=80) {
		while(donai) {			
		
			if(kane<100) {
			System.out.println("");
			System.out.println(Word.MSG_CHOOSE1);
			System.out.println("");
			System.out.println(Word.MSG_PAY_CHECK4+System.lineSeparator());
			System.out.println(Word.MSG_BAR);
			System.out.println(Word.MSG_DISPLAY_FIRST1);
			System.out.println(Word.MSG_PAY_CHECK5);
			System.out.println(Word.MSG_DISPLAY_FINISH);
			System.out.println(Word.MSG_BAR);
			System.out.println(Word.MSG_CHOOSE2);
			
			
			BufferedReader tmp118 = new BufferedReader(new InputStreamReader(System.in));
			String dosuru = null;
			try {
				dosuru = tmp118.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			switch(dosuru) {
			case "1":
				donai=false;				
				break;
				
			case "2":
				while(kane<100) {
					
					System.out.println("");
					System.out.println(Word.MSG_PAY1+System.lineSeparator());
					System.out.println(Word.MSG_PAY_CHECK2+kane);
					System.out.print(Word.MSG_PAY_CHECK3);
					kane = kane+scanner.nextInt();
				}
				donai=false;				
				check = "cola";
				break;
					
			case "9":
				System.out.println(Word.MSG_THANKS1);
				System.out.println(Word.MSG_THANKS2);
				donai=false;				
				System.exit(0);
				
			default:
				System.out.println(Word.MSG_ERROR);
				System.out.println("");
				donai=true;				
				
			}
			
			}
		}
		}
			
			if(kane>=100) {
				check = "cola";
			}

	
			return check;

	}
}
