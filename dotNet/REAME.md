Project setup:

```
dotnet run
```

ASP.NET Core MVC:

```
❯ curl http://127.0.0.1:8002/v1/22%2FA/products/electronics/list -i
HTTP/1.1 200 OK
Content-Type: application/json; charset=utf-8
Date: Tue, 03 Dec 2024 13:54:38 GMT
Server: Kestrel
Transfer-Encoding: chunked

{"id":"22%2FA","decodedId":"22/A","type":"electronics","products":[{"id":"22/A","name":"Product B","type":"furniture"}]}
```
