package com.example.appmobile.api;

import com.example.appmobile.model.Eleve;
import com.example.appmobile.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EleveController {

    @Autowired
    private EleveService eleveService;

    @PostMapping("/eleve")
    @ResponseBody
    public Eleve createEleve(@RequestBody Eleve eleve) {
        return eleveService.createEleve(eleve);
    }

    @GetMapping("/eleve/{email}")
    public Eleve getEleve(@PathVariable("email") String email){
      return eleveService.findEleve(email);
    }

    @GetMapping("/delete/eleve/{email}")
    public void deleteEleve(@PathVariable("email") String email){
        eleveService.deleteEleve(email);
    }

    @PostMapping("/update/eleve")
    @ResponseBody
    public void updateEleve(@RequestBody Eleve eleve) {
        eleveService.updateEleve(eleve);
    }

    @GetMapping("/eleves")
    public List<Eleve> getAllEleve(){
        return eleveService.findAllEleves();
    }
}
