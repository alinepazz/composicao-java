package entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date date = new Date();
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
		
	}
	public Order(Date date, OrderStatus status, Client client, List<OrderItem> itens) {
		this.date = date;
		this.status = status;
		this.client = client;
		this.itens = itens;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getItens() {
		return itens;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
}
