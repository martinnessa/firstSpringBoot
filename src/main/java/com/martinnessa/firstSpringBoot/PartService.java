package com.martinnessa.firstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartsRepository partsRepository;

    public List<Part> getParts(){
        return partsRepository.getParts();
    }

    public void addParts(Part part){
        partsRepository.addParts(part);
    }
}
