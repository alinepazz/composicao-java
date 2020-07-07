package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment = new Date(0);
	private List<OrderStatus> orders = new ArrayList<>();
}
