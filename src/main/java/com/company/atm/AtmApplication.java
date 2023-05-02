package com.company.atm;

import com.company.atm.model.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtmApplication.class, args);

        Transaction transaction = new Transaction();

        transaction.addCard(12, 2233, "12-30-2022", 700.0, "John");
        transaction.addCard(13, 4455, "03-11-2019", 600.0, "Ashley");
        transaction.addCard(14, 6677, "07-08-2009", 500.0, "Bond");

        transaction.addATM(7, 500.0, "London");
        transaction.addATM(8, 800.0, "Paris");
        transaction.addATM(9, 900.0, "Berlin");

//        transaction.showCardList();
//        transaction.showATMList();

//        transaction.removeMoneyToATM(8, 300.0);
//        transaction.removeMoneyToCard(13, 400.0);
//        transaction.showATMList();
//        transaction.showCardList();
//        System.out.println(" ");

//        transaction.getCash(12, 2233, 9, 200.0);
//        transaction.sendMoney(12, 2233, 13, 250.0);
//        transaction.showCardList();
//        transaction.showATMList();

//        transaction.theRichestOne();
//        transaction.thePoorestOne();


    }

}
