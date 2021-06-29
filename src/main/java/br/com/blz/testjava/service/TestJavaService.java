package br.com.blz.testjava.service;

import br.com.blz.testjava.dto.SkuDto;
import br.com.blz.testjava.repository.TestJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestJavaService  {
    @Autowired
    private TestJavaRepository testJavaServiceRepository;

    public static SkuDto create(SkuDto skuDto) {
        return TestJavaRepository.create(skuDto);
    }

    public static SkuDto getBySku(Integer sku) {
        SkuDto
//        return skuDto.stream().filter( {
  //          s -> s.sku = skuDto.getSku()}).findFirst().get();
    }

    public static SkuDto atualizar(SkuDto skuDto) {
        SkuDto skuDto = SkuDto.stream().filter( {
            p -> p.sku = skuDto.getSku()}).findFirst();
        SkuDto skuDtoAtualizado = SkuDto(

        )
    }

    public static void deletar(Integer sku) {
        SkuDto skuDto = skuDto.stream().filter( {
            p -> p.sku = skuDto.getSku()}).findFirst();
        skuDto = skuDto.minus(SkuDto);
    }
}
