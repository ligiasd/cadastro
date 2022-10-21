### API Cadastro

Desafio proposto para desenvolver uma API Rest com Spring Kotlin com rescursos:
- POST para inclusão de histórico cadastral;
- GET para consulta de históricos e filtros;

Recursos apresentados:  

- POST para cadastro de usuarios, dados à inserir nome, e-mail, cpf, tratamento de erro para validações de campo para e-mail e cpf(únicos na base de dados e não aceitam campo vazio);
- GET pesquisa por todos os usuários cadastrados, com paginação, filtro; 
- Teste Integrado para chamadas aos métodos de cadastro e consulta;

  Chamadas local para cadastro e consulta de todos registros na url: http://localhost:8080/customers;  
  Consulta com filtro nome e paginação na url: http://localhost:8080/customers/search;  
  
  obs.: para teste deixei dados json no link: http://www.dontpad.com/postmantest
  
  Para rodar localmente: 

- Estrutura do projeto segue versão Java SDK 11  
- Postgres para base de dados
  
  Será necessário criar uma base de dados no Postgres com o nome de "casatro_proj", para acessar a base dados através da IDE será necessário adicionar variavel de ambiente e salvar seus dados de usuário e senha;  
  
Para esta API ainda necessita de implementar alguns diferenciais e refatoração para forma de gravação assíncrona, e adicionar mais 2 tipos de filtros à base de consulta, Dockerfile ou docker compose.
    

  
 

