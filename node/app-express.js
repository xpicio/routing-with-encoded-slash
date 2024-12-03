const express = require("express");
const morgan = require("morgan");
const app = express();

app.use(morgan("combined"));

app.get("/v1/:id/products/:type/list", (req, res) => {
  const { id, type } = req.params;

  const products = [
    { id: "11", name: "Product A", type: "electronics" },
    { id: "22", name: "Product B", type: "furniture" },
    { id: "22/A", name: "Product B", type: "furniture" },
  ];

  const filteredProducts = products.filter((product) => product.id === id);

  res.json({ id, type, products: filteredProducts });
});

app.listen(8005, () => {
  console.log("Server running on http://localhost:8005");
});
