package com.example.demo.cities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesController {

    @GetMapping
    public String ThisIsDefaultMethodLocalhost(){
        //http://localhost:8080
        //just a default method that returns Localhost if application is run on client without any parameter.
        return "This is Localhost";
    }


    @GetMapping("/city/{cityName}")
    public String getProvince( @PathVariable("cityName") String NameofCity){
        //http://localhost:8080/city/Nairobi
        //an API method that gets input as client city and returns the province it belongs
        //PathVariable String must be the same as the GetMapping Variable i.e cityName must be passed as PathVariable.
        //Making a parameterized Get request with @PathVariable notation
        if (NameofCity.equals("Nairobi")){ return "Nairobi City Region";}
        if (NameofCity.equals("Nyeri")){ return "Central Region";}
        if (NameofCity.equals("Kisumu")){ return "Nyanza";}
        if (NameofCity.equals("Mombasa")){ return "Nairobi";}
//return NameofCity;
        else return "City does not exist";

    }

    @GetMapping("/city/")
    public String getCounty(@RequestParam(name = "cityName") String cityName){
        //rest api to handle query parameters
        // http://localhost:8080/city/?cityName=Nairobi
        // use the @RequestParam in the method param to handle query parameters



  //  return "County not found for this city";
        return cityName;
    }

}
