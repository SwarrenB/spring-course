package com.swarrenb.springcourse.controller;

import com.swarrenb.springcourse.dto.RecordDtoResponse;
import com.swarrenb.springcourse.service.RecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecordController {

    private final RecordService recordService;

    @GetMapping("/get-all-records")
    public List<RecordDtoResponse> getAllRecords()
    {
        return recordService.getAllRecords();
    }

    public RecordDtoResponse getRecordByUserId(@PathVariable Long userId)
    {
        return recordService.findRecordByUserId(userId);
    }

}
