package gojava.module8.homework;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T obj);

    void delete(T obj);

    void deleteAll(List<T> entities);

    void saveAll(List<T> entities);

    List<T> getList();

    void deleteById(long id);

    T get(long id);
}
