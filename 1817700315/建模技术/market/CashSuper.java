package market;

//现金收费接口
public interface CashSuper
{
	public double acceptCash(double money);
}
//正常收费子类
class CashNormal implements CashSuper
{

	public double acceptCash(double money)
	{
		return money;
	}
}
//打折收费子类
class CashRebate implements CashSuper
{
	private double	moneyRebate	= 1;

	public CashRebate(double moneyRebate)
	{
		this.moneyRebate = moneyRebate;
	}

	public double acceptCash(double money)
	{
		return money * moneyRebate;
	}
}
//返利收费子类
class CashReturn implements CashSuper
{
	private double	moneyCondition	= 0;
	private double	moneyReturn		= 0;

	public CashReturn(double moneyCondition, double moneyReturn)
	{
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	public double acceptCash(double money)
	{
		double result = money;
		if (money >= moneyCondition)
		{
			result = money - money / moneyCondition * moneyReturn;
		}
		return result;
	}
}
//现金收费工厂类
class CashFactory
{
	public static CashSuper createCash(String type)
	{
		CashSuper cs = null;
		if ("正常收费".equals(type))
		{
			cs = new CashNormal();
		}
		else if ("满300返100".equals(type))
		{
			cs = new CashReturn(300, 100);
		}
		else if ("打8折".equals(type))
		{
			cs = new CashRebate(0.8);
		}
		
		return cs;
	}
}