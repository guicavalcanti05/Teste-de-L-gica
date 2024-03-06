
	import java.util.Scanner;
	
	public class Exercicio {
	    public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número -->");
        int num = teclado.nextInt();
        teclado.close();

        if (Fibonacci(num)) {
            System.out.println(num + " é da à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não é da à sequência de Fibonacci.");
        }
    }

   
    public static boolean Fibonacci(int num) {
        int a = 0;
        int b = 1;

        while (b < num) {
            int aux = b;
            b = a + b;
            a = aux;
        }

        return b == num;
    }
}
