# shop4cloud

## 分布式ID
使用美团分布式id组件leaf

[leaf Github](https://github.com/Meituan-Dianping/Leaf)

[leaf 中文文档](https://github.com/Meituan-Dianping/Leaf/blob/master/README_CN.md)



## 小问题

### gateway单测报错
```shell
Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @4dca0ecd
```

如何解决？
```shell
--add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.text=ALL-UNNAMED --add-opens java.desktop/java.awt.font=ALL-UNNAMED
```