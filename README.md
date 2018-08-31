# declare_styleable

<resources> resource是跟标签，可以在里面定义若干个declare-styleable
<declare-styleable name="custom_view"> name定义了变量的名称
    <attr name="custom_color" format="color"></attr> 定义对应的属性，name定义了属性的名称
    <attr name="custom_size" format="dimension"></attr> 每一个发生要定义format指定其类型，类型包括
      reference   表示引用，参考某一资源ID

      string   表示字符串

      color   表示颜色值

      dimension   表示尺寸值

      boolean   表示布尔值

      integer   表示整型值

      float   表示浮点值

      fraction   表示百分数

      enum   表示枚举值

      flag   表示位运算

