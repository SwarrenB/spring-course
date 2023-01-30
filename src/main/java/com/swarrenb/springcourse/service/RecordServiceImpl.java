package com.swarrenb.springcourse.service;

import com.swarrenb.springcourse.dto.RecordDtoResponse;
import com.swarrenb.springcourse.model.Record;
import com.swarrenb.springcourse.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecordServiceImpl implements RecordService {

    private final RecordRepository recordRepository;

    @Override
    public List<RecordDtoResponse> getAllRecords() {
        Record recordDB = recordRepository.save(new Record());
        var testRecordsFinder = recordRepository.findAll();

        return List.of(new RecordDtoResponse("test message", Long.parseLong("1"), new Date()),
                new RecordDtoResponse("test message #2", Long.parseLong("2"), new Date()));
    }

    @Override
    public RecordDtoResponse findRecordByUserId(Long userId) {
        return new RecordDtoResponse(recordRepository.findByUserId(userId));
    }
}
