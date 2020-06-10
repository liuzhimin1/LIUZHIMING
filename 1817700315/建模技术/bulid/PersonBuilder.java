package bulid;

import java.awt.Graphics;

//画人的抽象类
public abstract class PersonBuilder
{
	protected Graphics	g;

	public PersonBuilder(Graphics g)
	{
		this.g = g;
	}

	public abstract void buildHead();

	public abstract void buildBody();

	public abstract void buildArmLeft();

	public abstract void buildArmRight();

	public abstract void buildLegLeft();

	public abstract void buildLegRight();
}
//瘦子类继承人的抽象类
class PersonThinBuilder extends PersonBuilder
{
	public PersonThinBuilder(Graphics g)
	{
		super(g);
	}

	public void buildArmLeft()
	{
		g.drawLine(60, 80, 40, 130);// 左手
	}

	public void buildArmRight()
	{
		g.drawLine(70, 80, 90, 130);// 右手
	}

	public void buildBody()
	{
		g.fillRect(60, 80, 10, 50);// 身体
	}

	public void buildHead()
	{
		g.fillOval(50, 50, 30, 30);// 头
	}

	public void buildLegLeft()
	{
		g.drawLine(60, 130, 45, 180);// 左腿
	}

	public void buildLegRight()
	{
		g.drawLine(70, 130, 85, 180);// 右腿
	}
}
//胖子类继承人的抽象类
class PersonFatBuilder extends PersonBuilder
{
	public PersonFatBuilder(Graphics g)
	{
		super(g);
	}

	public void buildArmLeft()
	{
		g.drawLine(60, 80, 40, 130);// 左手
	}

	public void buildArmRight()
	{
		g.drawLine(70, 80, 90, 130);// 右手
	}

	public void buildBody()
	{
		g.fillRect(60, 80, 10, 50);// 身体
	}

	public void buildHead()
	{
		g.fillOval(50, 50, 30, 30);// 头
	}

	public void buildLegLeft()
	{
		g.drawLine(60, 130, 45, 180);// 左腿
	}

	public void buildLegRight()
	{
		g.drawLine(70, 130, 85, 180);// 右腿
	}
}
//胖人或高个子其实都是用类似的代码去实现这个类就可以了，在客户端调用时，还是需要知道头身手脚这些方法，所以还缺少建造者模式中一个很重要的类，指挥者（Director），用它来控制建造过程，也用它来隔离用户与建造过程的关联。
class PersonDirector
{
	private PersonBuilder	pb;

	public PersonDirector(PersonBuilder pb)
	{
		this.pb = pb;
	}

	public void createPerson()
	{
		pb.buildHead();
		pb.buildBody();
		pb.buildArmLeft();
		pb.buildArmRight();
		pb.buildLegLeft();
		pb.buildLegRight();
	}
}


