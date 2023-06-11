package org.zerock.board.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;

    private String title;
    private String content;

    private String writerEmail;

    private String writerName;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    private int replyCount;
}