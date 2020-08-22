package controller;

import model.Equipment;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EquipmentService extends Remote {
    public String add(Equipment equipment) throws RemoteException;

    public String update(Equipment equipment) throws RemoteException;

    public String delete(int id) throws RemoteException;

    public Equipment getById(int id) throws RemoteException;

    public Equipment[] getAll() throws RemoteException;
}
