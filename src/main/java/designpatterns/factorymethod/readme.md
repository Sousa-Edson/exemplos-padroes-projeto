 
## Padrão Factory Method

O **Factory Method** é um padrão de projeto criacional que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

Esse padrão é útil quando o código precisa trabalhar com objetos cujos tipos exatos podem ser determinados em tempo de execução, mantendo o código cliente desacoplado das classes concretas.

### 💡 Vantagens:
- Desacopla o código cliente da lógica de criação dos objetos.
- Facilita a extensão do sistema com novos tipos de produtos.
- Segue o princípio do **aberto/fechado** (Open/Closed Principle).

### 🧱 Estrutura:
- **Product**: Interface comum dos objetos que serão criados.
- **ConcreteProduct**: Implementações específicas da interface.
- **Creator**: Classe abstrata com o método de fábrica (`factoryMethod()`).
- **ConcreteCreator**: Implementa o método de fábrica retornando instâncias de `ConcreteProduct`.

### ✅ Exemplo de uso:
Em um sistema de entregas, você pode ter um `TransportCreator` que define um método de fábrica abstrato. Subclasses como `CarTransportCreator` e `BikeTransportCreator` implementam esse método para criar objetos `Car` e `Bike`, respectivamente.

