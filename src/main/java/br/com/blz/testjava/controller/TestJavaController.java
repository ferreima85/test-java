package br.com.blz.testjava.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blz.testjava.dto.SkuDto;
import br.com.blz.testjava.service.TestJavaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class TestJavaController {

    private final TestJavaService testJavaService;

    @PostMapping
    public ResponseEntity<SkuDto> create(@RequestBody SkuDto skuDto){
        return testJavaService.create(skuDto);
    }

    @GetMapping("/{sku}")
    public ResponseEntity<Optional<SkuDto>> findBySku(@PathVariable Integer sku){
        return testJavaService.getBySku(sku);
    }

    @PutMapping("/{sku}")
    public ResponseEntity<SkuDto> atualizar(@RequestBody SkuDto skuDto) {
        return testJavaService.atualizar(skuDto);
    }

    @DeleteMapping("/{sku}")
    public void deletar(@PathVariable Integer sku) {
    	testJavaService.deletar(sku);
    }

}
