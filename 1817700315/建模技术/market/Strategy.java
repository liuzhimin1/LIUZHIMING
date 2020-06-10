package market;

//Strategy类，定义所有支持的算法的公共接口
public interface Strategy
{
	public void algorithmInterface();
}
//ConcreteStrategy封装了具体的算法或行为，继承于Strategy
class ConcreteStrategyA implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("算法A实现");
	}
}
class ConcreteStrategyB implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("算法A实现");
	}
}
class ConcreteStrategyC implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("算法C实现");
	}
}
//Context用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
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
