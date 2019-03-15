package strategy;
interface day {
    void printDay();
}
interface use {
    void printhowuse();
}
interface booked {
    void time();
}
class alluse implements use {
    public void printhowuse() {
        System.out.println("Can use forever");
    }
}
class someuse implements use {
    public void printhowuse() {
        System.out.println("Can use on no exams");
    }
}
class sevenday implements booked {
    public void time() {
        System.out.println("7 days");
    }
}
class fifteen implements booked {
    public void time() {
        System.out.println("15 days");
    }
}
class cannot implements booked {
    public void time() {
        System.out.println("Cannot days");
    }
}
class forever implements booked {
    public void time() {
        System.out.println("Infinity days");
    }
}
abstract class person {
    person p;
    booked book;
    use term;
    void print(){}
    void change(){
    }
}
class outsider extends person {
    String name;
    outsider(String name) {
        this.name = name;
        book = new cannot();
        term = new someuse();
    }
    void print(){
        System.out.println("I am Outsider");
        book.time();
        term.printhowuse();
    }
}
class employee extends person {
    String name;
    employee(String name) {
        this.name = name;
        book = new fifteen();
        term = new alluse();
    }
    void print(){
        System.out.println("I am Employees");
        book.time();
        term.printhowuse();
    }
}
class teacher extends person {
    String name;
    teacher(String name) {
        this.name = name;
        book = new sevenday();
        term = new alluse();
    }
    void print(){
        System.out.println("I am Teacher");
        book.time();
        term.printhowuse();
    }
}
class student extends person {
    String name;
    student(String name) {
        this.name = name;
        book = new sevenday();
        term = new alluse();
    }
    void print(){
        System.out.println("I am Student");
        book.time();
        term.printhowuse();
    }
}
public class Strategy {
    public static void main(String[] args) {
        person em = new employee("กรกนก");
        person tc = new teacher("วิชุดา");
        person st = new student("มาริดา");
        person us = new outsider("ศรีสุดา");
        em.print();
        tc.print();
        st.print();
        us.print();
        
    }
}
