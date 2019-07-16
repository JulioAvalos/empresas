package com.empresa.info.mapper;

import com.empresa.info.model.Empresa;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaMapper implements RowMapper<Empresa> {
    @Override
    public Empresa mapRow(ResultSet resultSet, int i) throws SQLException {
        return Empresa.builder()
                .id(resultSet.getLong("id"))
                .nombre(resultSet.getString("nombre"))
                .marca(resultSet.getString("marca"))
                .build();
    }
}
