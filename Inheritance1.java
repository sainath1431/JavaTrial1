class Person{
    
    private String name ;
    private int age;
    private String phone ;
    private String adhar;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setAdhar(String adhar){
        this.adhar=adhar;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAdhar()
    {
        return adhar;
    }
    

}

class Student extends Person
{

}



public class Inheritance1{
    
    public static void main(String [] args)
    {

    Student st = new Student();

    st.setName("sainath");
    st.setAge(18);
    st.setPhone("8766775336");
    st.setAdhar("8516 5726 5397");

    System.out.println(st.getName());
    System.out.println(st.getAge());
    System.out.println(st.getPhone());
    System.out.println(st.getAdhar());

    st.setName("Gurav");
    st.setAge(19);
    st.setPhone("8767211056");
    st.setAdhar("8516 5728 3397");

 
    
    }






}