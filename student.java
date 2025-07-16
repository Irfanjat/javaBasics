public class student{
    private String name;
    private String age;
    private int rollNumber;

    public student(String name,String age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }
    public void display(){
        System.out.println("The name of student is:"+name);
        System.out.println("The age of this student is:"+age);
        System.out.println("The roll Nimber is:"+rollNumber);

    }
    public static void main(String[]args){
        student st=new student("Irfan", "22", 24);
        st.display();

        
    }
}