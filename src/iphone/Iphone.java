package iphone;

public class Iphone {

    public static void main(String[] args) {
        ReprodutorMusical rm = new ReprodutorMusical();
        AparelhoTelefonico at = new AparelhoTelefonico();
        NavegadorInternet ni = new NavegadorInternet();
        
        rm.tocar();
        rm.pausar();
        rm.selecionarMusica();
        
        at.ligar();
        at.atender();
        at.iniciarCorreioVoz();
        
        ni.exibirPagina();
        ni.atualizarPagina();
        ni.adicionarNovaAba();
    }
    
}
