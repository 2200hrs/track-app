package com.example.coronavirapp.controllers;

import com.example.coronavirapp.models.LocationStats;
import com.example.coronavirapp.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    DataService dataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allSats =dataService.getAllStates();
        int totalReportedCases = allSats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats",allSats);
        model.addAttribute("totalReportedCases",totalReportedCases);

        return "home";
    }
}
