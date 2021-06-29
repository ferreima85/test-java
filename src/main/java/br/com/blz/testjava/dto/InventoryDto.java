package br.com.blz.testjava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryDto implements Serializable {

    private static final long serialVersionUID = -6575904146253255016L;

    private Integer quantity;
    private List<WarehousesDto> warehouses;

}
