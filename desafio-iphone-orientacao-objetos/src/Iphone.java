public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }
    public void atender(String numero){
        System.out.println("Atendendo Ligação");
    }
    public void iniciarCorreioVoz(String mensagem, String destinatario){
        System.out.println("----Correio de voz----");
        System.out.println(destinatario + mensagem);
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
    }
    public void tocar(){
        System.out.println("Ouvindo a música ");
    }
    public void pausar(){
        System.out.println("Música pausada");
    }
    public void exibirPagina(String url){
        System.out.println("Exibindo a página: " + url);
    }
    public void adicionarNovaAba(String novaAba){
        System.out.println("Adicionando nova aba" + novaAba);
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
    
}
