package com.mustache.bbs4.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HospitalReviewCreateRequest {
    private Integer hospitalId;
    private String title;
    private String content;
    private String userName;
}
