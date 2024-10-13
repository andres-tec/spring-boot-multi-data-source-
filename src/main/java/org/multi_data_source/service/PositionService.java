package org.multi_data_source.service;

import org.multi_data_source.secondary.IPositionRepository;
import org.multi_data_source.secondary.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    @Autowired
    IPositionRepository iPositionRepository;


    public List<Position> getAllPositions(){
        return iPositionRepository.findAll();
    }
}
