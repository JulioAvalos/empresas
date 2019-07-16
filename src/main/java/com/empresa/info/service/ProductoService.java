package com.empresa.info.service;

import com.empresa.info.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> obtenerProductos(Long id);
}
