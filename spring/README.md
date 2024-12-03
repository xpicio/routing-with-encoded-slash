Project setup:

```
mvn spring-boot:run
```

Spring Boot:

```
❯ curl http://127.0.0.1:8008/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200
Content-Type: application/json
Transfer-Encoding: chunked
Date: Tue, 03 Dec 2024 14:07:14 GMT

{"id":"22/A","products":[{"id":"22/A","name":"Product B","type":"furniture"}],"type":"electronics"}
```
