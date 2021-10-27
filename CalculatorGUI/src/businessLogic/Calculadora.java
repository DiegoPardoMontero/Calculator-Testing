/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author Anabel
 */
public class Calculadora {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float substract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        return a / b;
    }

    public static float mod(float a, float b) {
        return a % b;
    }

    public static float factor(float a) {
        float fa = 1;
        while (a > 0) {
            fa = fa * a;
            a--;
        }
        return fa;

    }
    public static float potencia_10(float a){
        float b = (float) Math.pow(10,a);
        return b;
    }
    public static float raiz(float a){
        return (float)Math.sqrt(a);
    }
    public static float signo(float a){
        return -1*a;
    }
    public static float log(float a){
        return (float) Math.log(a);
    }
    public static float coma(float a, float b){
       int cont = 0;
       int c = (int)b;
       while (c>0){
       c = c /10;
         cont++;
       }
       int res = (int) Math.pow(10, cont);
        return  a+(b/res);
    }
}
