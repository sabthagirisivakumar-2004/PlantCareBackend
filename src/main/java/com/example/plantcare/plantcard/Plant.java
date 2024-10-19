package com.example.plantcare.plantcard;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "plants")
public class Plant {

    @Id
    private String id;
    private String name;
    private double price;
    private double originalPrice;
    private String discount;
    private double rating;
    private List<String> availableSizes;
    private List<String> planterTypes;
    private int quantity;
    private String imageUrl;
    private boolean deliveryAvailable;
    private String dateAdded;
    private String category;
    private String description;
    private boolean stockAvailable;
    private List<String> tags;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public List<String> getAvailableSizes() {
        return availableSizes;
    }
    public void setAvailableSizes(List<String> availableSizes) {
        this.availableSizes = availableSizes;
    }
    public List<String> getPlanterTypes() {
        return planterTypes;
    }
    public void setPlanterTypes(List<String> planterTypes) {
        this.planterTypes = planterTypes;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public boolean isDeliveryAvailable() {
        return deliveryAvailable;
    }
    public void setDeliveryAvailable(boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }
    public String getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isStockAvailable() {
        return stockAvailable;
    }
    public void setStockAvailable(boolean stockAvailable) {
        this.stockAvailable = stockAvailable;
    }
    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    // Constructors, Getters, and Setters
}