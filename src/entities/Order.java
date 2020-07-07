package entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date date = new Date();
	private List<OrderStatus> orders = new ArrayList<>();
}
