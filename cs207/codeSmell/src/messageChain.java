class Person {
    Department _department;

    public Department getDepartment(){
        return _department;
    }

    public void setDepartment (Department arg){
        _department = arg;
    }


    //the delegate created to solve message chain
    public Person getManager(){
        return _department.getManager();
    }


}

class Department{
    private String _chargeCode;
    private Person _manager;

    public Department (Person manager){
        _manager = manager;
    }

    public Person getManager(){
        return _manager;
    }

}

class client{
    public static void main(String[] args){
        Person p = new Person();
        Person manager1 = p.getDepartment().getManager();// this is a message chain
        Person manager2 = p.getManager(); // this is the correct way to get the manager
    }
}




