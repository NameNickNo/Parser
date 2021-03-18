package com.example;

import com.example.model.Product;
import com.example.util.DataWriter;
import com.example.util.Parser;
import com.example.util.impl.DataWriterCsv;
import com.example.util.impl.ParserV1;

import java.util.ArrayList;
import java.util.List;

public class ParserApplication {
    public static List<Product> PRODUCTS = new ArrayList<>();
    public static String filename = "products.csv";

    public static void main(String[] args) {

        Parser parser = new ParserV1();
        DataWriter dataWriter = new DataWriterCsv();
        parser.parseObjectsFromSite();

        dataWriter.writeProducts(filename);
    }



}
