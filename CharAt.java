package ChouXiang;

import java.util.Calendar;

public class CharAt {
    public static void main(String[] args) {
        char s="�й���".charAt(1);
        char c = "��λ�".charAt(2);//charAt ��ȡ�ַ����ڸ����������ַ�����
        System.out.println(c);
        System.out.println("abc".compareTo("abb")); //compareTo ���ַ�������ĸ��ʼ�Ƚϱ���ֵ��ֻҪ��Ϊ0�򷵻ؽ�� Ϊ0����������Ա�
        int result1 ="abcd".compareTo("abce");
        System.out.println(result1);
        boolean result2 = "helloWorld.java".contains("ld");
        System.out.println(result2); //contains �ж���������ַ�����ԭ�ַ������Ƿ����
        boolean result3 = "http��//www.baidu.com".contains(".java");
        System.out.println(result3);
        boolean result4 = "hello World.java".endsWith(".java");//endsWish �ж��ַ�������Ƿ����������ַ���
        System.out.println(result4);
        System.out.println("aBC".equalsIgnoreCase("aBc"));//equalsIgnoreCase �����ִ�Сд���ж��Ƿ����
        byte[] bytes = "abcde".getBytes();
        for (int i = 0; i < bytes.length;i++){ System.out.println(bytes[i]); }
        System.out.println("abcjavaC++pythonjavacC#".indexOf("++"));//indexOf �ҵ������ַ�����ԭ�ַ����е�һ�γ��ֵ�����λ��
        String s1 ="a";
        System.out.println(s1.isEmpty());//isEmpty �ж�ԭ�ַ����Ƿ��ǿ��ַ���
        System.out.println("abc".length());//length();�ж�ԭ�ַ����е��ַ�������
        // length������ length()�Ƿ���
        System.out.println("".length());
        System.out.println("abcacbacbacbacbacbacabcabacbacabacbacbacbacbacb".lastIndexOf("cb"));
        //lastIndexOf ָ���������ַ������һ�γ��ֵ�����
        System.out.println("abcdefabcdefabcdefabcde".replace("def", "abc"));
        //replace ͨ��newchar�ķ�ʽ �޸�ԭ�ַ��������е�ָ��oldchar�ַ�
       String []a= "abcdefabcdefabcdefabcde".split("d");
        for (String element: a) { System.out.print(element+" "); }//split ���� ʹ�ø������ַ������ָ�����ָ�Դ�ַ���
        System.out.println();
        boolean b = "avbasfzxcerq".startsWith("a");//startsWish �ж��ַ����Ƿ��Ը����ַ�����β
        System.out.println(b);
        System.out.println("http://www.baidu.com".substring(7,10));
        char[] chas = "���Ǵ�ɵ��".toCharArray();  //toCharArray ���ַ�����Ϊһ�������ַ�
        for (char element : chas) {System.out.print(element); }
        System.out.println("        helloWorld      ".trim());//trim ȥ�����ߵĿո�
        String s2= String.valueOf(true);  //valueOf  ��������κ����͵�ת����ǰ���������ͣ�Ȼ�����
        System.out.println(s2);
        StringBuilder s3= new StringBuilder(); //��StringBuilder new��һ������Ȼ����������������������Ҫ���ӵ����ݣ��������κ����ݣ�����󶼻����ַ���
        s3.append("wocao"+"wodiu");
        System.out.println(s3);
        new Calendar
    }
}

