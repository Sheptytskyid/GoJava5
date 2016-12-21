package gojava.module8.homework;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    protected List<T> dataBase = new LinkedList<>();

    @Override
    public T save(T obj) {
        dataBase.add(obj);
        return obj;
    }

    @Override
    public void delete(T obj) {
        dataBase.remove(obj);
    }

    @Override
    public void deleteAll(List<T> entities) {
        dataBase.removeAll(entities);
    }

    @Override
    public void saveAll(List<T> entities) {
        dataBase.addAll(entities);
    }

    @Override
    public List<T> getList() {
        return dataBase;
    }

}
