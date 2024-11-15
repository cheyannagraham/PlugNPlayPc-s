package com.example.demo.controllers;

import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 *
 */

@Controller
public class HomeController {
    private final PartService partService;
    private final ProductService productService;

    public HomeController(PartService partService, ProductService productService) {
        this.partService = partService;
        this.productService = productService;
    }

    @GetMapping({"/home", "/"})
    public String checkInventory(Model model) {
        Long totalParts = partService.countAllParts();
        Long totalProducts = productService.countAllProducts();
        if (totalParts + totalProducts == 0) {
            partService.addSamplePartInventory();
            productService.addSampleProductInventory();
        }

        model.addAttribute("parts",List.of("RAM","Graphics Card", "HDD", "Cooling"));
        model.addAttribute("products",List.of("Microphone", "Headset", "PC","Webcam" ));
        return "pages/home";
    }
}
