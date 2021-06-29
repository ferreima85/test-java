package br.com.blz.testjava.repository;

import br.com.blz.testjava.dto.InventoryDto;
import br.com.blz.testjava.dto.SkuDto;
import br.com.blz.testjava.dto.WarehousesDto;
import lombok.var;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestJavaRepository {
    public static List<SkuDto> create(SkuDto skudto) {
        List<WarehousesDto> listWarehouses = new ArrayList<>();
        List<WarehousesDto> listWarehouses2 = new ArrayList<>();
        List<SkuDto> listSku = new ArrayList<>();

        var warehouses = WarehousesDto.builder()
            .locality("SP")
            .quantity(1)
            .type("sei lá")
            .build();
        var warehouses2 = WarehousesDto.builder()
            .locality("RJ")
            .quantity(1)
            .type("sei lá")
            .build();

        var warehouses3 = WarehousesDto.builder()
            .locality("GO")
            .quantity(1)
            .type("sei lá")
            .build();

        listWarehouses.add(warehouses);
        listWarehouses.add(warehouses2);
        listWarehouses.add(warehouses3);

        var skuRepository =
                 SkuDto.builder()
                    .sku(1)
                    .name("lapis")
                    .isMarketable(true)
                     .inventoryDto(InventoryDto.builder()
                         .quantity(10)
                         .warehouses(listWarehouses)
                         .build())
                    .build();

        var warehouses4 = WarehousesDto.builder()
            .locality("SP")
            .quantity(1)
            .type("sei lá")
            .build();
        var warehouses5 = WarehousesDto.builder()
            .locality("RJ")
            .quantity(1)
            .type("sei lá")
            .build();

        var warehouses6 = WarehousesDto.builder()
            .locality("GO")
            .quantity(1)
            .type("sei lá")
            .build();

        listWarehouses2.add(warehouses4);
        listWarehouses2.add(warehouses5);
        listWarehouses2.add(warehouses6);

        var skuRepository2 =
            SkuDto.builder()
                .sku(2)
                .name("borracha")
                .isMarketable(true)
                .inventoryDto(InventoryDto.builder()
                    .quantity(10)
                    .warehouses(listWarehouses2)
                    .build())
                .build();

        listSku.add(skuRepository);
        listSku.add(skuRepository2);

        return listSku;
    }

}
