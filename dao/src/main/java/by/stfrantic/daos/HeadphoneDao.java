package by.stfrantic.daos;

import by.stfrantic.entities.Headphone;

public interface HeadphoneDao {
    Headphone save(Headphone headphone);
    void update(Headphone headphone);
    void delete(Headphone headphone);
    Headphone read(Long id);
}
