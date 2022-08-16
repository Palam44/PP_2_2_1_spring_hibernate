package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserDao {
   void add(User user);
   void add(Car car);

   List<User> listUsers();
   List<Car> listCars();
   User getUserByCar(Car car);
}
