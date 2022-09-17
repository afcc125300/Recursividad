
package multiplicar;

public class bufEntrada {

    static void multiplicar(int i) {
       if(i==0){
           return;
       }
        System.out.println(i);
        multiplicar(i++);
    }
    
}
