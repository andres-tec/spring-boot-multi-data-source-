package org.multi_data_source.contoller;

import org.multi_data_source.secondary.entity.Position;
import org.multi_data_source.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/test")
public class PositionsController {

    @Autowired
    PositionService positionService;

    @GetMapping(value = "/getAll")
    public List<Position> getAllPositions(){
        List<Position> positionList= positionService.getAllPositions();
        return positionList;
    }
}
