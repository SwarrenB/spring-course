package com.swarrenb.springcourse.service;

import com.swarrenb.springcourse.dto.RecordDtoResponse;

import java.util.List;

public interface RecordService {

    List<RecordDtoResponse> getAllRecords();

    RecordDtoResponse findRecordByUserId(Long userId);
}
