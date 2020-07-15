package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date date = new Date();
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
	public double total() {
		double sum = 0.0;
		for(OrderItem iten : itens) {
			sum += iten.getPrice();
		}
		return sum;
	}
	
		@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment" + "\n");
		sb.append(sdf.format(date) + "\n");
		sb.append("Order status: " + "\n");
		sb.append(status + "\n");
		sb.append("Client: " );
		sb.append(client  + "\n" );
		sb.append("Order items:\n");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
			
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
