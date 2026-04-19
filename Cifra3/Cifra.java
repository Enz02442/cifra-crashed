import java.util.Scanner;

public class Cifra {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String f = s.nextLine().toUpperCase();

        String n = "";

        
        for (int i = 0; i < f.length(); i++) {
            char l = f.charAt(i);

            if (l >= 'A' && l <= 'Z') {
                n = n + l;
            }
        }

        int t = n.length();
        int r = 0;
        String c = "";

        // cifrar com salto 3
        for (int i = 0; i < t; i++) {
            c = c + n.charAt(r);
            r = (r + 3) % t;
        }

        System.out.println("Frase limpa: " + n);
        System.out.println("Frase cifrada: " + c);

        s.close();
    }
}