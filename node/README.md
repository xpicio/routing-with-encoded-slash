Project setup:

```
pnpm install
pnpm start:express
pnpm start:express
```

Express:

```
❯ curl http://127.0.0.1:8005/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
X-Powered-By: Express
Content-Type: application/json; charset=utf-8
Content-Length: 99
ETag: W/"63-3cajkbAZTbDKwi+6IItC+adEepM"
Date: Tue, 03 Dec 2024 14:03:29 GMT
Connection: keep-alive
Keep-Alive: timeout=5

{"id":"22/A","type":"electronics","products":[{"id":"22/A","name":"Product B","type":"furniture"}]}
```

Fastify:

```
❯ curl http://127.0.0.1:8006/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
content-type: application/json; charset=utf-8
content-length: 99
Date: Tue, 03 Dec 2024 14:04:03 GMT
Connection: keep-alive
Keep-Alive: timeout=72

{"id":"22/A","type":"electronics","products":[{"id":"22/A","name":"Product B","type":"furniture"}]}
```
