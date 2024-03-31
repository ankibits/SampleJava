package com.example.minor1.dtos;
import lombok.*;

import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchBookRequest {

    @NotBlank
    private String searchKey;

    @NotBlank
    private String searchValue;
}
