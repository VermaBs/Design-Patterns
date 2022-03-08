package Singleton_design_pattern;

public class BillPughOuterClass {
    private BillPughOuterClass() {}
   
    private static class BillPughSingleton
    {
	    private static final BillPughOuterClass INSTANCE = new BillPughOuterClass();
	}
    public static BillPughOuterClass getInstance()
    {
      return BillPughSingleton.INSTANCE;
    }
   
   
}
