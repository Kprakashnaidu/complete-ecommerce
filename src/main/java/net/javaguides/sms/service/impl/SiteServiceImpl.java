
package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Site;
import net.javaguides.sms.repository.SiteRepository;
import net.javaguides.sms.service.SiteService;



@Service
public class SiteServiceImpl implements SiteService{

private SiteRepository siteRepository;

public SiteServiceImpl(SiteRepository siteRepository) {
super();
this.siteRepository = siteRepository;
}

@Override
public List<Site> getAllSites() {
return siteRepository.findAll();
}


@Override
public Site saveSite(Site site) {
return siteRepository.save(site);
}



@Override
public Site getSiteById(Long id) {
return siteRepository.findById(id).get();
}

@Override
public Site updateSite(Site site) {
return siteRepository.save(site);
}

@Override
public void deleteSiteById(Long id) {
siteRepository.deleteById(id);
}

}