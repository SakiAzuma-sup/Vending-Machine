package Machine;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		System.out.println(Word.MSG_OPENING1);
	
		boolean ok = true;
		
		//ChooseFirst��9(�I��)���I�΂��܂ő���
		while(ok) {
			
			ChooseFirst tmp1 = new ChooseFirst();
			String cf1 = tmp1.choosefirst();
			int cf2 = Integer.parseInt(cf1);
			
			//�ŏ��̑���I��(ChooseFirst)
			switch (cf1) {
			//1.���i��I��
			case "1":	//to ���i�I��(ChooseProduct)
				ChooseProduct tmp2 = new ChooseProduct();
				String cp = tmp2.chooseproduct();
				int cp1 = Integer.parseInt(cp);
				
				//���i�I��(ChooseProduct)
				switch(cp1) {
				//1.�R�[��
				case 1:
					//����(PayMoney)--->>>���z�`�F�b�Nok(CheckMoney)
					PayMoney2 tmp23 = new PayMoney2();
					int pm2 = tmp23.paymoney2(cp1);
					
					CheckMoney2 tmp46 = new CheckMoney2();
					boolean cm2 = tmp46.checkmoney2(pm2);
					
					//to �Ō�̑���I��(ChooseLast)
					ChooseLast tmp45 = new ChooseLast();
					String c9 = tmp45.chooselast();
						//
						switch(c9) {
						//1.���i�̏ڍׂ�����
						case "1":
							ListDisplay tmp83 = new ListDisplay();
							String ld2 = tmp83.listdisplay(cp1);
						
						//2.�������𑱂���
						case "2":
							continue;
						
						//9.�I������
						case "9":
							System.out.println(Word.MSG_THANKS1);
							System.out.println(Word.MSG_THANKS2);
							System.exit(0);
							break;
						
						//�G���[
						default:
							System.out.println("");
							System.out.println(Word.MSG_ERROR+System.lineSeparator());
							ChooseLast tmp157 = new ChooseLast();
							String cl3 = tmp157.chooselast();
						}
						break;
				
				//2.�\�[�_
				case 2:
					//����(PayMoney)--->>>���z�`�F�b�Nok(CheckMoney)
					PayMoney3 tmp4 = new PayMoney3();
					int pm1 = tmp4.paymoney3(cp1);
					
					//CheckMoney tmp56 = new CheckMoney();
					//String check = tmp56.checkmoney(pm1);
					
					//to �Ō�̑���I��(ChooseLast)
					ChooseLast tmp6 = new ChooseLast();
					String cl1 = tmp6.chooselast();
						//
						switch(cl1) {
						//1.���i�̏ڍׂ�����
						case "1":
							ListDisplay tmp8 = new ListDisplay();
							String ld = tmp8.listdisplay(cp1);
						
						//2.�������𑱂���
						case "2":
							continue;
						
						//9.�I������
						case "9":
							System.out.println(Word.MSG_THANKS1);
							System.out.println(Word.MSG_THANKS2);
							System.exit(0);
							break;
						
						//�G���[
						default:
							System.out.println("");
							System.out.println(Word.MSG_ERROR+System.lineSeparator());
							ChooseLast tmp15 = new ChooseLast();
							String cl2 = tmp15.chooselast();
							
							
						}
					break;
				
				//�G���[
				default:
					System.out.println("");
					System.out.println(Word.MSG_ERROR+System.lineSeparator());
					ChooseProduct tmp3 = new ChooseProduct();
					String cp2 = tmp3.chooseproduct();
				}
				break;
				
			//2.����������	
			case "2":
				PayMoney tmp5 = new PayMoney();
				int pm = tmp5.paymoney();
				
				CheckMoney tmp6 = new CheckMoney();
				String cm = tmp6.checkmoney(pm);
				
				//��100�ȏ�̓���
				if(cm=="cola") {	
				ChooseProduct tmp13 = new ChooseProduct();
				String cp2 = tmp13.chooseproduct();
				int cp3 = Integer.parseInt(cp2);
				
				
				//to �Ō�̑���I��(ChooseLast)
				ChooseLast tmp451 = new ChooseLast();
				String c10 = tmp451.chooselast();
					//
					switch(c10) {
					//1.���i�̏ڍׂ�����
					case "1":
						ListDisplay tmp831 = new ListDisplay();
						String ld3 = tmp831.listdisplay(cp3);
					
					//2.�������𑱂���
					case "2":
						continue;
					
					//9.�I������
					case "9":
						System.out.println(Word.MSG_THANKS1);
						System.out.println(Word.MSG_THANKS2);
						System.exit(0);
						break;
					
					//�G���[	
					default:
						System.out.println("");
						System.out.println(Word.MSG_ERROR+System.lineSeparator());
						ChooseLast tmp158 = new ChooseLast();
						String cl4 = tmp158.chooselast();
					}
				}
				//��80�ȏく100�����̓���
				if(cm=="soda") {
					ChooseProduct2 tmp65 = new ChooseProduct2();
					String cp5 = tmp65.chooseproduct2();
					int cp6 = Integer.parseInt(cp5);
					
					//to �Ō�̑���I��(ChooseLast)
					ChooseLast tmp451 = new ChooseLast();
					String c10 = tmp451.chooselast();
						//
						switch(c10) {
						//1.���i�̏ڍׂ�����
						case "1":
							ListDisplay tmp831 = new ListDisplay();
							String ld3 = tmp831.listdisplay(cp6);
						
						//2.�������𑱂���
						case "2":
							continue;
						
						//9.�I������
						case "9":
							System.out.println(Word.MSG_THANKS1);
							System.out.println(Word.MSG_THANKS2);
							System.exit(0);
							break;
						
						//�G���[
						default:
							System.out.println("");
							System.out.println(Word.MSG_ERROR+System.lineSeparator());
							ChooseLast tmp158 = new ChooseLast();
							String cl4 = tmp158.chooselast();
						}
				
				}
				break;
			
				
			//x.pass
			case "19980301":
				Management m = new Management();
				break;
			
			//9.�I������
			case "9":
				System.out.println(Word.MSG_THANKS1);
				System.out.println(Word.MSG_THANKS2);
				ok = false;
				break;
			
			//�G���[
			default:
				System.out.println("");
				System.out.println(Word.MSG_ERROR);
				continue;
			}
			
		}
	}
			
			
			
		
		
	}

