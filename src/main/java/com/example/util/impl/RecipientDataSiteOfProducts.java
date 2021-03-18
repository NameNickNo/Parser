package com.example.util.impl;

import com.example.util.RecipientDataSite;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RecipientDataSiteOfProducts implements RecipientDataSite {

    @Override
    public Document getData(String link) {
        Document document = null;
        try {
            document = Jsoup.connect(link).ignoreContentType(true).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return document;
    }

    @Override
    public String[] getLinks() {
        String firstTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308568882614507183_1615536130257&widget_id=5547572&platform=pc&limit=12&offset=0&phase=1&productIds2Top=&postback=&_=1615536130818";
        String secondTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=12&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615983472214";
        String thirdTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=24&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615983476663";
        String forthTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=36&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615983957126";
        String fifthTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=48&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615983961003";
        String sixthTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=60&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615983992886";
        String seventhTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=72&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615984006739";
        String eighthTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=84&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615984022687";
        String ninthTwelveProducts = "https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18308716481492576171_1615983451758&widget_id=5547572&platform=pc&limit=12&offset=96&phase=1&productIds2Top=&postback=6106646d-589f-4366-a44f-c4292a0fe151&_=1615984036364";

        return new String[]{firstTwelveProducts, secondTwelveProducts, thirdTwelveProducts, forthTwelveProducts,
                fifthTwelveProducts, sixthTwelveProducts, seventhTwelveProducts, eighthTwelveProducts,ninthTwelveProducts};
    }
}
