package br.com.blz.testjava.controller;

import br.com.blz.testjava.dto.SkuDto;
import br.com.blz.testjava.service.TestJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class TestJavaController {

    @Autowired
    private TestJavaService testJavaService;

    @PostMapping
    public SkuDto create(@RequestBody SkuDto skuDto){
        return TestJavaService.create(skuDto);
    }

    @GetMapping("/{sku}")
    public SkuDto findBySku(@PathVariable Integer sku){
        return TestJavaService.getBySku(sku);
    }

    @PutMapping("/{sku}")
    public SkuDto atualizar(@RequestBody SkuDto skuDto) {
        return TestJavaService.atualizar(skuDto);
    }

    @DeleteMapping("/{sku}")
    public void deletar(@PathVariable Integer sku) {
        TestJavaService.deletar(sku);
    }

}
