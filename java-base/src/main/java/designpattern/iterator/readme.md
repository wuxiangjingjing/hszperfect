
https://www.cnblogs.com/java-my-life/archive/2012/05/22/2511506.html
https://blog.csdn.net/jason0539/article/details/45070441

迭代子模式又
    叫游标(Cursor)模式，是对象的行为模式。迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象（internal representation）。
    
迭代子模式的结构
    迭代子模式有两种实现方式，分别是白箱聚集与外禀迭代子和黑箱聚集于内禀迭代子。
    
迭代子模式主要有5个对象
    抽象迭代子角色：定义了遍历聚集的接口。 
    具体迭代子角色：实现了抽象迭代子接口。 
    抽象聚集角色：定义聚集的公共方法，并为聚集创建迭代子(Iterator)对象。 
    具体聚集角色：能够返回一个实现迭代子(Iterator)接口的迭代子实例。 
    客户端角色：持有对聚集和迭代子实例的引用，通过迭代子对聚集进行迭代。