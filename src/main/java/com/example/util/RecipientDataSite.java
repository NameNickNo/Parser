package com.example.util;

import org.jsoup.nodes.Document;

public interface RecipientDataSite {

    Document getData(String link);
    String[] getLinks();
}
