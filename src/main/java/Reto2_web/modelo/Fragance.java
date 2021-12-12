
package Reto2_web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author Fabio Ortiz
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fragance")
public class Fragance {
@Id
private String reference;
private String brand;
private String category;
private String presentation;
private String description;
private boolean availability = true;
private double price;
private int quantity;
private String photography;
public String getReference() {
    return reference;
}
public void setReference(String reference) {
    this.reference = reference;
}
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public String getCategory() {
    return category;
}
public void setCategory(String category) {
    this.category = category;
}
public String getPresentation() {
    return presentation;
}
public void setPresentation(String presentation) {
    this.presentation = presentation;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public boolean isAvailability() {
    return availability;
}
public void setAvailability(boolean availability) {
    this.availability = availability;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
public String getPhotography() {
    return photography;
}
public void setPhotography(String photography) {
    this.photography = photography;
}

}
