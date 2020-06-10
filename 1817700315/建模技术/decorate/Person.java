package decorate;

//Person类（ConcreteComponent）
public class Person
{
	private String	name;

	public Person()
	{
	}

	public Person(String name)
	{
		this.name = name;
	}

	public void show()
	{
		System.out.println("装扮的" + name);
	}
}
//服饰类（Decorator）
class Finery extends Person
{
	protected Person	component;

	public void decorate(Person component)
	{
		this.component = component;
	}

	public void show()
	{
		if (null != component)
		{
			component.show();
		}
	}
}
//具体服饰类（ConcreteDecorator）
class TShirts extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("大T恤");
	}
}
class BigTrouser extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("大裤衩");
	}
}
class Sneakers extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("破球鞋");
	}
}
class Suit extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("西装");
	}
}
class Tie extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("领带");
	}
}
class LeatherShoes extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("皮鞋");
	}
}
