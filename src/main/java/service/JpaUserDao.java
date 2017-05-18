package service;

import domain.User;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("bankCustomerDao")
public class JpaUserDao extends GenericDaoJpa<User> implements UserDao {

    
    public JpaUserDao() {
        super(User.class);
    }


//    @Override
//    @Transactional(readOnly = true)
//    public List<BankCustomer> getBankCustomerByBalance(double balance)
//    {
//        TypedQuery<BankCustomer> queryCustomer = em.createNamedQuery("Guest.getGuestByBalance",BankCustomer.class);
//        queryCustomer.setParameter("balance", balance);
//        return queryCustomer.getResultList();
//    }
}
