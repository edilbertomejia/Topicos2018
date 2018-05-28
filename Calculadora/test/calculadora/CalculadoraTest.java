/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author EDILBERTO MEJIA MEZA
 */
@RunWith(value = Parameterized.class)
public class CalculadoraTest {
     @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj=new ArrayList<>();
        obj.add(new Object[]{3,1,4});
        obj.add(new Object[]{2,3,5});
        obj.add(new Object[]{3,3,6});
        return obj;
    }
     private int a,b,exp;
     static Calculadora calc;
    public CalculadoraTest(int a, int b, int exp) {
        this.a=a;
        this.b=b;
        this.exp=exp;
    }
    
   @BeforeClass
    public static void beforeclass(){
        System.out.println("before class()");
        calc=new Calculadora();
    }
    @Before
    public void Before(){
        System.out.println("Before()");
        calc.clear();
    }
    
    @After
    public void After(){
        System.out.println("After()");
        calc.clear();
    }


    /**
     * Test of suma method, of class Calculadora.
     */
    /* @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora();
        int result = instance.suma(a, b);
        assertEquals(exp, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int a = 0;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.div(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int v = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.add(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class Calculadora.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int v = 0;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.sub(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ans method, of class Calculadora.
     */
    @Test
    public void testAns() {
        System.out.println("ans");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.ans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Calculadora.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Calculadora instance = new Calculadora();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of optima method, of class Calculadora.
     */
    @Test
    public void testOptima() {
        System.out.println("optima");
        Calculadora instance = new Calculadora();
        instance.optima();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
