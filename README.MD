# Projetos para a disciplina de Programação Orientada a Objetos (POO).

O objetivo é simular o sistema de carteira digital de uma startup de mobilidade, aplicando os conceitos de encapsulamento, regras de negócio e manipulação de estado dos objetos.

Como desafio proposto pelo professor desenvolvi o projeto Pet baseado na aula.

## Projeto - FiapRide

a ideia aqui é simular a carteira digital de um app de transporte.

### o que o objeto representa
a classe `Passageiro` representa um usuario real do aplicativo. ele guarda as infos do usuario (nome e cpf) e funciona como uma carteira digital, controlando o `saldo` que a pessoa tem na conta.

### como a classe funciona e metodos
o funcionamento é baseado em controlar o dinheiro e nao deixar o sistema aceitar valores invalidos:

- `adicionarSaldo(valor)`: serve pra colocar dinheiro na conta. tem uma regra de negocio que bloqueia valores negativos ou zerados, pq nao faz sentido depositar dinheiro negativo.
- `pagarViagem(custo)`: desconta o valor da corrida do saldo. a regra aqui é que o passageiro precisa ter dinheiro suficiente pra pagar, senao o sistema bloqueia a corrida.

### como usar
pra testar, é so instanciar a classe e chamar os metodos no `SistemaPrincipal`:

```java
Passageiro passageiro = new Passageiro("Ana", "123.456");
passageiro.adicionarSaldo(50.0); // recarrega 50
passageiro.pagarViagem(20.0); // gasta 20, sobra 30
```

## Projeto - Pet Virtual

esse é um projeto autoral aplicando os mesmos conceitos da aula de poo, mas usando um pet virtual no lugar do app de carona.

### o que o objeto representa
a classe `Pet` representa um bichinho virtual. em vez de controlar dinheiro, o objeto controla o estado fisico do bicho. os atributos sao nome, especie e a `energia`, que é o que dita se ele consegue fazer as coisas ou n.

### como a classe funciona e metodos
a classe controla a energia do pet atraves de 3 acoes principais, todas com regras de negocio pra impedir acoes impossiveis:

- `alimentar(quantidade)`: aumenta a energia do pet. a quantidade de comida tem q ser maior q zero.
- `brincar(esforco)`: gasta a energia. a regra aqui é q o pet nao pode brincar se o esforco for maior q a energia q ele tem (ele n brinca se tiver cansado).
- `dormir()`: recupera 10 pontos de energia automaticamente.

### como usar
é so instanciar o pet no `MainPet` e interagir com ele:

```java
meuPet.brincar(15.0);
        meuPet.alimentar(20.0);
        meuPet.brincar(15.0);
        meuPet.dormir();
```
