package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-18T07:48:19.952582096+01:00[Europe/Malta]")
public class Product {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private Double price;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lastUpdatedOn")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdatedOn;

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Product identifier
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "1001", description = "Product identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Product name
   * @return name
  */
  
  @Schema(name = "name", example = "Coffee", description = "Product name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Product price
   * @return price
  */
  
  @Schema(name = "price", example = "4.99", description = "Product price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Product description
   * @return description
  */
  
  @Schema(name = "description", example = "Arabica coffee beans", description = "Product description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product lastUpdatedOn(OffsetDateTime lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
    return this;
  }

  /**
   * Timestamp of last product update
   * @return lastUpdatedOn
  */
  @Valid 
  @Schema(name = "lastUpdatedOn", accessMode = Schema.AccessMode.READ_ONLY, example = "2023-01-01T10:10:10Z", description = "Timestamp of last product update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getLastUpdatedOn() {
    return lastUpdatedOn;
  }

  public void setLastUpdatedOn(OffsetDateTime lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.lastUpdatedOn, product.lastUpdatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, description, lastUpdatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdatedOn: ").append(toIndentedString(lastUpdatedOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

