import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
    	
    	Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma palavra -->");
        String input = teclado.nextLine();
        teclado.close();

        String invertedString = inverterString(input);
        System.out.println("Palavra invertida: " + invertedString);
    }

   
    public static String inverterString(String str) {
        char[] arrayPalavra = str.toCharArray();
        int left = 0;
        int right = arrayPalavra.length - 1;

        while (left < right) {
           
            char temp = arrayPalavra[left];
            arrayPalavra[left] = arrayPalavra[right];
            arrayPalavra[right] = temp;

            
            left++;
            right--;
        }

        return new String(arrayPalavra);
    }
}
