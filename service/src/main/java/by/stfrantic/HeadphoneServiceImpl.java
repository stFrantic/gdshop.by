package by.stfrantic;

import by.stfrantic.daos.HeadphoneDao;
import by.stfrantic.daos.HeadphoneDaoImpl;
import by.stfrantic.entities.Headphone;

public class HeadphoneServiceImpl implements HeadphoneService {

    public Headphone save(Headphone headphone) {
        HeadphoneDao headphoneDao = (HeadphoneDao) new HeadphoneDaoImpl();
        return headphoneDao.save(headphone);
    }

    public void update(Headphone headphone) {
        HeadphoneDao headphoneDao = (HeadphoneDao) new HeadphoneDaoImpl();
        headphoneDao.update(headphone);

    }

    public Headphone read(Long id) {
        HeadphoneDao headphoneDao = (HeadphoneDao) new HeadphoneDaoImpl();
        return headphoneDao.read(id);
    }
}
