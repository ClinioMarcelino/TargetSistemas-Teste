/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package targetsistemas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Clinio
 */
public class Questao3 {
    
    //Funçao para descobrir o valor do dia de menor faturamento
    static void menorFaturamento(ArrayList<Double> valor,ArrayList<Long> dia){
        Double menorValor = 0d;
        int indexMenorValor=0;
        
        for(int i = 0; i<valor.size() ; i++){
            if(valor.get(i)>0){
                if(menorValor==0){
                    menorValor = valor.get(i);
                    indexMenorValor = i;
                }
                else if(menorValor>valor.get(i)){
                    menorValor = valor.get(i);
                    indexMenorValor = i;
                }
            }
        }
        
        System.out.printf("\nO dia de menor faturamento é %d com um faturamento de R$%.2f\n",dia.get(indexMenorValor),menorValor);
    }
    
    
    //Função para descobrir o maior valor do dia de maior faturamento
    static void maiorFaturamento(ArrayList<Double> valor,ArrayList<Long> dia){
        Double maiorValor = 0d;
        int indexMaiorValor =0;
        
        for(int i = 0; i<valor.size() ; i++){
            if(valor.get(i)>maiorValor){
                maiorValor = valor.get(i);
                indexMaiorValor = i;
            }
        }
        System.out.printf("\nO dia de maior faturamento é %d com um faturamento de R$%.2f\n",dia.get(indexMaiorValor),maiorValor);
    }
    
    
    // Função para determinar o numero de dias no mes maior que o faturamento supera a media mensal
    static void numDiasFatSupMedMensal(ArrayList<Double> valor){
        Double media=0d, soma=0d;
        int qntDias = 0;
        for(int i = 0 ; i<valor.size() ; i++){
            if(valor.get(i)>0){
                soma+=valor.get(i);
                qntDias++;
            }
        }
        media = soma/qntDias;
        
        qntDias=0;//Reaproveitando a variavel
        for(int i = 0 ; i<valor.size() ; i++){
            if(valor.get(i)>media)
                qntDias++;
        }
        
        System.out.printf("\n%d é o numero de dias que o faturamento supera a media mensal\n",qntDias);
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        // Criação de listas para futuro preenchimento
        ArrayList<Long> dias = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();
        
        JSONParser jparser = new JSONParser();
        
        
        try(FileReader reader = new FileReader("C:\\Users\\Clinio\\Documents\\NetBeansProjects\\TargetSistemas\\src\\targetsistemas\\dados.json")){
            // Leitura do JSON
            Object obj = jparser.parse(reader);
            
            // Colocando em um lista
            JSONArray lista = (JSONArray) obj;
            
            // Adicionando na lista a ser trabalhada com a ajuda do objeto separador para separar o dia e o valor
            for( int i = 0; i<lista.size() ; i++){
                // Selecionando um elemento da lista temos um objeto e assim consigo separar a JSONArray
                JSONObject separador = (JSONObject) lista.get(i);
                Long dia = (Long) separador.get("dia");
                Double valor = (Double) separador.get("valor");
                dias.add(dia);
                valores.add(valor);
            }
      
        }catch(Exception e){
            System.out.println(e);
        }
        
        menorFaturamento(valores, dias);
        maiorFaturamento(valores, dias);
        numDiasFatSupMedMensal(valores);
        
    } 
}
