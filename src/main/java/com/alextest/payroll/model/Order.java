package com.alextest.payroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CUSTOMER_ORDER")
@Getter @Setter
@EqualsAndHashCode
public class Order {

	  private @Id @GeneratedValue Long id;

	  private String description;
	  private Status status;

	  public Order() {}

	  public Order(String description, Status status) {

	    this.description = description;
	    this.status = status;
	  }

	  @Override
	  public String toString() {
	    return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
	  }
}
