package com.swarrenb.springcourse.repository;

import com.swarrenb.springcourse.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

    Record findByUserId(Long userId);
}
