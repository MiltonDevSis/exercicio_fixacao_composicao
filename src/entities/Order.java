package entities;

import enums.OrdemStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrdemStatus status;

    private Client client;
    private List<Order> orders = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrdemStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public void addItens(OrdemItem item){

    }

    public void removeItens(OrdemItem item){

    }

    public Double total(){
        double total = 0;
        return total;
    }
}
