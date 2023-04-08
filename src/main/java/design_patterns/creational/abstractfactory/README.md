# Design Patterns: Abstract Factory

### Problem

Não consegui pensar em um problema matemático que eu pudesse perpassar o conceito do Abstract Factory.
Mas, vamos lá, vamos tentar entender o que é esse pattern se baseando no conteúdo do site [Refactoring Guru](https://refactoring.guru/design-patterns/abstract-factory).

> O Abstract Factory é um pattern de criação que permite a criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

O refactoring guru traz uma problema que achei muito legal para entendermos melhor esse conceito. 
Sabemos que as pessoas usam Sistemas Operacionais variados e, dessa forma, como desenvolvedores, precisamos criar aplicações que sejam compatíveis com esses sistemas operacionais.
Seja visualmente ou funcionalmente, precisamos que a aplicação seja compatível com o sistema operacional do usuário.

Pensando na criação de uma aplicação com interface gráfica, é fácil entender que devemos ter botões, caixas de texto, etc. específico para cada Sistema Operacional.

### Solution

O Padrão Abstract Factory nos permite manter uma estrutura sustentável para a criação desses elementos gráficos.
