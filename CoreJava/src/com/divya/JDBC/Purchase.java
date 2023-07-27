package com.divya.JDBC;

public class Purchase
{
int user_id;
String date;
double amount;
public Purchase(int id, String date, double amount){
    this.amount=amount;
    this.user_id=id;
    this.date=date;
}

    @Override
    public String toString() {
        return this.user_id+", date="+this.date +",amount="+this.getAmount();
    }

    public double getAmount() {
        return amount;
    }
}