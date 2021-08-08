package az.elixir.social.Domain;


import az.elixir.social.DTO.OrderDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
public class OrderDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int orderId;

    private int serviceOrderId;

    private String status;

    private int serviceCode;

    private double totalAmount;

    private String description;

    private Date creationDate;

    @Lob
    private OrderDTO response;

    public OrderDetailsModel() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(int serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public OrderDTO getResponse() {
        return response;
    }

    public void setResponse(OrderDTO response) {
        this.response = response;
    }
}
