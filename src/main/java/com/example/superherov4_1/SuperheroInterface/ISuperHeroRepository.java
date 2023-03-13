package com.example.superherov4_1.SuperheroInterface;


import com.example.superherov4_1.DTO.SuperPowerDTO;
import com.example.superherov4_1.Model.SuperheroModel;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ISuperHeroRepository {
    default List<SuperheroModel> getAll() {
        return null;
    }
    default List<SuperheroModel> getSuperhero(String name) {
        return null;
    }
    default List<SuperheroModel> getSuperheroesFromCity(String cityName) {
        return null;
    }
    default List<SuperheroModel> getSuperheroPower(String name) {
        return null;
    }
    default List<SuperPowerDTO> countSuperheroPower(String name) {
        return null;
    }

}


