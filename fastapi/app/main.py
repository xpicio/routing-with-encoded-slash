from fastapi import FastAPI
from typing import List

app = FastAPI()


@app.get("/v1/{id:path}/products/{type}/list")
async def get_products_list(id: str, type: str):
    products = [
        {"id": "11", "name": "Product A", "type": "electronics"},
        {"id": "22", "name": "Product B", "type": "furniture"},
        {"id": "22/A", "name": "Product B", "type": "furniture"},
    ]

    filtered_products = [p for p in products if p["id"] == id]

    return {"id": id, "type": type, "products": filtered_products}
