package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    private final CalculatorService calculatorService;

    public ControllerCalculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public Integer plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.doPlus(num1,num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.doMinus(num1,num2);
    }
    @GetMapping("/multiply")
    public Integer multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.doMultiply(num1,num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.doDivide(num1,num2);
    }
}
