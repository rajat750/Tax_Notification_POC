package com.example.POCTaxNotification.repository;

import com.example.POCTaxNotification.pojo.NotificationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface TaxNotificationRepository extends JpaRepository<NotificationData,Long> {
}
