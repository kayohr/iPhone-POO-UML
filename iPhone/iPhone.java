package iPhone;

import Modelo.Modelo;
import appIPhone.AparelhoTelefonico;
import appIPhone.NavegadorInternet;
import appIPhone.ReprodutorMusical;

public class iPhone {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();

        usarReprodutorMusical(modelo);
        usarAparelhoTelefonico(modelo);
        usarNavegadorInternet(modelo);
    }

    public static void usarReprodutorMusical(ReprodutorMusical reprodutor) {
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
    }

    public static void usarAparelhoTelefonico(AparelhoTelefonico telefone) {
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }

    public static void usarNavegadorInternet(NavegadorInternet navegador) {
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}



//para executar o comando
// cd /home/est/Dio/projetos-Dio/UML-POO-iPhone/src
// javac iPhone/*.java
// java iPhone.iPhone