package com.weiyu.mediator.demo;

/**
 * @author weiyu
 * 用一个中介者对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 * 从而使耦合松散，而且可以独立地改变它们之间的交互
 * @description 中介者模式
 * @create 2018/01/04
 */

abstract class AbstractColleague {
    protected int number;

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    //这里的参数不是同事类，而是中介者
    public abstract void setNumber(int number, AbstractMediator am);
}

class ColleagueA extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}

class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}

abstract class AbstractMediator{
    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b){
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();
}

class Mediator extends AbstractMediator{

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    //处理A对B的影响
    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }

    //处理B对A的影响
    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}

public class MediatorClient {
    public static void main(String[] args) {
        AbstractColleague collA = new ColleagueA();
        AbstractColleague collB = new ColleagueB();

        AbstractMediator am = new Mediator(collA,collB);

        System.out.println("======设置A影响B======");
        collA.setNumber(1288,am);
        System.out.println("collA的number值："+collA.getNumber());
        System.out.println("collB的number值："+collB.getNumber());

        System.out.println("======设置B影响A======");
        collB.setNumber(87635, am);
        System.out.println("collB的number值："+collB.getNumber());
        System.out.println("collA的number值："+collA.getNumber());
    }
}
