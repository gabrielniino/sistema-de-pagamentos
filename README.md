# 💼 Sistema de Pagamento - Programação Orientada a Objetos

<img align="center" alt="Java" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">

---

## 📚 Informações da Atividade

- **Professor:** Marcelo Yamamoto  
- **Matéria:** Linguagem de Programação Orientada a Objetos

---

## 📝 Descrição

Este projeto simula um **Sistema de Pagamento** utilizando os princípios da **Programação Orientada a Objetos (P.O.O.)** com a linguagem **Java**.

A aplicação lida com dois tipos de pessoas:
- Funcionários (com salário fixo)
- Prestadores de serviço (pagos por hora)

As classes foram organizadas de forma hierárquica e modular para melhor legibilidade e manutenção do código.

---

## 🌱 Estrutura do Projeto

```
src/
└── com/
    └── empresas/
        └── pagamentos/
            ├── app/
            │   └── Main.java
            ├── model/
            │   ├── Pessoa.java
            │   ├── Funcionario.java
            │   └── PrestadorServico.java
            ├── service/
            │   └── PagamentoService.java
            └── util/
                ├── Formatador.java
                └── PagamentoException.java
```

---

## 🧠 Conceitos Aplicados

- Herança
- Polimorfismo
- Encapsulamento
- Abstração
- Tratamento de exceções
- Organização em pacotes

---

## 🌿 Branches

| Branch         | Descrição |
|----------------|-----------|
| `main`         | Contém a **solução base** solicitada na atividade original. |
| `validations`  | Contém um **incremento** da atividade com tratamento de exceções personalizadas e mensagens de erro mais descritivas. |

---

## 💡 Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/seu-usuario/sistema-pagamento-java.git
   ```

2. Compile e execute o arquivo `Main.java` com sua IDE favorita (Eclipse, IntelliJ, VSCode) ou via terminal:
   ```bash
   javac src/com/empresas/pagamentos/app/Main.java
   java com.empresas.pagamentos.app.Main
   ```

---

## 📌 Observações

Este projeto foi desenvolvido como parte de uma atividade avaliativa da disciplina, com o objetivo de aplicar os conceitos de orientação a objetos em um cenário prático e realista.

---

## 👨‍💻 Autor

Gabriel G. Pereira  
Engenharia de Software

