package ProjetoCarro;

import java.util.Scanner;

public class Carro {


       // declaração das variaveis

        String modelo, cor, marca, tetoSolar, cambioAutomatico;
        int ano, chassi, velocidadeMaxima,numeroMarchas,velocidadeAtual, numeroDePortas, volumeCombustivel, marchaAtual;
        Proprietario proprietario;

        void acelera(){
            velocidadeAtual +=1;
        }
        void frear(){
            velocidadeAtual = 0;
        }
        void trocarMarcha(int marcha){
            marchaAtual = marcha;
        }
        void reduzirMarcha(){
            marchaAtual -= 1;
        }

}
