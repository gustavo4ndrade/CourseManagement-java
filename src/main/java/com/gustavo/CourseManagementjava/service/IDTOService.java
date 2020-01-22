package com.gustavo.CourseManagementjava.service;

import java.util.List;

public interface IDTOService<DOMAIN, DTO> {
    DTO save(DTO dto);
    DTO findOneById(Long id);
    //List<DTO> saveAllBatches(Iterable<DTO> items);
    //List<DTO> findAll();
}
