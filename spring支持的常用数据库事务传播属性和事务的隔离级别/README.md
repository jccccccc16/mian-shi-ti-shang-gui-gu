### 事务的传播行为

传播行为就是，当一个有事务的方法调用了另外一个有事务的方法时，使用自己的事务还是使用另一个方法的事务

spirng 定义了7种传播行为

required：继续使用原来的

required_new：使用另外方法的

### 隔离级别

- 脏读：读取了一个无，

  1更改了age：20，为age：30

  2读取了age：30，

  1回滚了，age：20

  结果2读取了age为一个无效的值了

- 不可重复读

  不可以重复读，重复读就不一样了

  1读取了age：20，

  2更改age：30，

  1再次读取age，结果与第一次不一样

- 幻读

  1第一次读的时候，读取了表的一部分数据，

  2增加了新的行，

  1结果再次读取结果发现多了，怎么不一样了捏

设置隔离级别

读未提交

读已提交

可重复读

