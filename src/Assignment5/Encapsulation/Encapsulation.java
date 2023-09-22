package Assignment5.Encapsulation;


class Encapsulation {
    private int empid;
    public void setEmpid(int eid){
        empid = eid;
    }

    public int getEmpid(){
        return empid;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setEmpid(1000480);
        System.out.println(encapsulation.getEmpid());
    }
}
