git工作流

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210419195636739.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDc3MTU4Mg==,size_16,color_FFFFFF,t_70)

先是有一个master分支，然后打了一个develop分支用于开发，devlop分支又打分支用于分工，分工完成之后，合并到develop分支，好了之后，与master合并，上线，如果发现了bug之后，又打了一个hotfix分支，用于修复bug，修复好之后，就合并到master和develop。