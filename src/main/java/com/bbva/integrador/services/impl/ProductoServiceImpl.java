package com.bbva.integrador.services.impl;

import com.bbva.integrador.model.Producto;
import com.bbva.integrador.repository.ProductoRepository;
import com.bbva.integrador.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> getProductoById(String id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(String id) {
        productoRepository.deleteById(id);
    }
}
