package com.example.POCTaxNotification.services;

import com.example.POCTaxNotification.pojo.NotificationData;
import com.example.POCTaxNotification.repository.TaxNotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaxNotificationServiceImpl implements TaxNotificationService{

    @Autowired
    TaxNotificationRepository notificationRepository;

    @Override
    public NotificationData retrieveNotificationDataById(long id) {
         return notificationRepository.findById(id).orElse(null);
    }

    @Override
    public List<NotificationData> retrieveNotificationAllData() {
      return notificationRepository.findAll();
    }

    @Override
    public void acceptNotificationData(NotificationData notificationData) {
        notificationRepository.save(notificationData);
    }
}
