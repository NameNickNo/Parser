package com.example.util.impl;

import com.example.model.Answer;
import com.example.util.Parser;
import com.example.util.RecipientDataSite;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.nodes.Document;

import static com.example.ParserApplication.PRODUCTS;

public class ParserV1 implements Parser {

    public void parseObjectsFromSite() {
        RecipientDataSite recipient = new RecipientDataSiteOfProducts();
        String[] links = recipient.getLinks();

        for (String link : links) {
            Document page = recipient.getData(link);
            String data = page.text();
            int startIndex = data.indexOf("(") + 1;
            int endIndex = data.lastIndexOf(")");
            String jsonObject = data.substring(startIndex, endIndex);
            Gson gson = new GsonBuilder().create();
            Answer answer = gson.fromJson(jsonObject, Answer.class);
            PRODUCTS.addAll(answer.getResults());
        }

    }

}
