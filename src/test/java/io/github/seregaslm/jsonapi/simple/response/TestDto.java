package io.github.seregaslm.jsonapi.simple.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.seregaslm.jsonapi.simple.annotation.JsonApiId;
import io.github.seregaslm.jsonapi.simple.annotation.JsonApiType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Accessors(chain = true)
@JsonApiType(TestDto.API_TYPE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestDto {
    public static final String API_TYPE = "test-object";

    @JsonApiId
    private UUID id;
    private String name;
    private LocalDateTime createDate;
}
