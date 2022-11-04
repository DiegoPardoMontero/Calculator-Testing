/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.AssertJUnit.assertEquals;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {

    public CalculadoraIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 20F;
        float b = 5F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testMod() {
        System.out.println("mod");
        float a = 12F;
        float b = 5F;
        float expResult = 2F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);

    }

    //Test #1
    @Test
    public void testSumWithTwoPositiveIntegers() {
        System.out.println("sum two positive integers");
        int a = 15;
        int b = 23;
        int expResult = 38;
        int result = (int) Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    //Test #2
    @Test
    public void testSumWithNegativeAndPositiveIntegers() {
        System.out.println("sum with a negative and a positive integer");
        int a = 8;
        int b = -4;
        int expResult = 4;
        int result = (int) Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    //Test #3
    @Test
    public void testSumWithTwoNegativeIntegers() {
        System.out.println("sum with two negative integers");
        int a = -17;
        int b = -10;
        int expResult = -27;
        int result = (int) Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    //Test #4
    @Test
    public void testSumWithTwoPositiveFloats() {
        System.out.println("sum with two positive floats");
        float a = 4.5F;
        float b = 7.9F;
        float expResult = 12.4F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }


    //Test #5
    @Test
    public void testSumWithNegativeAndPositiveFloats() {
        System.out.println("sum with a negative and a positive");
        float a = -5.6F;
        float b = 2.4F;
        float expResult = -3.2F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.01);
    }

    //Test #6
    @Test
    public void testSumWithTwoNegativeFloats() {
        System.out.println("sum with two negative floats");
        float a = -9.1F;
        float b = -5.4F;
        float expResult = -14.5F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }
    //Test #7
    @Test
    public void testSumWithPositiveIntegerAndPositiveFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #8
    @Test
    public void testSumWithNegativeIntegerAndNegativeFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #9
    @Test
    public void testSumWithPositiveFloatAndNegativeInteger(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #10
    @Test
    public void testSumWithNegativeFloatAndPositiveInteger(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #11
    @Test
    public void testSubstractWithTwoPositivesIntegers(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #12
    @Test
    public void testSubstractWithTwoNegativesIntegers(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #13
    @Test
    public void testSubstractWithPositiveAndNegativeIntegers(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #14
    @Test
    public void testSubstractWithTwoPositiveFloats(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #15
    @Test
    public void testSubstractWithTwoNegativeFloats(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #16
    @Test
    public void testSubstractWithPositiveAndNegativeFloats(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #17
    @Test
    public void testSubstractWithPositiveIntegerAndPositiveFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #18
    @Test
    public void testSubstractWithPositiveIntegerAndNegativeFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #19
    @Test
    public void testSubstractWithNegativeIntegerAndPositiveFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #20
    @Test
    public void tesSubstractWithNegativeIntegerAndPositiveFloat(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #21
    @Test
    public void testMultiply(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #22
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #23
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #24
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #25
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #26
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #27
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #28
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #29
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #30
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #31
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #32
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #33
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #34
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #35
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #36
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #37
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #38
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #39
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #40
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #41
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #42
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #43
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #44
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #45
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #46
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #47
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #48
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #49
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }

    //Test #50
    @Test
    public void test(){
        System.out.println("some test");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result, 0.0);
    }
}
