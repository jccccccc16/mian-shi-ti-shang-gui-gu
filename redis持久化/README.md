### redis持久化的两种不同方法

- RDB：redis database

  - 指定时间间隔内将内存中的数据集写入磁盘（快照文件），当要恢复时，将快照文件读取到内存中
  - 缺点：当数据量大时，将大量的数据写入磁盘比较小号性能；由于相隔一段时间备份一次，那么会在备份前意外丢失

- AOF：append of file

  - 与rdb是互补的方式，以日志的方式记录每个写操作
  - 将redis的写操作记录下来将数据追加到文件中（不可以改写文件），
  - redis重启的话就根据日志文件的内容将写指令从前到后执行一次恢复数据

  