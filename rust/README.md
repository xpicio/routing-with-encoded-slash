Project setup:

```
cargo run
```

Actix:

```
❯ curl http://127.0.0.1:8007/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
content-length: 61
content-type: application/json
date: Tue, 03 Dec 2024 14:04:59 GMT

[{"id":"22/A","name":"Product B","product_type":"furniture"}]
```
