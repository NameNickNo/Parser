package com.example.util.impl;

import com.example.model.Product;
import com.example.util.DataWriter;

import java.io.*;

import static com.example.ParserApplication.PRODUCTS;

public class DataWriterCsv implements DataWriter {

    public void writeProducts(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (Product product :PRODUCTS) {

                String stringBuilder = product.getProductId() + "," +
                        product.getSellerId() + "," +
                        product.getOriMinPrice() + "," +
                        product.getOriMaxPrice() + "," +
                        product.getPromotionId() + "," +
                        product.getStartTime() + "," +
                        product.getEndTime() + "," +
                        product.getPhase() + "," +
                        product.getProductTitle() + "," +
                        product.getMinPrice() + "," +
                        product.getMaxPrice() + "," +
                        product.getDiscount() + "," +
                        product.getTotalStock() + "," +
                        product.getStock() + "," +
                        product.getOrders() + "," +
                        product.getSoldout() + "," +
                        product.getProductImage() + "," +
                        product.getProductDetailUrl() + "," +
                        product.getTrace() + "," +
                        product.getTotalTranpro3() + "," +
                        product.getProductPositiveRate() + "," +
                        product.getProductAverageStar() + "," +
                        product.getItemEvalTotalNum() + "," +
                        product.getGmtCreate() + ",";
                writer.write(stringBuilder);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
