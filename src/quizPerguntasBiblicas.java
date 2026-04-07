import java.util.Scanner;

public class quizPerguntasBiblicas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // metodo SCANNER

        System.out.println(" ");
        System.out.println("=========================================");
        System.out.println("===========|| QUIZ BÍBLICO ||============");
        System.out.println("=========================================");

        //Cabeçalho do Quiz

        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("RESPONDA AS PERGUNTAS BÍBLICAS ABAIXO:");
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" ");

        // Pergunta 01
        System.out.println("PERGUNTA 01: Qual o nome do irmão de Moisés que foi chamado por Deus?");
        System.out.println(" ");
        System.out.println("1) Abnadabe");
        System.out.println("2) Arão");
        System.out.println("3) Davi");
        System.out.println("4) Absalão");
        System.out.println(" ");

        //Resposta
        System.out.print("Sua Resposta: ");
        var option1 = scanner.nextInt();
        System.out.println(" ");

        //--------------------------------------------------------------------------------------------
        // Pergunta 02
        System.out.println("PERGUNTA 02: O que tinha dentro da ARCA DA ALIANÇA?");
        System.out.println(" ");
        System.out.println("1) Maná, barba de Arão e Tábuas dos Mandamentos");
        System.out.println("2) Barba de Arão, Tábuas dos Mandamentos e papiros");
        System.out.println("3) Cajado de Arão, Maná e Tábuas dos Mandamentos");
        System.out.println("4) Cajado de Arão, Maná e papiros");
        System.out.println(" ");

        //Resposta
        System.out.print("Sua Resposta: ");
        var option2 = scanner.nextInt();
        System.out.println(" ");

        //--------------------------------------------------------------------------------------------
        // Pergunta 03
        System.out.println("PERGUNTA 03: Em quantos dias o mundo e tudo que contém nele foi CRIADO?");
        System.out.println(" ");
        System.out.println("1) 8 dias");
        System.out.println("2) 7 dias");
        System.out.println("3) 5 dias");
        System.out.println("4) 6 dias");
        System.out.println(" ");

        //Resposta
        System.out.print("Sua Resposta: ");
        var option3 = scanner.nextInt();
        System.out.println(" ");

        //--------------------------------------------------------------------------------------------
        // Pergunta 04
        System.out.println("PERGUNTA 04: Quem enfrentou o gigante GOLIAS vencendo-o com uma pedrada?");
        System.out.println(" ");
        System.out.println("1) Davi");
        System.out.println("2) Saul");
        System.out.println("3) Jonathas");
        System.out.println("4) Malaquias");
        System.out.println(" ");

        //Resposta
        System.out.print("Sua Resposta: ");
        var option4 = scanner.nextInt();
        System.out.println(" ");

        //--------------------------------------------------------------------------------------------
        // Pergunta 05
        System.out.println("PERGUNTA 05: Quantas pragas foram enviadas no EGITO por Deus?");
        System.out.println(" ");
        System.out.println("1) 5");
        System.out.println("2) 7");
        System.out.println("3) 10");
        System.out.println("4) 11");
        System.out.println(" ");

        //Resposta
        System.out.print("Sua Resposta: ");
        var option5 = scanner.nextInt();
        System.out.println(" ");

        // Resultados
        System.out.println(" ");
        System.out.println("--- RESULTADO FINAL ---");
        System.out.println(" ");

        if (option1 == 2) {
            System.out.println("PERGUNTA 01 - CERTA RESPOSTA \\0// (2,0) pontos");
        } else
            System.out.println("PERGUNTA 01 ERRADA");

        if (option2 == 3) {
        } else
            System.out.println("PERGUNTA 02 ERRADA");

        if (option3 == 4) {
            System.out.println("PERGUNTA 03 - CERTA RESPOSTA \\0// (2,0) pontos");
        } else
            System.out.println("PERGUNTA 03 ERRADA");

        if (option4 == 1) {
            System.out.println("PERGUNTA 04 - CERTA RESPOSTA \\0// (2,0) pontos");
        } else
            System.out.println("PERGUNTA 04 ERRADA");

        if (option5 == 3) {
            System.out.println("PERGUNTA 05 - CERTA RESPOSTA \\0// (2,0) pontos");
        } else
            System.out.println("PERGUNTA 05 ERRADA");




    }

}
