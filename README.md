# Java Spring Expert

Neste repositório vamos trabalhar muito com testes automatizados, desde os fundamentos até testes de unidade, de integração, de API, caixa branca/preta, TDD, cobertura de testes, e muito mais, além de vários novos desafios onde você consolidará seu aprendizado. Vamos focar em ferramentas tais como JUnit, Mockito, MockMvc, Jacoco e RestAssured. Importante ressaltar que aqui você vai ter desafios com TDD, ou seja, você vai receber um projeto onde os testes já estão escritos previamente, e sua tarefa será implementar as funcionalidades para fazer os testes passarem. Essa prática é muito importante e muito usada em processos seletivos de empresas.

## Conteúdo Programático

### Módulo 1: Preparação do projeto
- Setup do projeto DSCatalog
- Banco de dados H2, camadas
- Criação de entidades
- Transações e sessão JPA
- Seeding da base de dados
- DTO
- Criando um ambiente de execução no Postman
- Tratamento de exceções
- Operações de CRUD
- Métodos GET, POST, PUT, DELETE
- Dados de auditoria
- Paginação
- Revisão modelo relacional N-N
- Mapeamento JPA N-N

### Módulo 2: Testes automatizados
- Tipos de teste
- Benefícios dos testes automatizados
- O que é TDD
- Boas práticas para testes
- JUnit
- Testes Java vanilla
- Padrão de projeto Factory para instanciar objetos
- Exercícios JUnit vanilla
- Testes com Spring, principais annotations
- Testes de repository
- Fixtures no JUnit, BeforeEach
- Exercício com repository
- Mockito vs MockBean
- Testes de unidade da camada Service
- Imports estáticos do Mockito
- Simulando comportamentos diversos com Mockito
- Exercício testes de unidade com Mockito
- Testes na camada web
- Legibilidade e negociação de conteúdo
- Exercício testes na camada web
- Testes de integração
- Teste de integração na camada web
- Implementando o desafio TDD resolvido
- DESAFIO: TDD Event-City

### Módulo 3: Validação e segurança
- Implementando entidades User e Role, ORM, seed
- Introdução ao Bean Validation
- Anotações básicas
- Tratando exceção MethodArgumentNotValidException
- Resposta customizada para erro de validação
- Implementando um ConstraintValidator customizado
- Inclusão de segurança ao projeto
- OAuth2, JWT
- Pré-autorizando métodos por perfil de usuário
- DESAFIO: Validação e segurança

### Módulo 4: Consultas, finalização do DSCatalog
- Consulta detalhada de produtos
- Problema N+1 consultas
- Correção nos testes automatizados após mudanças
- Configuração de CORS
- DESAFIO: MovieFlix domínio
- DESAFIO: MovieFlix casos de uso

### Módulo 5: Cobertura de testes com Jacoco
- Setup do Jacoco no projeto Spring Boot
- Seleção de pacotes para cobertura
- Fluxos de cobertura, caixa branca
- Análise e implementação de testes de unidade
- Mock de dependências com Mockito
- Mocks relacionados a segurança
- Relatório de cobertura
- DESAFIO: Cobertura Jacoco

### Módulo 6: Testes de API com RestAssured
- Setup do Spring Boot com RestAssured
- Domain-specific language (DSL) do RestAssured
- Análise e implementação de testes de API
- Considerações de integração e seed da base de dados
- Paralelo MockMvc e RestAssured
- DESAFIO: Teste de API com RestAssured

## Projetos

### Projeto DSCatalog
Este é o projeto principal da trilha do Java Spring Expert. O projeto consiste em um sistema de catálogo de produtos, onde o objetivo do projeto é ensinar aos alunos como estruturar com projeto completo com camadas, boas práticas, validação, segurança, tratamento de exceções, consultas ao banco de dados, testes automatizados, dentre outros recursos. Esse projeto também será nosso objeto de estudo para aplicar os tópicos do conteúdo programático da trilha.

*Nota: este é o design Figma do sistema, que é usado para nos guiar durante o desenvolvimento do back end. Porém, a construção do front end com as telas gráficas não faz parte desta formação, que é de back end, e não de front end.*

### Projeto Event-City
Este projeto é utilizado em dois dos desafios que o aluno terá que realizar durante a trilha de aprendizado. O primeiro deles é para avaliar a competência do aluno no desenvolvimento de funcionalidades baseado no princípio TDD, onde testes automatizados são escritos previamente como especificação. Esta competência é muito importante e é muito utilizada em testes de entrevistas de emprego. No segundo desafio, o aluno será avaliado em sua competência para estruturar a segurança de um projeto Spring Boot, com login e controle de acesso por perfis de usuário, além de outros aspectos tais como validação de dados, testes automatizados, dentre outros.

### Projeto MovieFlix
O projeto MovieFlix é um sistema no qual os usuários podem navegar em um catálogo de filmes e enviar avaliações sobre os filmes. Este projeto é utilizado em dois dos desafios que o aluno terá que realizar durante a trilha de aprendizado. No primeiro desafio, o aluno deverá implementar o modelo de domínio e o seed da base de
