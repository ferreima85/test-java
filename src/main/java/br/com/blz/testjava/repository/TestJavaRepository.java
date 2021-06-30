package br.com.blz.testjava.repository;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import br.com.blz.testjava.dto.InventoryDto;
import br.com.blz.testjava.dto.SkuDto;

@Repository
public class TestJavaRepository {
    //variavel global criada para simular BD
    //a idéia é evitar que os dados deste objeto seja
    //excluído da memória
    SkuDto skuEntity = new SkuDto();

    public ResponseEntity<SkuDto> create(SkuDto skuDto) {

        skuEntity = SkuDto.builder()
            .sku(skuDto.getSku())
            .name(skuDto.getName())
            .isMarketable(skuDto.getIsMarketable())
            .inventoryDto(InventoryDto.builder()
                .quantity(skuDto.getInventoryDto().getQuantity())
                .warehouses(skuDto.getInventoryDto().getWarehouses())
                .build())
            .build();

        return ResponseEntity.ok(skuEntity);
    }

    public ResponseEntity<SkuDto> atualizar(SkuDto skuDto) {
        skuEntity = SkuDto.builder()
            .sku(skuDto.getSku())
            .name(skuDto.getName())
            .isMarketable(skuDto.getIsMarketable())
            .inventoryDto(InventoryDto.builder()
                .quantity(skuDto.getInventoryDto().getQuantity())
                .warehouses(skuDto.getInventoryDto().getWarehouses())
                .build())
            .build();

        return ResponseEntity.ok(skuEntity);
    }

    public ResponseEntity<Optional<SkuDto>> getBySku(Integer sku) {
        return ResponseEntity.ok(Optional.ofNullable(skuEntity)
            .filter(entidade -> entidade.getSku() == sku));
    }

    public ResponseEntity<Optional<Void>> deletar(Integer sku) {
        return ResponseEntity.noContent().build();
    }

}
