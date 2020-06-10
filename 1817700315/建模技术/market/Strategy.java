package market;

//Strategy�࣬��������֧�ֵ��㷨�Ĺ����ӿ�
public interface Strategy
{
	public void algorithmInterface();
}
//ConcreteStrategy��װ�˾�����㷨����Ϊ���̳���Strategy
class ConcreteStrategyA implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("�㷨Aʵ��");
	}
}
class ConcreteStrategyB implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("�㷨Aʵ��");
	}
}
class ConcreteStrategyC implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("�㷨Cʵ��");
	}
}
//Context��һ��ConcreteStrategy�����ã�ά��һ����Strategy���������
class Context
{
	private Strategy	strategy;

	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void contextInterface()
	{
		strategy.algorithmInterface();
	}
}
