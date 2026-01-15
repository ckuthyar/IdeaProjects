package com.sangamone.r1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
class ApnaIndia {
    @GetMapping("/IN/getStates")
    fun getStates():List<String>{
        val f1=File("countries/IN/IN_States.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getDistricts")
    fun getDistricts():List<String>{
        val f1=File("countries/IN/IN_districts.txt")
        val list1=f1.readLines()
        return list1



    }
    @GetMapping("/IN/getTaluks")
    fun getTaluks():List<String>{
        val f1=File("countries/IN/IN_taluks.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getPincodes")
    fun getPincodes():List<String>{
        val f1=File("countries/IN/IN_pincodes.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getTrains")
    fun getTrains():List<String>{
        val f1=File("countries/IN/IN_trains.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getStations")
    fun getStations():List<String>{
        val f1=File("countries/IN/IN_stations.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getSchools")
    fun getSchools():List<String>{
        val f1=File("countries/IN/IN_schools.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getColleges")
    fun getColleges():List<String>{
        val f1=File("countries/IN/IN_colleges.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getHospitals")
    fun getHospitals():List<String>{
        val f1=File("countries/IN/IN_hospitals.txt")
        val list1=f1.readLines()
        return list1
    }


    @GetMapping("/IN/getRivers")
    fun getRivers():List<String>{
        val f1=File("countries/IN/IN_rivers.txt")
        val list1=f1.readLines()
        return list1
    }





}