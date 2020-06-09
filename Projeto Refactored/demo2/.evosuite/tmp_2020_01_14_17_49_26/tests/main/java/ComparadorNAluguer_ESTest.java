/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 14 18:10:49 GMT 2020
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.Cliente;
import main.java.ComparadorNAluguer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparadorNAluguer_ESTest extends ComparadorNAluguer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = mock(Cliente.class, new ViolatedAssumptionAnswer());
      doReturn(1962, (-1)).when(cliente0).getNAlugueres();
      int int0 = comparadorNAluguer0.compare(cliente0, cliente0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = mock(Cliente.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(cliente0).getNAlugueres();
      Cliente cliente1 = mock(Cliente.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(cliente1).getNAlugueres();
      int int0 = comparadorNAluguer0.compare(cliente0, cliente1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      // Undeclared exception!
      try { 
        comparadorNAluguer0.compare((Cliente) null, (Cliente) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.ComparadorNAluguer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComparadorNAluguer comparadorNAluguer0 = new ComparadorNAluguer();
      Cliente cliente0 = mock(Cliente.class, new ViolatedAssumptionAnswer());
      doReturn((-1), 4).when(cliente0).getNAlugueres();
      int int0 = comparadorNAluguer0.compare(cliente0, cliente0);
      assertEquals(1, int0);
  }
}
