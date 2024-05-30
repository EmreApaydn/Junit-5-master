package com.mediamarkt.elements;

import org.openqa.selenium.By;

public class Elements {
    public static By anladim = By.xpath("//a[@class='cookie-info-accept-button js-cookie-info-accept-button button']");
    public static By mediaMarkt = By.xpath("//*[@id=\"rise-header\"]/div/div/div[1]/a/span");
    public static By televizyon = By.xpath("//a[@title='Televizyonlar']");
    public static By araListe = By.xpath("//input[(@class='facet-search') and (@placeholder='Ara')]");
    public static By samsung = By.xpath("//li/label/input[@value='/Search.ff?channel=MMTRtr&filterCategoriesROOT=TV%2C+G%C3%B6r%C3%BCnt%C3%BC+ve+Ses%C2%A7MediaTRtrc678536&filterCategoriesROOT/TV%2C+G%C3%B6r%C3%BCnt%C3%BC+ve+Ses%C2%A7MediaTRtrc678536=Televizyon%C2%A7MediaTRtrc465019&filterbrand=SAMSUNG&ids_only=true&productsPerPage=20&navigation=true']");
    public static By favori1 = By.xpath("(//a[@class='add-to-wishlist js-add-to-wishlist'])[1]");
    public static By alisverisedon = By.id("continue-shopping");
    public static By favori2 = By.xpath("(//a[@class='add-to-wishlist js-add-to-wishlist'])[2]");
    public static By fiyat = By.xpath("//*[@id=\"category\"]/ul[2]/li[2]/div/aside[2]/div[1]/div[1]/div[2]");
    public static By favorilerim = By.xpath("//a[@class='button right close']");
    public static By fiyat2 = By.xpath("//*[@id=\"my-account\"]/div[1]/ul[2]/li[2]/div/aside[2]/div[1]/div[1]/div[2]");
    public static By listedenKaldir = By.xpath("(//a[@class='clickable remove-from-wishlist'])[1]");
    public static By urun = By.xpath("//figure[@class='photo-wrapper']");
    public static By sepeteEkle = By.xpath("//div[@id='pdp-add-to-cart']");
    public static By sepeteDevam = By.id("sepete-ekle-devam-et");
    public static By sil = By.xpath("//button[@class='delete-item ins-init-condition-tracking']");
    public static By bosSepet = By.xpath("//h2[normalize-space()='Sepetinizde ürün bulunmuyor!']");


}
