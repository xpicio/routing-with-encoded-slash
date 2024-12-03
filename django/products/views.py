from django.http import JsonResponse


def products_list(request, id, type):
    products = [
        {"id": "11", "name": "Product A", "type": "electronics"},
        {"id": "22", "name": "Product B", "type": "furniture"},
        {"id": "22/A", "name": "Product B", "type": "furniture"},
    ]

    filtered_products = [p for p in products if p["id"] == id]

    return JsonResponse({"id": id, "type": type, "products": filtered_products})
