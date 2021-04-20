### centos 6

service name start

service name stop

等等

查看自启动

chkconfig --list

修改自启动

chkconfig --level {运行级别} {服务名} off/on

在哪一个运行级别下关闭或者开启服务

### centos 7

systemctl start name

 查看服务

systemctl list-unit-files

systemctl --type service

systemctl enable name+

