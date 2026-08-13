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

# Funções Lambda

Deixam o código mais limpo, direto e sem dor de cabeça.

```java
.filter(e -> e % 2 == 0)
```

- **`e`** — é o parâmetro da função lambda, ou seja, o elemento da lista.
- **`->`** — é a seta, o separador da lambda.
- **`e % 2 == 0`** — é o que vem após a seta, o corpo da função lambda (o que ficaria entre as chaves `{ }`).

Assim o código fica mais fácil de entender e de dar manutenção — ele fica **explícito**.