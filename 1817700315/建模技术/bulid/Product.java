package bulid;

import java.util.ArrayList;

//Product�ࡪ��Ʒ�࣬�ɶ���������
public class Product
{
	ArrayList<String>	parts	= new ArrayList<String>();

	public void add(String part)
	{
		parts.add(part);
	}

	public void show()
	{
		System.out.println("��Ʒ ����----");
		
		for (String part : parts)
		{
			System.out.println(part);
		}
	}
}
//Builder�ࡪ���������࣬ȷ����Ʒ����������PartA��PartB��ɣ�������һ���õ���Ʒ��������ķ���getResult
abstract class Builder
{
	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();
}
//ConcreteBuilder1�ࡪ���彨������
class ConcreteBuilder1 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("����A");
	}

	public void buildPartB()
	{
		product.add("����B");
	}

	public Product getResult()
	{
		return product;
	}

}
// ConcreteBuilder2�ࡪ���彨������
class ConcreteBuilder2 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("����X");
	}

	public void buildPartB()
	{
		product.add("����Y");
	}

	public Product getResult()
	{
		return product;
	}

}
//Director�ࡪָ����
class Director
{
	public void construct(Builder builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}
}

