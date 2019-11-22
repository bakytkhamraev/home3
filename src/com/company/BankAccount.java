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
        return;
    }


    public float withDraw(float sum) throws Exception {
        amount -= sum;
        if (sum > amount) {

            throw new LimitException("Недостаточная сумма на счету", amount);
        }else {
            amount -= sum;
        }
        return amount;
    }


    public void takeMoney() {

        double amount1 = getAmount();
        amount = (float) (amount1-getAmount());

    }
}
