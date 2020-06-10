package bulid;

import java.awt.Graphics;

//���˵ĳ�����
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
//������̳��˵ĳ�����
class PersonThinBuilder extends PersonBuilder
{
	public PersonThinBuilder(Graphics g)
	{
		super(g);
	}

	public void buildArmLeft()
	{
		g.drawLine(60, 80, 40, 130);// ����
	}

	public void buildArmRight()
	{
		g.drawLine(70, 80, 90, 130);// ����
	}

	public void buildBody()
	{
		g.fillRect(60, 80, 10, 50);// ����
	}

	public void buildHead()
	{
		g.fillOval(50, 50, 30, 30);// ͷ
	}

	public void buildLegLeft()
	{
		g.drawLine(60, 130, 45, 180);// ����
	}

	public void buildLegRight()
	{
		g.drawLine(70, 130, 85, 180);// ����
	}
}
//������̳��˵ĳ�����
class PersonFatBuilder extends PersonBuilder
{
	public PersonFatBuilder(Graphics g)
	{
		super(g);
	}

	public void buildArmLeft()
	{
		g.drawLine(60, 80, 40, 130);// ����
	}

	public void buildArmRight()
	{
		g.drawLine(70, 80, 90, 130);// ����
	}

	public void buildBody()
	{
		g.fillRect(60, 80, 10, 50);// ����
	}

	public void buildHead()
	{
		g.fillOval(50, 50, 30, 30);// ͷ
	}

	public void buildLegLeft()
	{
		g.drawLine(60, 130, 45, 180);// ����
	}

	public void buildLegRight()
	{
		g.drawLine(70, 130, 85, 180);// ����
	}
}
//���˻�߸�����ʵ���������ƵĴ���ȥʵ�������Ϳ����ˣ��ڿͻ��˵���ʱ��������Ҫ֪��ͷ���ֽ���Щ���������Ի�ȱ�ٽ�����ģʽ��һ������Ҫ���ָ࣬���ߣ�Director�������������ƽ�����̣�Ҳ�����������û��뽨����̵Ĺ�����
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


