# User Microservice (Kotlin)

POST http://localhost:9191/users/

Body
`{
"name" :"Yogendra",
"email" :"yogendra@gmail.com",
"departmentId" :1
}`

GET http://localhost:9191/users/{id}

### Summary
Part of microservices example

Used to store and retrieve user from H2 db
Used to retrieve user from user-service

### Frameworks used
* Microutils kotlin logging
* H2 Database
* Spring JPA
* Spring Web
* Eureka client
* Cloud config
* Cloud bootstrap - for bootsrtap.xml from spring 2.4 onwards
* Zipkin and sleuth

### Microservices in group
* department-service
* user-service
* service-registry
* cloud-gateway
* hystrix-dashoard
* cloud-config-server
* zipkin jar file