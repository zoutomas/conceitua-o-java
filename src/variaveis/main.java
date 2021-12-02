package variaveis;

//* Classe de exemplo para o exercícios da Aula 1 de Variaveis, Tipos de Dado e Operadores aritméticos.

public class main {

    public static void main(String[] args) {


        int i;
//        int i;   esta variavel é invalida por já existir.
        int I;
//        int 1a;  esta variavel é invalida por começar com numero.
        int _1a;
        int $aq;


        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;


        final int j = 10;
//        j = 15;   aqui esta linha eu tento muda uma constante que esta definida como constante.
          int asrn24678md;
//        int asr246 78md;   aqui esta errado por ter espaco.
          int asrn2$4678_md = 10;
//          int asrn2$46%78_md = 10;  errado por esta usando o sinal de "%".


          asrn24678md = 100;
          asrn2$4678_md = 10;


          int quantidadeProduto = 50;
//        int quantidadeProduto;  não é uma boa pratica começar com letra maiuscula.
          final int NUMERO_TENTATIVAS = 5;
//        final int numeroTentativas = 5; aqui nao segue o patrao com todos letras maiusculas.
          int QUANTIDADE_OPCOES =15;
//        int qtdprod; nao segue uma boa pratica de expressividade.

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);


        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);


        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
