## 5. Java中List<?>和List之间的区别是什么？java中List和原始类型List之间的区别？
```
  List，即原始类型，其引用变量可以接受任何对应List<E>的参数化类型， 包括List<?>，并且可以添加任意类型的元素。但其缺点在于不安全性、不便利性、不表述性(不应该使用原生类型的原因)。
  List<?>，即通配符类型，其引用变量，同样可以接受任何对应List<E>的参数化类型，包括List，但不能添加任何元素，保证了安全性和表述性。但不具有表述性，从中取出的元素时Object类型，要通过手动转换才能得到原本的类型。
  List<Object>，即实际类型参数为Object的参数化类型，其引用变量可以接受List，可以添加元素，但不能接受除了其本身外的任何参数化类型(泛型的子类型化原则)。
```
## 6.Java中synchronized 和 ReentrantLock 有什么不同？
```
两者的共同点：
1. 都是用来协调多线程对共享对象、变量的访问
2. 都是可重入锁，同一线程可以多次获得同一个锁
3. 都保证了可见性和互斥性
两者的不同点：
4. ReentrantLock 显示的获得、释放锁，synchronized 隐式获得释放锁
5. ReentrantLock 可响应中断、可轮回，synchronized 是不可以响应中断的，为处理锁的不可用性提供了更高的灵活性
6. ReentrantLock 是 API 级别的，synchronized 是 JVM 级别的
7. ReentrantLock 可以实现公平锁
8. ReentrantLock 通过 Condition 可以绑定多个条件
9. 底层实现不一样， synchronized 是同步阻塞，使用的是悲观并发策略，lock 是同步非阻塞，采用的是乐观并发策略
10. Lock 是一个接口，而 synchronized 是 Java 中的关键字，synchronized 是内置的语言实现。
11. synchronized 在发生异常时，会自动释放线程占有的锁，因此不会导致死锁现象发生；而 Lock 在发生异常时，如果没有主动通过 unLock()去释放锁，则很可能造成死锁现象，因此使用 Lock 时需要在 finally 块中释放锁。
12. Lock 可以让等待锁的线程响应中断，而 synchronized 却不行，使用 synchronized 时，等待的线程会一直等待下去，不能够响应中断。
13. 通过 Lock 可以知道有没有成功获取锁，而 synchronized 却无法办到。
14. Lock 可以提高多个线程进行读操作的效率，既就是实现读写锁等。
```
## 7.并发编程的三要素
```
原子性：即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。
可见性：指当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。
有序性：即程序执行的顺序按照代码的先后顺序执行。
```
## 8.CyclicBarrier和CountDownLatch的区别，CountDownLatch这个已经上过，要求自己学习CyclicBarrier并且写出代码
```
CountDownLatch: 一个线程(或者多个)， 等待另外N个线程完成某个事情之后才能执行。
CyclicBarrier: N个线程相互等待，任何一个线程完成之前，所有的线程都必须等待。
CountDownLatch的计数器只能使用一次。而CyclicBarrier的计数器可以使用reset() 方法重置。所以CyclicBarrier能处理更为复杂的业务场景，比如如果计算发生错误，可以重置计数器，并让线程们重新执行一次。
CountDownLatch：减计数方式，CyclicBarrier：加计数方式

代码： Player.java
```
## 10.ConcurrentHashMap和Hashtable的区别？
```
它们都可以用于多线程的环境，但是当Hashtable的大小增加到一定的时候，性能会急剧下降，因为迭代时需要被锁定很长的时间。
因为ConcurrentHashMap引入了分割(segmentation)，不论它变得多么大，仅仅需要锁定map的某个部分，而其它的线程不需要等到迭代完成才能访问map。简而言之，在迭代的过程中，ConcurrentHashMap仅仅锁定map的某个部分，而Hashtable则会锁定整个map。
```