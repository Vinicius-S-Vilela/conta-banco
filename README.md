# Sistema de Conta bancária

## Visão Geral
O projeto "Conta Banco" foi desenvolvido com o objetivo de aprimorar meus estudos em Programação Orientada a Objetos (POO). É um sistema simples em Java que simula operações bancárias básicas, como abrir conta, fechar conta, depositar, sacar e pagar mensalidade. O objetivo é permitir a criação e manipulação de contas bancárias de dois tipos diferentes: Conta Corrente (CC) e Conta Poupança (CP), com regras específicas para cada operação.

## Funcionalidades Principais
1. **Abrir Conta**: Permite ao usuário abrir uma conta do tipo "CC" (Conta Corrente) ou "CP" (Conta Poupança). Ao abrir uma conta, um saldo inicial é definido automaticamente:
   - **CC**: Saldo inicial de R$50,00
   - **CP**: Saldo inicial de R$150,00

2. **Fechar Conta**: Fecha uma conta se o saldo estiver zerado. A conta não pode ser fechada se houver saldo positivo ou débito pendente.

3. **Depositar**: Realiza um depósito em uma conta aberta, aumentando o saldo da conta.

4. **Sacar**: Permite ao usuário sacar um valor da conta, desde que haja saldo suficiente e a conta esteja aberta.

5. **Pagar Mensalidade**: Deduz uma taxa mensal da conta dependendo do tipo:
   - **CC**: R$12,00
   - **CP**: R$20,00

#### Atributos
- `int conta`: Número da conta.
- `String tipo`: Tipo da conta (CC ou CP).
- `String dono`: Nome do proprietário da conta.
- `Double saldo`: Saldo da conta.
- `Boolean status`: Status da conta (aberta ou fechada).

#### Métodos
- `estadoAtual()`: Exibe o estado atual da conta, incluindo número, tipo, dono, saldo e status.
- `abrirConta(String tipo)`: Abre uma conta do tipo especificado (CC ou CP).
- `fecharConta()`: Fecha a conta se o saldo estiver zerado.
- `depositar(Double deposito)`: Realiza um depósito na conta.
- `sacar(Double sacar)`: Realiza um saque da conta.
- `pagarMensal()`: Deduz a mensalidade da conta.

#### Construtor
- `ContaBanco()`: Inicializa uma nova conta com saldo 0 e status fechado.

## Requisitos do Sistema
- **Java SE 8** ou superior
- **IDE**: Qualquer IDE compatível com Java (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Passos para Execução
1. Clone ou faça o download do código-fonte.
2. Importe o projeto em uma IDE de sua escolha.
3. Compile e execute a classe `ContaBanco`.
4. Utilize os métodos da classe para simular operações bancárias.

## Possíveis Melhorias
- Implementar autenticação para maior segurança.
- Adicionar uma interface gráfica (GUI) para facilitar o uso.
- Expandir as operações, incluindo transferência entre contas e relatórios de transações.

## Contribuição
Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades. Para isso, faça um fork deste repositório, crie uma branch para sua feature, e submeta um pull request.
