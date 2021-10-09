# Design Patterns: Builder

### Problem

Suponhamos que o número máximo de monômios em um polinômio seja 10.

Ex.: 
````javascript
polynomialDegree10 = "2x^1 + 3x^2 + 2x^3 + 7x^4 + 5x^5 + 5x^6 + 10x^7 + 2x^8 + 4x^9 + 3x^10";
````

Podemos escrever um números polinomiais de quantos monômios quisermos (limitados a 10);

Ex.: 
````javascript
polynomialDegree5 = "2x^1 + 3x^2 + 2x^3 + 7x^4 + 5x^5";
polynomialDegree5 = "2x^1 + 2x^3 + 7x^4 + 5x^5";
````

Não existe uma ordem para montar um polinômio, mas sua composição deve estar ordenada de menor grau para maior grau;

Como nós criaríamos um sistema que atendesse essas regras?

### Solution

Para entendermos esse pattern de uma forma concreta, vamos criar um projeto que gera números polinomiais. (Vamos relembrar um pouco de matemática, né?)

Monômios: 2x^2

Polinômios: 2x^2 + 5x^3