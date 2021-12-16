package com.kodilla.challenges;

import org.springframework.core.annotation.Order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderRepository {

        public void writeStringToFile(String buyerName, String sellerName, String productName, BigDecimal price) {

                try {
                        FileWriter orderData = new FileWriter(new File("order.txt"));
                        orderData.write(buyerName+ " bought from " + sellerName + " this product: " + productName + " for: " + price );
                        orderData.close();
                } catch (IOException e) {
                        System.out.println("Error with saving to file");
                }
        }
}
