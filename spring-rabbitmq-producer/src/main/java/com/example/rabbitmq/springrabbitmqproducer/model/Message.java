package com.example.rabbitmq.springrabbitmqproducer.model;


public class Message {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Message [id=" + id + ", name=" + name + "]";
}
private String name;

}
