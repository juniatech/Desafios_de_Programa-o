// fa�a um programa que imprima todos os n�meros entre 1 e 100. 
// S� que no lugar dos m�ltiplos de 3, ele escreve foo, no lugar dos m�ltiplos de 5 ele escreve bar, 
// e nos m�ltiplos de 3 e 5, ele escreve foo bar.

package Pacote01;
public class Numerosde0a100 {
    public static void main(String args[]) {
        for (int n = 1; n <= 100; n++) {
            if ((n % 3 == 0) && (n % 5 == 0))
                System.out.println("foo bar");
            else {
                
                if (n % 3 == 0)
                    System.out.println("foo");
                else if (n % 5 == 0)
                    System.out.println("bar");
                else 
                    System.out.printf(n+"\n");
            }
        }
    }
}
