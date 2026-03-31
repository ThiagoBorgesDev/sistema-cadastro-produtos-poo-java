# 🛒 Sistema de Cadastro de Produtos (CRUD) em Java

Projeto desenvolvido com foco em aplicar conceitos de **Programação Orientada a Objetos (POO)** e simular um sistema real de gerenciamento de produtos com operações completas de CRUD.

---

## 🚀 Sobre o projeto

Este sistema permite o gerenciamento de produtos através de um menu interativo no terminal, possibilitando:

* Cadastro de novos produtos
* Listagem de produtos cadastrados
* Busca por produto
* Atualização de dados
* Remoção de produtos

O projeto foi estruturado seguindo boas práticas de desenvolvimento, com separação em camadas e organização semelhante a sistemas utilizados no mercado.

---

## 🧠 Conceitos aplicados

* ✅ Programação Orientada a Objetos (POO)
* ✅ Encapsulamento
* ✅ Separação de responsabilidades
* ✅ Arquitetura em camadas (Model, Service, Repository)
* ✅ Validação de dados
* ✅ Estruturas de controle (if, switch, loops)
* ✅ Manipulação de listas com ArrayList

---

## 🏗️ Estrutura do projeto

```
src/
 ├── model/
 │    └── Produto.java
 │
 ├── repository/
 │    └── ProdutoRepository.java
 │
 ├── service/
 │    └── ProdutoService.java
 │
 └── app/
      └── Main.java
```

---

## 📦 Funcionalidades (CRUD completo)

### ➕ Create (Cadastrar)

Permite adicionar novos produtos ao sistema com:

* Nome
* Preço
* Quantidade

---

### 📋 Read (Listar)

Exibe todos os produtos cadastrados no sistema.

---

### 🔍 Search (Buscar)

Permite localizar um produto pelo nome.

---

### ✏️ Update (Atualizar)

Permite alterar:

* Preço
* Quantidade de um produto existente

---

### ❌ Delete (Remover)

Remove um produto do sistema com base no nome.

---

## 🖥️ Exemplo de uso

```
===== SISTEMA DE PRODUTOS =====
1 - Cadastrar produto
2 - Listar produtos
3 - Buscar produto
4 - Atualizar produto
5 - Remover produto
0 - Sair
Escolha:
```

---

## ⚙️ Tecnologias utilizadas

* Java
* Paradigma de Programação Orientada a Objetos (POO)

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de:

* Consolidar conhecimentos em Java
* Praticar os pilares da POO
* Simular um sistema real de gerenciamento
* Demonstrar organização de código para portfólio

---

## 🔥 Diferenciais do projeto

* ✔ Implementação completa de CRUD
* ✔ Menu interativo com entrada de dados via Scanner
* ✔ Validação de dados na camada de serviço
* ✔ Separação em camadas (arquitetura limpa)
* ✔ Código organizado e de fácil manutenção

---

## ⚠️ Validações implementadas

* Nome não pode ser vazio
* Preço não pode ser negativo
* Quantidade não pode ser negativa
* Verificação de existência antes de atualizar/remover

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```
git clone https://github.com/ThiagoBorgesDev/sistema-cadastro-produtos-poo-java.git
```

2. Abra o projeto em sua IDE (IntelliJ, Eclipse ou VS Code)

3. Execute a classe principal:

```
app.Main
```

---

## 🚀 Possíveis melhorias futuras

* 💾 Persistência em banco de dados (MySQL/PostgreSQL)
* 🌐 Transformação em API REST com Spring Boot
* 🔐 Validação mais robusta
* 🧪 Testes automatizados (JUnit)
* 🖥️ Interface gráfica ou web

---

## 👨‍💻 Autor

Thiago Borges Dev

---

## 📌 Considerações finais

Este projeto representa a evolução de um sistema simples para um CRUD completo, demonstrando domínio dos conceitos fundamentais de desenvolvimento Java e preparação para projetos mais avançados no ambiente profissional.

---
