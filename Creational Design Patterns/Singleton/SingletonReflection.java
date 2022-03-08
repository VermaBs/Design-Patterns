package Singleton_design_pattern;


//Java code to explain effect of Reflection
//on Singleton property

import java.lang.reflect.Constructor;

//Singleton class
class Singleton
{
	// public instance initialized when loading the class
	public static SingletonAll instance = new SingletonAll();
	
	private Singleton()
	{
		// private constructor
	}
}

//Java program for Enum type singleton , enum will not allow to create objects via reflection
//JVM internally handle the process of object creation for enum

enum SingletonEnum
{
  INSTANCE;
}


public class SingletonReflection
{

	public static void main(String[] args)
	{
		SingletonAll instance1 = Singleton.instance;
		SingletonAll instance2 = null;
		try
		{
			Constructor[] constructors =
					SingletonAll.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (SingletonAll) constructor.newInstance();
				break;
			}
		}
	
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	System.out.println("instance1.hashCode():- "+ instance1.hashCode());
	System.out.println("instance2.hashCode():- "+ instance2.hashCode());
	
	//------------------------------------------------------------------
	
		SingletonEnum obj1 = SingletonEnum.INSTANCE;
		SingletonEnum obj2 = null;
		
		try
		{
			Constructor[] constructors =
					SingletonEnum.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				obj2 = (SingletonEnum) constructor.newInstance();
				break;
			}
		}
	
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	System.out.println("obj1.hashCode():- "+ obj1.hashCode());
    System.out.println("obj2.hashCode():- "+ obj2.hashCode());
	
	
	}
}
