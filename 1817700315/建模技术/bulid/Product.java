package bulid;

import java.util.ArrayList;

//Product类—产品类，由多个部件组成
public class Product
{
	ArrayList<String>	parts	= new ArrayList<String>();

	public void add(String part)
	{
		parts.add(part);
	}

	public void show()
	{
		System.out.println("产品 创建----");
		
		for (String part : parts)
		{
			System.out.println(part);
		}
	}
}
//Builder类—抽象建造者类，确定产品由两个部件PartA和PartB组成，并声明一个得到产品建造后结果的方法getResult
abstract class Builder
{
	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();
}
//ConcreteBuilder1类—具体建造者类
class ConcreteBuilder1 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("部件A");
	}

	public void buildPartB()
	{
		product.add("部件B");
	}

	public Product getResult()
	{
		return product;
	}

}
// ConcreteBuilder2类—具体建造者类
class ConcreteBuilder2 extends Builder
{
	private Product	product	= new Product();

	public void buildPartA()
	{
		product.add("部件X");
	}

	public void buildPartB()
	{
		product.add("部件Y");
	}

	public Product getResult()
	{
		return product;
	}

}
//Director类—指挥类
class Director
{
	public void construct(Builder builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}
}

