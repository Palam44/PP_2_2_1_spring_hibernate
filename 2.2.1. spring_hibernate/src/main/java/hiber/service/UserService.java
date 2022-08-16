package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void add(User user);
    void add(Car car);

    List<User> listUsers();
    List<Car> listCars();

    User getUserByCar(Car car);
}
