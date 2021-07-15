package ChouXiang;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
/*
2.	 ���һ���⳵ϵͳ,������γ��Ϳ���
     ��γ��������㷽����   <=7��   �����*����
                           >7��    ����7�첿�ִ�7��
     �⿨���������㷽��:    <=10��  ������*50*����
                           >10��   ����10�찲���ִ�6��
     ���ܰ���
> 1.�³����
> 2.�⳵(�������)
> 3.����
 */
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
public class Rental {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Function function =null;
        do { CarSystem();
          Scanner s = new Scanner(System.in);
          int num = s.nextInt();
          switch (num){
              case 1:
                  function = new Function1();
                  function.ruKu();
                  break;
              case 2:
                  function = new Function2();
                  function.calculationRent();
                  break;
              case 3:
                  function = new Function3();
                  function.returnCar();
                  break;
              case 4:
                  System.out.println("�γ�����Ϊ��"+function.getCarNum());
                  System.out.println("��������Ϊ��"+function.getTruckNum());
                  break;
             }
        }while(true);
    }
    static void CarSystem(){
        ArrayList<String> carSystem=new ArrayList<>();
        Collections.addAll(carSystem,"========================="+"\n"+"��ӭ�����⳵ϵͳ��"+"\n"+"��ѡ���ܣ�"+"\n"+"1.�³����\n"+"2.�⳵(�������)"
        +"\n3.����"+"\n4.��ѯ�ܳ���");
        for (String element :carSystem) {
            System.out.println(element);
        }
    }
}
class Function{
    private int carNum=10;
    private int truckNum=10;
    private int carRent=60;
    public Function(){

    }
    public Function(int carNum, int truckNum, int carRent) {
        this.carNum = carNum;
        this.truckNum = truckNum;
        this.carRent = carRent;
    }
    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getTruckNum() { return truckNum; }

    public void setTruckNum(int truckNum) {
        this.truckNum = truckNum;
    }

    public int getCarRent() {
        return carRent;
    }

    public void setCarRent(int carRent) {
        this.carRent = carRent;
    }

    void ruKu()throws  InterruptedException, ExecutionException{}

