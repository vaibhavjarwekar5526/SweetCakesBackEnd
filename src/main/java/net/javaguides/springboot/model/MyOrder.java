package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class MyOrder {


    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Id
    @Column(name = "mobile")
    private String mobile;

    @Column(name = "cakename")
    private String cakeName;

    @Column(name = "caketext")
    private String cakeText;

    @Column(name = "deliverdate")
    private String deliverDate;

    @Column(name = "status")
    private String status;

    @Column(name = "currentdate")
    private String currentDate;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "amount")
    private String amount;



    public MyOrder() {

    }

    public MyOrder(String name,  String address, String mobile, String cakeName, String cakeText,String deliverDate,String status,String currentDate,String quantity,String amount){
        super();
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.cakeName = cakeName;
        this.cakeText = cakeText;
        this.deliverDate = deliverDate;
        this.status = status;
        this.currentDate = currentDate;
        this.quantity = quantity;
        this.amount = amount;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getCakeName() {
        return cakeName;
    }
    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }
    public String getCakeText() {
        return cakeText;
    }
    public void setCakeText(String cakeText) {
        this.cakeText = cakeText;
    }
    public String getDeliverDate() {
        return deliverDate;
    }
    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCurrentDate() {
        return currentDate;
    }
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
}
