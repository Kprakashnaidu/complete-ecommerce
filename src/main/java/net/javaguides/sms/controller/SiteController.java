package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Site;
import net.javaguides.sms.entity.Student;
import net.javaguides.sms.service.SiteService;



@Controller
public class SiteController {


private SiteService siteService;


public SiteController(SiteService siteService) {
super();
this.siteService = siteService;
}

@GetMapping("/sites/new")
public String createSiteForm(Model model) {

// create student object to hold student form data
Site site = new Site();
model.addAttribute("site", site);
return "site_form";

}

@PostMapping("/sites")
public String saveSite(@ModelAttribute("site") Site site) {
siteService.saveSite(site);
return "redirect:/students";
}

}