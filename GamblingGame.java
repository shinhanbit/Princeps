package ch4;

import java.util.Scanner;

class Player{		// ������ ǥ���ϴ� Ŭ����
	private String name;		// ���� �̸�, private�� ����
	public Player(String p) {name = p;}		// ������
	String getName() {return name;}
}
public class GamblingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player [] p = new Player [2];		// ���� �迭 ����
		for(int i=0; i<2; i++) {			// �� ������ �̸��� �Է¹޴´�.
			System.out.print("���� �̸� �Է� >>");		// ������Ʈ ���
			p[i] = new Player(scanner.next());		// �� ���� ��ü ����
		}
		int n=0;			// �� ������ ������ �����ϱ� ����, n�� �迭 p[]�� �ε���
		while(true) {
			System.out.print(p[n].getName() + " <Enter�� �ƹ�Ű�� ġ����>");
			scanner.next();			// yŰ�� �а� ����
			int [] val = new int[3];		// ���� ������ ������ ���� �迭 ����
			for(int i=0; i<val.length; i++) {		// 3���� ���� ���� ����
				val[i] = (int)(Math.random()*3);		// 0~2������ ������ �߻�
				System.out.print(val[i] + "\t");		// 3���� ���� ���
			}
			System.out.println();		// �� �� ���
			if(val[0]==val[1] && val[1]==val[2]) {		// ������ ��� ������
				System.out.println(p[n].getName() + "��(��) �¸��Ͽ����ϴ�.");		// �¸��޽��� ���
				break;		// while�� ���
			}
			n++;			// ���� ���� �ε���
			n = n%2;		// �ε����� 2�� �Ǹ� �ٽ� 0���� ������ ����
		}
		scanner.close();
	}
}