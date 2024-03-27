package Quiz;
import java.util.Scanner;

class Questoes {
    String pergunta;
    String[] opcoes = new String[4];
    String questaoCorreta;

    public boolean realizarPerguntaValidaResposta() {
        Scanner ler = new Scanner(System.in);

        System.out.println();
        System.out.println("______________________________________________________________");
        System.out.println(" Pergunta: " + this.pergunta);
        for (String opcao : this.opcoes) {
            System.out.println(" " + opcao);
        }
        System.out.println();
        System.out.println(" Resposta: ");
        String respostaUsuario = ler.next();

        return this.conferirResposta(respostaUsuario);
    }

    private boolean conferirResposta(String respostaUser) {
        if (respostaUser.equalsIgnoreCase(this.questaoCorreta)) {
            System.out.println("A sua resposta está CORRETA! ");
            return true;
        }
        System.out.println("A sua resposta está INCORRETA! ");
        System.out.println("A Resposta correta é: " + this.questaoCorreta);
        return false;
    }

}
