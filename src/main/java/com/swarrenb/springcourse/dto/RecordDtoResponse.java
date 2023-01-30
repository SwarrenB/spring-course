package com.swarrenb.springcourse.dto;

import com.swarrenb.springcourse.model.Record;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class RecordDtoResponse {
    private String text;
    private Long userId;
    private Date dueDate;

    public RecordDtoResponse(Record record)
    {
        this.text = record.getText();
        this.userId = record.getUserId();
        this.dueDate = record.getDueDate();
    }
}
