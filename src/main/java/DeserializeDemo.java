import java.io.*;
public class DeserializeDemo {
    public static void main(String [] args)
    {
        Employee e = null; //e为null 对e进行赋值
        try
        {
            FileInputStream fileIn = new FileInputStream("D:\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();  //读取对象 转换为对象e
            in.close(); //对象流关闭
            fileIn.close(); //IO流关闭
        }catch(IOException i)
        {

            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println(",,,,,");
        System.out.println("2222222");
        System.out.println("333333");
        System.out.println("44444");
        System.out.println("5");
       
        System.out.println("7");
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);  //输出对象的属性信息 对象的属性信息保存在内存中
    }
}
