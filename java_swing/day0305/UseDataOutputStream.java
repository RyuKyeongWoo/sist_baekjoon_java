package day0305;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *	�⺻�� ���������� �� �� �ִ� ��Ʈ��
 * @author user
 */
public class UseDataOutputStream {
	
	public UseDataOutputStream() throws IOException{
		
		
		DataOutputStream dos = null;//�⺻�� ���������� �������� ��Ʈ��
		DataInputStream dis = null;//�⺻�� ���������� �б����� ��Ʈ��
		try {
			//1. ��Ʈ�� ����
			dos = new DataOutputStream(new FileOutputStream("c:/dev/temp1/write1.txt"));
			dis = new DataInputStream(new FileInputStream("c:/dev/temp1/write1.txt"));
			
			//2. ��Ʈ���� ���
			int data = Integer.MAX_VALUE;
			dos.writeInt(data); // int -> writeInt(), log -> writeLong(), ,,, boolean -> writeBoolean
			dos.writeBoolean(false);
			//3. �������� ����
			dos.flush();
			System.out.println("���ϻ����Ϸ�");
			
			//���Ͽ� ��ϵ� �⺻�� ���������� �о���̱�
			System.out.println("���� : "+dis.readInt());
			System.out.println("�Ҹ� : "+dis.readBoolean());
			          
		}finally {
			if(dos != null) dos.close();
			if(dis != null) dis.close();
		}
	}
	
	public static void main(String[] args) {
			try {
				new UseDataOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}