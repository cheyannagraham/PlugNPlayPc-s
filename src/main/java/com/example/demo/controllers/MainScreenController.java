package com.example.demo.controllers;

import com.example.demo.domain.Product;
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
public class MainScreenController {
    // private final PartRepository partRepository;
    // private final ProductRepository productRepository;'

    private PartService partService;
    private ProductService productService;

//    private List<Part> theParts;
//    private List<Product> theProducts;

 /*   public MainScreenController(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }*/

    public MainScreenController(PartService partService, ProductService productService) {
        this.partService = partService;
        this.productService = productService;
    }

    @GetMapping({"/mainscreen", "/"})
    public String checkInventory(Model model) {
        Long totalParts = partService.countAllParts();
        Long totalProducts = productService.countAllProducts();
        if (totalParts + totalProducts == 0) {
            partService.addSamplePartInventory();
            productService.addSampleProductInventory();
        }

        model.addAttribute("parts",List.of("RAM","Graphics Card", "HDD", "Cooling"));
        model.addAttribute("products",List.of("Microphone", "Headset", "PC","Webcam" ));

//    , @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
//        theModel.addAttribute("parts",partList);
//        theModel.addAttribute("partkeyword",partkeyword);
//        theModel.addAttribute("products",productService.findAll());
//        theModel.addAttribute("products", productList);
//        theModel.addAttribute("productkeyword",productkeyword);
        return "pages/mainscreen";
    }
}
