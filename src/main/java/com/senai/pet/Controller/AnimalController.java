package com.senai.pet.Controller;

import com.senai.pet.Entity.Animal;
import com.senai.pet.Service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animais")
public class AnimalController {

    private final AnimalService animalService;
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> mostrar(){
        return animalService.mostrarAnimais();
    }

    @PostMapping
    public void criarAnimal(@RequestBody Animal a){
        animalService.cadastrarAnimal(a);
    }
}

