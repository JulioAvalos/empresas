package com.empresa.info.dao;

import com.empresa.info.mapper.MarcaMapper;
import com.empresa.info.model.Marca;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MarcaDao {

    private JdbcTemplate jdbcTemplate;

    public MarcaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Marca> findAll(){
        String sql = "SELECT id, nombre FROM empresas.marca";
        return jdbcTemplate.query(sql, new MarcaMapper());
    }
}
