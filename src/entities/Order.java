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
	
		public Order(Date date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
		
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:");
		sb.append("Order moment: " + date);
		sb.append("Order status: " + status);
		sb.append("Client: " + client.getName() + "(" + client.getBirthDate()+ ")" +"-"+ client.getEmail());
		sb.append("Order items:");
		for (OrderItem c : itens) {
			sb.append(c.getProduct() + "," + "%.2f" + c.getPrice() + c.getQuantity() + "," + c.subTotal());
		}
		
		return sb.toString();
	}
}
