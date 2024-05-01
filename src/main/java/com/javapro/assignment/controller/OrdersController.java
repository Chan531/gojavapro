package com.javapro.assignment.controller;

import com.javapro.assignment.domain.Customer;
import com.javapro.assignment.domain.Orders;
import com.javapro.assignment.repository.OrderRepository;
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
@RequestMapping("/orders")
public class OrdersController {

    private final OrderRepository orderRepository;

    @GetMapping
    public String orders() {
        return "orders";
    }

    @PostMapping
    public String createOrders(@ModelAttribute Orders orders) {
        orderRepository.save(orders);
        return "redirect:/orders/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Orders> list = orderRepository.findAll();
        model.addAttribute("list", list);
        return "orders-list";
    }
}
