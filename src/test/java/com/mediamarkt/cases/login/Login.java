package com.mediamarkt.cases.login;

import com.mediamarkt.driver.DriverManager;
import com.mediamarkt.elements.Elements;
import com.mediamarkt.methods.Methods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Login extends DriverManager {
    Methods methods = new Methods();

    @Test
    @Order(1)
    public void chekcURL() {

        Assertions.assertEquals("https://www.mediamarkt.com.tr/", webDriver.getCurrentUrl());
        methods.clickWithFluentWait(Elements.anladim);
    }
    @Test
    @Order(2)
    public void checkVisibility() {
        Assertions.assertTrue(methods.isElementVisible(Elements.mediaMarkt));
    }
    @Test
    @Order(3)
    public void searchProduct() {
        methods.clickWithFluentWait(Elements.televizyon);
        List<WebElement> liste = methods.findElements(Elements.araListe);
        liste.get(0).click();
        liste.get(0).sendKeys("samsung");
        methods.clickWithFluentWait(Elements.samsung);
        methods.waitSeconds(2);
    }
    @Test
    @Order(4)
    public void checkPrice() {
        methods.click(Elements.favori1);
        methods.click(Elements.alisverisedon);
        String fiyat1 = webDriver.findElement(Elements.fiyat).getText();
        methods.clickWithFluentWait(Elements.favori2);
        methods.clickWithFluentWait(Elements.favorilerim);
        String fiyat2 = webDriver.findElement(Elements.fiyat2).getText();
        Assertions.assertEquals(fiyat1, fiyat2);
    }
    @Test
    @Order(5)
    public void checkIsCartEmpty() {

        methods.clickWithFluentWait(Elements.listedenKaldir);
        methods.clickWithFluentWait(Elements.urun);
        methods.clickWithFluentWait(Elements.sepeteEkle);
        methods.clickWithFluentWait(Elements.sepeteDevam);
        methods.clickWithFluentWait(Elements.sepeteDevam);
        methods.clickWithFluentWait(Elements.sil);
        methods.waitSeconds(2);
        Assertions.assertEquals("Sepetinizde ürün bulunmuyor!",webDriver.findElement(Elements.bosSepet).getText());



    }
}
