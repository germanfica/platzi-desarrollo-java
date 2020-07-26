package com.williambluish.test;

/**
 * Un empleado gana una cierta cantidad de dinero. Los empleados pueden recibir
 * un bono adicional. Calcular el salario total.
 */

class Person {
    private String name;
    private String lastName;

    Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" + "last name: " + lastName + "\n";
    }
}

class Employee extends Person {
    private int salary;
    private int bonus;

    Employee(String name, String lastName, int salary) {
        super(name, lastName);
        this.salary = salary;
        bonus = 0;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int totalSalary() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "salary: " + salary + "\n" +
                "bonus: " + bonus + "\n" +
                "total salary: " + totalSalary();
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("German", "Fica", 3000);
        employee.setBonus(300);
        System.out.println(employee.toString());

        System.out.println("--------------------");

        try {
            if (System.getProperty("java.version").startsWith("11.")) {
                // Java 11
                System.out.println("Java version: " + System.getProperty("java.version"));
                var numero = 10;
                System.out.println("numero: " + numero);
                System.out.println("Los var estan implementados en java 11");
            } else {
                System.out.println("Java version: " + System.getProperty("java.version"));
                System.out.println("Los var no existen en esta versión de Java. :'(");
            }
        } catch (Exception e) {


        }
    }
}