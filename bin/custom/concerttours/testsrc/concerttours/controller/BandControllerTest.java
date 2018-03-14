package concerttours.controller;

import concerttours.facades.BandFacade;
import de.hybris.platform.catalog.CatalogVersionService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

public class BandControllerTest
{
    private static final String CATALOG_ID = "concertoursProductCatalog";
    private static final String CATALOG_VERSION_NAME = "Online";
    private CatalogVersionService catalogVersionService;
    private BandFacade bandFacade;
    private static Logger log = LoggerFactory.getLogger(BandControllerTest.class);

    @Test
    public String showBands()
    {
        log.info("BandController is start...");
        //final List<BandData> bands = bandFacade.getBands();
        //model.addAttribute("bands", bands);
        return "BandList";
    }
    /*@RequestMapping(value = "/bands/{bandId}")
    public String showBandDetails(@PathVariable final String bandId, final Model model) throws UnsupportedEncodingException
    {
        catalogVersionService.setSessionCatalogVersion(CATALOG_ID, CATALOG_VERSION_NAME);
        final String decodedBandId = URLDecoder.decode(bandId, "UTF-8");
        final BandData band = bandFacade.getBand(decodedBandId);
        model.addAttribute("band", band);
        return "BandDetails";
    }*/
    @Autowired
    public void setCatalogVersionService(final CatalogVersionService catalogVersionServiceService)
    {
        this.catalogVersionService = catalogVersionServiceService;
    }
    @Autowired
    public void setFacade(final BandFacade facade)
    {
        this.bandFacade = facade;
    }
}