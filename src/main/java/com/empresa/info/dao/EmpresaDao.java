package com.empresa.info.dao;

import com.empresa.info.mapper.EmpresaMapper;
import com.empresa.info.mapper.MarcaMapper;
import com.empresa.info.mapper.ProductoMapper;
import com.empresa.info.model.Empresa;
import com.empresa.info.model.Marca;
import com.empresa.info.model.Producto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpresaDao {

    private JdbcTemplate jdbcTemplate;

    public EmpresaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Marca> obtenerMarcas(){
        String sql = "SELECT id, nombre FROM empresas.marca";
        return jdbcTemplate.query(sql, new MarcaMapper());
    }

    public List<Empresa> obtenerEmpresasPorIdMarca(Long id) {
        String sql = "SELECT e.id, e.nombre, m.nombre as marca " +
                " FROM empresas.empresa as e " +
                " inner join empresas.marca as m on m.id = e.idmarca " +
                " where e.idmarca =  ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new EmpresaMapper());

    }

    public List<Producto> obtenerProductosPorIdEmpresa(Long id) {
        String sql = "SELECT id, nombre, descripcion, precio, existencias, idempresa from producto where idempresa = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new ProductoMapper());
    }

}
