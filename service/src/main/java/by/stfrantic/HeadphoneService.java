package by.stfrantic;

import by.stfrantic.entities.Headphone;

public interface HeadphoneService {
    Headphone save(Headphone headphone);
    void update(Headphone headphone);
    Headphone read(Long id);
}
