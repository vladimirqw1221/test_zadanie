package net.azurewebsites;
import static com.codeborne.selenide.Selenide.open;

import org.junit.After;
import org.junit.Before;

public class Befcls {

   @Before
    public void set(){

       open("https://ilswebreact-develop.azurewebsites.net/");
       System.out.println("Start Test");

   }


   @After
    public void screen(){
       System.out.println("Test Finish");

   }

}
