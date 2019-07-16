package com.empresa.info.service;

import com.empresa.info.dao.MarcaDao;
import com.empresa.info.model.Marca;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaDao marcaDao;

    public MarcaServiceImpl(MarcaDao marcaDao) {
        this.marcaDao = marcaDao;
    }

    @Override
    public List<Marca> obtenerMarcas() {
        return marcaDao.findAll();
    }
}
