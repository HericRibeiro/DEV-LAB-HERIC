public class Main {
    public static void main (String[] args) {
        System.out.println("Hello Word"); // Maneira de imprimir valores no terminal, sempre com aspas duplas.
        System.out.println(10 + 10); // Também é possível fazer calculos dentro da impressão.
        variaveis(args); // Para que algo seja executado, deve está junto com a class principal.
        adicaoString(args); // Adiciona Strings em impressão
        variaveisMesmaLinha(args); // Variáeis na mesma linha
        Alargamento.alargamentovariavel(args); // Alargamento da variável
        Extreitamento.extreitamentovariavel(args); // Extreitametno da variável
    }
    
    public static void variaveis (String[] args) {
        // Variáveis:
        String name = "Heric";
        System.out.println(name);
    }
    
    public static void adicaoString (String[] args) {
        // Adição de valores na impressão:
        String nome = "adição";
        System.out.println("Olá, eu sou uma " + nome); // É possível adicionar variáveis a textos
    }
    
    public static void variaveisMesmaLinha (String[] args) {
        // Adição de valores na impressão:
        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z); // É possível adicionar variáveis a textos
    }
    
}

class Alargamento {
    public static void alargamentovariavel(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // alargamento foi definido atráves dessa variável
        
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}

class Extreitamento {
    public static void extreitamentovariavel(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Mudança manual: de double para int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}