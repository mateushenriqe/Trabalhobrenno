package Quiz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        Cabecalho cabecalho = new Cabecalho();
        cabecalho.aluno = "Mateus Henrique Silva Ribeiro";
        cabecalho.professor = "Brenno Pimenta da Silva";
        cabecalho.curso = "Engenharia de Software";
        cabecalho.materia = "Algoritmo e Programação 2";
        cabecalho.tema = "Diversos (perguntas sobre variados conhecimentos)";

        System.out.println(" Tema:" + cabecalho.tema);
        System.out.println("   Aluno: " + cabecalho.aluno);
        System.out.println("   Professor: " + cabecalho.professor);
        System.out.println("   Curso: " + cabecalho.curso);
        System.out.println("   Matéria: " + cabecalho.materia);
        System.out.println("_________________________________________");

        System.out.println("      * Teste seus conhecimentos em 15 perguntas.  *      ");
        System.out.println();

        int qtdeAcertos = 0;
        int qtdeErros = 0;

        //Questão 1
        Questoes questao1 = new Questoes();
        questao1.pergunta = "Qual é o rio mais longo do mundo?";
        questao1.opcoes[0] = "A - Amazonas";
        questao1.opcoes[1] = "B - Yangtzé";
        questao1.opcoes[2] = "C - Mississippi";
        questao1.opcoes[3] = "D - Danúbio";
        questao1.questaoCorreta = "A";
        if (questao1.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }


        //Questão 2
        Questoes questao2 = new Questoes();
        questao2.pergunta = "Quem foi o primeiro homem a pisar na Lua? ";
        questao2.opcoes[0] = "A - Neil Armstrong";
        questao2.opcoes[1] = "B - Buzz Aldrin";
        questao2.opcoes[2] = "C - Yuri Gagarin";
        questao2.opcoes[3] = "D - Alan Shepard";
        questao2.questaoCorreta = "A";
        if (questao2.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 3
        Questoes questao3 = new Questoes();
        questao3.pergunta = "Quantas vezes Michael Jordan ganhou campeonatos pelo Chicago Bulls? ";
        questao3.opcoes[0] = "A - 5";
        questao3.opcoes[1] = "B - 7";
        questao3.opcoes[2] = "C - 6";
        questao3.opcoes[3] = "D - 4";
        questao3.questaoCorreta = "C";
        if (questao3.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 4
        Questoes questao4 = new Questoes();
        questao4.pergunta = "Qual é a capital da Austrália?  ";
        questao4.opcoes[0] = "A - Sydney";
        questao4.opcoes[1] = "B - Melbourne";
        questao4.opcoes[2] = "C - Brisbane";
        questao4.opcoes[3] = "D - Canberra";
        questao4.questaoCorreta = "D";
        if (questao4.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 5
        Questoes questao5 = new Questoes();
        questao5.pergunta = "Qual é o “rei dos esportes”? ";
        questao5.opcoes[0] = "A - Basquete";
        questao5.opcoes[1] = "B - Beisebol";
        questao5.opcoes[2] = "C - Futebol";
        questao5.opcoes[3] = "D - Hóquei no gelo";
        questao5.questaoCorreta = "C";
        if (questao5.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 6
        Questoes questao6 = new Questoes();
        questao6.pergunta = "Em que ano a Segunda Guerra Mundial começou? ";
        questao6.opcoes[0] = "A - 1914";
        questao6.opcoes[1] = "B - 1939";
        questao6.opcoes[2] = "C - 1945";
        questao6.opcoes[3] = "D - 1950";
        questao6.questaoCorreta = "B";
        if (questao6.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 7
        Questoes questao7 = new Questoes();
        questao7.pergunta = "Qual dos seguintes esportes não usa bola”? ";
        questao7.opcoes[0] = "A - golfe";
        questao7.opcoes[1] = "B - tênis";
        questao7.opcoes[2] = "C - hóquei";
        questao7.opcoes[3] = "D - polo";
        questao7.questaoCorreta = "C";
        if (questao7.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 8
        Questoes questao8 = new Questoes();
        questao8.pergunta = "Qual é a capital do Japão? ";
        questao8.opcoes[0] = "A - Seul";
        questao8.opcoes[1] = "B - Pequim";
        questao8.opcoes[2] = "C - Tóquio";
        questao8.opcoes[3] = "D - Bangcoc";
        questao8.questaoCorreta = "C";
        if (questao8.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 9
        Questoes questao9 = new Questoes();
        questao9.pergunta = "Qual é o elemento mais abundante na crosta terrestre ? ";
        questao9.opcoes[0] = "A - Oxigênio";
        questao9.opcoes[1] = "B - Silício";
        questao9.opcoes[2] = "C - Ferro";
        questao9.opcoes[3] = "D - Alumínio";
        questao9.questaoCorreta = "A";
        if (questao9.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 10
        Questoes questao10 = new Questoes();
        questao10.pergunta = "Qual é o oceano mais extenso";
        questao10.opcoes[0] = "A - Atlântico";
        questao10.opcoes[1] = "B - Índico";
        questao10.opcoes[2] = "C - Pacífico";
        questao10.opcoes[3] = "D - Antártico";
        questao10.questaoCorreta = "C";
        if (questao10.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 11
        Questoes questao11 = new Questoes();
        questao11.pergunta = "Qual é o maior deserto do mundo em área? ";
        questao11.opcoes[0] = "A - Deserto do Saara";
        questao11.opcoes[1] = "B - Deserto de Atacama";
        questao11.opcoes[2] = "C - Deserto de GOBI";
        questao11.opcoes[3] = "D - Deserto da Arábia\n";
        questao11.questaoCorreta = "A";
        if (questao11.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 12
        Questoes questao12 = new Questoes();
        questao12.pergunta = "Em que ano ocorreu a Revolução Francesa? ";
        questao12.opcoes[0] = "A - 1600";
        questao12.opcoes[1] = "B - 1750";
        questao12.opcoes[2] = "C - 1789";
        questao12.opcoes[3] = "D - 1850";
        questao12.questaoCorreta = "C";
        if (questao12.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 13
        Questoes questao13 = new Questoes();
        questao13.pergunta = "Qual é o maior mamífero terrestre”? ";
        questao13.opcoes[0] = "A - Elefante africano";
        questao13.opcoes[1] = "B - Baleia-azul";
        questao13.opcoes[2] = "C - GIRAFA";
        questao13.opcoes[3] = "D - Hipopótamo";
        questao13.questaoCorreta = "A";
        if (questao13.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 14
        Questoes questao14 = new Questoes();
        questao14.pergunta = "Qual é a fórmula química da água? ";
        questao14.opcoes[0] = "A - CO2";
        questao14.opcoes[1] = "B - H2O";
        questao14.opcoes[2] = "C - O2";
        questao14.opcoes[3] = "D - NaCl";
        questao14.questaoCorreta = "B";
        if (questao14.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        //Questão 15
        Questoes questao15 = new Questoes();
        questao15.pergunta = "Em que continente está localizado o Monte Kilimanjaro? ";
        questao15.opcoes[0] = "A - África";
        questao15.opcoes[1] = "B - Ásia";
        questao15.opcoes[2] = "C - Europa";
        questao15.opcoes[3] = "D - Oceania";
        questao15.questaoCorreta = "A";
        if (questao15.realizarPerguntaValidaResposta()) {
            qtdeAcertos++;
        } else {
            qtdeErros++;
        }

        System.out.println();
        System.out.println(" ******** RESUMO ********");
        System.out.println("  Total de Perguntas.......: " + (qtdeAcertos + qtdeErros));
        System.out.println("  Acertos..................: " + qtdeAcertos);
        System.out.println("  Erros....................: " + qtdeErros);
        System.out.println(" **************************");


    }


}
