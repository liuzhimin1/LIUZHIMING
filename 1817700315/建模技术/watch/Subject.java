package watch;

import java.util.ArrayList;

//Subject类，可翻译为主题或抽象通知者，一般用一个抽象类或一个接口实现。它把所有对观察者对象的引用保存在一个聚集里面，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以拉回和删除观察者对象。
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
//Observer类，抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。抽象观察者一般用一个抽象类或者一个接口实现。更新接口通常包含一个update()方法，这个方法叫做更新方法。
 abstract class Observer
{
	public abstract void update();
}
//ConcreteSubject类，叫做具体主题或具体通知者，将有关状态存入具体观察者对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知。具体主题角色通常用一个具体子类实现。
class ConcreteSubject extends Subject<Object, Object>
{
	// 具体被观察者状态
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
//ConcreteObserver类，具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。具体观察者角色可以保存一个指向具体主题对象的引用。具体观察者角色通常用一个具体子类实现。
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
		System.out.println("观察者" + name + "的新状态是" + observerState);
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
