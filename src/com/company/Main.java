package com.company;

public class Main {

    public static void main(String[] args) {
//        SalariedEmployee salaried = new SalariedEmployee("bob", "01/01/1990","1999",12345678,"1990",40000.00,true);
//        salaried.retire();

        Worker firstWorker = new Worker("lee", "01/01/2002");
        firstWorker.getAge();

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("age = " + tim.getAge());
        System.out.println("pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);

    }
}
