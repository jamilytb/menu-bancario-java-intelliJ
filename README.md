# Movimentações Financeiras

Este projeto é uma aplicação simples em Java que permite ao usuário gerenciar suas movimentações financeiras em uma conta bancária. O usuário pode consultar o saldo atual, transferir valores e receber valores.

## Funcionalidades

- **Consultar Saldo**: O usuário pode verificar o saldo atual da conta.
- **Transferir Valor**: O usuário pode transferir um valor para outra conta, desde que tenha saldo suficiente.
- **Receber Valor**: O usuário pode adicionar um valor ao seu saldo.
- **Sair**: O usuário pode sair do aplicativo.

## Estrutura do Código

O código é estruturado em uma classe chamada `MovimentaçõesFinanceiras`, que contém o método `main` responsável pela execução do programa. 

### Variáveis Principais

- `nome`: Nome do cliente.
- `tipoDeConta`: Tipo de conta (ex: Corrente).
- `saldo`: Saldo atual da conta.
- `opcao`: Opção escolhida pelo usuário no menu.

### Menu de Opções

O menu de opções é apresentado ao usuário em um loop, permitindo que ele faça diversas operações até decidir sair. As opções disponíveis são:

1. Consultar saldo
2. Transferir valor
3. Receber valor
4. Sair
