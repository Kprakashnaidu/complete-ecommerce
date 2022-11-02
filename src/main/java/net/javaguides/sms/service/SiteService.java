package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Site;

public interface SiteService {


Site saveSite(Site site);

Site getSiteById(Long id);

Site updateSite(Site site);

void deleteSiteById(Long id);

List<Site> getAllSites();
}

