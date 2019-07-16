package com.empresa.info.mapper;

import com.empresa.info.model.Marca;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MarcaMapper implements RowMapper<Marca> {
    @Override
    public Marca mapRow(ResultSet resultSet, int i) throws SQLException {
        return Marca.builder()
                .id(resultSet.getLong("id"))
                .nombre(resultSet.getString("nombre"))
                .build();
    }
}
