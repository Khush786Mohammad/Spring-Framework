package com.khush.notes_api.mapper;

import com.khush.notes_api.dto.NotesResponseDTO;
import com.khush.notes_api.entity.Notes;

public class NotesMapper {
    public static NotesResponseDTO toDTO(Notes obj) {
        NotesResponseDTO dto = new NotesResponseDTO();
        dto.setId(obj.getId());
        dto.setTitle(obj.getTitle());
        dto.setContent(obj.getContent());
        dto.setCrt_dt(obj.getCrt_dt());
        dto.setLst_updt_dt(obj.getLst_updt_dt());
        return dto;
    }
}
