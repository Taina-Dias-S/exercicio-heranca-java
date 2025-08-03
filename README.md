# 💻 Prática de POO em Java 

Este projeto foi desenvolvido como parte dos meus estudos de Programação Orientada a Objetos (POO) em Java. Ele demonstra conceitos fundamentais como herança, abstração e polimorfismo utilizando uma estrutura de classes relacionadas a pessoas, alunos e bolsistas.
Apesar de ser um projeto simples, ele já me ajudou bastante a compreender melhor esses conceitos e a colocá-los em prática.

## 📚 Conceitos aplicados

- Classe abstrata: `Pessoa` serve como modelo base e não pode ser instanciada.
- Herança Simples: `Visitante` herda de `Pessoa` sem adicionar novos atributos ou comportamentos.
- Herança por Diferenciação: `Aluno` herda de `Pessoa` e adiciona atributos como curso e matrícula.
- Herança em Cadeia: 'Bolsista` herda de `Aluno`, que por sua vez herda de `Pessoa`.
- Polimorfismo: O método `pagarMensalidade()` é sobrescrito na classe `Bolsista` para alterar seu comportamento.
- 
## 🧠 O que eu aprendi

Durante o desenvolvimento deste projeto, aprendi e pratiquei os seguintes conceitos POO:

- **Classes e Objetos**: Como estruturar classes e instanciar objetos.
- **Abstração**: Criação de uma classe abstrata (Pessoa) que serve como modelo.
- **Herança**: Reutilização de atributos e métodos através das classes Visitante, Aluno e Bolsista.
- **Polimorfismo**: Implementação de métodos com comportamentos diferentes, como "pagarMensalidade()" em Aluno e Bolsista.
- **Sobrescrita de Métodos**: Redefinição de métodos herdados para adaptar o comportamento em subclasses.
- **Encapsulamento**: Uso de getters e setters para proteger os dados das classes.
- **Organização de código**: Separação lógica entre classes e uso de boas práticas de nomes e comentários.


