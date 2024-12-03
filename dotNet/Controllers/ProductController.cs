using Microsoft.AspNetCore.Mvc;
using System.Net;

namespace AspNetCore8App.Controllers
{
    [Route("v1/{id}/products/{type}/list")]
    public class ProductsController : Controller
    {
        [HttpGet]
        public IActionResult GetProductsList(string id, string type)
        {
            string decodedId = WebUtility.UrlDecode(id);

            var products = new[]
            {
                new { Id = "11", Name = "Product A", Type = "electronics" },
                new { Id = "22", Name = "Product B", Type = "furniture" },
                new { Id = "22/A", Name = "Product B", Type = "furniture" }
            };

            var filteredProducts = products.Where(p => p.Id == decodedId);

            return Json(new { id, decodedId, type, products = filteredProducts });
        }
    }
}
