package com.example.transaction.service;

import com.example.transaction.model.Payment;
import com.example.transaction.repository.PaymentRepository;
import java.io.FileNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentService {

    private final PaymentRepository paymentRepository;

    /*
    // 1
    @Transactional(propagation = Propagation.REQUIRED)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
    */


    /*
    // 2
    @Transactional(propagation = Propagation.SUPPORTS)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
    */

    /*
    // 3
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
    */

    /*
    // 4
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
     */

    /*
    // 5
    @Transactional(propagation = Propagation.NEVER)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
    */

    /*
    // 6
    @Transactional(propagation = Propagation.MANDATORY)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
    }
    */

    /*
    //7
    @Transactional
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
        throw new FileNotFoundException("asdfasd");
        //throw new RuntimeException("asdfasd");
    }
     */

    //8
    @Transactional(rollbackFor = FileNotFoundException.class)
    public void pay(Payment payment) throws FileNotFoundException {
        this.paymentRepository.save(payment);
        log.info("======> Payment Id: {}", payment.getId());
        throw new FileNotFoundException("asdfasd");
    }
}
