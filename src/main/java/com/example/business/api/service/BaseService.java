package com.example.business.api.service;

public interface BaseService<T, S> {
    void mergeDTO2Entity(S dto, T entity, String mappingName);
    S convert2DTO(T entity);
    T convert2Entity(S dto);
    Iterable<S> convertIterable2DTO(Iterable<T> iterableEntities);
    Iterable<T> convertIterable2Entity(Iterable<S> iterableDTOs);
}
