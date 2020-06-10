package watch;

import java.util.ArrayList;

//Subject�࣬�ɷ���Ϊ��������֪ͨ�ߣ�һ����һ���������һ���ӿ�ʵ�֡��������жԹ۲��߶�������ñ�����һ���ۼ����棬ÿ�����ⶼ�������κ������Ĺ۲��ߡ����������ṩһ���ӿڣ��������غ�ɾ���۲��߶���
@SuppressWarnings("hiding")
public abstract class Subject<observers, observers1>
{
	private ArrayList<Observer>	observers	= new ArrayList<Observer>();

	public void attach(Observer observer)
	{
		observers.add(observer);
	}

	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	public void announce()
	{
		for (Observer obj : observers)
		{
			obj.update();
		}
	}
}
//Observer�࣬����۲��ߣ�Ϊ���еľ���۲��߶���һ���ӿڣ��ڵõ������֪ͨʱ�����Լ�������ӿڽ������½ӿڡ�����۲���һ����һ�����������һ���ӿ�ʵ�֡����½ӿ�ͨ������һ��update()��������������������·�����
 abstract class Observer
{
	public abstract void update();
}
//ConcreteSubject�࣬����������������֪ͨ�ߣ����й�״̬�������۲��߶����ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ�����������ɫͨ����һ����������ʵ�֡�
class ConcreteSubject extends Subject<Object, Object>
{
	// ���屻�۲���״̬
	private String	subjectState;

	public String getSubjectState()
	{
		return subjectState;
	}

	public void setSubjectState(String subjectState)
	{
		this.subjectState = subjectState;
	}
}
//ConcreteObserver�࣬����۲��ߣ�ʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬��Э��������۲��߽�ɫ���Ա���һ��ָ����������������á�����۲��߽�ɫͨ����һ����������ʵ�֡�
class ConcreteObserver extends Observer
{
	private String			name;
	private String			observerState;
	private ConcreteSubject	subject;

	public ConcreteObserver(String name, ConcreteSubject subject)
	{
		this.name = name;
		this.subject = subject;
	}

	public void update()
	{
		observerState = subject.getSubjectState();
		System.out.println("�۲���" + name + "����״̬��" + observerState);
	}

	public ConcreteSubject getSubject()
	{
		return subject;
	}

	public void setSubject(ConcreteSubject subject)
	{
		this.subject = subject;
	}
}
