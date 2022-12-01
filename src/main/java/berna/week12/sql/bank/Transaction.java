package berna.week12.sql.bank;

import java.sql.Date;

public class Transaction {
    public int transactionNr;
    public Date transactionDate;
    public int amountTA;
    public Account receiverAccount;

    public Transaction(int amount) {
        this.amountTA = amount * (-1);
        ++transactionNr;
        //TODO: get a date-time stamp
    }

    public Transaction(int amount, Account receiverAccount) {
        this.receiverAccount = receiverAccount;
        this.amountTA = amount * (-1);
        ++transactionNr;
    }


    public int getTransactionNr() {
        return transactionNr;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public int getAmountTA() {
        return amountTA;
    }


    public Account getReceiverAccount() {
        return receiverAccount;
    }
}
