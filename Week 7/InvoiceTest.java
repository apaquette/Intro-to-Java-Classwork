/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexa
 */
public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice = new Invoice("ABC123", "Product_One", 3, 1.99);
        
        printInvoice(invoice);
        
        invoice.setPartNumber("DEF456");
        invoice.setPartDescription("Product_Two");
        invoice.setQuantity(5);
        invoice.setPrice(6.99);
        
        printInvoice(invoice);
    }
    public static void printInvoice(Invoice invoice){
        System.out.printf("Serial Number: %s%n", invoice.getPartNumber());
        System.out.printf("Product Name: %s%n", invoice.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price: $%.2f%n", invoice.getPrice());
        System.out.printf("Invoice Amount: $%.2f%n%n%n", invoice.getInvoiceAmount());
    }
}