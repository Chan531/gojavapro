package com.javapro.assignment.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Orders {

    @Id
    private int orderid;
    private int custid;
    private int bookid;
    private int saleprice;
    private LocalDate orderdate;

    public Orders(int orderid, int custid, int bookid, int saleprice, LocalDate orderdate) {
        this.orderid = orderid;
        this.custid = custid;
        this.bookid = bookid;
        this.saleprice = saleprice;
        this.orderdate = orderdate;
    }
}
