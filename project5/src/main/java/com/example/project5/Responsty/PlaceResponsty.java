package com.example.project5.Responsty;

import com.example.project5.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceResponsty extends JpaRepository<Place, Integer> {

    Place findAllById(Integer id);
//    Place getPlaceByName(String name);
//    Place getPlaceByCity(String city);
//    Place getPlaceByRole(String role);
    @Query("select Place from  Place Place where Place.category='writer'")
    List<Place> findPlaceByByCategory(String hoppy);

    Place findPlaceById(Integer placeId);
}
