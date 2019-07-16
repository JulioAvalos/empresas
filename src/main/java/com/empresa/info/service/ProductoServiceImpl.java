package com.empresa.info.service;

import com.empresa.info.dao.ProductoDao;
import com.empresa.info.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoDao productoDao;

    public ProductoServiceImpl(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> obtenerProductos(Long id) {
        return productoDao.findAllByIdEmpresa(id);
    }
}
