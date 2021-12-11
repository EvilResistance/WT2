package by.bsuir.Yaskevich.Service.impl;

import by.bsuir.Yaskevich.Exception.ResourceException;
import by.bsuir.Yaskevich.Exception.ServiceException;
import by.bsuir.Yaskevich.Service.Validator.Validator;
import by.bsuir.Yaskevich.DAO.ExceptionMessageConstant;
import by.bsuir.Yaskevich.DAO.ApplianceDAO;
import by.bsuir.Yaskevich.DAO.DAOFactory;
import by.bsuir.Yaskevich.Entity.Appliance;
import by.bsuir.Yaskevich.Entity.Feature.Feature;
import by.bsuir.Yaskevich.Service.ApplianceService;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 * @author Yaskevich Anton
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param feature the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Feature feature) throws ServiceException {
        if (!Validator.isCriteriaValid(feature)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(feature);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
