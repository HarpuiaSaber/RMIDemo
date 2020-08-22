package server;

import controller.EquipmentService;
import daos.EquipmentDao;
import daos.impl.EquipmentDaoimpl;
import model.Equipment;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements EquipmentService {

    private EquipmentDao equipmentDao;

    public Server() throws RemoteException {
        super();
        equipmentDao = new EquipmentDaoimpl();
    }

    @Override
    public String add(Equipment equipment) throws RemoteException {
        return "add dc";
    }

    @Override
    public String update(Equipment equipment) throws RemoteException {
        return "sua dc";
    }

    @Override
    public String delete(int id) throws RemoteException {
        return "xoa dc";
    }

    @Override
    public Equipment getById(int id) throws RemoteException {
        return new Equipment();
    }

    @Override
    public Equipment[] getAll() throws RemoteException {
        return new Equipment[5];
    }
}
