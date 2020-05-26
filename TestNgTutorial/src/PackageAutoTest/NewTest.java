package PackageAutoTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest 
{
  @Test(groups={"action1"})
  public void f()
  {System.out.println("f");
  }
  @Test(groups={"action2"})
  public void f1()
  {System.out.println("f1");
  }
  @BeforeSuite
  public void beforeSuite()
  {System.out.println("b4 suite");
  }
  @AfterSuite
  public void afterSuite() {
System.out.println("after suite");
  }
}