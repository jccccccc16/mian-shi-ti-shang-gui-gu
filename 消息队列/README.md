在高并发的情况下，系统来不及同时处理那么多的数据，比如涉及到insert，update

那么可不可以**异步去处理一些操作**呢，将压力分流出来

- 异步

![在这里插入图片描述](https://img-blog.csdnimg.cn/2021042017143748.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDc3MTU4Mg==,size_16,color_FFFFFF,t_70)

- 并行

  ![在这里插入图片描述](https://img-blog.csdnimg.cn/20210420171615197.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDc3MTU4Mg==,size_16,color_FFFFFF,t_70)

- 排队处理

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210420171655105.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDc3MTU4Mg==,size_16,color_FFFFFF,t_70)



消息队列的弊端：

不确定性，如果发送失败了呢？

采用延迟队列，轮询技术来解决；



轮询计划在云E办中有，用来确认消息是否处理成功

