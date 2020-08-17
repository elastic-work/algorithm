# 栈

## 栈的类型定义

### 定义：

成为堆栈，是一种先进后出，删除和插入都在栈顶操作的线性表

### 栈是什么：

是一种使用堆的方法

## 作用：

栈在程序的运行中有着举足轻重的作用。最重要的是栈保存了一个函数调用时所需要的维护信息，这常常称之为堆栈帧或者活动记录。堆栈帧一般包含如下几方面的信息：

1．函数的返回地址和参数

2． 临时变量：包括函数的非静态局部变量以及编译器自动生成的其他临时变量。

### 特性：

先进后出，后进先出

![1596370975038](D:\math\algorithm\栈\栈的理解\1596370975038.png)

类似于枪的弹夹，装到最后的子弹一定是先射出来的子弹

### 栈的操作

插入：push

删除：pop

### 如何构建一个空栈

使栈底和栈顶相等，就可以构建一个空栈

```java
void init(SqStack sqStack){
  sqStack.base= (int *)malloc(size*sizeof(int));//确定栈底
  sqStack.top = sqStack.base;
  sqStack.stacksize =size;
}
```

### 将元素插入栈

```c++
void push(SqStack s,int e){
    if (s.top - s.base>s.stacksize){//内存发生溢出
        s.base =(int*)realloc(s.base,(s.stacksize+incresize)*sizeof(int));//申请(s.stacksize+incresize)个int元素所用空间，并将s.base指入新的内存空间
        s.top = s.base + s.stacksize;//得到栈顶指针位置
        s.stacksize+=incresize;//得到栈的大小
    }
    *s.top++=e;//没有溢出，那么直接将e压入栈顶
}
```

删除栈元素

```c++
void pop(SqStack s ,int e){
    if(s.top!=s.base){
        e=*(--s.top);
    }
    cout<<e<<endl;
}
```

打印栈

```c++
void Print(SqStack*s){
    int*temp;
    int *s->top;
    while(temp!=s->base){
        temp--;
        printf("%d",*temp)
    }
}
```

### 栈的应用

##### 1、十进制转八进制

算法原理：

N=（N div d）x d +N mod d

![1596375835903](D:\math\algorithm\栈\栈的理解\1596375835903.png)

将十进制28768转为8进制结果为70140。

#### 2、括号匹配的检验

![1596375979851](D:\math\algorithm\栈\栈的理解\1596375979851.png)

 出现不匹配的三种情况

- 到来的右括号不是希望的，比如希望得到右中括号，结果来了右小括号
- 到来的是“不速之客”
- 直到结束也没有到来期待的括号

检验原则:

- 只要出现左括号，则进栈
- 只要出现右括号，先检查栈是否为
- - 如果栈空，则表明“右括号”多余
  - 如果栈不为空，就和栈顶元素比较
  - 如果匹配，则左括号出战，否则表名不匹配
- 表达式检验结束时
- - 若栈空，则表名表达式中匹配正确
  - 否则表明左括号有余



