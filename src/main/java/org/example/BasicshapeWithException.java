package org.example;
import java.util.*;
import java.util.logging.*;
class BasicshapeWithException{
    double length;
    double breadth;
    double radius;
    double sidelength1;
    double sidelength2;
    double sidelength3;
    double base;
    double height;
    double area;
    double perimeter;
    String tr="triangle";
    String rec="rectangle";
    String cir="circle";
    BasicshapeWithException(double l, double br){
        length=l;
        breadth=br;
    }
    BasicshapeWithException(double r){
        radius=r;
    }
    BasicshapeWithException(double s1, double s2,double s3,double b,double h){
        sidelength1=s1;
        sidelength2=s2;
        sidelength3=s3;
        base=b;
        height=h;
    }
    public double areA(String s){
        if(s.equals(tr)){
            area=0.5*base*height;
            return area;
        }
        else if(s.equals(rec)){
            area=length*breadth;
            return area;
        }
        else if(s.equals(cir)){
            area=(3.14)*radius*radius;
            return area;
        }
        return 0.0;
    }
    public double perimeteR(String h){
        if(h.equals(tr)){
            perimeter=sidelength1+sidelength2+sidelength3;
            return perimeter;
        }
        else if(h.equals(rec)){
            perimeter=2*(length+breadth);
            return perimeter;
        }
        else if(h.equals(cir)){
            perimeter=2*3.14*radius;
            return perimeter;
        }
        return 0.0;
    }
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        try{
            while(true){
                l.info("1.Triangle");
                l.info("2.Rectangle");
                l.info("3.circle");
                l.info("4.Exit");
                l.info("enter the shape type:");
                String shapetype=sc.next();
                shapetype=shapetype.toLowerCase();
                if(shapetype.equals("triangle")){
                    l.info("enter the side1");
                    double side1=sc.nextDouble();
                    l.info("enter the side2");
                    double side2=sc.nextDouble();
                    l.info("enter the side3");
                    double side3=sc.nextDouble();
                    l.info("enter the height");
                    double height=sc.nextDouble();
                    l.info("enter the base");
                    double base=sc.nextDouble();
                    BasicshapeWithException t=new BasicshapeWithException(side1,side2,side3,base,height);
                    double x=t.areA(shapetype);
                    String xa="the area of triangle:"+x;
                    l.info(xa);
                    double y=t.perimeteR(shapetype);
                    String ya="the perimeter of triangle:"+y;
                    l.info(ya);
                }
                else if(shapetype.equals("rectangle")){
                    l.info("enter the length");
                    double length=sc.nextDouble();
                    l.info("enter the breadth");
                    double breadth=sc.nextDouble();
                    BasicshapeWithException re=new BasicshapeWithException(length,breadth);
                    double z=re.areA(shapetype);
                    String za="the area of rectangle:"+z;
                    l.info(za);
                    double k=re.perimeteR(shapetype);
                    String ka="the perimeter of rectangle:"+k;
                    l.info(ka);
                }
                else if(shapetype.equals("circle")){
                    l.info("enter the radius");
                    double radius=sc.nextDouble();
                    BasicshapeWithException c=new BasicshapeWithException(radius);
                    double q=c.areA(shapetype);
                    String qa="the area of circle:"+q;
                    l.info(qa);
                    double i=c.perimeteR(shapetype);
                    String ia="the perimeter of circle:"+i;
                    l.info(ia);
                }
                else if(shapetype.equals("exit")){
                    l.info("Exit");
                    break;
                }
                else{
                    l.info("invalid choice");
                }
            }
        }
        catch(Exception e){
            l.info("Something went wrong in giving the input "+e);
        }
        sc.close();
    }
}
