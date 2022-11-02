package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Site;

public interface SiteRepository extends JpaRepository<Site, Long>{

}