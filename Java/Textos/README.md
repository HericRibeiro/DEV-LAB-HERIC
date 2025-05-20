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