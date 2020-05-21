package com.lakers.lambda;

import com.lakers.util.PrintUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;


/**
 * @Author: panyusheng
 * @Date: 2020/5/21 10:48
 * @Version 1.0
 */
public class LambdaTestTest {

    @Test
    public void testForEach() {
        List<String> languages = Arrays.asList("java","scala","python");
        languages.forEach(System.out::println);
//        languages.forEach(new PrintUtil()::print);
        // 静态方法
//        languages.forEach(PrintUtil::print);
    }

    @Test
    public void testMap() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
        cost.stream().map(x -> x + x * 0.05).forEach(System.out::println);
    }

    @Test
    public void testReduce() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
//        double allCost = cost.stream().map(x -> x + x*0.05).reduce((sum,x) -> sum + x).get();
        Stream<Double> doubleStream = cost.stream().map(x -> x + x * 0.05);
        Double aDouble = doubleStream.reduce((sum, a) -> sum + a).get();
        System.out.println(aDouble);
    }

    @Test
    public void testFilter() {
        List<Double> cost = Arrays.asList(10.0, 20.0,30.0,40.0);
        List<Double> filteredCost = cost.stream().filter(x -> x > 25.0).collect(Collectors.toList());
        filteredCost.forEach(System.out::println);

    }

}