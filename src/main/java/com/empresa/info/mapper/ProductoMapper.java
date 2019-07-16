package com.empresa.info.mapper;

import com.empresa.info.model.Producto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoMapper implements RowMapper<Producto> {
    @Override
    public Producto mapRow(ResultSet resultSet, int i) throws SQLException {
        return Producto.builder()
                .id(resultSet.getLong("id"))
                .nombre(resultSet.getString("nombre"))
                .descripcion(resultSet.getString("descripcion"))
                .precio(resultSet.getBigDecimal("precio"))
                .existencias(resultSet.getInt("existencias"))
                .build();
    }
}
