1、切入点表达式的使用规则：
execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern) throws-pattern?)
有“?”号的部分表示可省略的，modifers-pattern表示修饰符如public、protected等，ret-type-pattern表示方法返回类型，declaring-type-pattern代表特定的类，
name-pattern代表方法名称，param-pattern表示参数，throws-pattern表示抛出的异常。在切入点表达式中，可以使用*来代表任意字符，用..来表示任意个参数。