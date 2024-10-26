package com.myapp.spring.mapper;

import java.util.List;

import org.mapstruct.Mapping;

public interface GenericMapper<D, E> {

	    @Mapping(target = "createdOn", source = "createdOn", ignore = true)
	    @Mapping(target = "lastModifiedOn", source = "lastModifiedOn", ignore = true)
	    @Mapping(target = "enabled", source = "enabled", ignore = true)
	    E dtoToEntity(D dto);

	    D entityToDto(E entity);

	    @Mapping(target = "createdOn", source = "createdOn", ignore = true)
	    @Mapping(target = "lastModifiedOn", source = "lastModifiedOn", ignore = true)
	    @Mapping(target = "enabled", source = "enabled", ignore = true)
	    List<E> dtoToEntity(Iterable<D> dtos);

	    List<D> entityToDto (Iterable<E> entities);

}
