package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBonus200() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=800;
        int actual= cashback.bonus (amount);
        int expected=200;
        assertEquals ( expected,actual);
    }
    @Test
    public void shouldBonus999() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1;
        int actual= cashback.bonus (amount);
        int expected=999;
        assertEquals ( expected,actual);
    }
    @Test
    public void shouldBonus1000() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=0;
        int actual= cashback.bonus (amount);
        int expected=1000;
        assertEquals ( expected,actual);
    }
    @Test
    public void shouldNegativBonus() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=-1;
        int actual= cashback.bonus (amount);
        int expected=1001;
        assertEquals ( expected,actual);
    }
    @Test
    public void shouldBonus1() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=999;
        int actual= cashback.bonus (amount);
        int expected=1;
        assertEquals ( expected,actual);
    }
    @Test
    public void ShouldNotBonusNull() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1000;
        int actual= cashback.bonus (amount);
        int expected=0;
        assertEquals ( expected,actual);
    }
    @Test
    public void ShouldNotBonusMore1000() {
        CashbackHackService cashback= new CashbackHackService();
        int amount=1001;
        int actual= cashback.bonus (amount);
        int expected=0;
        assertEquals ( expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldBonus200T2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual =  cashback.bonus(800);
        assertEquals(200, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldBonus999T2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (1);
        assertEquals ( 999,actual);
    }
    @org.junit.jupiter.api.Test
    void shouldBonus1000T2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (0);
        assertEquals ( 1000,actual);
    }
    @org.junit.jupiter.api.Test
    void shouldNegativBonusT2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (-1);
        assertEquals ( 1001,actual);
    }
    @org.junit.jupiter.api.Test
    void shouldBonus1T2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (999);
        assertEquals ( 1,actual);
    }
    @org.junit.jupiter.api.Test
    void ShouldNotBonusNullT2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (1000);
        assertEquals ( 0,actual);
    }
    @org.junit.jupiter.api.Test
    void ShouldNotBonusMore1000T2() {
        CashbackHackService cashback= new CashbackHackService();
        int actual= cashback.bonus (1001);
        assertEquals ( 0,actual);
    }

}
