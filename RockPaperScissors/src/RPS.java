import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-�� ����-");
		System.out.println("p�� ������");
		System.out.println("p�� -3�϶� ���(b) ��!");
		System.out.println("p�� 3�϶� ����(r) ��!");
		System.out.print("���������� ���� ����");
		int p;
		p = 0;
		for (;;) {
			System.out.println("����Ʈ�� " + p);
			int r;
			r = 0;
			int b;
			b = 0;

			System.out.println("1.���� 2.���� 3.��");
			System.out.print("r�� ���� :");
			r = sc.nextInt();
			System.out.print("b�� ���� :");
			b = sc.nextInt();
// ========================r win=====================
			if (r == 1 && b == 3) {
				System.out.println("r ��!");
				p += 1;
			} else if (r == 2 && b == 1) {
				System.out.println("r ��!");
				p += 1;
			} else if (r == 3 && b == 2) {
				System.out.println("r ��!");
				p += 1;
			}
// ========================b win=====================
			else if (r == 3 && b == 1) {
				System.out.println("b ��!");
				p -= 1;
			} else if (r == 1 && b == 2) {
				System.out.println("b ��!");
				p -= 1;
			} else if (r == 2 && b == 3) {
				System.out.println("b ��!");
				p -= 1;
			}
// ===================================================			
			else {
				System.out.println("���");
			}
//=========================END========================
			if (p == 3) {
				System.out.println("���� ��!" + p);
				return;
			} else if (p == -3) {
				System.out.println("��� ��!" + p);
				return;
			}
		}
	}
}