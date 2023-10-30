package service;

import entities.Staff;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    Utils utils = new Utils();
    public void inputEmployee(Scanner scanner, ArrayList<Staff> staff){
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap luong");
        double salary = utils.inputDouble(scanner);
        if (salary<11){
            System.out.println("ko can dong thue");
        } else {
            System.out.println("dong thue mat 10%");
            double afterTax = (salary/100)*10;
            double newSalary = salary - afterTax;
            System.out.println("tien luong cuoi cung "+newSalary);
        }
        staff.add( new Staff(name,salary));
    }
}
