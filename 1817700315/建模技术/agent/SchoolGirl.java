package agent;

//��׷������
public class SchoolGirl
{
	public String	name;

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
//������
class Proxy
{
	SchoolGirl	mm;

	public Proxy(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " ����������");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " �����ʻ�");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " �����ɿ���");
	}
}

