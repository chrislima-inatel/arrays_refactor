package br.inatel.cdg;

public class Main{
    public static void main(String args[]){
        System.out.println("Bem vindo ao Campo Minado!");
        CampoMinado campoMinado1 = new CampoMinado(); // Chama o construtor
        campoMinado1.campoMinadoJogoFor();
        //campoMinado1.campoMinadoJogoDoWhile(campoMinadoGrid);
        System.out.println("Jogo Encerrado");
    }
}