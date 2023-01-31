package org.example;
import java.util.*;
import java.util.logging.*;
class BasiccreditcardWithException implements Cloneable{
    String name;
    int creditcardNumber;
    String expirationDate;
    public BasiccreditcardWithException(String name, int creditcardNumber, String expirationDate){
        this.name=name;
        this.creditcardNumber=creditcardNumber;
        this.expirationDate=expirationDate;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String equally(BasiccreditcardWithException s){
        if(creditcardNumber == s.creditcardNumber){
            return "true";
        }
        return "false";
    }
    public void compare(int credit){
        Logger l = Logger.getLogger("com.api.jar");
        if(creditcardNumber==credit){
            l.info("Both are same");
        }
        else{
            l.info("Both are not same");
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        try {
            l.info("name:");
            String naMe = sc.nextLine();
            l.info("credit card number:");
            int creditcardnumber = sc.nextInt();
            sc.nextLine();
            l.info("Expiry Date:");
            String expirationdate = sc.nextLine();
            l.info("Enter the new person credit card number:");
            int c1 = sc.nextInt();
            l.info("checking whether two credit card numbers same or not");
            BasiccreditcardWithException ba = new BasiccreditcardWithException(naMe, creditcardnumber, expirationdate);
            ba.compare(c1);
            l.info("After cloning");
            BasiccreditcardWithException ba1 = (BasiccreditcardWithException) ba.clone();
            String k = ba.equally(ba1);
            l.info(k);
            sc.close();
        }
        catch(InputMismatchException e){
            l.info("invalid input "+e);
        }
    }
}
