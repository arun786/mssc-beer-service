package com.arun.msscbeerservice.web.controller;

import com.arun.msscbeerservice.web.model.BeerDto;
import com.arun.msscbeerservice.web.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BeerController {

    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }


    @GetMapping("/v1/beer/{id}")
    public ResponseEntity<BeerDto> getBeerId(@PathVariable("id") String id) {
        BeerDto beerId = beerService.getBeerId(id);
        return ResponseEntity.ok(beerId);
    }

    @PostMapping("/v1/beer")
    public BeerDto saveBeer(@RequestBody BeerDto beerDto) {
        BeerDto beerDto1 = beerService.saveBeer(beerDto);
        return new ResponseEntity<>(beerDto1, HttpStatus.CREATED);
    }

    @PutMapping("/v/beer")
    public ResponseEntity updateBeer(String id, BeerDto beerDto) {
        beerService.updateBeer(id, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
