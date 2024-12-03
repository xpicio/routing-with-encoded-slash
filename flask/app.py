from flask import Flask, jsonify

app = Flask(__name__)


@app.route("/v1/<path:id>/products/<string:type>/list", methods=["GET"])
def get_products_list(id, type):
    products = [
        {"id": "11", "name": "Product A", "type": "electronics"},
        {"id": "22", "name": "Product B", "type": "furniture"},
        {"id": "22/A", "name": "Product B", "type": "furniture"},
    ]

    filtered_products = [p for p in products if p["id"] == id]

    return jsonify({"id": id, "type": type, "products": filtered_products})


if __name__ == "__main__":
    app.run(debug=True, port=8004)
