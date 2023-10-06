package com.martinnessa.firstSpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
@Slf4j
public class PartsController {

    @Autowired
    private PartService partService;

    @GetMapping()
    public ResponseEntity<List<Part>> getParts(){
        return ResponseEntity.ok(partService.getParts());
    }

    @PostMapping()
    public void addPart(@RequestBody Part part){
        partService.addParts(part);
    }
}
