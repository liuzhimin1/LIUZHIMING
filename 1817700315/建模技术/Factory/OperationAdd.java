package Factory;

public class OperationAdd extends Operation
{
	public double getResult()
	{
		double result = 0;
		result = getNumberA() + getNumberB();
		return result;
	}
}

class OperationSub extends Operation
{
	public double getResult()
	{
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
}
 class OperationMul extends Operation
{
	public double getResult()
	{
		double result = 0;
		result = getNumberA() * getNumberB();
		return result;
	}
}

 class OperationDiv extends Operation
{
	public double getResult() throws Exception
	{
		double result = 0;
		if (getNumberB() == 0)
		{
			throw new Exception("除数不能为0");
		}
		result = getNumberA() / getNumberB();
		return result;
	}
}
