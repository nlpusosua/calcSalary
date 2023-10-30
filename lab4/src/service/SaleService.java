package service;

import entities.HeadStaff;
import entities.Staff;
import entities.StaffSell;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleService {
    Utils utils = new Utils();
    public void inputSales(Scanner scanner, ArrayList<Staff> staff){
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap luong");
        double salary = utils.inputDouble(scanner);
        System.out.println("nhap doanh thu");
        double sales = utils.inputDouble(scanner);
        System.out.println("nhap ty le hoa hong");
        double percentage = utils.inputDouble(scanner);
        staff.add( new StaffSell(name,salary, sales,percentage));
        double sumSalary = salary+sales+percentage;
        if (sumSalary<11){
            System.out.println("ko can dong thue");
        } else {
            System.out.println("dong thue 10%");
            double newSalary = sumSalary-(sumSalary/100)*10;
            System.out.println("tien luong cuoi cung la "+newSalary);
        }
    }
}
