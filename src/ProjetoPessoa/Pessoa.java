package ProjetoPessoa;

public class Pessoa {

    String nome, cpf;

    Pessoa (String nome, String cpf){
        System.out.println("Instanciando o Objeto... ");
        this.nome = nome;
        this.cpf = cpf;
    }

    void correr(){

    }

    // PARTE 02 DA AULA

    // mostrar o nome
    public String getNome(){
        return this.nome;
    }

    // alterar o nome
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf (){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
