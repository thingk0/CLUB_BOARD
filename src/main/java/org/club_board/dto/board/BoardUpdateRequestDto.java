package org.club_board.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.club_board.entity.Board;

@Data
@Builder
public class BoardUpdateRequestDto {

    private String title;
    private String content;

    public BoardUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public static BoardUpdateRequestDto toDto(Board board) {
        return BoardUpdateRequestDto.builder()
                .title(board.getTitle())
                .content(board.getContent())
                .build();
    }
}