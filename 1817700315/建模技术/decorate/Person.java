package decorate;

//Person�ࣨConcreteComponent��
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
		System.out.println("װ���" + name);
	}
}
//�����ࣨDecorator��
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
//��������ࣨConcreteDecorator��
class TShirts extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("��T��");
	}
}
class BigTrouser extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("�����");
	}
}
class Sneakers extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("����Ь");
	}
}
class Suit extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("��װ");
	}
}
class Tie extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("���");
	}
}
class LeatherShoes extends Finery
{
	public void show()
	{
		super.show();
		System.out.println("ƤЬ");
	}
}
