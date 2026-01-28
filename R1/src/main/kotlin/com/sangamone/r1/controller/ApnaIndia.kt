package com.sangamone.r1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.File

@RestController
class ApnaIndia {
    @GetMapping("/IN/getStates")
    fun getStates():List<String>{
        val f1=File("countries/IN/IN_states.txt")
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
    @GetMapping("/IN/getFestivals")
    fun getFestivals():List<String>{
        val f1=File("countries/IN/IN_festivals.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getRoads")
    fun getRoads():List<String>{
        val f1=File("countries/IN/IN_roads.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getLakes")
    fun getLakes():List<String>{
        val f1=File("countries/IN/IN_lakes.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getCompanies")
    fun getCompanies():List<String>{
        val f1=File("countries/IN/IN_companies.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getNGOs")
    fun getNGOs():List<String>{
        val f1=File("countries/IN/IN_ngos.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getTemples")
    fun getTemples():List<String>{
        val f1=File("countries/IN/IN_temples.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getBanks")
    fun getBanks():List<String>{
        val f1=File("countries/IN/IN_banks.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getInsurers")
    fun getInsurers():List<String>{
        val f1=File("countries/IN/IN_insurers.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getMosques")
    fun getMosques():List<String>{
        val f1=File("countries/IN/IN_mosques.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getChurches")
    fun getChurches():List<String>{
        val f1=File("countries/IN/IN_churches.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getGurudwaras")
    fun getGurudwaras():List<String>{
        val f1=File("countries/IN/IN_gurudwaras.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getPSUs")
    fun getPSUs():List<String>{
        val f1=File("countries/IN/IN_psus.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getPlaces")
    fun getPlaces():List<String>{
        val f1=File("countries/IN/IN_places.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getLeaders")
    fun getLeaders():List<String>{
        val f1=File("countries/IN/IN_leaders.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getScientists")
    fun getScientists():List<String>{
        val f1=File("countries/IN/IN_scientists.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getHistory")
    fun getHistory():List<String>{
        val f1=File("countries/IN/IN_history.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getLanguages")
    fun getLanguages():List<String>{
        val f1=File("countries/IN/IN_languages.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getCastes")
    fun getCastes():List<String>{
        val f1=File("countries/IN/IN_castes.txt")
        val list1=f1.readLines()
        return list1
    }
    @GetMapping("/IN/getAirports")
    fun getAirports():List<String>{
        val f1=File("countries/IN/IN_airports.txt")
        val list1=f1.readLines()
        return list1
    }





}