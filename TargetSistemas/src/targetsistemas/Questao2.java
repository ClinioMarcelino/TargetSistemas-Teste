/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package targetsistemas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Clinio
 */
public class Questao2 {
    
    // Função para gerar em uma lista os primeiros 20 numeros da sequencia de Fibonacci
    static ArrayList<Integer> fibonacci(){
        ArrayList<Integer> sequenciaFibonacci = new ArrayList<>();
        
        for (int i = 0; i<20; i++){
            if(i==0||i==1)
                sequenciaFibonacci.add(i);
            else
                sequenciaFibonacci.add(sequenciaFibonacci.get(i-2)+sequenciaFibonacci.get(i-1));
        }
        return sequenciaFibonacci;
    }
    
    static void verificacaoFibonacci(int a){
        if(fibonacci().indexOf(a)!=-1)
            System.out.println(a+" pertence aos 20 primeiros numeros da sequencia de Fibonnaci");
        else
            System.out.println(a+" NAO pertence aos 20 primeiros numeros da sequencia de Fibonnaci");
    }
    
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Digite um numero inteiro e vamos verificar se ele pertence aos 20 primeiros da sequencia de Fibonacci");
        verificacaoFibonacci(sc.nextInt());
                
    }
}