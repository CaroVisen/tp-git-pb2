import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Integer a;
        Integer b;
        Integer opcion;
        Integer resultado;
        
        @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
     
        do{
            System.out.println("Ingrese su operación\n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
            opcion = teclado.nextInt();
        }while(opcion < 1 && opcion > 4);

        System.out.println("Ingrese el primer numero");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = teclado.nextInt();

        switch(opcion) {
        	case 1:{
                    resultado = a + b;
                    System.out.println("El resultado es de la suma es:" + resultado.toString());
                }
        		break;
        	case 2:{
                    resultado = a - b;
                    System.out.println("El resultado es de la resta es:" + resultado.toString());
                }
        		break;
        	case 3:{
                    resultado = a * b;
                    System.out.println("El resultado es de la multiplicacion es:" + resultado.toString());
                }
        		break;
        	default:{
                    resultado = a / b;
                    System.out.println("El resultado es de la divicion es:" + resultado.toString());
                }
        }
    }
}