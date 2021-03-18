package com.example.model;

public class Product {
    private long productId;
    private long sellerId;
    private String oriMinPrice;
    private String oriMaxPrice;
    private long promotionId;
    private long startTime;
    private long endTime;
    private long phase;
    private String productTitle;
    private String minPrice;
    private String maxPrice;
    private int discount;
    private int totalStock;
    private int stock;
    private int orders;
    private boolean soldout;
    private String productImage;
    private String productDetailUrl;
    private String trace;
    private String totalTranpro3;
    private String productPositiveRate;
    private String productAverageStar;
    private int itemEvalTotalNum;
    private long gmtCreate;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", sellerId=" + sellerId +
                ", oriMinPrice='" + oriMinPrice + '\'' +
                ", oriMaxPrice='" + oriMaxPrice + '\'' +
                ", promotionId=" + promotionId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", phase=" + phase +
                ", productTitle='" + productTitle + '\'' +
                ", minPrice='" + minPrice + '\'' +
                ", maxPrice='" + maxPrice + '\'' +
                ", discount=" + discount +
                ", totalStock=" + totalStock +
                ", stock=" + stock +
                ", orders=" + orders +
                ", soldout=" + soldout +
                ", productImage='" + productImage + '\'' +
                ", productDetailUrl='" + productDetailUrl + '\'' +
                ", trace='" + trace + '\'' +
                ", totalTranpro3='" + totalTranpro3 + '\'' +
                ", productPositiveRate='" + productPositiveRate + '\'' +
                ", productAverageStar='" + productAverageStar + '\'' +
                ", itemEvalTotalNum=" + itemEvalTotalNum +
                ", gmtCreate=" + gmtCreate +
                '}';
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getOriMinPrice() {
        return oriMinPrice;
    }

    public void setOriMinPrice(String oriMinPrice) {
        this.oriMinPrice = oriMinPrice;
    }

    public String getOriMaxPrice() {
        return oriMaxPrice;
    }

    public void setOriMaxPrice(String oriMaxPrice) {
        this.oriMaxPrice = oriMaxPrice;
    }

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getPhase() {
        return phase;
    }

    public void setPhase(long phase) {
        this.phase = phase;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public boolean getSoldout() {
        return soldout;
    }

    public void setSoldout(boolean soldout) {
        this.soldout = soldout;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDetailUrl() {
        return productDetailUrl;
    }

    public void setProductDetailUrl(String productDetailUrl) {
        this.productDetailUrl = productDetailUrl;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getTotalTranpro3() {
        return totalTranpro3;
    }

    public void setTotalTranpro3(String totalTranpro3) {
        this.totalTranpro3 = totalTranpro3;
    }

    public String getProductPositiveRate() {
        return productPositiveRate;
    }

    public void setProductPositiveRate(String productPositiveRate) {
        this.productPositiveRate = productPositiveRate;
    }

    public String getProductAverageStar() {
        return productAverageStar;
    }

    public void setProductAverageStar(String productAverageStar) {
        this.productAverageStar = productAverageStar;
    }

    public int getItemEvalTotalNum() {
        return itemEvalTotalNum;
    }

    public void setItemEvalTotalNum(int itemEvalTotalNum) {
        this.itemEvalTotalNum = itemEvalTotalNum;
    }

    public long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
