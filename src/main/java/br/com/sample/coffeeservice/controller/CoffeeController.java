package br.com.sample.coffeeservice.controller;

import br.com.sample.coffeeservice.domain.coffee.CoffeeDetail;
import br.com.sample.coffeeservice.domain.coffee.CoffeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
@Tag(name = "Coffee Service", description = "Serviço verificar se há café")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping()
    @Operation(summary = "Obtem café", description = "Metodo verificador de café")
    public ResponseEntity<CoffeeDetail> obeterCafe() {
        return ResponseEntity.ok(coffeeService.check());
    }

}
