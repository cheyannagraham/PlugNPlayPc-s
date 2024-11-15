package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.service.PartService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PartsPageController {

    private final PartService partService;

    public PartsPageController(PartService partService){
        this.partService=partService;
    }

    @GetMapping("/parts")
    public String listParts(Model theModel, @Param("partkeyword") String partkeyword){
        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);
        return "pages/parts";
    }
}
