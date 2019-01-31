package app.service;

import java.util.List;

/**
 * Created by Black on 12.02.2018.
 */
public interface Service<T, V> {
    void save(V item);
    T get(long id);
    List<T> list();
    void update(long id, V item);
    void delete(long id);
}
