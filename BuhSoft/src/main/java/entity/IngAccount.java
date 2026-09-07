package entity;

import java.util.Objects;
//Счёт бухгалтерского учёта

public class IngAccount {
    private int id;
    private int number;
    private int subaccount;
    private String name;
    private String type;
    private boolean balance;

    public IngAccount(int number, int subaccount, String name, String type, boolean balance) {
        this.number = number;
        this.subaccount = subaccount;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public IngAccount() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubaccount() {
        return subaccount;
    }

    public void setSubaccount(int subaccount) {
        this.subaccount = subaccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        IngAccount that = (IngAccount) o;
        return id == that.id && number == that.number && subaccount == that.subaccount && balance == that.balance && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + number;
        result = 31 * result + subaccount;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(type);
        result = 31 * result + Boolean.hashCode(balance);
        return result;
    }

    @Override
    public String toString() {
        return "IngAccount{" +
                "id=" + id +
                ", number=" + number +
                ", subaccount=" + subaccount +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}
