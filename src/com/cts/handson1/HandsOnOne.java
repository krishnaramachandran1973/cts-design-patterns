package com.cts.handson1;

import com.cts.handson1.events.Order;
import com.cts.handson1.events.Repair;
import com.cts.handson1.factory.OrderFactory;
import com.cts.handson1.factory.RepairFactory;

import java.util.Scanner;

public class HandsOnOne {
    // Factories declared here
    private static final OrderFactory orderFactory;
    private static final RepairFactory repairFactory;

    // factory initializations
    static {
        orderFactory = new OrderFactory();
        repairFactory = new RepairFactory();
    }

    public static void main(String[] args) {

        // Repair and Order interfaces to use later
        Repair repair;
        Order order;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our site. Would you like to order or repair?");
        String processOption = scanner.nextLine();

        String modelName, accessory;

        // Logic to process phone orders and repairs based on input
        switch (processOption) {

            // process orders
            case "order":
                System.out.println("Please provide the phone model name");
                modelName = scanner.nextLine();
                order = orderFactory.createOrder(processOption);
                order.processOrder(modelName);
                break;

            // process repairs
            case "repair":
                System.out.println("Is it the phone or the accessory that you want to be repaired?");
                String repairType = scanner.nextLine();

                switch (repairType) {

                    // phone repairs
                    case "phone":
                        System.out.println("Please provide the phone model name");
                        modelName = scanner.nextLine();
                        // Get PhoneRepair from Factory
                        repair = repairFactory.createRepair(repairType);
                        repair.processRepair(modelName);
                        break;

                    // accessory repairs
                    case "accessory":
                        System.out.println("Please provide the accessory detail, like headphone, tempered glass");
                        accessory = scanner.nextLine();
                        // Get AccessoryRepair from Factory
                        repair = repairFactory.createRepair(repairType);
                        repair.processRepair(accessory);
                        break;

                    default:
                        break;
                }

            default:
                break;
        }
    }
}
