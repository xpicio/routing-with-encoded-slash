Project setup:

```
poetry install
poetry run python manage.py runserver 8001
```

Django:

```
❯ curl http://127.0.0.1:8001/v1/22%2FA/products/electronics/list/ -i
HTTP/1.1 200 OK
Date: Tue, 03 Dec 2024 13:52:33 GMT
Server: WSGIServer/0.2 CPython/3.12.7
Content-Type: application/json
X-Frame-Options: DENY
Content-Length: 109
X-Content-Type-Options: nosniff
Referrer-Policy: same-origin
Cross-Origin-Opener-Policy: same-origin

{"id": "22/A", "type": "electronics", "products": [{"id": "22/A", "name": "Product B", "type": "furniture"}]}
```
