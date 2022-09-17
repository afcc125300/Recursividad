
package multiplicar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Multiplicar {

  
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
                int i;
		int num1;
		int num2;
		int sum;
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(bufEntrada.readLine());
		sum = 0;
                    
		for (i=1;i<=num2;i++) {
			sum = sum+num1;
			System.out.println(sum-num1+" + "+num1+" = "+sum);
		}
		System.out.println("LA MULTIPLICACION DE "+num1+"x"+num2+"= "+sum);
	}


}

