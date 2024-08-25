package com.unir.microoperador.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.unir.microoperador.model.Order;
import com.unir.microoperador.model.OrderItems;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Order order;
    private List<OrderItems> orderItems;
}
