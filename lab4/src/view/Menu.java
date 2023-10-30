package view;

import entities.Staff;
import service.EmployeeService;
import service.HeadStaffService;
import service.SaleService;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public Menu menuDisplay(Scanner scanner, ArrayList<Staff> staff){
        System.out.println("chon cac lua chon sau");
        System.out.println("1. dien tin cho nhan vien hanh chinh");
        System.out.println("2. dien tt cho nhan vien sale");
        System.out.println("3. dien tt cho truong phong");
        System.out.println("4. thoat ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("nhap thong tin cho nhan vien hanh chinh");
                EmployeeService employeeService = new EmployeeService();
                employeeService.inputEmployee(scanner, staff);
                break;

            case 2:  System.out.println("nhap thong tin cho nhan vien tiep thi");
                SaleService saleService = new SaleService();
                saleService.inputSales(scanner, staff);
                break;

            case 3:System.out.println("nhap luong cho truong phong");
                HeadStaffService headStaffService = new HeadStaffService();
                headStaffService.inputHead(scanner, staff);
                break;
            case 4: System.exit(0);
        }
        return menuDisplay(scanner, staff);
    }
}
