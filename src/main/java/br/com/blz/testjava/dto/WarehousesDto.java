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
public class WarehousesDto  implements Serializable {

    private static final long serialVersionUID = 4186107415954655367L;

    private String locality;
    private Integer quantity;
    private String type;

}
