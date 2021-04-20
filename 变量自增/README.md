### 方法的参数传递机制(地址或值)

#### 实参给形参赋值：

- 基本数据类型：将数据值赋值给形参

- 引用数据类型：将地址值赋值给形参引用

### 实参是引用数据类型

#### 传递地址值

#### string，包装类等对象的不可变性

j+=“world”，一开始，j与str共同指向常量池中“hello”，然后对j操作，在常量池中产生一个新的常量“hello world”,j指向了“hello world”

至于integer的值为什么不会改变，因为integer的值是指向

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210418165500764.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDc3MTU4Mg==,size_16,color_FFFFFF,t_70)