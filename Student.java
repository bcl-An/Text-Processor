import sun.util.cldr.CLDRLocaleDataMetaInfo;

public class Student {
    String Na,Cl,Nu;

    public void setCN(String na,String cl,String nu) {
        Na = na;
        Cl = cl;
        Nu = nu;
    }
    public String toString(){
        return "姓名："+Na+" 班级："+ Cl+" 学号："+Nu+"\n";
    }
}
