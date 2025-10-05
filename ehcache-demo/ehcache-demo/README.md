# ehcache-demo

Spring Boot demo project showing simple usage of Ehcache with @Cacheable.

## Run
./mvnw spring-boot:run
or
mvn spring-boot:run

## Endpoint
GET http://localhost:8080/api/users/{id}

First call will take ~3 seconds, subsequent calls within 30s will be served from cache.
