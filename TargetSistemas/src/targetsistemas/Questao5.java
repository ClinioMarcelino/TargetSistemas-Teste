/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

import java.util.Scanner;

/**
 *
 * @author Clinio
 */
public class Questao5 {
    // Função para inverter a string
    static String reversao(String a){
        String inversa="";
        // Percorre a String passada de traz para frente e a cada iteração concatena, adiciona uma letra, um char a string inversa
        for(int i=a.length()-1;i>=0;i--){
            inversa+= a.charAt(i);
        }
        return inversa;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase e eu lhe retornarei o inverso dela");
        String frase = sc.nextLine();
        
        System.out.println(reversao(frase));
    }
    
}
