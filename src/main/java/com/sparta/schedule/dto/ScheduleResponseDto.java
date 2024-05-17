package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String description;
    private String manager;
    private Long password;
    private Long date;

    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.description = schedule.getDescription();
        this.manager = schedule.getManager();
        this.password = schedule.getPassword();
        this.date = schedule.getDate();
    }
}
