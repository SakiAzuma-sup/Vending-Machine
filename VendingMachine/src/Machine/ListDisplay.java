package Machine;

import java.util.ArrayList;
import java.util.List;

public class ListDisplay {

	//���i�̏ڍׂ�����
	public String listdisplay(int shohin){
		//���i�ڍ�
		ArrayList<String> display = new ArrayList<>();
			display.add("��� : �Y�_���� | ���ޗ��� : ���ށi�ʓ��Ԃǂ����t���A�����j�A�Y�_�A�J�������F�f�A�_�����A�����A�J�t�F�C���@|�@�G�l���M�[ : 45kcal/100ml");
			display.add("��� : �Y�_���� | ���ޗ��� : ���A��_���Y�f�A�����b���A���_�l���@|�@�G�l���M�[ : 0kcal/100ml");
		
		//���i�ڍׂ�\��
		System.out.println(display.get(shohin-1));
		System.out.println("");
	
	//�ʂɂ����
	String hoge = null;
	return hoge;
	}
}
