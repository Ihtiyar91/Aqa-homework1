package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testBonus() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=800;
        int actual= cashback.bonus (amount);
        int expected=200;
        assertEquals ( expected,actual);
    }
    @Test
    public void testMinBuy() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1;
        int actual= cashback.bonus (amount);
        int expected=999;
        assertEquals ( expected,actual);
    }
    @Test
    public void testNotBuy() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=0;
        int actual= cashback.bonus (amount);
        int expected=1000;
        assertEquals ( expected,actual);
    }
    @Test
    public void testNegativBonus() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=-1;
        int actual= cashback.bonus (amount);
        int expected=1001;
        assertEquals ( expected,actual);
    }
    @Test
    public void testMaxBuyForBonus() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=999;
        int actual= cashback.bonus (amount);
        int expected=1;
        assertEquals ( expected,actual);
    }
    @Test
    public void testNotMessangeBonus() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1000;
        int actual= cashback.bonus (amount);
        int expected=0;
        assertEquals ( expected,actual);
    }
    @Test
    public void testNotMessangeBonus2() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1001;
        int actual= cashback.bonus (amount);
        int expected=0;
        assertEquals ( expected,actual);
    }
}