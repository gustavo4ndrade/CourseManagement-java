package com.gustavo.CourseManagementjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IRepository<DOMAIN> extends JpaRepository<DOMAIN, Long> {
    <S extends DOMAIN> S save(S entity);
}
