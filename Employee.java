/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author LENOVO
 */
class Employee {
    private String name;
    
    public Employee(String name){
        this. name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this. name = name;
    }
    public void work(){
        System.out.println( getName() + "Karyawan sedang bekerja");
    }
}
class Manager extends Employee {
    public Manager(String name){
        super(name);
    }
    @Override
    public void work(){
        System.out.println( getName() +" bekerja sebagai Manajer");
    }
}
class Developer extends Employee{
    public Developer (String name){
        super(name);
    }
    @Override
    public void work(){
        System.out.println( getName() + " bekerja sebagai Pengembang");
    }
}
class Designer extends Employee {
    public Designer(String name){
        super(name);
    }
    @Override
    public void work(){
        System.out.println( getName() +" bekerja sebagai Desainer");
    }
    public static void main(String[] args) {
        Employee employ1 = new Manager("Bagus");
        employ1.work();
        Employee employ2 = new Developer("Sinta");
        employ2.work();
        Employee employ3 = new Designer("Ayu");
        employ3.work();
    }
}