/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 14 18:08:58 GMT 2020
 */

package main.java;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.CarroEletrico;
import main.java.Coordinate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CarroEletrico_ESTest extends CarroEletrico_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CarroEletrico carroEletrico0 = new CarroEletrico("1?vXj,M:,\"V`4v@G", "1i\"#TiJExE<)", "Autonomia: ", 1645, 2.0, (-2170.210254886), (-3035), (Coordinate) null, false);
      CarroEletrico carroEletrico1 = carroEletrico0.clone();
      assertEquals((-2170.210254886), carroEletrico1.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CarroEletrico carroEletrico0 = new CarroEletrico();
      carroEletrico0.setPreco(1778.52684811);
      CarroEletrico carroEletrico1 = carroEletrico0.clone();
      assertNotSame(carroEletrico1, carroEletrico0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CarroEletrico carroEletrico0 = new CarroEletrico();
      carroEletrico0.setClassificacao(2205);
      CarroEletrico carroEletrico1 = carroEletrico0.clone();
      assertEquals(0, carroEletrico1.getVelocidade());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(coordinate0).toString();
      CarroEletrico carroEletrico0 = new CarroEletrico("Velocidade M\u00E9dia: ", "Velocidade M\u00E9dia: ", "Velocidade M\u00E9dia: ", (-1066), (-1.0), (-1.0), (-1066), coordinate0, false);
      carroEletrico0.setClassificacao((-1066));
      CarroEletrico carroEletrico1 = carroEletrico0.clone();
      assertEquals("Velocidade M\u00E9dia: ", carroEletrico1.getMarca());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(coordinate0).toString();
      CarroEletrico carroEletrico0 = new CarroEletrico("main.java.CarroEletrico", "main.java.CarroEletrico", "main.java.CarroEletrico", (-1757), (-1757), 1.0, 1, coordinate0, true);
      CarroEletrico carroEletrico1 = carroEletrico0.clone();
      assertEquals(1.0, carroEletrico1.getConsumo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CarroEletrico carroEletrico0 = new CarroEletrico("main.java.Veiculo", "vbF=1bl;C", "main.java.Veiculo", 1, (-1173.308), 1.0, 1, (Coordinate) null, true);
      // Undeclared exception!
      try { 
        carroEletrico0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CarroEletrico carroEletrico0 = null;
      try {
        carroEletrico0 = new CarroEletrico((CarroEletrico) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      CarroEletrico carroEletrico0 = new CarroEletrico("", "", "", 1, 1, (-486.57314568052), 1, coordinate0, false);
      boolean boolean0 = carroEletrico0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      CarroEletrico carroEletrico0 = new CarroEletrico("vxN", "vxN", "vxN", 0, 0, 0, 0, coordinate0, true);
      boolean boolean0 = carroEletrico0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      CarroEletrico carroEletrico0 = new CarroEletrico("", "", "", 1, 1, (-486.57314568052), 1, coordinate0, false);
      boolean boolean0 = carroEletrico0.equals(carroEletrico0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      CarroEletrico carroEletrico0 = new CarroEletrico((String) null, (String) null, "main.java.CarroEletrico", (-539), 0.0, 0.0, 0, coordinate0, true);
      CarroEletrico carroEletrico1 = new CarroEletrico();
      // Undeclared exception!
      try { 
        carroEletrico0.equals(carroEletrico1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.Veiculo", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      CarroEletrico carroEletrico0 = new CarroEletrico((String) null, (String) null, "main.java.CarroEletrico", (-539), 0.0, 0.0, 0, coordinate0, true);
      carroEletrico0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Coordinate coordinate0 = mock(Coordinate.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(coordinate0).toString();
      CarroEletrico carroEletrico0 = new CarroEletrico((String) null, (String) null, "main.java.CarroEletrico", (-539), 0.0, 0.0, 0, coordinate0, true);
      String string0 = carroEletrico0.toString();
      assertEquals("***** Carro El\u00E9trico *****\n*****    VE\u00CDCULO    *****\nMarca: null\nMatr\u00EDcula: null\nNIF do Propriet\u00E1rio: main.java.CarroEletrico\nVelocidade M\u00E9dia: -539\nPre\u00E7o Base por Km: 0.0\nConsumo: 0.0\nAutonomia: 0\nPosi\u00E7\u00E3o (latitude e longitude): null\nDispon\u00EDvel: true\nClassifica\u00E7\u00E3o: 0\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CarroEletrico carroEletrico0 = new CarroEletrico();
      CarroEletrico carroEletrico1 = new CarroEletrico(carroEletrico0);
      assertEquals(0.0, carroEletrico1.getPreco(), 0.01);
  }
}