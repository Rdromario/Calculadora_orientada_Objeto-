/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjeto;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        
        Scanner scanner = new  Scanner(System.in);
        int opcao;
        float num1, num2, resultado;
        
        //Menu Calculadora
        System.out.println("----------------------");
        System.out.println("-----Calculadora------");
        System.out.println("----------------------");
        System.out.println("Selecine uma opção ");
        System.out.println("1 - Soma");
        System.out.println("2 - subatração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Raiz Quadra ");
        System.out.println("6 - Potência");
        System.out.println("------------------------");
        System.out.println("À Opção Escolhida");
        
        //Entrada Opção
        opcao = scanner.nextInt();
        
        
        //Seleção 
        if(opcao ==1){
        //entrada do primeiro valor
        System.out.println("Informe o primeiro valor ");
        num1 = scanner.nextInt();
        //entrada do segundo número 
        System.out.println("Informe o sehundo valor ");
        num2 = scanner.nextInt();
            
           resultado = calculadora.somar(num1, num2);
            System.out.println("A soma entre " +num1+ " + " +num2+ " = "+resultado );
            
        }
        if(opcao ==2){
        //entrada do primeiro valor
        System.out.println("Informe o primeiro valor ");
        num1 = scanner.nextInt();
        //entrada do segundo número 
        System.out.println("Informe o sehundo valor ");
        num2 = scanner.nextInt();
        
            resultado = calculadora.subtrair(num1, num2);
            System.out.println("A Subtração entre " +num1+ " - " +num2+ " = " +resultado );
        }
        if(opcao ==3){
        //entrada do primeiro valor
        System.out.println("Informe o primeiro valor ");
        num1 = scanner.nextInt();
        //entrada do segundo número 
        System.out.println("Informe o sehundo valor ");
        num2 = scanner.nextInt();
            resultado = calculadora.multipicar(num1, num2);
            System.out.println("A multiplicação entre " +num1+ " x " +num2+ " = " +resultado);
        }
        if(opcao ==4){
        //entrada do primeiro valor
        System.out.println("Informe o primeiro valor ");
        num1 = scanner.nextInt();
        //entrada do segundo número 
        System.out.println("Informe o sehundo valor ");
        num2 = scanner.nextInt();
            resultado = calculadora.dividir(num1, num2);
            System.out.println("A divição entre" +num1+ " / " +num2+ " = " +resultado);
        }
        if(opcao ==5){
        System.out.println("Informe o Numero da Raiz ");
        num1 = scanner.nextInt();  
        resultado = (float) cc.raizQuadrada(num1);
            System.out.println("O resultado da Raiz Quadrada" +num1+ "  = " +resultado);
      
        }
        if(opcao ==6){
        System.out.println("Informe o primeiro valor ");
        num1 = scanner.nextInt();
        //entrada do segundo número 
        System.out.println("Informe o sehundo valor ");
        num2 = scanner.nextInt();
            resultado = (float) cc.potencia(num1, num2);
            System.out.println("O resultado entre a Potencia " +num1+ " ^ " +num2+ " = "+resultado);
            
        }
        
                
    }
}
