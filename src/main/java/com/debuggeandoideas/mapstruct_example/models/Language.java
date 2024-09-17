package com.debuggeandoideas.mapstruct_example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    private String name;
    private Boolean isOfficial;
    private Integer speakersCount;
}
