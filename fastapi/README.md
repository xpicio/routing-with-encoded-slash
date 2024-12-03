Project setup:

```
poetry install
poetry run uvicorn app.main:app --reload --port 8003
```

FastAPI:

```
❯ curl http://127.0.0.1:8003/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
date: Tue, 03 Dec 2024 13:58:20 GMT
server: uvicorn
content-length: 99
content-type: application/json

{"id":"22/A","type":"electronics","products":[{"id":"22/A","name":"Product B","type":"furniture"}]}%
```
