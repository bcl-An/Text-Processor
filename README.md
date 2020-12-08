# 模拟学生作业处理
### 计191 陈伟然 2019310172
# 实验五
## 实验目的
掌握字符串String及其方法的使<br>
掌握文件的读取/写入方法<br>
掌握异常处理结构<br>
## 要求
### 业务说明
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。<br>
文件A包括两部分内容：<br>
一、是学生的基本信息；<br>
二、是学生处理后的作业信息，该作业的业务逻辑内容是：<br>
>利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：<br>
>>1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”；<br>
>>2.允许提供输入参数，统计古诗中某个字或词出现的次数；<br>
>>3.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A；<br>
>>4.考虑操作中可能出现的异常，在程序中设计异常处理程序。
### 实验要求
1.设计学生类（可利用之前的）；<br>
2.采用交互式方式实例化某学生；<br>
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。
## 设计
### 对象示例
学生（姓名、班级、学号）
### 流程
1、利用scanner实现交互输入，获取学生基本信息；<br>
2、利用字符输入流读取B.txt内容，同时利用String和StringBuffer处理文本；<br>
3、利用字符输出流将学生基本信息及处理好的文本写入到A.txt（若根目录下无A。txt则自动新建）；<br>
4、统计args[0]出现的次数。<br>
## 核心代码
```JAVA
//从B.txt读取文本
FileReader in = null;
StringBuffer s = new StringBuffer();
try {
    in = new FileReader("B.txt");
    char[] chars = new char[7];
    for (int i = 1;in.read(chars) !=-1&&i<=34;i++){
    //处理文本
        String str = new String(chars);
        if (i%2==1){
            s.append(str+",");
        }else if (i%2==0){
            s.append(str+"。"+"\n");
        }
    }
    } catch (IOException e) {  //异常处理
        e.printStackTrace(); 
    } finally {
        if (in != null) {
            try {
                in.close();  //关闭流
            } catch (IOException e) {  //异常处理
                e.printStackTrace();
            }
    }
}
```
## 运行截图
![列表yxjg.png图片](https://github.com/bcl-An/Text-Processor/blob/main/yxjg.png "运行结果") 
![列表yxjg.png图片](https://github.com/bcl-An/Text-Processor/blob/main/scwj.png "输出文件") 
## 感想
通过实验五，我基本掌握了利用IO流读取文件及写文件的方法，并重温了String及StringBuffer的相关方法。同时，又一次使用交互输入使得我对scanner愈发熟悉。
