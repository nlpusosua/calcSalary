package service;

import entities.HeadStaff;
import entities.Staff;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadStaffService {
    Utils utils = new Utils();
    public void inputHead(Scanner scanner, ArrayList<Staff> staff){
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap luong");
        double salary = utils.inputDouble(scanner);
        System.out.println("nhap luong trach nhiem");
        double resSalary = utils.inputDouble(scanner);
        staff.add( new HeadStaff(name,salary, resSalary));
        double sumSalary = salary+resSalary;
        if (sumSalary>11){
            System.out.println("dong thue 10%");
            double newSalary = sumSalary-(sumSalary/10);
            System.out.println("tiefn luong cuoi cung la "+newSalary);
        } else {
            System.out.println("ko can dong thue");
        }
    }
}
