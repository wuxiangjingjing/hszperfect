
    适配器模式（Adapter Pattern），把一个类的接口变换成客户端所期待的另一种接口， Adapter模式使原本因接口不匹配（或者不兼容）
       而无法在一起工作的两个类能够在一起工作。又称为转换器模式、变压器模式、包装（Wrapper）器模式（把已有的一些类包装起来，使之能有满足需要的接口）。
   
   
共有两类适配器模式：1.类的适配器模式（采用继承实现）2.对象适配器（采用对象组合方式实现）

    1)类适配器模式
        ——适配器继承自已实现的类（一般多重继承）。


Adapter与Adaptee是继承关系

    1、用一个具体的Adapter类和Target进行匹配。结果是当我们想要一个匹配一个类以及所有它的子类时，类Adapter将不能胜任工作
    2、使得Adapter可以重定义Adaptee的部分行为，因为Adapter是Adaptee的一个子集
    3、仅仅引入一个对象，并不需要额外的指针以间接取得adaptee
    2)对象适配器模式—— 适配器容纳一个它包裹的类的实例。在这种情况下，适配器调用被包裹对象的物理实体。

Adapter与Adaptee是委托关系

    1、允许一个Adapter与多个Adaptee同时工作。Adapter也可以一次给所有的Adaptee添加功能
    2、使用重定义Adaptee的行为比较困难
    无论哪种适配器，它的宗旨都是：保留现有类所提供的服务，向客户提供接口，以满足客户的期望。
    即在不改变原有系统的基础上，提供新的接口服务。

https://blog.csdn.net/hguisu/article/details/7527842