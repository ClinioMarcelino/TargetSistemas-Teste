/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

/**
 *
 * @author Clinio
 */
public class Questao4 {
    
    static float percentual(float estado,float soma){
        return (estado/soma)*100;
    }
    
    public static void main(String[] args){
        float SP =67836.43f,
                RJ = 36678.66f,
                MG = 29229.88f,
                ES = 27165.48f,
                outros =19849.53f;
        
        float soma = SP + RJ + MG + ES + outros;
        
        System.out.printf("SP representa %.2f%% do valor total\n",percentual(SP,soma));
        System.out.printf("RJ representa %.2f%% do valor total\n",percentual(RJ,soma));
        System.out.printf("MG representa %.2f%% do valor total\n",percentual(MG,soma));
        System.out.printf("ES representa %.2f%% do valor total\n",percentual(ES,soma));
        System.out.printf("Outros representa %.2f%% do valor total\n",percentual(outros,soma));
    }
}
