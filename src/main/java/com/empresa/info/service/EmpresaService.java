package com.empresa.info.service;

import com.empresa.info.model.Empresa;

import java.util.List;

public interface EmpresaService {
    List<Empresa> obtenerEmpresas(Long id);
}
