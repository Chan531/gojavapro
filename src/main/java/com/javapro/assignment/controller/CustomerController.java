package com.javapro.assignment.controller;

import com.javapro.assignment.domain.Customer;
import com.javapro.assignment.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping
    public String customer() {
        return "customer";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "redirect:/customers/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Customer> list = customerRepository.findAll();
        model.addAttribute("list", list);
        return "customer-list";
    }
}
