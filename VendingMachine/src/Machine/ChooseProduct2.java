package Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseProduct2 {
	
	//���i��I��(�\�[�_�̂�)
	public String chooseproduct2() {
		//���i�I�����
		System.out.println("");
		System.out.println(Word.MSG_CHOOSE3);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_PRODUCT2);
		System.out.println(Word.MSG_BAR);
		System.out.println(Word.MSG_CHOOSE4);
		
		BufferedReader sinamono = new BufferedReader(new InputStreamReader(System.in));
		String sentaku = null;
			try {
				sentaku = sinamono.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		//sentaku(���i�ԍ�/String�^)��Ԃ�
		return sentaku;
			
		
	}

}
