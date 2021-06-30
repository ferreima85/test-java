package br.com.blz.testjava.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.blz.testjava.dto.SkuDto;
import br.com.blz.testjava.repository.TestJavaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestJavaService  {

    private final TestJavaRepository repository;

    public ResponseEntity<SkuDto> create(SkuDto skuDto) {
        return repository.create(skuDto);
    }

    public ResponseEntity<Optional<SkuDto>> getBySku(Integer sku) {
        return repository.getBySku(sku);
    }

    public ResponseEntity<SkuDto> atualizar(SkuDto skuDto) {
        return repository.atualizar(skuDto);
    }

    public void deletar(Integer sku) {
        repository.deletar(sku);
    }
}
