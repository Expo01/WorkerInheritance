package com.company;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;


    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        //"incomplete" constructor. other method below for endDate assignment.
    }

    public int getAge(){
       int dateAsInt = Integer.parseInt(birthDate.substring(6));
       // .substring converts xx/xx/xxxx format and starts with year at index 6.
       int currentYar = 2025;
        int age = currentYar - dateAsInt;
       return age;
    }

    public double collectPay(){
        return  0.0;
    }

  public void terminate(String endDate){
      this.endDate = endDate;
  }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
