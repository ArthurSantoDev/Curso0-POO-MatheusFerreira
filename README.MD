# Programação Orientada a Objetos (POO) — Anotações

Resumo de estudos sobre os conceitos fundamentais de Programação Orientada a Objetos em Java: classes, atributos, construtores, encapsulamento, getters/setters e o método `toString`.

## Sumário

- [Classes](#classes)
- [Atributos](#atributos)
- [Construtores](#construtores)
- [Métodos](#métodos)
- [Encapsulamento](#encapsulamento)
- [Getters e Setters](#getters-e-setters)
- [Atributos obrigatórios via construtor](#atributos-obrigatórios-via-construtor)
- [O método toString](#o-método-tostring)

## Classes

Uma classe é formada por um ou mais **atributos** e um ou mais **métodos**. Todo atributo tem um tipo, e os métodos definem as funcionalidades da classe.

Cada método tem um tipo de retorno e pode receber argumentos. O corpo do método é composto por declarações e instruções, separadas por ponto e vírgula.

A classe funciona como um **molde**, um modelo que define o que um objeto deve ter — como no exemplo de um carrinho a seguir.

## Atributos

Os atributos (ou variáveis de instância) são as características que fazem parte da construção do objeto que estamos criando.

```java
public class Carrinho {

    private String cor;
    private String tamanho;
    private int numRodas;

}
```

Assim conseguimos definir os atributos de acordo com o que queremos que a classe represente. Eles funcionam como etiquetas ou rótulos que guardam informações.

## Construtores

Construtores são métodos usados para criar o objeto (no exemplo, o "carrinho"): eles executam a ação de construção quando chamados. Quando nenhum construtor é definido, o Java cria automaticamente um construtor vazio.

```java
public Carrinho() {

}
```

Esse é um construtor de `Carrinho`. Nele devemos definir o que for obrigatório para construir o objeto por padrão.

```java
public Carrinho(String cor, String tamanho, int numRodas) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.numRodas = numRodas;
}
```

Aqui passamos os parâmetros que queremos receber no construtor. Ou seja, ao usar esse construtor, é obrigatório informar esses parâmetros:

```java
Carrinho carrinho = new Carrinho("Vermelho", "Grande", 4);
```

## Métodos

Agora podemos criar um método para exibir essas características:

```java
public void exibirCaracteristicas() {
    System.out.println("Cor: " + cor);
    System.out.println("Tamanho: " + tamanho);
    System.out.println("Número de Rodas: " + numRodas);
}
```

Chamando o método criado:

```java
carrinho.exibirCaracteristicas();
```

## Encapsulamento

Encapsulamento é a forma de proteger os atributos e métodos de uma classe.

Quando o encapsulamento é `private`, o atributo ou método só pode ser acessado dentro daquele escopo de código. Essa é a essência do encapsulamento: uma forma de proteção que impede o acesso por outras classes — não sendo possível, por exemplo, instanciar diretamente um atributo privado com `new`.

Exemplo de erro por acesso indevido a um atributo privado:

```java
public static void main(String[] args) {

    Livro livro = new Livro();
    livro.titulo = "Título do livro"; // erro: 'titulo' é private
}
```

Esse código gera erro porque o atributo está privado. Se ele fosse público, o acesso direto seria possível.

Também é possível usar o modificador `protected`, que permite atribuir dados a um atributo que está no mesmo pacote, tornando possível a instanciação nesse contexto.

> Quanto mais encapsulado, melhor.

## Getters e Setters

Para permitir a atribuição e leitura de atributos ou métodos privados, usamos **getters e setters**:

```java
public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getTitulo() {
    return titulo;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getAutor() {
    return autor;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public String getDescricao() {
    return descricao;
}

public boolean getCapaDura() {
    return capaDura;
}

public void setCapaDura(boolean capaDura) {
    this.capaDura = capaDura;
}
```

Esses setters são públicos e responsáveis por receber o valor passado por parâmetro e atribuí-lo à respectiva variável.

## Atributos obrigatórios via construtor

Se quisermos tornar algum atributo obrigatório, devemos sobrecarregar o construtor da classe. No exemplo de `Livro`, passamos o título no construtor, tornando-o obrigatório na construção do objeto:

```java
public Livro(String titulo) {
    this.titulo = titulo;
}
```

## O método toString

Toda classe em Java (e todo objeto) já possui um método `toString`, que funciona como uma "assinatura" do objeto. Podemos sobrescrevê-lo (fazer o *override*) para retornar uma representação em `String` customizada:

```java
@Override
public String toString() {
    return "Livro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", descricao='" + descricao + '\'' +
            ", capaDura=" + capaDura +
            '}';
}
```

Exemplo de uso completo:

```java
Livro livro = new Livro("O Senhor dos Anéis");
livro.setAutor("J.R.R. Tolkien");
livro.setDescricao("Uma épica história de fantasia.");
livro.setCapaDura(true);

System.out.println(livro);
```

---

*Anotações baseadas no curso de POO — Matheus Leandro Ferreira.*

# Lambdas

Ele é semelhante ao método, porém não precisa de nome, nem modificador
de acesso, e é implementado diretamente aonde vai ser usado.

Ele tem a estrutura:

```
(argumento) -> expression
(argumento, argumento) -> expression
() -> {bloco}
```

Por exemplo a seguir temos uma expressão lambda usando um println sobre
uma lista:

```java
clientes.forEach(c -> System.out.println(c.getNome()+ "-" + c.getIdade()));
```

Por exemplo temos uma lista com um stream e podemos passar uma lambda
num filter, map e usar o forEach:

```java
List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
lista.stream()
.limit(7)
.filter(e -> e % 2 == 0)
.map(e -> e * 2)
.forEach(System.out::println);
```

Temos o parâmetro da função lambda, no caso o `e` + arrow token, ou
function + corpo da função.

## Stream API

Ele também diminui o código, usando ela temos diversos recursos.

![Sugestões de métodos do Stream em clientes.stream() (forEach, map, filter, limit, allMatch, anyMatch, collect, count, distinct, dropWhile, findAny...)](extracted/media/image1.png)

```java
List<Cliente> clientesFilter = clientes.stream()
.filter(c -> c.getIdade() > 18)
.collect(Collectors.toList());

clientes.stream()
.map(c -> c.getIdade())
.filter(v -> v > 30)
.collect(Collectors.toList());
```

Ele usa funções lambdas só que com mais recursos.

A partir do momento que temos uma lista podemos dar um `.` e utilizar o
stream e a partir dele fazer operações.

### forEach

forEach: ele espera um consumer, o consumer é genérico, ele é uma
interface funcional, ela tem apenas um método para implementação, no
accept ele recebe o mesmo "t".

```java
usuariosRequest.stream()
.forEach(new MeuConsumer());

usuariosRequest.stream()
.forEach(u -> System.out.println(u.senha()));
```

Depois da `->` já vem a implementação, que no caso é o accept, usando uma
função lambda.

### Map

Map: ele utiliza chaves e valores, ele percorre esses dados, ele espera
receber uma função, ele recebe dois e retorna um.

```java
usuariosRequest.stream()
.map(new MinhaFunction()).toList().forEach(System.out::println);
```

Aqui ela recebe o usuário request e response no método, mas retorna
somente o response. E aqui fazemos um map em cima do request, mas no
map usamos a MinhaFunction que retorna somente o response, aonde
mapeamos ele com o forEach para trazer os dados.

Podemos usar uma lambda aonde recebemos o request como parâmetro e na
saída retornamos um novo usando o response, aonde passamos o que
queremos, e passamos um toList usando o forEach; assim não passamos
uma classe ou interface, somente usamos a lambda:

```java
quest.stream()
.map(u -> new UsuarioResponseDto(u.nome(), u.email(),
u.idade())).toList().forEach(System.out::println);
```

### Filter

Ele filtra esperando um predicate, aonde ele retorna um booleano.

No meuPredicate fizemos o filtro, mas podemos usar uma lambda para fazer
isso sem criar a classe ou interface:

```java
usuariosRequest.stream()
.filter(new MeuPredicate()).toList().forEach(System.out::println);

usuariosRequest.stream()
.filter(u -> u.idade() >= 18).toList().forEach(System.out::println);
}
```

Aqui temos um stream em que para cada 1 dos números é chamada a função
forEach que faz o sout:

```java
List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
lista.stream().forEach(System.out::println);
```

### Outros métodos de Stream

Outro caso:

```java
List<Integer> lista = Arrays.asList(4,3,5,6,4,3,6,7,7,8,1,6);
lista.stream()
.skip(2)
.limit(5)
.distinct()
.forEach(System.out::println);
```

Aqui usamos métodos como o skip, que serve para ignorarmos os primeiros
itens da lista, o limit limita a x números e o distinct é para ignorar
os números iguais.

```java
List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
lista.stream()
.filter(e -> e > 5)
.forEach(System.out::println);
```

Aqui usamos o filter com uma expressão lambda no forEach para o sout.

```java
List<Integer> lista = Arrays.asList(4,6,7,8,3,5,6,8,1,2,4,2,4,7);
lista.stream()
.map(e -> e * 4)
.forEach(e -> System.out.println(e + " "));
```

Aqui usamos o map para fazer a multiplicação de cada item por 4, e
usamos uma lambda para o sout.

```java
.max(Comparator.naturalOrder());
```

Aqui estamos buscando o maior número na lista, e usamos um max com o
comparator com o get para retornar.

```java
.min(Comparator.naturalOrder());
```

Aqui foi o contrário, buscamos o mínimo.

```java
.filter(e -> e % 2 == 0) // mantém apenas números pares
.count(); // pega quantos itens restam no stream
```

Aqui busquei apenas os pares e, no caso, a contagem de quantos números
pares.

```java
.collect(Collectors.toList());
```

Aqui usamos o collect para criar a nova lista.

```java
List<Integer> lista1 = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4,
2, 1, 3);
Map<Boolean, List<Integer>> mapa = lista1.stream()
.map(e -> e * 2) // multiplica cada item por 2
.collect(Collectors.groupingBy(e -> e > 8)); // agrupa itens baseado
no resultado
System.out.println(mapa);
```

Aqui usamos o groupingBy no collectors para agrupar os itens.

```java
.collect(Collectors.joining(";"));
```

Aqui usamos um join que vai separar os elementos por ";".

# Tratamento de Erros: Try-Catch

Ele deve ser usado com cuidado, onde faz sentido usar em exceções.

Ele é custoso em performance; se usado frequentemente, pode causar impactos negativos. Ele traz más práticas de design quando torna o código menos legível. Na captura genérica de exceções, ele pode esconder o problema, que deveria ser tratado de forma mais específica, silenciando exceções — pois não faz sentido criar um catch vazio. E na manutenção, ele pode dificultar quando usado em excesso.

Se o erro for previsível, ele pode ser evitado por uma condicional, e assim fazemos a verificação condicional, caso não use o try-catch para lidar com isso.

Vamos a exemplos:

## Validar exceções antes de executar uma ação

```java
try {
    int[] arr = new int[10];
    System.out.println(arr[11]);

} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice fora dos limites do array");
}
```

Mas podemos tratar essa mesma exceção com um if e else:

```java
int[] arr1 = new int[10];
int index = 11;
if (index >= 0 && index < arr1.length) {
    System.out.println(arr1[index]);
} else {
    System.out.println("Índice fora dos limites do array");
}
```

### Outro exemplo na mesma linha de raciocínio

```java
try {
    String text = null;
    System.out.println(text.length());
} catch (NullPointerException e) {
    System.out.println("Objeto nulo acessado");
}
```

```java
String text1 = null;
if (text1 != null) {
    System.out.println(text1.length());
} else {
    System.out.println("Objeto nulo acessado");
}
```

### Outro exemplo na mesma linha de raciocínio

```java
try {
    int number = Integer.parseInt("abc");

} catch (NumberFormatException e) {
    System.out.println("Formato de número inválido");
}
```

```java
int number1 = Integer.parseInt("abc");
if (number1 >= Integer.MIN_VALUE && number1 <= Integer.MAX_VALUE) {
    System.out.println(number1);
} else {
    System.out.println("Formato de número inválido");
}
```

## Exemplo de try-catch

```java
try {
    int soma = Integer.parseInt(idade + "a");
    System.out.println(soma);

} catch (NumberFormatException e) {
    System.out.println(e.getMessage());
    System.out.println(e.getStackTrace());
    System.out.println(e);
    System.out.println(e.getClass());
    System.out.println("Erro: Formato de número inválido");
}
```

## Tratamento de título específico

```java
try {
    int soma = Integer.parseInt(idade + "a");
    System.out.println(soma);

} catch (NumberFormatException n) {
    System.out.println("Erro: Formato de número inválido, não foi possível converter a soma!");
} catch (Exception e) {
    System.out.println("Erro não identificado!");
}
```

## Cascata de tratamento de exceções

```java
try {
    int soma = idade / 0;
    System.out.println(soma);

} catch (NumberFormatException n) {
    System.out.println("Erro: Formato de número inválido, não foi possível converter a soma!");
} catch (ArithmeticException a) {
    System.out.println("Houve um erro de operação aritmética!");
}
```

## Usando um laço for e Scanner

```java
Scanner sc = new Scanner(System.in);

for (int i = 0; i < 3; i++) {
    System.out.println("Digite um número: ");
    String numero = sc.nextLine();

    try {
        int numConvertido = Integer.parseInt(numero);
        System.out.println(numConvertido);

    } catch (NumberFormatException n) {
        System.out.println("Erro: Formato de número inválido, não foi possível converter a soma!");
    } catch (ArithmeticException a) {
        System.out.println("Houve um erro de operação aritmética!");
    } catch (Exception e) {
        System.out.println("Erro não identificado");
    }

}
```

## Usando while true

```java
Scanner sc = new Scanner(System.in);

boolean opcao = false;

while (opcao == false) {
    System.out.println("Digite um número: ");
    String numero = sc.nextLine();

    try {
        int numConvertido = Integer.parseInt(numero);
        System.out.println(numConvertido);

        opcao = true;

    } catch (NumberFormatException n) {
        System.out.println("Erro: Formato de número inválido, não foi possível converter a soma!");
    } catch (ArithmeticException a) {
        System.out.println("Houve um erro de operação aritmética!");
    } catch (Exception e) {
        System.out.println("Erro não identificado");
    }

}
```

## Usando um array em loop for

```java
int[] colInt = new int[5];
colInt[0] = 1;
colInt[1] = 5;
colInt[2] = 10;
colInt[3] = 15;
colInt[4] = 20;

for (int i = 0; i <= 5; i++) {
    try {
        System.out.println(colInt[i]);
    } catch (ArrayIndexOutOfBoundsException a) {
        System.out.println("Não existe este index: " + i);
    }
}
```
