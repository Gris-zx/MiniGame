# 第一章 需求分析

**1.1** **应用功能**

1.1.1应用简介

  《快刀戳指缝》又叫做勇敢者游戏，是《荒野大镖客2》中可以游玩的小游戏之一，考验玩家的手速。

在游戏中你需要伸出一直手，五指分开，掌心向下放再桌子上，然后用匕首快速向指缝之间的空位戳刺，你需要快速移动匕首并且避免让手指受伤，在30秒内戳刺的轮数最多的玩家获胜。

![img](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image002.jpg)

1.1.2应用功能

v 点击首页进入应用。

v 点击竞速模式开始游戏。

v 进入游戏界面点击开始游戏开始计时。

v 玩家有30s的时间来戳指缝，戳的轮数越多说明手速越快。

v 时间结束或者戳到手指10次游戏结束。

v 退出可以点击返回主界面！

 

整个应用的功能结构图如图下图所示：

 

**1.2** **程序流程图**

用户使用“快刀戳指缝”应用的程序流程图如下图所示：

![img](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image004.jpg)

 

# 第二章 总体设计

**2.1** **应用框架设计**

activity_main：

为了使界面更加整齐美观，我们采用相对布局RelativeLayout嵌套ImageView 的方法，将三个ImageView放置在同一个RelativeLayout里，显示出导航栏的效果，前面已经描述过该结构的实现，这里就不再赘述。同时为了实现倒计时跳转的功能，我们增加了一个Button，并未改Button添加符合设计主题的背景，使整体看起来更加能够融合在一起。分别添加TextView以及ImageView使得页面看起来整齐美观，不会因为缺少控件而使页面结构失调。

![IMG_256](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image006.jpg)

 

activity_main2.xml：

  导航栏依然采用相对布局RelativeLayout嵌套ImageView 的方法，将三个ImageView放置在同一个RelativeLayout里，显示出导航栏的效果，前面已经描述过该结构的实现，这里就不再赘述。下面由多个TextView组成，实现文本模块化布局。整体包含在相对布局RelativeLayout 中。在activity_main2与activity_main3中都使用了这种模块排列组合，除了内容不同，其他方面完全一样，这里不再过多阐述。

 

 

 

 

Activity_main3.xml：

![B4F0D6775E7720D3A62409660277D5F8](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image008.jpg) ![IMG_256](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image010.jpg)

 

 

采用了线性布局，此布局为了让这个组件在不同型号的手机上都能运行良好。由于不同手机屏幕的分辨率、尺寸并不完全相同，如果让程序手动控制每个组件的大小、位置，则将给编程带来巨大的困难。为了解决这个问题，我们采用了布局管理器。布局管理器可以根据运行平台来调整组件的大小。整个外框采用了背景和边距的属性来调整布局。并且采用了线性布局嵌套相对布局RelativeLayout，相对布局容器是为了调整图片与图片之间的位置。

 

 

 

 

 

 

activity_main4/success/fail.xml：

![img](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image012.jpg)

 

整体采用水平的线性布局，嵌套三个垂直的线性布局。采用了艺术字体的welcome，EditText与TextView 非常相似，它甚至与TextView共用了绝大部分XML属性和方法。但是EditText可以接受用户输入并介绍的与输入相关的属性。最后是RelativeLayout，来控制三个按钮的位置。

 

 

![FA0C762496540AE4E96E37759B407798](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image014.jpg)![51C1FFCEAAAA3D0AA0F91D3130F6BD27](file:///C:/Users/17137/AppData/Local/Temp/msohtmlclip1/01/clip_image016.jpg)

 

采用垂直方式的布局，放入图片文字，结合相对布局将文字组件的位置由图片组件决定。
