package com.demo;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CrudOperations {

    protected static int count =1;
    protected static String name,age,salary,city,mob,email,gen;
    protected static Map<Integer, Employee> map = new HashMap<Integer, Employee>();


    public static Integer generateNewId(){

        return count++;
    }

    public static void add(Employee employee) throws CustomException {

        if (map.containsKey(employee.getId())){
            throw new CustomException("Id ["+employee.getId()+"] already exists");
        }
        employee.setId(generateNewId());
        map.put(employee.getId(),employee);
    }

    public static List<Employee> view() {

        Collection<Employee> collection = map.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(collection);

        System.out.println(list);
        return list;
    }

    public static Employee getEmployeeById(int id) throws CustomException {
        if (!map.containsKey(id)){
            throw new CustomException("Id ["+id+"] doesn't exists");
        }
        return map.get(id);
    }

    public static Employee updateEmployee(Employee employee) {

        if (!map.containsKey(employee.getId())){
            new CustomException();
        }
            map.put(employee.getId(), employee);
        return employee;
    }

    public static void deleteEmployee(int id) throws CustomException {

        if (!map.containsKey(id)){
            throw new CustomException("Id ["+id+"] doesn't exists");
        }
        map.remove(id);

        System.out.println("Record Deleted Successfully");
    }

}