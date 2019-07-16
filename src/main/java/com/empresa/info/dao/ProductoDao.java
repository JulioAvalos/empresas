package com.empresa.info.dao;

import com.empresa.info.mapper.ProductoMapper;
import com.empresa.info.model.Producto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoDao {

    private final JdbcTemplate jdbcTemplate;

    public ProductoDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Producto> findAllByIdEmpresa(Long id) {
        String sql = "SELECT id, nombre, descripcion, precio, existencias, idempresa from producto where idempresa = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new ProductoMapper());
    }
}
