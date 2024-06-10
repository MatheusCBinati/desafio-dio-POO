public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone Pausou");
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Iphone selecionou: "+ musica);
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone tocar");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Iphone atender");
    }

    @Override
    public void inicarConversar() {
        // TODO Auto-generated method stub
        System.out.println("Iphone inicia uma conversa");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Iphone ligar para: "+numero);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Iphone adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Iphone atualiza a página");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Iphone exibe a página: "+url);
    }
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        //Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Metal");

        System.out.println("");

        //Aparelho Telefonico
        iphone.ligar("123-123");
        iphone.atender();
        iphone.inicarConversar();

        System.out.println("");

        //NavegadorInternet
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}



