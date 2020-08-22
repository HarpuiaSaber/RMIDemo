package daos;

import model.Equipment;

import java.util.List;

public interface EquipmentDao {
    public String add(Equipment equipment);

    public String update(Equipment equipment);

    public String delete(int id);

    public Equipment getById(int id);

    public List<Equipment> getAll();
}
