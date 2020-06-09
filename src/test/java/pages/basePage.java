package pages;

import Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class basePage {

    public static void main(String[] args) {
        System.out.println("Name and Surname : Ali Kocaaga");

    }
    public basePage(){
        PageFactory.initElements(Driver.get(), this);
    }

}
