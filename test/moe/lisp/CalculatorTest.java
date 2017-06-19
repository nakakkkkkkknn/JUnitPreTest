/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author koide
 */
public class CalculatorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() throws Exception{
        System.out.println("multiply");
        int x = 0;
        int y = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     /**
     * Test of multiply method, of class Calculator.
     * 乗算のテスト<br/>
     * 対象 multiply(int, int) <br/>
     * 条件: 引数-10,20 <br/>
     * 期待する結果: 戻り値 -200 <br/>
     */
    @Test
    public void testMultiply02() throws Exception{
        System.out.println("multiply");
        int x = -10;
        int y = 20;
        Calculator instance = new Calculator();
        int expResult = -200;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of multiply method, of class Calculator.
     * 乗算のテスト<br/>
     * 対象 multiply(int, int) <br/>
     * 条件: 引数 0,-20 <br/>
     * 期待する結果: 戻り値 0 <br/>
     */
    @Test
    public void testMultiply03() throws Exception{
        System.out.println("multiply");
        int x = 0;
        int y = -20;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 10,20,30 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax01() throws Exception{
        System.out.println("max");
        int a = 10;
        int b = 20;
        int c = 30;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 30,20,10 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax02() throws Exception{
        System.out.println("max");
        int a = 30;
        int b = 20;
        int c = 10;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 20,30,10 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax03() throws Exception{
        System.out.println("max");
        int a = 20;
        int b = 30;
        int c = 10;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 10,30,20 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax04() throws Exception{
        System.out.println("max");
        int a = 10;
        int b = 30;
        int c = 20;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 30,10,20 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax05() throws Exception{
        System.out.println("max");
        int a = 30;
        int b = 10;
        int c = 20;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of max method, of class Calculator.
     * 与えられた３つの引数の内最大の値を返すテスト<br/>
     * 対象 max(int, int, int) <br/>
     * 条件: 引数 20,10,30 <br/>
     * 期待する結果: 戻り値 30 <br/>
     */
    @Test
    public void testMax06() throws Exception{
        System.out.println("max");
        int a = 20;
        int b = 10;
        int c = 30;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
