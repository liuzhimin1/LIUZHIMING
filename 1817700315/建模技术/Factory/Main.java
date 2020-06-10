package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader buffer = null;

		stdin = new InputStreamReader(System.in);
		buffer = new BufferedReader(stdin);

		try
		{
			System.out.print("����������A:");
			double numberA = Double.parseDouble(buffer.readLine());
			System.out.print("��ѡ�������(+��-��*��/):");
			String operator = buffer.readLine();
			System.out.print("����������B:");
			double numberB = Double.parseDouble(buffer.readLine());

			Operation oper = OperationFactory.createOperation(operator);
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			try {
				System.out.println("�����:" + oper.getResult());
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
