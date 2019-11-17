package com.company;


public class BankAccount {
    private float amount;

    public BankAccount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void deposit(float sum) {


        amount = +sum;

    }


    public void withDraw(float sum) throws Exception {
        amount -= sum;
        if (sum > amount) {

            throw new LimitException("Недостаточная сумма на счету", amount);
        }


    }

    public float lastMoney() {
        float sum = 4000;
        amount -= sum;
        return amount;
    }

}