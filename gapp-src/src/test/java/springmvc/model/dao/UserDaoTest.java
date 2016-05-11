package springmvc.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@Test(groups = "UserDaoTest")
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserDaoTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    UserDao userDao;

    @Test
    public void getUser()
    {
    	
    	for(int i = 0; i > userDao.getUsers().size();i++){
    		
    		
    		assert userDao.getUsers().get(i).getEmail().equalsIgnoreCase("student1@localhost.localdomain");

    		if(userDao.getUsers().get(i).getUsertype().getApplication().size()==1){
        		assert userDao.getUsers().get(i).getUsertype().getApplication()!= null;

    		}
       		assert userDao.getUsers().get(i).getUsertype().getUsers().equals("Student");
       		
//    		System.out.println(userDao.getUsers().get(i).getEmail());
    		System.out.println(userDao.getUsers().get(3).getUsertype().getApplication());
    		
    	}
        //assert userDao.getUser( 1 ).getEmail().equalsIgnoreCase( "admin@localhost.localdomain" );
    }

    
}