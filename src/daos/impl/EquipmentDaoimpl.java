package daos.impl;

import daos.Connection;
import daos.EquipmentDao;
import model.Equipment;

import java.util.List;

public class EquipmentDaoimpl extends Connection implements EquipmentDao {
    @Override
    public String add(Equipment equipment) {
        return null;
    }

    @Override
    public String update(Equipment equipment) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public Equipment getById(int id) {
        return new Equipment();
    }

    @Override
    public List<Equipment> getAll() {
        return null;
    }
}
