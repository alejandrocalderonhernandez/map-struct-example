package com.debuggeandoideas.mapstruct_example.mappers;

import com.debuggeandoideas.mapstruct_example.dtos.CountryDto;
import com.debuggeandoideas.mapstruct_example.dtos.LanguageDto;
import com.debuggeandoideas.mapstruct_example.models.Country;
import com.debuggeandoideas.mapstruct_example.models.Language;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper mapper = Mappers.getMapper(CountryMapper.class);

    @Mapping(target = "continent", source = "location.continent")
    CountryDto toCountryDto(Country country);

    @Mapping(target = "isOfficialLanguage", source = "isOfficial")
    @Mapping(target = "speakersTotal", source = "speakersCount")
    LanguageDto toLanguageDto(Language language);

}
