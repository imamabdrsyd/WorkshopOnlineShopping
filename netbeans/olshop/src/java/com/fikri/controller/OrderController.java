package com.fikri.controller;

import com.fikri.dao.OrderService;
import com.fikri.model.Orderdet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService os;
    
    @RequestMapping()
    public String OrderForm(Model model){
        OrderFormBean orderBean=new OrderFormBean();
        model.addAttribute("orderBean",orderBean);
        return "checkout";
    }
    @RequestMapping(value = "/save")
    public String saveOrder(@ModelAttribute("orderBean") OrderFormBean orderBean,Model model){
        Orderdet order=new Orderdet();
        order.setTotal(orderBean.getTotal());
        order.setProductId(orderBean.getDescription());
        order.setTanggal(orderBean.getTanggal());
        os.saveOrder(order);
        model.addAttribute("data",orderBean);
        return "checkout";
    }
}
