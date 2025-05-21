# Tutorial Java

# ♨ Módulo: strings em java

## 🧠 Oque você vai aprender aqui?

- Como declarar variáveis em Java
- Como manipular e imprimir Strings
- Diferença entre `print` e `println`
- Tipos primitivos mais usados
- Dicas e boas práticas ao manipular variáveiss

## Exemplos práticos:

# Impressão de valores:
```java
    System.out.println("Hello Word");
```
   Esse comando e feito para imprimir algum valor com quebra de linhas, ou seja, um embaixo do outro.
   
    O "print" normal, serve para deixar palavras impressões na mesma linha.
    Sempre que terminar um trecho, coloque ponto e virgula ";"

| Tipo      | Exemplo                 | Descrição                                 |
| --------- | ----------------------- | ----------------------------------------- |
| `String`  | `"Olá"`                 | Armazena textos entre aspas duplas        |
| `int`     | `int idade = 25;`       | Números inteiros (positivos ou negativos) |
| `float`   | `float preco = 19.99f;` | Números com ponto flutuante               |
| `char`    | `char letra = 'A';`     | Um único caractere entre aspas simples    |
| `boolean` | `boolean ativo = true;` | Verdadeiro (`true`) ou falso (`false`)    |

No float, tem que colocar a letra `f` no final da declaração. 

    ℹ️ Importante: ao atribuir um novo valor a uma variável, o valor anterior será sobrescrito.
    
Ex:
```java
        type variableName = value;
    
        String name = "Heric"
        name = "O valor e esse agora"
        System.out.println(name)
            ---Vai retornar:   "O valor e esse agora"---
```
    É possível imprimir Strings entre aspas duplas e variáveis usando a operação de +



| 🚨 Observação importante |
⚠️ Os métodos só serão executados se estiverem dentro da classe principal do arquivo, geralmente chamada de Main.

# Mais de uma variável na mesma linha:
    ```java

    int x = 5, y = 6, z = 7;
    System.ou.print(x + y + z);
    ```

    Nesse caso foi declarado três variáveis de número inteiros e impressas. (--Foram somadas--)

# Declaração de variável e atualização do valor da variável:
    ```java
    // Calculando a área de um retangulo
    int largura = 12;
    int altura = 7;
    int area; // Nesse estado, a variável está como `null`

    area = largura * altura; // Novo valor atribuído a variável

    System.out.println("largura: " + largura);
    System.out.println("altura: " + altura);
    System.out.println("Área do retangulo: " + area);

    ``` 
    /* Retorno:
        largura: 12
        altura: 7
        Área do rentangulo: 84
    */

# Tipos de dados Primitivos:
    Data Type	    Description
    byte	        Armazena números inteiros de -128 to 127
    short	        Armazena números inteiros de -32,768 to 32,767
    int	            Armazena números inteiros de -2,147,483,648 to 2,147,483,647
    long	        Armazena números inteiros de -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float	        Armazena números fracionários. Suficiente para armazenar de 6 to 7 dígitos decimais.
    double	        Armazena números fracionários. Suficiente para armazenar de 15 to 16 dígitos decimais.
    boolean	        Armazena valores verdadeiros ou falsos
    char	        Armazena um único caractere/letra ou valores ASCII

`Resalva:`
    Use os dados primitivos quando tiver certeza que o valor não ultrapassára os delimitadores, caso passe, irá gerar erro. Caso não tenha certeza, use um dado primitivo um pouco maior!

  |  -- Obs: quanto maior for, mais consumirá memória. |

# Tipos de dados Não primitivos

    Dados primitivos são aqueles dados que sempre começam com a letra inicial minúscula, os não primitivos, são aqueles que começam com a letra inicial geralmente em maiúsculas.

    Tipos de dados primitios:
        Arrays e classes.

# Conversão de tipo Java

    Em Java, existem dois tipos de fundição:

    Alargamento de fundição (automaticamente) - convertendo um tipo menor para um tamanho de fonte maior
    | byte -> short -> char -> int -> long -> float -> double |

    Estreitamento da fundição (manualmente) - convertendo um tipo maior para um tipo de tamanho menor
    | double -> float -> long -> int -> char -> short -> byte |

`Alargamento de fundição:`
```java
        public class Main {
        public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automaticamente e alargado a fundição da variável

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        }
    }
``` 
Repare que antes a variável tinha a descrição de INT, logo após foi atribuida outra descrisão DOUBLE. Com isso a descrisão da variável foi "Alargada".

`Fundição de Extreitamento:`
    A conversão de restrição deve ser feita manualmente, colocando o tipo entre parênteses na frente do valor:()

```java
    public class Main {
    public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Mudança manual: de double para int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
```
A descrisão da variável que antes era double, foi restrita para int após declarar a variável como int e adicionar a descrisão a frente com parenteses: ()

`Exemplo real:`
    Programa para calcular a porcentagem da pontuação de um usuário em relação à um jogo.

```java
    // Pontuação máxima do jogo é 500
    int maxScore = 500;
    
    // Pontuação do jogador
    int userScore = 423;

    // Calculando a porcentagem da pontuação do usuário em relação à pontuação máxima do jogo.
    float porcentagem = (float) userScore / maxScore *100.0f;

    // Imprimindo o resultado
    System.out.println("A porcetagem do usuário é " + porcentagem);
```
Neste caso acima foi aplicado o metodo de conversão de tipo.

# Operadores Java

    Os operadores são usados para executar operações em variáveis e valores.

    Java divide os operadores nos seguintes grupos:

    Operadores aritméticos
    Operadores de atribuição
    Operadores de comparação
    Operadores lógicos
    Operadores bit a bit

`Operadores Aritméticos:`
     
    | Operadores |      Nomes      |
    |-------------------------------
    |      +     |     Adição      |
    |      -     |    Subtração    |
    |      *     |  Multiplicação  |
    |      /     |    Divisão      |
    |      %     |    Modulos      |
    |     ++     |  Incrementação  |
    |     --     |  Decrementação  |

`Operadores de Atribuição:`

    | Operador | Exemplo | Execução  |
    |------------------------------- |
    |    =     |  x = 5  |   x = 5   |
    |    +=    |  x += 3 | x = x + 3 |
    |    -=    |  x -= 3 | x = x - 3 |
    |    *=    |  x *= 3 | x = x * 3 |
    |    /=    |  x /= 3 | x = x / 4 |
    |    %=    |  x %= 3 | x = x % 3 | 
    |    &=    |  x &= 3 | x = x & 3 |
    |    |=    |  x |= 3 | x = x | 3 |
    |    ^=    |  x ^= 3 | x = x ^ 3 |
    |   >>=    | x >>= 3 | x = x >> 3|
    |   <<=    | x <<= 3 | x = x << 3|

    | Operador  | Exemplo |      DEscrição     |
    |------------------------------------------|
    |    ==     | x == y  |      Indentico     |
    |    !=     | x != y  |      Negação       |
    |    >      | x > y   |      Maior que     |
    |    <      | x < y   |      Menor que     |
    |    >=     | x >= y  | Maior ou igual que |
    |    <=     | x <= y  | Menor ou igual que |