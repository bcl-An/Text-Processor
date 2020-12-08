import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名： 班级： 学号：");
        stu.setCN(sc.next(), sc.next(), sc.next());//输入学生姓名、班级及学号
        //读取B.txt并处理文本
        FileReader in = null;
        StringBuffer s = new StringBuffer();
        try {
            in = new FileReader("B.txt");
            char[] chars = new char[7];
            for (int i = 1;in.read(chars) !=-1&&i<=34;i++){
                String str = new String(chars);
                if (i%2==1){
                    s.append(str+",");
                }else if (i%2==0){
                    s.append(str+"。"+"\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //向文件A.txt中写入学生基本信息及处理好的文本
        FileWriter out = null;
        try {
            out = new FileWriter("A.txt");
            out.write(String.valueOf(stu)+s);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //统计古诗中某个字或词出现的次数
        String s1 = new String(s);
        int i = 0;
        int count = 0;
        while(s1.indexOf(args[0],i)>=0){
            count++;
            i=s1.indexOf(args[0],i)+args[0].length();
        }
        System.out.println(args[0]+"出现次数为"+count+"次。");
    }
}
