package InventoryCalc.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class HostController {

    @GetMapping("/")
    public String displayHost (Model model){
        return "homepage";
    }

}
