package com.senai.pet.Service;

import com.senai.pet.Entity.Animal;
import com.senai.pet.Repository.AnimalRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> mostrarAnimais(){
        List<Animal> animaisList = new ArrayList<>();
        return animaisList = animalRepository.findAll();
    }

    public void cadastrarAnimal(Animal anima){
        Animal animals = new Animal();
        animals.setNome(anima.getNome());
        animals.setCastrado(anima.isCastrado());
        animals.setEspecie(anima.getEspecie());
        animals.setRaca(anima.getRaca());
        animals.setSexo(anima.getSexo());
        animals.setCor(anima.getCor());
        animals.setDataNasc(anima.getDataNasc());
        animals.setObservacoes(anima.getObservacoes());
        animals.setPeso(anima.getPeso());
        animals.setVacinacao(anima.getVacinacao());

        animalRepository.save(animals);

    }
}
