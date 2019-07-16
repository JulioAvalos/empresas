package com.empresa.info.service;

import com.empresa.info.model.Empresa;
import com.empresa.info.model.Marca;
import com.empresa.info.model.Producto;

import java.util.List;

public interface EmpresaService {

    List<Marca> obtenerMarcas();

    List<Empresa> obtenerEmpresas(Long id);

    List<Producto> obtenerProductos(Long id);
}
