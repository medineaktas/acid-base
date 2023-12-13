package com.example.transaction.service;

import com.example.transaction.model.Order;
import com.example.transaction.model.Payment;
import com.example.transaction.repository.OrderRepository;
import java.io.FileNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final PaymentService paymentService;
    private final OrderRepository orderRepository;

    /*
   //1
   @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
    */

    /*
    //2
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
     */

    /*
    //3
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }*/

    /*
    //4
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
    */

    /*
    //5
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
    */

    /*
    //6
    @Transactional(propagation = Propagation.REQUIRED)
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
    */

    //7
    @Transactional
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }

    /*
    //8
    @Transactional
    public void placeOrder(Order order) throws FileNotFoundException {
        this.orderRepository.save(order);
        log.info("======> Order Id: {}", order.getId());
        Payment payment = Payment.builder()
                .price(order.getTotalPrice())
                .orderId(order.getId())
                .userId(order.getUserId())
                .build();
        this.paymentService.pay(payment);
    }
    */
}
