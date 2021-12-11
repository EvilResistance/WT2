package by.bsuir.Yaskevich.Service;

import by.bsuir.Yaskevich.Exception.ResourceException;
import by.bsuir.Yaskevich.Exception.ServiceException;
import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.Entity.Feature.Feature;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 * @author Yaskevich Anton
 */
public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param feature the feature
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Feature feature) throws ResourceException, ServiceException;

}
