package com.company.atm.model;

import java.util.LinkedList;
import java.util.List;

public class Transaction {
    private List<Card> cardList = new LinkedList<>();
    private List<ATM> atmList = new LinkedList<>();

    public void addCard(Integer cardId, Integer pinCode, String expDate, Double balance, String ownData) {
        Card card = new Card(cardId, pinCode, expDate, balance, ownData);
        cardList.add(card);
    }

    public void addATM(Integer machineId, Double balance, String location) {
        ATM atm = new ATM(machineId, balance, location);
        atmList.add(atm);
    }

    public void removeCard(Integer cId, Integer pCode, String ownDate) {
        for (Card card : cardList) {
            if (card.getCardId().equals(cId)) {
                if (card.getPinCode().equals(pCode)) {
                    if (card.getOwnDate().equals(ownDate)) {
                        cardList.remove(card);
                    }
                }
            }
        }
    }

    public void removeATM(Integer machineId, String location) {
        for (ATM atm : atmList) {
            if (atm.getMachineId().equals(machineId)) {
                if (atm.getLocation().equals(location)) {
                    atmList.remove(atm);
                }
            }
        }
    }

    public void addMoneyToCard(Integer cId, Double blc) {
        for (Card card : cardList) {
            if (card.getCardId().equals(cId)) {
                card.setBalance(card.getBalance() + blc);
            }
        }
    }

    public void addMoneyToATM(Integer mId, Double blc) {
        for (ATM atm : atmList) {
            if (atm.getMachineId().equals(mId)) {
                atm.setBalance(atm.getBalance() + blc);
            }
        }
    }

    public void removeMoneyToCard(Integer cId, Double blc) {
        for (Card card : cardList) {
            if (card.getCardId().equals(cId)) {
                card.setBalance(card.getBalance() - blc);
            }
        }
    }

    public void removeMoneyToATM(Integer mId, Double blc) {
        for (ATM atm : atmList) {
            if (atm.getMachineId().equals(mId)) {
                atm.setBalance(atm.getBalance() - blc);
            }
        }
    }

    public void getCash(Integer cId, Integer pCode, Integer mId, Double blc) {
        for (Card card : cardList) {
            if (card.getPinCode().equals(pCode)) {
                for (ATM atm : atmList) {
                    if (atm.getMachineId().equals(mId)) {
                        card.setBalance(card.getBalance() - blc);
                        atm.setBalance(atm.getBalance() + blc);
                    }
                }
            }
        }
    }

    public void changePinCodeInCard(Integer cId, Integer oldPin, String ownDate, Integer newPin) {
        for (Card card : cardList) {
            if (card.getCardId().equals(cId)) {
                if (card.getPinCode().equals(oldPin)) {
                    if (card.getOwnDate().equals(ownDate)) {
                        card.setPinCode(newPin);
                    }
                }
            }
        }
    }

    public void sendMoney(Integer senderID, Integer pCode, Integer resiverID, Double blc) {
        for (Card card : cardList) {
            if (card.getCardId().equals(senderID)) {
                if (card.getPinCode().equals(pCode)) {
                    for (Card card1 : cardList) {
                        if (card1.getCardId().equals(resiverID)) {
                            card.setBalance(card.getBalance() - blc);
                            card1.setBalance(card1.getBalance() + blc);
                        }
                    }
                }
            }
        }
    }

    public void theRichestOne() {
        Double rich = cardList.get(0).getBalance();
        for (Card card : cardList) {
            if (card.getBalance() > rich) {
                rich = card.getBalance();
            }
        }
        for (Card card : cardList) {
            if (card.getBalance() == rich) {
                System.out.println("eng ko'p pullik inson : " + card.getOwnDate());
            }
        }
    }

    public void thePoorestOne() {
        Double poor = cardList.get(0).getBalance();
        for (Card card : cardList) {
            if (card.getBalance() < poor) {
                poor = card.getBalance();
            }
        }
        for (Card card : cardList) {
            if (card.getBalance() == poor) {
                System.out.println("eng kam pullik inson : " + card.getOwnDate());
            }
        }
    }

    public void showCardList() {
        for (Card card : cardList) {
            System.out.println(card);
        }
    }

    public void showATMList() {
        for (ATM atm : atmList) {
            System.out.println(atm);
        }
    }

}
