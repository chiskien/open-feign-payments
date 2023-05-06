package com.example.openfeignpayments.proxies;

import com.example.openfeignpayments.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "payment", url = "${name.service.url}")
public interface PaymentProxy {
    @PostMapping("/payment")
    Payment createPayment(@RequestHeader String requestId,
                          @RequestBody Payment payment);

    @GetMapping("/payment")
    List<Payment> getAll();
}
