package Tarea.Productos.dao;

import Tarea.Productos.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {

}
