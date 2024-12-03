Project setup:

```
poetry install
poetry run python app.py
```

Flask:

```
❯ curl http://127.0.0.1:8004/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
Server: Werkzeug/3.1.3 Python/3.12.7
Date: Tue, 03 Dec 2024 14:01:15 GMT
Content-Type: application/json
Content-Length: 150
Connection: close

{
  "id": "22/A",
  "products": [
    {
      "id": "22/A",
      "name": "Product B",
      "type": "furniture"
    }
  ],
  "type": "electronics"
}
```
