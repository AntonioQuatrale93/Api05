package it.develhope.Api05.Controllers;

import it.develhope.Api05.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public CarDTO getNewCar() {
        System.out.println("A new car has been created");
        return new CarDTO();
    }

    @PostMapping()
    public ResponseEntity getCarBody(@Valid @RequestBody CarDTO carDTO) {
        System.out.println(carDTO.toString());
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
