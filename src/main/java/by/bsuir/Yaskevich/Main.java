package by.bsuir.Yaskevich;

import by.bsuir.Yaskevich.Common.ApplianceNameConstant;
import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.Entity.Feature.Feature;
import by.bsuir.Yaskevich.Entity.Feature.SearchFeature;
import by.bsuir.Yaskevich.Exception.ResourceException;
import by.bsuir.Yaskevich.Exception.ServiceException;
import by.bsuir.Yaskevich.Service.ApplianceService;
import by.bsuir.Yaskevich.Service.ServiceFactory;

import java.util.List;

/**
 * The type by.bsuir.Yaskevich.Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ServiceException  the service exception
     * @throws ResourceException the resource exception
     */
    public static void main(String[] args) throws ServiceException, ResourceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Feature featureLaptop = new Feature(ApplianceNameConstant.LAPTOP);
        featureLaptop.add(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 100000.0);
        appliances = service.find(featureLaptop);
        PrinterAppliance.print(appliances);

        Feature featureTeapot = new Feature(ApplianceNameConstant.TEAPOT);
        featureTeapot.add(SearchFeature.Teapot.POWER.name(), 1000.0);
        featureTeapot.add(SearchFeature.Teapot.BULK.name(), 2.0);
        appliances = service.find(featureTeapot);
        PrinterAppliance.print(appliances);

        Feature featureSmartphone = new Feature(ApplianceNameConstant.FRIDGE);
        featureSmartphone.add(SearchFeature.Fridge.COLOR.name(), "BLACK");
        featureSmartphone.add(SearchFeature.Fridge.COMPANY.name(), "BOSCH");
        appliances = service.find(featureSmartphone);
        PrinterAppliance.print(appliances);
    }
}
