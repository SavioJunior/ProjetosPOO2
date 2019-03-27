package ProjetoClinica;

public class clinica {
    public static void main(String[] args) {

        // Paciente

        Paciente p1 = new Paciente();
        p1.nome = "Pedro";
        p1.numeroCartao = 12345678;
        p1.endereco = "Um Lugar";


        // medico

        medico m1 = new medico();
        m1.nome = "João";
        m1.crm = 123456788;
        m1.endereco = "Um Lugar do Medico";

        // criando um atendimento

        atendimento at1 = new atendimento();
        at1.dataConsulta = "27/03/2019";
        at1.medico = m1;
        at1.paciente = p1;
        at1.valorConsulta = 90.00;


    }
}
