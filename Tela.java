/*
 * Importação do pacote AWT. É nesse pacote que se encontram os
 * componentes que serão usados para a construção de uma tela 
 * em JAVA.
 */
import java.awt.*;
/*
 * Criamos a classe "Tela" e herdamos os componentes presentes 
 * na classe "Frame". A classe "Frame" já está incluida no 
 * pacote AWT que foi importado anteriormente.
 */
public class Tela extends Frame{

    /*
     * O Panel é a estrutura primordial para que se possa 
     * construir uma tela em JAVA.
     */
    Panel p1;

    /*
     * O Label é um componente responsavel por imprimir 
     * informações na tela, para que sejam visualizadas 
     * pelo usuário.
     */
    Label imprimir;

    /*
     * O Button é um componente responsável por permitir 
     * interação com o usuário. Nesse componente, ações 
     * específicas podem ser programadas para serem 
     * executadas quando houver um "click".
     */
    Button botao;

    /*
     * O TextField é um componente que permite interação
     * com o usuário, permitindo que o mesmo digite uma
     * sequencia de caracteres que podem ser usados 
     * para inúmeras ações.
     */
    TextField caixaTexto;

    /*
     * Nesse passo, criamos o metodo construtor da classe. Nele
     * se encontrarão os códigos responsáveis por criar os 
     * componentesna tela.
     */
    Tela(){  // -> Criação de componentes gráficos.

        /*
         * Método que determina a altura(height) e a largura(width) da tela
         */
        setSize(400, 300);

        /*
         * Método que determina a visibilidade da tela. A visibilidade definida
         * com o valor "true", indica que a tela será visivel quando o código
         * for compilado.
         */
        setVisible(true);

        /*
         * Método que define o layout padrão da tela. Nesse exemplo, o layout 
         * escolhido foi o de Borda(BorderLayout), e nesse layout, o posicionamento
         * dos componentes se baseia nos pontos cardeais: North(Norte), South(Sul), 
         * West(Oeste), East(Leste) e *Center(Centro)
         */
        setLayout(new BorderLayout());

        //Instância da classe "Panel"
        /*
         * Observação: O "Panel" atua de maneira semelhante a uma <div> HTML. 
         * Quando essa estrutura é criada, ela cria um espaço na memória onde
         * um componente(button, label, textfield, entre outros) será armazenado.
         */
        p1 = new Panel();
        /*
         * Método "add" sendo usado para definir a localização do Panel em meio a 
         * tela.
         */
        add("Nort", p1);
        //Instância da classe "Label"
        imprimir = new Label("Teste Tela JAVA AWT!!");
        /*
         * Método "add" sendo usado para associar um componente visual ao Panel
         */
        p1.add(imprimir);

        //Instância da classe "Button"
        botao = new Button();

        //Instância da classe "TextField" 
        /*
         * Observação: Na instância da classe TextField,
         * podem ou não passar parâmetros para definir 
         * um texto por padrão, ou até mesmo o tamanho,
         * em pixels, que a caixa de texto acupará na 
         * tela.
         */
        caixaTexto = new TextField(/*<Texto_Padrão>, <Tamanho_Pixels>*/);

    }

    public void Action(){

        /*
         * Método onde serão criadas as ações a serem realizadas pelos
         * componentes presentes na tela.
         */
    }

    /*
     * Função main que será responsável por executar o código e 
     * ativar a tela.
     */
    public static void main(String[] args){

        /*
         * Instância da classe a ser executada para a criação da 
         * tela.
         */
        new Tela();

    }
}
