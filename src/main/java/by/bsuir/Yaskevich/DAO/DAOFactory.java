package by.bsuir.Yaskevich.DAO;

import by.bsuir.Yaskevich.DAO.impl.ApplianceDAOImpl;

/**
 * DAOFactory class.
 * @author Yaskevich Anton
 */
public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * private constructor
     */
    private DAOFactory() {
    }

    /**
     * Gets appliance dao.
     *
     * @return the appliance dao
     */
    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
