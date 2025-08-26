package com.bbva.integrador.services;

import com.bbva.integrador.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {


    public List<Producto> getAllProductos();


    public Optional<Producto> getProductoById(String id);

    public Producto saveProducto(Producto producto);

    public void deleteProducto(String id);
}

