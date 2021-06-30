package br.com.blz.testjava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkuDto  {

    private Integer sku;
    private String name;
    private InventoryDto inventoryDto;
    private Boolean isMarketable;

}
