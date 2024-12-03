from django.urls import path
from .views import products_list

urlpatterns = [
    path("<path:id>/products/<str:type>/list/", products_list, name="products_list"),
]
