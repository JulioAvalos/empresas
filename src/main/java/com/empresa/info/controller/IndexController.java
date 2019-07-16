package com.empresa.info.controller;

import com.empresa.info.model.Marca;
import com.empresa.info.service.MarcaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class IndexController {

    private final MarcaService marcaService;

    public IndexController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @RequestMapping({"","/","/index"})
    public String index(Model model) {
        List<Marca> listaMarcas = marcaService.obtenerMarcas();
        log.debug("Marcas obtenidas: " + listaMarcas);
        model.addAttribute("marcas", listaMarcas);
        return "index";
    }

}
