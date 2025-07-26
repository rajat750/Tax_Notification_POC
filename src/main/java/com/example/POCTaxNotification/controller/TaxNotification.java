package com.example.POCTaxNotification.controller;

import com.example.POCTaxNotification.pojo.NotificationData;
import com.example.POCTaxNotification.services.TaxNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/taxNotification/")
public class TaxNotification {

    @Autowired
    TaxNotificationService taxNotificationService;

    @PostMapping("notification")
    public void acceptNotificationData(@RequestBody NotificationData dataDto){
       taxNotificationService.acceptNotificationData(dataDto);
    }

    @GetMapping("notification/{id}")
    public NotificationData retrieveNotificationData(@PathVariable long id){
       return taxNotificationService.retrieveNotificationDataById(id);
    }

    @GetMapping("retrivedata")
    public List<NotificationData> retrieveAllNotificationData(){
        return taxNotificationService.retrieveNotificationAllData();
    }


}