    void calculationRent() throws InterruptedException {
    }
    void returnCar() throws InterruptedException {
    }
}
class Function1 extends Function{
    public Function1() {
        super();
    }
    void ruKu()throws  InterruptedException, ExecutionException {
        System.out.println("������Ҫ�����³����ͣ�(1.�γ�  2.����)");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("���������Ľγ�����");
                int car = s.nextInt();
                setCarNum(getCarNum()+car);
                System.out.println("��ӳɹ��������ڲ�ѯ���г���,���Ժ󡣡���");
                Thread.sleep(1000);
                System.out.println("���нγ���"+getCarNum());
                System.out.println("���п�����"+getTruckNum());
                break;
            case 2:
                System.out.println("���������Ŀ�������");
                int Truck = s.nextInt();
                setTruckNum(getTruckNum()+Truck);
                System.out.println("��ӳɹ��������ڲ�ѯ���г���,���Ժ󡣡���");
                Thread.sleep(1000);
                System.out.println("���нγ���"+getCarNum());
                System.out.println("���п�����"+getTruckNum());
                break;
            }
        }
    }

    class Function2 extends Function{
        public Function2() {
            super();
        }
        void calculationRent() throws InterruptedException {
            System.out.println("��������Ҫ�⳵������(1.�γ�  2.���� )");
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            switch (num){
                case 1:
                    System.out.println("���˽�γ����ļ��㷽ʽ��"+"\n"+"�������<=7�� ÿ��60Ԫ���������>7��  ����7�첿�ִ�7��");
                    System.out.println("��ȷ��(Yes/No):");
                    String  a = s.next();
                    int e=0;
                    if (a.equalsIgnoreCase("yes")){
                        System.out.println("��������Ҫ�γ���������"+"ʣ��γ�"+"("+getCarNum()+")");
                        int b = s.nextInt();
                        if (b>super.getCarNum()){
                            System.out.println("������󣬷���������");
                            return;
                        }
                        System.out.println("��������Ҫ���������");
                        int c = s.nextInt();
                        if (c>7){
                            e=(int)((c-7)*60*0.7);
                        }
                        System.out.println("���ڼ�����Ҫ֧����������Ժ󡣡���");
                        for (int i = 0; i <3 ; i++) {
                            System.out.print("��"+"  ");
                            Thread.sleep(500);
                        }
                        System.out.println("����Ҫ֧�����"+((60*b*c)+e)+"��Ԫ����������Ҫ֧���Ľ�����ɽ��ף�");
                        int d = s.nextInt();
                        if (d==((60*b*c)+e)){
                            System.out.println("֧���ɹ����ڴ������´ι��٣�����");
                            super.setCarNum(super.getCarNum()-b);
                            Thread.sleep(500);
                            System.out.println("���ڷ��������档����");
                            Thread.sleep(1000);
                        }else {
                            System.out.println("֧��ʧ�ܣ����ڷ��������档����");
                            Thread.sleep(1000);
                            return;
                        }
                    }else if(a.equalsIgnoreCase("no")){
                        System.out.println("���ڷ���������");
                        return;
                    }else {
                        if ((a.equalsIgnoreCase("yes")!=true)&&(a.equalsIgnoreCase("no")!=true)){
                            System.out.println("�������ݲ��Ϸ������ڷ���������");
                            return;
                        }
                    }
                    break;
                case 2:
                    System.out.println("���˽⿨�����ļ��㷽ʽ��"+"\n"+"(ÿ����������1.5��) ����<=10��  50*����*������ >10�� ����10�첿�ִ�6��");
                    System.out.println("��ȷ��(Yes/No):");
                    String  truck1 = s.next();
                    int f=0;
                    if (truck1.equalsIgnoreCase("yes")){
                        System.out.println("��������Ҫ������������(��濨����"+super.getTruckNum()+"��)");
                        int b = s.nextInt();
                        if (b>getTruckNum()){
                            System.out.println("�������벻��ȷ�����ڷ���������");
                            return;
                        }
                        System.out.println("��������Ҫ���������");
                        int c = s.nextInt();
                        if (c>7){
                            f=(int)(50*1.5*(c-10)*b*0.6);
                        }
                        System.out.println("���ڼ�����Ҫ֧����������Ժ󡣡���");
                        for (int i = 0; i <3 ; i++) {
                            System.out.print("��"+"  ");
                            Thread.sleep(500);
                        }
                        System.out.println("����Ҫ֧�����"+((50*1.5*c*b)+f)+"��Ԫ����������Ҫ֧���Ľ�����ɽ��ף�");
                        int d = s.nextInt();
                        if (d==((50*1.5*c*b)+f)){
                            System.out.println("֧���ɹ����ڴ������´ι��٣�����");
                            Thread.sleep(500);
                            super.setTruckNum(super.getTruckNum()-b);
                            System.out.println("���ڷ��������档����");
                            Thread.sleep(1000);
                        }else {
                            System.out.println("֧��ʧ�ܣ����ڷ��������档����");
                            Thread.sleep(1000);
                        }
                    }else if(truck1.equalsIgnoreCase("no")){
                        System.out.println("���ڷ���������");
                    }else {
                        if ((truck1.equalsIgnoreCase("yes")!=true)&&(truck1.equalsIgnoreCase("no")!=true)){
                            System.out.println("�������ݲ��Ϸ������ڷ���������");
                        }
                    }
                    break;
        }
    }
}
class Function3 extends Function {
        public Function3() {
            super();
        }
        void returnCar() throws InterruptedException {
            Scanner s = new Scanner(System.in);
            System.out.println("��������Ҫ�黹�ĳ������ͣ�(1.�γ� 2.����)");
            int a = s.nextInt();
            switch (a){
                case 1 :
                    System.out.println("��������Ҫ�黹����������(�γ�)��");
                    int b = s.nextInt();
                    System.out.println("�黹�ɹ�����");
                    System.out.println("���ڼ��㣺");
                    Thread.sleep(1000);
                    System.out.println("��ǰ�γ�����ʣ�ࡾ"+(super.getCarNum()+b)+"����");
                    break;
                case 2:
                    System.out.println("��������Ҫ�黹����������(����)��");
                    int c = s.nextInt();
                    System.out.println("���ڼ��㣺");
                    Thread.sleep(1000);
                    System.out.println("��ǰ��������ʣ�ࡾ"+(super.getTruckNum()+c)+"����");
                    break;
            }
        }
}