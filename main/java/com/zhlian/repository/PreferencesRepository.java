package com.zhlian.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zhlian.dto.HomeDto;


// one repository per entity (doing CRUD operations on the entity type)
// requires <Type, Type of the primary key>
public interface PreferencesRepository extends JpaRepository<HomeDto, Long> {

	// @Query("select dto from HomeDto dto where userId = :userId")
	// Or we can do native query
	// @Query(value="select * from mars_api_preferences where user_id = :userId", nativeQuery=true)
	
	// Custom query
	// In this case we do not need custom query because we go by findBy... built in convention
	HomeDto findByUserId(Long userId);
}
