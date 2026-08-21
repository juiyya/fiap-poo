# FiapRide - Sistema de Carteira Digital

Este projeto foi desenvolvido para a disciplina de Programação Orientada a Objetos (POO). O objetivo é simular o sistema de carteira digital de uma startup de mobilidade, aplicando os conceitos de encapsulamento, regras de negócio e manipulação de estado dos objetos.

## Estrutura do Projeto

O projeto está organizado na seguinte estrutura de pacotes:
- **`br.com.fiapride.main`**: Contém a classe `SistemaPrincipal`, responsável por ser o ponto de entrada (execução) do programa e testar as funcionalidades.
- **`br.com.fiapride.model`**: Contém as classes de negócio que modelam o mundo real (`Passageiro` e `Pet`).

## O que os Objetos Representam?

### Classe `Passageiro`
Representa **um usuário final do aplicativo de transporte**. Assim como um passageiro real possui uma carteira física, o nosso objeto possui um atributo interno `saldo` (sua carteira digital virtual), além de suas informações de identificação, como `nome` e `cpf`.

### Classe `Pet` (Bônus)
É uma classe criada de forma autoral para demonstrar a aplicação da mesma lógica de POO ensinada em aula, mas em um domínio diferente. Assim como o passageiro tem regras rígidas para recarga e gasto de saldo, o objeto `Pet` possui suas próprias regras de estado (por exemplo, interagir com níveis de energia ou fome), seguindo os mesmos princípios de validação de dados para garantir que o objeto se comporte de maneira lógica.

## Métodos e Regras de Negócio (`Passageiro`)

A classe `Passageiro` interage com o sistema através de dois métodos principais de controle financeiro:

- **`adicionarSaldo(double valor)`**
  - **Como usar:** Deve ser chamado quando o usuário deseja depositar dinheiro no aplicativo (ex: via Pix ou Cartão de Crédito).
  - **Regra de Negócio:** O sistema bloqueia depósitos com valores negativos ou zerados. Afinal, no mundo real, não faz sentido depositar "-20 reais" na conta.

- **`pagarViagem(double custo)`**
  - **Como usar:** É chamado ao final de uma corrida para descontar o valor da viagem diretamente da carteira do usuário.
  - **Regra de Negócio:** 
    1. O custo da corrida deve ser um valor válido (maior que zero).
    2. O passageiro precisa ter saldo suficiente para cobrir o custo total. Se o saldo for menor que o valor da corrida, a transação é recusada e o saldo não sofre alterações.

## Como testar 

1. Abra o arquivo `SistemaPrincipal.java` no seu editor.
2. Dentro do método `main`, instancie os objetos e chame os métodos testando diferentes cenários:
   ```java
   // Exemplo de uso:
   Passageiro julia = new Passageiro("Julia", "111.222.333-44");
   
   julia.adicionarSaldo(50.0);  // Sucesso: Saldo vai para 50.0
   julia.adicionarSaldo(-10.0); // Erro: Regra de negócio impede saldo negativo
   
   julia.pagarViagem(30.0);     // Sucesso: Saldo reduz para 20.0
   julia.pagarViagem(100.0);    // Erro: Saldo insuficiente para a viagem
   ```
3. Execute o `SistemaPrincipal.java` para visualizar as validações sendo impressas no console.