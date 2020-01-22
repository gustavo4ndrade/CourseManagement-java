package com.gustavo.CourseManagementjava.service;

import com.gustavo.CourseManagementjava.dto.IDTO;
import com.gustavo.CourseManagementjava.repository.IRepository;
import com.gustavo.CourseManagementjava.rest.mapper.IDTOMapper;
import com.gustavo.CourseManagementjava.service.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Transactional
public abstract class AbstractDTOServiceAdapter<DOMAIN, DTO extends IDTO> implements IDTOService<DOMAIN, DTO>{
    @Autowired(required = false)
    IRepository<DOMAIN> repository;

    @Inject
    IDTOMapper<DOMAIN, DTO> mapper;

    public AbstractDTOServiceAdapter(){}

    @Override
    public DTO save(DTO dto) {
        DOMAIN domain = mapper.toDomain(dto);
        domain = repository.save(domain);
        dto =  mapEntityToDTO(domain);

        return dto;
    }

    @Override
    public DTO findOneById(Long id) {
        try {
            DOMAIN domain = repository.getOne(id);
            return mapEntityToDTO(domain);
        }catch (EntityNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }

    public DTO mapEntityToDTO(DOMAIN domain){
        DTO dto = mapper.toDTO(domain);
        setRelatedEntities(dto);
        return dto;
    }

    public DTO setRelatedEntities(DTO dto){
        return null;
    }

    public List<DTO> setRelatedEntities(List<DTO> dto){
        return null;
    }
}
