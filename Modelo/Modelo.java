package Modelo;

import appIPhone.AparelhoTelefonico;
import appIPhone.NavegadorInternet;
import appIPhone.ReprodutorMusical;

public class Modelo implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("Tocando música...");
    }

      public void pausar(){
        System.out.println("Pausando música...");
    }

      public void selecionarMusica(){
        System.out.println("Selecionando música...");
    }

      public void ligar(){
        System.out.println("Ligando telefone...");
    }

      public void atender(){
        System.out.println("Atendendo chamada...");
    }

      public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

      public void exibirPagina(){
        System.out.println("Exibindo página na Internet...");
    }

      public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba...");
    }

     public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
}
