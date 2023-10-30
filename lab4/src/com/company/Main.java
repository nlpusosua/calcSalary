package com.company;

import entities.HeadStaff;
import entities.Staff;
import service.EmployeeService;
import service.HeadStaffService;
import service.SaleService;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staff = new ArrayList<Staff>();
        Menu menu = new Menu();
        menu.menuDisplay(scanner, staff);


    }
}
