package com.empresa.info.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Marca {

    private Long id;
    private String nombre;
    private List<Empresa> listadoEmpresas;

}
