package com.example.POCTaxNotification.services;


import com.example.POCTaxNotification.pojo.NotificationData;

import java.util.List;


public interface TaxNotificationService {

    public NotificationData retrieveNotificationDataById(long id);

    public List<NotificationData> retrieveNotificationAllData();

    public void acceptNotificationData(NotificationData notificationData);
}
