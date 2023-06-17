/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.calculomedias;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Poo {
     public static Scanner teclado = new Scanner(System.in);
    
    public static double notas[] = new double[4];
    
    public static double media;
    
    public static String situacao;
    
    public static void inserirNotas(){
    
        for(int i = 0; i < 4; i ++){
            System.out.printf("Por favor insira a nota %d\n\n", i);
            notas[i] = teclado.nextDouble(); 
        }
    
        System.out.println("Notas inseridas com sucesso...");  
    }
    
    public static double calcularMedia(){
    
        double total = 0;
        
        for(int i = 0; i < notas.length; i ++){
            total += notas[i];
        }
    
        return media = total / notas.length;
    }
    
    public static String verificarSituacao(){
                
        if(media <= 5.9){
            situacao = "Reprovado";
        }
        
        if(media >= 6.0){
            situacao = "Aprovado";
        }
        
        return situacao;
    }

    public static void exibirResultados(){
        
        for(int i = 0; i < notas.length; i ++){
            
            System.out.printf("Nota[%d]: %f\n", i, notas[i]);
                        
        }
        
        System.out.printf("Media: %f \n", media);
        System.out.printf("Situação: %s \n", situacao);
        
    }
}