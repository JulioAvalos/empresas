package com.empresa.info.controller;

import com.empresa.info.model.Empresa;
import com.empresa.info.model.Producto;
import com.empresa.info.service.EmpresaService;
import com.empresa.info.service.ProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class EmpresaController {

    private final EmpresaService empresaService;
    private final ProductoService productoService;

    public EmpresaController(EmpresaService empresaService, ProductoService productoService) {
        this.empresaService = empresaService;
        this.productoService = productoService;
    }

    @RequestMapping("/empresas/{marcaId}")
    public String mostrarEmpresas(@PathVariable Long marcaId, Model model) {
        log.debug("Marca consultada : " + marcaId);

        List<Empresa> listEmpresa = empresaService.obtenerEmpresas(marcaId);


        log.debug("Lista empresas: " + listEmpresa);

        model.addAttribute("empresas", listEmpresa);
        return "empresa/index";
    }

    @RequestMapping("/empresas/{empresaId}/productos")
    public String mostrarProductoPorIdEmpresa(@PathVariable Long empresaId, Model model) {
        log.debug("Empresa consultada: " + empresaId);

        List<Producto> listProductos = productoService.obtenerProductos(empresaId);

        log.debug("Lista productos: " + listProductos);

        model.addAttribute("productos", listProductos);

        // se le agrega :: porque es el fragmento de la vista a renderizar con los productos (ver modal en html)
        return "fragments/modalProductos :: modalProductos";
    }

}
