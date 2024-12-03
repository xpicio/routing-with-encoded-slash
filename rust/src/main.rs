use actix_web::{web, App, HttpServer, Responder, HttpResponse};
use serde::Serialize;

#[derive(Serialize)]
struct Product {
    id: String,
    name: String,
    product_type: String,
}

async fn products_list(path: web::Path<(String, String)>) -> impl Responder {
    let (id, _product_type) = path.into_inner();

    let products = vec![
        Product { id: "11".into(), name: "Product A".into(), product_type: "electronics".into() },
        Product { id: "22".into(), name: "Product B".into(), product_type: "furniture".into() },
        Product { id: "22/A".into(), name: "Product B".into(), product_type: "furniture".into() },
    ];

    let filtered_products: Vec<&Product> = products.iter()
        .filter(|p| p.id == id)
        .collect();

    HttpResponse::Ok().json(web::Json(filtered_products))
}

#[actix_web::main]
async fn main() -> std::io::Result<()> {
    HttpServer::new(|| {
        App::new()
            .route("/v1/{id}/products/{type}/list", web::get().to(products_list))
    })
    .bind(("127.0.0.1", 8007))?
    .run()
    .await
}
