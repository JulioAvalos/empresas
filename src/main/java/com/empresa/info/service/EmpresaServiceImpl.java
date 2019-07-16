package com.empresa.info.service;

import com.empresa.info.dao.EmpresaDao;
import com.empresa.info.model.Empresa;
import com.empresa.info.model.Marca;
import com.empresa.info.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    private final EmpresaDao empresaDao;

    public EmpresaServiceImpl(EmpresaDao empresaDao) {
        this.empresaDao = empresaDao;
    }

    @Override
    public List<Marca> obtenerMarcas() {
        return empresaDao.obtenerMarcas();
    }

    @Override
    public List<Empresa> obtenerEmpresas(Long id) {
        return empresaDao.obtenerEmpresasPorIdMarca(id);
    }

    @Override
    public List<Producto> obtenerProductos(Long id) {
        return empresaDao.obtenerProductosPorIdEmpresa(id);
    }
}
