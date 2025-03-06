package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PaginatedResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-18T07:48:19.952582096+01:00[Europe/Malta]")
public class PaginatedResult {

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("data")
  @Valid
  private List<Object> data = null;

  public PaginatedResult offset(Integer offset) {
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

  public PaginatedResult limit(Integer limit) {
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

  public PaginatedResult total(Integer total) {
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

  public PaginatedResult data(List<Object> data) {
    this.data = data;
    return this;
  }

  public PaginatedResult addDataItem(Object dataItem) {
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
  
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Object> getData() {
    return data;
  }

  public void setData(List<Object> data) {
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
    PaginatedResult paginatedResult = (PaginatedResult) o;
    return Objects.equals(this.offset, paginatedResult.offset) &&
        Objects.equals(this.limit, paginatedResult.limit) &&
        Objects.equals(this.total, paginatedResult.total) &&
        Objects.equals(this.data, paginatedResult.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResult {\n");
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

