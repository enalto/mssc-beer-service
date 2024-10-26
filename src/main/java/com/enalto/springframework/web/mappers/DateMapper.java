package com.enalto.springframework.web.mappers;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

    public OffsetDateTime toOffsetDateTime(Timestamp timestamp) {
        LocalDateTime localDateTime = timestamp.toLocalDateTime();

        return OffsetDateTime.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(),
                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(),
                ZoneOffset.UTC);
    }

    public Timestamp toTimestamp(OffsetDateTime offsetDateTime) {
        LocalDateTime localDateTime = offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();

        return Timestamp.valueOf(localDateTime);
    }
}
