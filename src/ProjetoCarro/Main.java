package ProjetoCarro;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.ano = 2017;
        meuCarro.chassi = 595496;
        meuCarro.modelo = "Palio";
        meuCarro.numeroMarchas = 5;
        meuCarro.numeroDePortas = 5;
        meuCarro.velocidadeMaxima = 250;

        meuCarro.volumeCombustivel = 10;
        meuCarro.marchaAtual = 2;
        meuCarro.velocidadeAtual = 20;


        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.acelera();
        System.out.println(meuCarro.velocidadeAtual);

        meuCarro.frear();
        System.out.println(meuCarro.velocidadeAtual);

        meuCarro.trocarMarcha(4);
        System.out.println(meuCarro.marchaAtual);

        meuCarro.reduzirMarcha();
        System.out.println(meuCarro.marchaAtual);
    }
}
