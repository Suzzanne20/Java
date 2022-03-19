/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcu;

/**
 *
 * @author Suzzanne
 */
public class Todo {

//metodos
int num1, num2, result=0;

    public int sumar(int num1, int num2){ 
        result=num1+num2;
        System.out.println( "La suma es: " + result );
        return 0;
    }

    public int rest(int num1, int num2){ 
        result=num1-num2;
        System.out.println( "La resta es: " + result );
        return 0;
    }

    public int mult(int num1, int num2){ 
        result=num1*num2;
        System.out.println( "La multiplicacion es: " + result );
        return 0;
    }

    public int divi(int num1, int num2){ 
        result=num1/num2;
        System.out.println( "La division es: " + result );
        return 0;
    }
    
}
