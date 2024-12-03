var builder = WebApplication.CreateBuilder(args);

builder.WebHost.UseUrls("http://localhost:8002");
builder.Services.AddControllers();

var app = builder.Build();

app.Use(async (context, next) =>
{
    Console.WriteLine($"[{DateTime.UtcNow}] {context.Request.Method} {context.Request.Path}");
    await next();
});

app.UseRouting();
app.UseEndpoints(endpoints =>
{
    endpoints.MapControllerRoute(
        name: "default",
        pattern: "{controller=Home}/{action=Index}/{id?}");
});

app.Run();
