/**
 * Created by Junaid on 2/12/2025
 */
package com.mjk.spring6reactive.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private Integer id;
    private String customerName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}