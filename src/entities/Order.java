package entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date date = new Date();
	private OrderStatus status;
	private Client client;
	private Product product;
	private List<OrderItem> itens = new ArrayList<>();
}
