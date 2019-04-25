package com.learn.day05


/**函数式编程的训练
 *
 */
data class Product(val name:String, val price:Double)
data class Order(val products:List<Product>,val isDelivered:Boolean)
data class Customer(val name:String,val city:String,val orders:List<Order>)
data class Shop(val name:String,val customers:List<Customer>)

//模拟产品数据
val dianFanBao = Product("电饭煲",400.0)
val weiBoLu = Product("电波卢",200.0)
val dianKaoXiang = Product("电烤箱",300.0)
//模拟订单数据
val order1 = Order(listOf(dianFanBao, weiBoLu),true)
val order2 = Order(listOf(dianFanBao, dianKaoXiang),true)
val order3 = Order(listOf(weiBoLu, dianKaoXiang),false)
//模拟顾客数据
val customer1 = Customer("chen","hubei",listOf(order1, order2))
val customer2 = Customer("wen","wuhan",listOf(order1, order3))
val customer3 = Customer("kai","shanghai",listOf(order3, order2))
//模拟商店数据
val shop1 = Shop("黑马商店",listOf(customer1,customer2,customer3))



fun main(args:Array<String>) {
    println("----黑马商店，用户来自哪些城市----")
    val list_city = shop1.customers.map{
        it.city   //map将原来集合的数据组成一个新的集合
    }.distinct()
    println(list_city)

    println("----黑马商店，chen买过哪些商品")
    var chen = shop1.customers.find{
        it.name=="chen"
    }?.orders?.flatMap {
        it.products
    }?.distinct()
    println(chen)

    println("---黑马商店，用户买过的所有商品")
    val products = shop1.customers.flatMap{
        it.orders
    }?.flatMap{
        it.products
    }.distinct()
    println(products)

    println("---黑马商店，chen买东西花了多少钱")
    val chen_money = shop1.customers.find{
        it.name=="chen"
    }?.orders?.filter{
        it.isDelivered
    }?.flatMap {
        it.products
    }?.sumByDouble {
        it.price
    }
    println(chen_money)

    println("黑马商店，所有订单里已发货的价格最贵的商品")

    val max_price = shop1.customers.flatMap {
        it.orders
    }.filter{
        it.isDelivered
    }.flatMap {
        it.products
    }.distinct()?.maxBy {
        it.price
    }?.name

    println(max_price)



















}