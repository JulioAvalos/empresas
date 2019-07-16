package com.empresa.info.service;

import com.empresa.info.dao.EmpresaDao;
import com.empresa.info.model.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements  EmpresaService{

    private final EmpresaDao empresaDao;

    public EmpresaServiceImpl(EmpresaDao empresaDao) {
        this.empresaDao = empresaDao;
    }

    @Override
    public List<Empresa> obtenerEmpresas(Long id) {
        return empresaDao.findAllByIdEmpresa(id);
    }
}
