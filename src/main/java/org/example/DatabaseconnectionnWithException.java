package org.example;
import java.util.*;
import java.util.logging.*;
class DatabaseconnectionnWithException{
    Logger l= Logger.getLogger("com.api.jar");
    static DatabaseconnectionnWithException st;
    String connection;
    String connect;
    private DatabaseconnectionnWithException(String connection){
        this.connection=connection;
    }
    public static DatabaseconnectionnWithException getInstance(String connection){
        if(st==null){
            st=new DatabaseconnectionnWithException(connection);
        }
        return st;
    }
    public void connection(String s){
        l.info("Connection is established");
    }
    public void closeconnection(){
        l.info("connection is closed");
    }
    public static void main(String[] args){
        Logger l= Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        l.info("Enter connection:");
        String connection=sc.next();
        DatabaseconnectionnWithException sv=DatabaseconnectionnWithException.getInstance(connection);
        while(true) {
            try {
                l.info("1.New Connection");
                l.info("2.Terminate connection");
                l.info("3.Exit");
                l.info("Enter your operation or choice");
                int op = sc.nextInt();
                if (op == 1) {
                    l.info("Enter new connection");
                    String s=sc.next();
                    sv.connection(s);
                }
                else if (op == 2) {
                    sv.closeconnection();
                }
                else if(op==3) {
                    l.info("Exit");
                    break;
                }
                else{
                    l.info("invalid choice:choose correct option");
                }
            }
            catch(Exception e) {
                l.info("something Wrong "+ e);
                sc.nextLine();
            }
        }
        sc.close();
    }
}
