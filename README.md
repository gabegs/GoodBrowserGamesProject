# **Projeto**
Fórum criado usando Spring Framework e Thymeleaf.


## Funções
### Para todos: 
- Criação de perfil em [/registration](http://localhost:8080/forum/registration).
- Exibição na página inicial: todas as seções existentes, tópicos recentes e postagens recentes.
- Exibição todos os tópicos da seção em [/section/{id}](http://localhost:8080/forum/section/1).
- Exibição de tópicos e posts em [/topic/{id}](http://localhost:8080/forum/topic/1).

### Apenas para usuário autorizado (ROLE_USER):
- Exibição de perfis [/user/{username}](http://localhost:8080/forum/user/user) or [/user/id/{id}](http://localhost:8080/forum/user/id/1). Displaying your own profile at [/myprofile](http://localhost:8080/forum/myprofile).
- Edição de perfil em [/myprofile/edit](http://localhost:8080/forum/myprofile/edit).
- Deleção de perfil em [/myprofile/delete](http://localhost:8080/forum/myprofile/delete). This operation requires a password confirmation.
- Criação de novo tópico em [/topic/new](http://localhost:8080/forum/topic/new).
- Criação de posts na página do tópico.
- Deleção de tópicos e posts próprios por botão na página do tópico.


### Apenas para administrador (ROLE_ADMIN): 
- Criação de seção em[/section/new](http://localhost:8080/forum/section/new).
- Exibição lista de todos os usuários em [/users](http://localhost:8080/forum//users)

## Configuração
Propriedades em `application.example.properties`.

```properties
## Database connection ##
spring.datasource.url=jdbc:mysql://localhost:3306/goodbrowsergames
spring.datasource.username=goodbrowsergames
spring.datasource.password=password

## Hibernate ##
spring.jpa.hibernate.ddl-auto=create
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

## Thymeleaf ##
spring.thymeleaf.cache=false
spring.messages.basename=messages/messages

## Static resources ##
spring.mvc.static-path-pattern=/resources/**

## Email ##
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.transport.protocol=stmp
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=### EMAIL ###
spring.mail.password=### PASSWORD ### 
spring.mail.smtp.auth=true
```
