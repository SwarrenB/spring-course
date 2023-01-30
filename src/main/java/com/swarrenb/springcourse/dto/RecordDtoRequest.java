package com.swarrenb.springcourse.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class RecordDtoRequest {
    private String text;
    private Date dueDate;
}
