package by.bsuir.Yaskevich.DAO;

import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.Entity.Feature.Feature;
import by.bsuir.Yaskevich.Exception.ResourceException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 * @author Yaskevich Anton
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances by given criteria.
     *
     * @param feature {@link Feature}
     * @return list of appliance
     * @throws ResourceException exception
     */
    List<Appliance> find(Feature feature) throws ResourceException;
}
