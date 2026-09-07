package entity;

import java.util.Objects;

//хозяйственная операция

public class BusinessTransaction {
    private int id;
    private int number;
    private String name;
    private IngAccount accountDebit;
    private IngAccount accountCredit;
    private double balance;

    public BusinessTransaction() {
    }

    public BusinessTransaction(int number, String name, IngAccount accountDebit, IngAccount accountCredit, double balance) {
        this.number = number;
        this.name = name;
        this.accountDebit = accountDebit;
        this.accountCredit = accountCredit;
        this.balance = balance;
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

    public IngAccount getAccountDebit() {
        return accountDebit;
    }

    public void setAccountDebit(IngAccount accountDebit) {
        this.accountDebit = accountDebit;
    }

    public IngAccount getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(IngAccount accountCredit) {
        this.accountCredit = accountCredit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        BusinessTransaction that = (BusinessTransaction) o;
        return id == that.id && number == that.number && Double.compare(balance, that.balance) == 0 && Objects.equals(name, that.name) && Objects.equals(accountDebit, that.accountDebit) && Objects.equals(accountCredit, that.accountCredit);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + number;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(accountDebit);
        result = 31 * result + Objects.hashCode(accountCredit);
        result = 31 * result + Double.hashCode(balance);
        return result;
    }

    @Override
    public String toString() {
        return "BusinessTransaction{" +
                "id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", accountDebit=" + accountDebit +
                ", accountCredit=" + accountCredit +
                ", balance=" + balance +
                '}';
    }
}
