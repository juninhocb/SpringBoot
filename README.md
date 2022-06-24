# SpringBoot
CRUD de clientes e pedidos, utilizando-se do framework Spring, banco de dados PostgreSQL e H2 dependendo do perfil, configurado para deploy com Heroku, segurança oAuth 2.0.

1- Atentar-se com o versionamento do SpringBoot oAuth, versão 2.0.1.RELEASE utilizada, novas versões estão com anotations depreciados
2- Java 17 utilizado
3- Para conseguir fazer as requisições após rodar o servidor é necessário gerar um acess token com a senha gerada no log do compilador do server
4- Acesso ao banco de dados deverá ser configurado com o pgAdmin, caso seja utilizado nos perfis "dev" ou "prod"
5- Senha do basic auth está ilustrada em "application.properties"
6- Para alterar o profile de execução do servidor basta ir em "application.properties" e alterar a propriedade "spring.profiles.active", para "dev", "prod" ou "test"
7- O Banco de dados do profile "test" já vem com informações que podem ser acessadas no /h2-console, usuário e senha em "application-test.properties"
