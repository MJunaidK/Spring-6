package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Product;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetAllProducts200Response
 */

@JsonTypeName("getAllProducts_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-18T07:48:19.952582096+01:00[Europe/Malta]")
public class GetAllProducts200Response {

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("data")
  @Valid
  private List<Product> data = null;

  public GetAllProducts200Response offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Page offset
   * @return offset
  */
  
  @Schema(name = "offset", example = "10", description = "Page offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public GetAllProducts200Response limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Page size limit
   * @return limit
  */
  
  @Schema(name = "limit", example = "5", description = "Page size limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public GetAllProducts200Response total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of records across all pages
   * @return total
  */
  
  @Schema(name = "total", example = "1500", description = "Total number of records across all pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetAllProducts200Response data(List<Product> data) {
    this.data = data;
    return this;
  }

  public GetAllProducts200Response addDataItem(Product dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Product> getData() {
    return data;
  }

  public void setData(List<Product> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAllProducts200Response getAllProducts200Response = (GetAllProducts200Response) o;
    return Objects.equals(this.offset, getAllProducts200Response.offset) &&
        Objects.equals(this.limit, getAllProducts200Response.limit) &&
        Objects.equals(this.total, getAllProducts200Response.total) &&
        Objects.equals(this.data, getAllProducts200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAllProducts200Response {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

