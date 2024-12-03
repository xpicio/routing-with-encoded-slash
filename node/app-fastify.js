const fastify = require("fastify")({ logger: true });

fastify.get("/v1/:id/products/:type/list", (request, reply) => {
  const { id, type } = request.params;

  const products = [
    { id: "11", name: "Product A", type: "electronics" },
    { id: "22", name: "Product B", type: "furniture" },
    { id: "22/A", name: "Product B", type: "furniture" },
  ];

  const filteredProducts = products.filter((product) => product.id === id);

  reply.send({ id, type, products: filteredProducts });
});

fastify.listen({ port: 8006 }, (err, address) => {
  if (err) {
    fastify.log.error(err);
    process.exit(1);
  }
  fastify.log.info(`Server running at ${address}`);
});
