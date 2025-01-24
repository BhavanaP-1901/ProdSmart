package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.entity.Product;
import com.tka.service.ProductService;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("/add-product")
	public String insertProductPage() {
		return "add";
		
	}
   @PostMapping("/insert-product")
	public String addProduct(@ModelAttribute Product product) {
	   System.out.println("We are in post method");
	   System.out.println(product);
	   String msg=ps.addProduct(product);
	   System.out.println(msg);
	   return "add";
		
	}
   @GetMapping("/display-product")
   public String displayProduct(Model model) {
	   System.out.println("We are in display method");
	   List<Product> list=ps.displayProduct();
	   System.out.println(list);
	   model.addAttribute("products",list);
	   
	return "display";
	   
   }
   @GetMapping("/delete-product")
   public String deleteProduct(@RequestParam("pid")int pk) {
      String msg=ps.deleteProduct(pk);
      System.out.println(msg);
      return "redirect:/display-product";
	   
   }
   
   @GetMapping("/view-product")
   public String viewProduct(@RequestParam("pid")int pk, Model model) {
	   
	   Product product=ps.getProduct(pk);
	   model.addAttribute("p",product);
	   return "update";

     }
   
   @PostMapping("/update-product")
   public String updateProduct(@ModelAttribute Product product) {
	   String msg=ps.updateProduct(product);
	   return "redirect:/display-product";  
   }
   
}